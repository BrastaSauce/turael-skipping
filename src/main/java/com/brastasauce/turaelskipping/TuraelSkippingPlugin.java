/*
 * Copyright (c) 2022, BrastaSauce
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.brastasauce.turaelskipping;

import com.google.inject.Provides;
import javax.inject.Inject;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.worldmap.WorldMapPointManager;
import net.runelite.client.util.Text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
@PluginDescriptor(
	name = "Turael Skipping"
)
public class TuraelSkippingPlugin extends Plugin
{
	private static final String TURAEL = "Turael";

	// NPC messages
	private static final Pattern TURAEL_ASSIGN_MESSAGE = Pattern.compile(".*(?:Your new task is to kill \\d+) (?<name>.+)(?:.)");
	private static final Pattern TURAEL_CURRENT_MESSAGE = Pattern.compile(".*(?:You're still hunting) (?<name>.+)(?:, you have \\d+ to go.)");

	@Getter
	private Task task;

	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private WorldMapPointManager worldMapPointManager;

	@Inject
	private TuraelSkippingOverlay overlay;

	@Inject
	private TuraelSkippingConfig config;

	private void setTask(String taskName)
	{
		task = Task.getTask(taskName);
		createWorldPoint();
	}

	private void completeTask()
	{
		task = null;
		worldMapPointManager.removeIf(TaskWorldMapPoint.class::isInstance);
	}

	private void createWorldPoint()
	{
		if (task != null && config.displayMapIcon())
		{
			worldMapPointManager.add(new TaskWorldMapPoint(task));
		}
	}

	@Subscribe
	public void onGameTick(GameTick gameTick)
	{
		// Getting tasks
		Widget npcName = client.getWidget(WidgetInfo.DIALOG_NPC_NAME);
		Widget npcDialog = client.getWidget(WidgetInfo.DIALOG_NPC_TEXT);

		if (npcDialog != null && npcName.getText().equals(TURAEL))
		{
			String npcText = Text.sanitizeMultilineText(npcDialog.getText());
			final Matcher mAssign = TURAEL_ASSIGN_MESSAGE.matcher(npcText);
			final Matcher mCurrent = TURAEL_CURRENT_MESSAGE.matcher(npcText);

			if (mAssign.find())
			{
				String name = mAssign.group("name");
				setTask(name);
			}

			if (mCurrent.find())
			{
				String name = mCurrent.group("name");
				setTask(name);
			}
		}
	}

	@Subscribe
	public void onChatMessage(ChatMessage event)
	{
		// Completing tasks
		if (event.getType() != ChatMessageType.GAMEMESSAGE && event.getType() != ChatMessageType.SPAM)
		{
			return;
		}

		String chatMessage = Text.removeTags(event.getMessage());

		if (chatMessage.startsWith("You've completed") && (chatMessage.contains("Slayer master") || chatMessage.contains("Slayer Master")))
		{
			completeTask();
		}
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(overlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
		task = null;
		worldMapPointManager.removeIf(TaskWorldMapPoint.class::isInstance);
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		worldMapPointManager.removeIf(TaskWorldMapPoint.class::isInstance);
		if (event.getGroup().equals("turaelskipping"))
		{
			createWorldPoint();
		}
	}

	@Provides
	TuraelSkippingConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(TuraelSkippingConfig.class);
	}
}
