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

import com.google.common.collect.ImmutableMap;
import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

import javax.annotation.Nullable;
import java.util.Map;

@Getter
public enum Task
{
    BANSHEES("Banshees", new WorldPoint[]{new WorldPoint(3442,3542,0)}, "Morytania Slayer Tower", new String[]{"Slayer Ring: Morytania Slayer Tower"}, ""),
    BATS("Bats", new WorldPoint[]{new WorldPoint(3351,3490,0)}, "West of Paterdomus Temple", new String[]{"Ring of the elements: Earth Altar","Digsite/Lumberyard teleport"}, ""),
    BEARS("Bears", new WorldPoint[]{new WorldPoint(2700,3330,0)}, "Mine east of Ardougne", new String[]{"Fairy Ring: BLR","Quest Cape teleport"}, ""),
    BIRDS("Birds", new WorldPoint[]{new WorldPoint(3178,3359,0)}, "Champions' Guild", new String[]{"Combat Bracelet: Champions' Guild","Chronicle teleport"}, ""),
    CAVE_BUGS("Cave Bugs", new WorldPoint[]{new WorldPoint(3206,3217,0),new WorldPoint(2786,5318,0)}, "Dorgeshuun Dungeon", new String[]{"Fairy Ring: AJQ then north and west"}, "Bring a light source"),
    CAVE_CRAWLERS("Cave Crawlers", new WorldPoint[]{new WorldPoint(2789,3617,0),new WorldPoint(2795,9997,0)}, "Fremennik Slayer Dungeon", new String[]{"Slayer Ring: Relekka Slayer Caves","Fairy Ring: AJR"}, ""),
    CAVE_SLIMES("Cave Slimes", new WorldPoint[]{new WorldPoint(3206,3217,0),new WorldPoint(2786,5318,0)}, "Dorgeshuun Dungeon", new String[]{"Fairy Ring: AJQ then north and west"}, "Bring a light source"),
    COWS("Cows", new WorldPoint[]{new WorldPoint(3257,3273,0)}, "Lumbridge Cow Pen", new String[]{"Lumbridge teleport"}, ""),
    CRAWLING_HANDS("Crawling Hands", new WorldPoint[]{new WorldPoint(3419,3571,0)}, "Morytania Slayer Tower", new String[]{"Slayer Ring: Morytania Slayer Tower"}, ""),
    DOGS("Dogs", new WorldPoint[]{new WorldPoint(3347,2783,0)}, "East of Sophanem", new String[]{"Pharaoh's Sceptre: Jaleustrophos (Option 2)"}, ""),
    DWARVES("Dwarves", new WorldPoint[]{new WorldPoint(2819,3490,0),new WorldPoint(2863,9878,0)}, "Under White Wolf Mountain", new String[]{"Construction Cape: Taverley","Redirected house tab"}, ""),
    GOBLINS("Goblins", new WorldPoint[]{new WorldPoint(3145,3301,0)}, "Southeast of Draynor Manor", new String[]{"Draynor Manor teleport tab"}, "Directly south of the Sourhog Cave"),
    GHOSTS("Ghosts", new WorldPoint[]{new WorldPoint(1639,3673,0),new WorldPoint(1693,10063,0)}, "Zeah Catacombs", new String[]{"Achievement Diary Cape: Kourend","Xeric's Talisman: Xeric's Heart"}, ""),
    ICEFIENDS("Icefiends", new WorldPoint[]{new WorldPoint(3007,3475,0)}, "Ice Mountain", new String[]{"Lassar teleport tab"}, ""),
    KALPHITE("Kalphite", new WorldPoint[]{new WorldPoint(3326,3122,0),new WorldPoint(3372,9528,0)}, "Outside Shantay Pass", new String[]{"Desert Amulet 4: Kalphite Cave"}, ""),
    LIZARDS("Lizards", new WorldPoint[]{new WorldPoint(3413,3035,0)}, "Al Kharid Desert (east of river)", new String[]{"Fairy Ring: DLQ"}, "Bring ice coolers"),
    MINOTAURS("Minotaurs", new WorldPoint[]{new WorldPoint(3084,3417,0),new WorldPoint(1875,5218,0)}, "First Floor Stronghold of Security", new String[]{"Skull Sceptre: Invoke"}, ""),
    MONKEYS("Monkeys", new WorldPoint[]{new WorldPoint(2713,2794,0)}, "Underneath Ape Atoll", new String[]{"Gnome Glider: Ookookolly Undri"}, "Run south and open trapdoor"),
    RATS("Rats", new WorldPoint[]{new WorldPoint(3240,3458,0),new WorldPoint(3237,9866,0)}, "Varrock Sewers, northeast entrance", new String[]{"Varrock teleport"}, ""),
    SCORPIONS("Scorpions", new WorldPoint[]{new WorldPoint(3299,3301,0)}, "Al Kharid Mine", new String[]{"Ring of the elements: Fire Altar","Ring of dueling: PvP Arena"}, ""),
    SKELETONS("Skeletons", new WorldPoint[]{new WorldPoint(3352,3417,0)}, "Digsite", new String[]{"Master Scroll Book: Digsite","Digsite Pendant"}, "Bring a rope"),
    SOURHOGS("Sourhogs", new WorldPoint[]{new WorldPoint(3143,3347,0),new WorldPoint(3173,9688,0)}, "Sourhog Cave east of Draynor Manor", new String[]{"Draynor Manor teleport tab"}, ""),
    SPIDERS("Spiders", new WorldPoint[]{new WorldPoint(3168,3244,0)}, "Outside H.A.M. Hideout", new String[]{"Achievement Diary Cape: Twiggy O'Korn","Amulet of Glory: Draynor Village"}, ""),
    WOLVES("Wolves", new WorldPoint[]{new WorldPoint(2847,3498,0)}, "White Wolf Mountain", new String[]{"Gnome Glider: Sindarpos"}, ""),
    ZOMBIES("Zombies", new WorldPoint[]{new WorldPoint(3630,3530,0)}, "West of Ecto Altar", new String[]{"Ectophial: Empty"}, "Both Cows and Chickens count towards Zombie task");

    private static final Map<String, Task> tasks;

    private final String name;
    private final WorldPoint[] worldPoints; // Both surface and underground
    private final String location;
    private final String[] teleports;
    private final String info;

    static
    {
        ImmutableMap.Builder<String, Task> builder = new ImmutableMap.Builder<>();

        for (Task task : values())
        {
            builder.put(task.getName().toLowerCase(), task);
        }

        tasks = builder.build();
    }

    Task(String name, WorldPoint[] worldPoints, String location, String[] teleports, String info)
    {
        this.name = name;
        this.worldPoints = worldPoints;
        this.location = location;
        this.teleports = teleports;
        this.info = info;
    }

    @Nullable
    static Task getTask(String taskName)
    {
        return tasks.get(taskName.toLowerCase());
    }
}
