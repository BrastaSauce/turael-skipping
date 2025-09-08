package com.brastasauce.turaelskipping.utils;

import com.brastasauce.turaelskipping.TuraelSkippingPlugin;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.worldmap.WorldMapPoint;
import net.runelite.client.util.ImageUtil;

import java.awt.image.BufferedImage;

public class SlayerTaskWorldMapPoint extends WorldMapPoint {
    public SlayerTaskWorldMapPoint(WorldPoint worldPoint) {
        super(worldPoint, null);

        BufferedImage taskWorldImage = ImageUtil.loadImageResource(TuraelSkippingPlugin.class, "/turael_chathead.png");

        this.setSnapToEdge(true);
        this.setJumpOnClick(true);
        this.setName("Turael Task");
        this.setImage(taskWorldImage);
    }
}
