package com.brastasauce.turaelskipping.models;

import lombok.Getter;
import net.runelite.api.coords.WorldArea;

import java.util.List;

@Getter
public class NpcLocation {
    private final String name;
    private final String[] teleports;
    private final List<WorldArea> worldAreas;

    public NpcLocation(String name, List<WorldArea> worldAreas, String[] teleports) {
        this.name = name;
        this.worldAreas = worldAreas;
        this.teleports = teleports;
    }
}
