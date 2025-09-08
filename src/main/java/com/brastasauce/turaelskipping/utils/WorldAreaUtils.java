package com.brastasauce.turaelskipping.utils;

import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public class WorldAreaUtils {
    public static WorldArea fromCorners(WorldPoint p1, WorldPoint p2) {
        int x1 = Math.min(p1.getX(), p2.getX());
        int y1 = Math.min(p1.getY(), p2.getY());
        int x2 = Math.max(p1.getX(), p2.getX());
        int y2 = Math.max(p1.getY(), p2.getY());

        return new WorldArea(
                new WorldPoint(x1, y1, p1.getPlane()),
                x2 - x1 + 1,
                y2 - y1 + 1
        );
    }
}
