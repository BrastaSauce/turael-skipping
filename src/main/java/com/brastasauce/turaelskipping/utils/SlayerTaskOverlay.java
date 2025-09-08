package com.brastasauce.turaelskipping.utils;


import com.brastasauce.turaelskipping.TuraelSkippingConfig;
import com.brastasauce.turaelskipping.TuraelSkippingPlugin;
import com.brastasauce.turaelskipping.models.NpcLocation;
import com.brastasauce.turaelskipping.models.SlayerTask;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldArea;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;

import javax.inject.Inject;
import java.awt.*;

public class SlayerTaskOverlay extends OverlayPanel {
    private final Client client;
    private final TuraelSkippingPlugin plugin;
    private final TuraelSkippingConfig config;

    @Inject
    public SlayerTaskOverlay(Client client, TuraelSkippingPlugin turaelSlayerPlugin, TuraelSkippingConfig config) {
        this.client = client;
        this.plugin = turaelSlayerPlugin;
        this.config = config;

        setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
        setPreferredSize(new Dimension(216, 40));
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        if (!config.enableInformationBox()) {
            return null;
        }

        SlayerTask task = plugin.getCurrentSlayerTask();

        if (task == null) {
            return null;
        }

        boolean inArea = false;

        for (NpcLocation npcLocation : task.getLocations()) {
            for (WorldArea worldArea : npcLocation.getWorldAreas()) {
                if (worldArea.contains(client.getLocalPlayer().getWorldLocation())) {
                    inArea = true;
                }
            }
        }

        // If disabled, set inArea to false so the information box will always be drawn
        if (!config.automaticallyHideInformationBox()) {
            inArea = false;
        }

        if (!inArea) {
            for (NpcLocation npcLocation : task.getLocations()) {
                panelComponent.getChildren().add(LineComponent.builder().left(npcLocation.getName()).leftColor(Color.YELLOW).build());

                for (String teleport : npcLocation.getTeleports()) {
                    panelComponent.getChildren().add(LineComponent.builder().left("- " + teleport).build());
                }
            }

            if (task.getInformation() != null) {
                panelComponent.getChildren().add(LineComponent.builder().left(" ").build());
                panelComponent.getChildren().add(LineComponent.builder().left(task.getInformation()).build());
            }
        }

        return super.render(graphics);
    }
}
