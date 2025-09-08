/*
 * Copyright (c) 2025, wesley-221
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

import com.brastasauce.turaelskipping.models.NpcLocation;
import com.brastasauce.turaelskipping.models.SlayerTask;
import com.brastasauce.turaelskipping.utils.WorldAreaUtils;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.gameval.NpcID;

import java.util.List;
import java.util.Map;

public class SlayerTaskRegistry {
    private final static Map<String, SlayerTask> TURAEL_TASKS = Map.ofEntries(
            Map.entry("banshees", new SlayerTask("Banshees", List.of(NpcID.SLAYER_BANSHEE_1), List.of(
                            new WorldPoint(3442, 3542, 0)
                    ), List.of(
                            new NpcLocation("Morytania Slayer Tower", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(3431, 3530, 0),
                                            new WorldPoint(3452, 3567, 0)
                                    )
                            ), new String[]{"Slayer Ring: Morytania Slayer Tower (Option 2)"})
                    ))
            ),
            Map.entry("bats", new SlayerTask("Bats", List.of(NpcID.SMALL_BAT), List.of(
                            new WorldPoint(3351, 3490, 0)
                    ), List.of(
                            new NpcLocation("Silvarea, North of Digsite", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(3327, 3475, 0),
                                            new WorldPoint(3398, 3507, 0)
                                    )
                            ), new String[]{"Ring of the elements: Earth Altar (Option 3)", "Digsite pendant (Option 1)", "Digsite/Lumberyard teleport"})
                    ))
            ),
            Map.entry("bears", new SlayerTask("Bears", List.of(NpcID.BROWNBEAR), List.of(
                            new WorldPoint(2700, 3330, 0)
                    ), List.of(
                            new NpcLocation("South-west of Legends' Guild", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(2687, 3318, 0),
                                            new WorldPoint(2722, 3351, 0)
                                    )
                            ), new String[]{"Fairy ring: BLR", "Quest Cape teleport"})
                    ))
            ),
            Map.entry("birds", new SlayerTask("Birds", List.of(NpcID.DUCK, NpcID.DUCK_FEMALE), List.of(
                            new WorldPoint(3178, 3359, 0)
                    ), List.of(
                            new NpcLocation("West of the Champions' Guild", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(3153, 3337, 0),
                                            new WorldPoint(3202, 3362, 0)
                                    )
                            ), new String[]{"Chronicle teleport"})
                    ))
            ),
            Map.entry("cave bugs", new SlayerTask("Cave bugs", List.of(NpcID.SWAMP_CAVE_BUG), List.of(
                            new WorldPoint(3206, 3217, 0),
                            new WorldPoint(2786, 5318, 0)
                    ), List.of(
                            new NpcLocation("Dorgesh-Kaan South Dungeon", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(2708, 5221, 0),
                                            new WorldPoint(2721, 5245, 0)
                                    )
                            ), new String[]{"Fairy ring: AJQ"})
                    ), "Bring a light source")
            ),
            Map.entry("cave crawlers", new SlayerTask("Cave Crawlers", List.of(NpcID.SLAYER_CAVE_CRAWLER_1, NpcID.SLAYER_CAVE_CRAWLER_2, NpcID.SLAYER_CAVE_CRAWLER_3, NpcID.SLAYER_CAVE_CRAWLER_4), List.of(
                            new WorldPoint(2789, 3617, 0),
                            new WorldPoint(2795, 9997, 0)
                    ), List.of(
                            new NpcLocation("Fremennik Slayer Dungeon", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(2777, 9987, 0),
                                            new WorldPoint(2799, 10007, 0)
                                    )
                            ), new String[]{"Slayer ring: Fremennik Slayer Dungeon (Option 3)", "Fairy ring: AJR"})
                    ))
            ),
            Map.entry("cave slimes", new SlayerTask("Cave slimes", List.of(NpcID.SWAMP_CAVE_SLIME), List.of(
                            new WorldPoint(3206, 3217, 0),
                            new WorldPoint(2786, 5318, 0)
                    ), List.of(
                            new NpcLocation("Dorgesh-Kaan South Dungeon", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(2692, 5227, 0),
                                            new WorldPoint(2708, 5242, 0)
                                    ),
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(2722, 5232, 0),
                                            new WorldPoint(2735, 5239, 0)
                                    )
                            ), new String[]{"Fairy ring: AJQ"})
                    ), "Bring a light source")
            ),
            // My preferred area for this task, keep it for when alternative locations are added
//            Map.entry("cows", new SlayerTask("Cows", List.of(NpcID.AHOY_UNDEAD_COW), List.of(
//                            new NpcLocation("Alice's Farm, west of the Ectofuntus", List.of(
//                                    WorldAreaUtils.fromCorners(
//                                            new WorldPoint(3608, 3521, 0),
//                                            new WorldPoint(3637, 3534, 0)
//                                    )
//                            ), new String[]{"Ectophial: Empty"})
//                    ))
//            ),
            Map.entry("cows", new SlayerTask("Cows", List.of(
                            NpcID.COW,
                            NpcID.COW2,
                            NpcID.COW3,
                            NpcID.COW2_CALF,
                            NpcID.COW3_CALF), List.of(
                            new WorldPoint(3257, 3273, 0)
                    ), List.of(
                            new NpcLocation("Lumbridge", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(3266, 3254, 0),
                                            new WorldPoint(3240, 3298, 0)
                                    )
                            ), new String[]{"Achievement diary cape: Lumbridge (Option B)", "Lumbridge teleport"})
                    ))
            ),
            Map.entry("crawling hands", new SlayerTask("Crawling Hands", List.of(
                            NpcID.SLAYER_CRAWLING_HAND_1,
                            NpcID.SLAYER_CRAWLING_HAND_2,
                            NpcID.SLAYER_CRAWLING_HAND_3,
                            NpcID.SLAYER_CRAWLING_HAND_4,
                            NpcID.SLAYER_CRAWLING_HAND_5,
                            NpcID.SLAYER_CRAWLING_HAND_BIG_1,
                            NpcID.SLAYER_CRAWLING_HAND_BIG_2,
                            NpcID.SLAYER_CRAWLING_HAND_BIG_3,
                            NpcID.SLAYER_CRAWLING_HAND_BIG_4,
                            NpcID.SLAYER_CRAWLING_HAND_BIG_5), List.of(
                            new WorldPoint(3419, 3571, 0)
                    ), List.of(
                            new NpcLocation("Morytania Slayer Tower", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(3408, 3539, 0),
                                            new WorldPoint(3445, 3577, 0)
                                    )
                            ), new String[]{"Slayer Ring: Morytania Slayer Tower (Option 2)"})
                    ))
            ),
            Map.entry("dogs", new SlayerTask("Dogs", List.of(NpcID.ICS_LITTLE_JACKAL_ALT), List.of(
                            new WorldPoint(3347, 2783, 0)
                    ), List.of(
                            new NpcLocation("East of Sophanem", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(3329, 2770, 0),
                                            new WorldPoint(3351, 2788, 0)
                                    )
                            ), new String[]{"Pharaoh's sceptre: Jaleustrophos (Option 2)"})
                    ))
            ),
            Map.entry("dwarves", new SlayerTask("Dwarves", List.of(NpcID.DWARF_MOUNTAIN), List.of(
                            new WorldPoint(2819, 3490, 0),
                            new WorldPoint(2863, 9878, 0)
                    ), List.of(
                            new NpcLocation("White Wolf Tunnel pub", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(2856, 9867, 0),
                                            new WorldPoint(2872, 9885, 0)
                                    )
                            ), new String[]{"Construction cape: Taverley (Option 3)", "Re-direct house tab (Option 2)"})
                    ))
            ),
            Map.entry("ghosts", new SlayerTask("Ghosts", List.of(NpcID.KOUREND_GHOST1), List.of(
                            new WorldPoint(1639, 3673, 0),
                            new WorldPoint(1693, 10063, 0)
                    ), List.of(
                            new NpcLocation("Catacombs of Kourend", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(1680, 10053, 0),
                                            new WorldPoint(1703, 10070, 0)
                                    )
                            ), new String[]{"Achievement diary cape: Kourend Castle (Option A)", "Xeric's talisman: Xeric's Heart (Option 4)"})
                    ))
            ),
            // When getting a Goblin task from Aya, it is named "goblin", when you talk to her again after it is named "goblins"
            // When checking through slayer helm, it is named "goblins"
            Map.entry("goblin", createGoblinTask("Goblin")),
            Map.entry("goblins", createGoblinTask("Goblins")),
            Map.entry("icefiends", new SlayerTask("Icefiends", List.of(NpcID.SLAYER_ICEFIEND_1), List.of(
                            new WorldPoint(3007, 3475, 0)
                    ), List.of(
                            new NpcLocation("Ice Mountain", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(2990, 3464, 0),
                                            new WorldPoint(3013, 3489, 0)
                                    )
                            ), new String[]{"Lassar teleport"})
                    ))
            ),
            Map.entry("kalphite", new SlayerTask("Kalphite", List.of(NpcID.KALPHITE_WORKER_STRONGHOLDCAVE), List.of(
                            new WorldPoint(3326, 3122, 0),
                            new WorldPoint(3372, 9528, 0),
                            new WorldPoint(3324, 9502, 0)
                    ), List.of(
                            new NpcLocation("Kalphite Cave", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(3314, 9493, 0),
                                            new WorldPoint(3333, 9511, 0)
                                    ),
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(3297, 9513, 0),
                                            new WorldPoint(3319, 9539, 0)
                                    )
                            ), new String[]{"Desert amulet 4: Kalphite cave"})
                    ))
            ),
            Map.entry("lizards", new SlayerTask("Lizards", List.of(NpcID.SLAYER_LIZARD_SMALL2_SANDY, NpcID.SLAYER_LIZARD_SMALL1_GREEN), List.of(
                            new WorldPoint(3413, 3035, 0)
                    ), List.of(
                            new NpcLocation("North of Nardah Fairy Ring", List.of(
                                    WorldAreaUtils.fromCorners(new WorldPoint(3392, 3027, 0), new WorldPoint(3423, 3049, 0)),
                                    WorldAreaUtils.fromCorners(new WorldPoint(3392, 3050, 0), new WorldPoint(3423, 3069, 0)),
                                    WorldAreaUtils.fromCorners(new WorldPoint(3424, 3050, 0), new WorldPoint(3451, 3069, 0)),
                                    WorldAreaUtils.fromCorners(new WorldPoint(3424, 3027, 0), new WorldPoint(3451, 3049, 0))
                            ), new String[]{"Fairy ring: DLQ"})
                    ), "Bring Ice coolers")
            ),
            Map.entry("minotaurs", new SlayerTask("Minotaurs", List.of(NpcID.SOS_WAR_MINOTAUR), List.of(
                            new WorldPoint(3084, 3417, 0),
                            new WorldPoint(1875, 5218, 0)
                    ), List.of(
                            new NpcLocation("Stronghold of Security", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(1869, 5210, 0),
                                            new WorldPoint(1885, 5223, 0)
                                    )
                            ), new String[]{"Skull sceptre: Invoke"})
                    ))
            ),
            Map.entry("monkeys", new SlayerTask("Monkeys", List.of(NpcID.MM2_MANIACAL_MONKEY_MAZE), List.of(
                            new WorldPoint(2713, 2794, 0)
                    ), List.of(
                            new NpcLocation("Kruk's Dungeon", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(2306, 9141, 1),
                                            new WorldPoint(2332, 9163, 1)
                                    )
                            ), new String[]{"Gnome Glider: Ookookolly Undri"})
                    ), "Run south and open the trapdoor, bring a light source")
            ),
            Map.entry("rats", new SlayerTask("rats", List.of(NpcID.RAT, NpcID.DUNGEON_RAT), List.of(
                            new WorldPoint(3240, 3458, 0),
                            new WorldPoint(3237, 9866, 0)
                    ), List.of(
                            new NpcLocation("Varrock Sewers", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(3218, 9857, 0),
                                            new WorldPoint(3252, 9875, 0)
                                    )
                            ), new String[]{"Achievement diary cape: Varrock (Option D)", "Varrock teleport"})
                    ))
            ),
            Map.entry("scorpions", new SlayerTask("Scorpions", List.of(NpcID.SCORPION), List.of(
                            new WorldPoint(3299, 3301, 0)
                    ), List.of(
                            new NpcLocation("Al Kharid Mines", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(3288, 3273, 0),
                                            new WorldPoint(3309, 3320, 0)
                                    )
                            ), new String[]{"Ring of the elements: Fire Altar (Option 4)", "Ring of dueling: Emir's Arena (Option 1)"})
                    ))
            ),
            Map.entry("skeletons", new SlayerTask("Skeletons", List.of(
                            NpcID.SKELETON_UNARMED,
                            NpcID.SKELETON_UNARMED2,
                            NpcID.SKELETON_UNARMED3,
                            NpcID.SKELETON_UNARMED4
                    ), List.of(
                            new WorldPoint(3352, 3417, 0)
                    ), List.of(
                            new NpcLocation("Digsite Dungeon", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(3359, 9739, 0),
                                            new WorldPoint(3387, 9757, 0)
                                    )
                            ), new String[]{"Digsite pendant (Option 1)", "Digsite teleport"})
                    ), "Bring a rope")
            ),
            Map.entry("spiders", new SlayerTask("Spiders", List.of(NpcID.SPIDER, NpcID.GIANTSPIDER1), List.of(
                            new WorldPoint(3168, 3244, 0)
                    ), List.of(
                            new NpcLocation("Outside H.A.M. Hideout", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(3152, 3224, 0),
                                            new WorldPoint(3174, 3256, 0)
                                    )
                            ), new String[]{"Achievement diary cape: Twiggy O'Korn (Option G)", "Ornate Jewellery Box: Draynor Village (Option Q)", "Glory amulet: Draynor Village (Option 3)"})
                    ))
            ),
            Map.entry("wolves", new SlayerTask("Wolves", List.of(NpcID.WHITEWOLF_SENTRY, NpcID.WHITEWOLF, NpcID.WOLFPACK_LEADER_WHITER, NpcID.PACK_WOLF_WHITER), List.of(
                            new WorldPoint(2847, 3498, 0)
                    ), List.of(
                            new NpcLocation("White Wolf Mountain", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(2828, 3477, 0),
                                            new WorldPoint(2865, 3519, 0)
                                    )
                            ), new String[]{"Gnome Glider: Sindarpos"})
                    ))
            ),
            Map.entry("zombies", new SlayerTask("Zombies", List.of(NpcID.AHOY_UNDEAD_COW, NpcID.AHOY_UNDEAD_CHICKEN), List.of(
                            new WorldPoint(3630, 3530, 0)
                    ), List.of(
                            new NpcLocation("Alice's Farm, west of the Ectofuntus", List.of(
                                    WorldAreaUtils.fromCorners(
                                            new WorldPoint(3608, 3521, 0),
                                            new WorldPoint(3637, 3534, 0)
                                    )
                            ), new String[]{"Ectophial: Empty"})
                    ))
            )
    );

    public static SlayerTask getSlayerTaskByNpcName(String npcName) {
        return TURAEL_TASKS.get(npcName);
    }

    /**
     * Creates a Goblin slayer task
     *
     * @param name the name of the task, for goblins in specific this should be "goblin" and "goblins"
     * @return the goblin slayer task
     */
    private static SlayerTask createGoblinTask(String name) {
        return new SlayerTask(name, List.of(
                NpcID.GOBLIN_UNARMED_MELEE_1,
                NpcID.GOBLIN_UNARMED_MELEE_2,
                NpcID.GOBLIN_UNARMED_MELEE_3,
                NpcID.GOBLIN_UNARMED_MELEE_5,
                NpcID.GOBLIN_UNARMED_MELEE_6,
                NpcID.GOBLIN_UNARMED_MELEE_7,
                NpcID.GOBLIN_UNARMED_MELEE_8
        ), List.of(
                new WorldPoint(3145, 3301, 0)
        ), List.of(
                new NpcLocation("South-East of Draynor Manor", List.of(
                        WorldAreaUtils.fromCorners(
                                new WorldPoint(3132, 3291, 0),
                                new WorldPoint(3156, 3312, 0)
                        )
                ), new String[]{"Draynor manor teleport", "Ornate Jewellery Box: Draynor Village (Option Q)", "Glory amulet: Draynor Village (Option 3)"})
        ), "South of the Sourhog Cave");
    }
}
