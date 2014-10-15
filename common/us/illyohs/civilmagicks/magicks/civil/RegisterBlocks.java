/**
 * Copyright (c) 2014, Anthony Anderson(Lord Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package us.illyohs.civilmagicks.magicks.civil;

import net.minecraft.init.Blocks;

import us.illyohs.civilmagicks.api.civilregistry.CivilRegistry;
import us.illyohs.civilmagicks.api.civilregistry.CivilStatus;

public class RegisterBlocks {

    public static void reg() {

        // Civilized
        CivilRegistry.registerBlock(Blocks.acacia_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.oak_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.oak_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.birch_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.brick_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.nether_brick_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.quartz_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.dark_oak_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.gold_block, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.iron_block, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.emerald_block, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.lapis_block, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.quartz_block, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.bookshelf, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.cake, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.cauldron, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.carpet, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.glass, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.glass_pane, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.stained_glass, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.chest, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.cobblestone_wall, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.fence, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.fence_gate, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.nether_brick_fence, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.brick_block, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.nether_brick, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerBlock(Blocks.beacon, 0, CivilStatus.CIVILIZED);

        // Uncivilized
        CivilRegistry.registerBlock(Blocks.anvil, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.dirt, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.lava, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.flowing_lava, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.cobblestone, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.stone, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.gravel, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.grass, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.tallgrass, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.vine, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.pumpkin, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.web, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.deadbush, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.waterlily, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.cactus, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.coal_ore, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.tnt, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.sticky_piston, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.mob_spawner, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.netherrack, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.nether_wart, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.tripwire, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.tripwire_hook, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.trapped_chest, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.clay, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.stained_hardened_clay, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.hardened_clay, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.soul_sand, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.sand, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.wooden_door, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.ice, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.packed_ice, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.bed, 0, CivilStatus.UNCIVILIZED); // ?
        CivilRegistry.registerBlock(Blocks.piston, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.piston_extension, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.piston_head, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.hardened_clay, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.hay_block, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.obsidian, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.iron_ore, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.gold_ore, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.lapis_ore, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.quartz_ore, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.coal_block, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.log, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.log, 1, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.log, 2, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.log, 3, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.log2, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.log2, 1, CivilStatus.UNCIVILIZED);

    }
}
