package com.brastasauce.turaelskipping.models;

import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

import java.util.List;

@Getter
public class SlayerTask {
    private final String name;
    private final List<Integer> npcIds;
    private final List<WorldPoint> worldMapLocations;
    private final List<NpcLocation> locations;
    private final String information;

    public SlayerTask(String name, List<Integer> npcIds, List<WorldPoint> worldMapLocations, List<NpcLocation> locations) {
        this.name = name;
        this.npcIds = npcIds;
        this.worldMapLocations = worldMapLocations;
        this.locations = locations;
        this.information = null;
    }

    public SlayerTask(String name, List<Integer> npcIds, List<WorldPoint> worldMapLocations, List<NpcLocation> locations, String information) {
        this.name = name;
        this.npcIds = npcIds;
        this.worldMapLocations = worldMapLocations;
        this.locations = locations;
        this.information = information;
    }
}
