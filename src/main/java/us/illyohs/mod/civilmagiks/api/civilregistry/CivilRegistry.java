/**
 * Copyright (c) 2015, Anthony Anderson(Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
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
package us.illyohs.mod.civilmagiks.api.civilregistry;

import java.util.HashMap;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

public class CivilRegistry {
    
    @Deprecated
    public static HashMap<CivilObject, CivilStatus> civilReg = new HashMap<CivilObject, CivilStatus>();
    
    public static HashMap<Object, CivilStatus> reg2 = new HashMap<Object, CivilStatus>();
    

    public CivilRegistry() {
        registerCivilBlocks(CivilStatus.CIVILIZED);
        registerCivilItems(CivilStatus.CIVILIZED);
        registerUnCivilBlocks(CivilStatus.UNCIVILIZED);
        registerUnCivilItems(CivilStatus.UNCIVILIZED);
        
    }
    
    private void registerCivilBlocks(CivilStatus civilized) {
        civilReg.put(new CivilObject(Blocks.acacia_stairs, 0), civilized);
        reg2.put(Blocks.acacia_door, civilized);
        reg2.put(Blocks.acacia_fence, civilized);
        reg2.put(Blocks.acacia_fence_gate, civilized);
        reg2.put(Blocks.acacia_stairs, civilized);
        
        civilReg.put(new CivilObject(Blocks.oak_stairs, 0), civilized);
        civilReg.put(new CivilObject(Blocks.oak_stairs, 0), civilized);
        civilReg.put(new CivilObject(Blocks.birch_stairs, 0), civilized);
        civilReg.put(new CivilObject(Blocks.brick_stairs, 0), civilized);
        civilReg.put(new CivilObject(Blocks.nether_brick_stairs, 0), civilized);
        civilReg.put(new CivilObject(Blocks.quartz_stairs, 0), civilized);
        civilReg.put(new CivilObject(Blocks.dark_oak_stairs, 0), civilized);
        civilReg.put(new CivilObject(Blocks.gold_block, 0), civilized);
        civilReg.put(new CivilObject(Blocks.iron_block, 0), civilized);
        civilReg.put(new CivilObject(Blocks.emerald_block, 0), civilized);
        civilReg.put(new CivilObject(Blocks.lapis_block, 0), civilized);
        civilReg.put(new CivilObject(Blocks.quartz_block, 0), civilized);
        civilReg.put(new CivilObject(Blocks.bookshelf, 0), civilized);
        civilReg.put(new CivilObject(Blocks.cake, 0), civilized);
        civilReg.put(new CivilObject(Blocks.cauldron, 0), civilized);
        civilReg.put(new CivilObject(Blocks.carpet, 0), civilized);
        civilReg.put(new CivilObject(Blocks.glass, 0), civilized);
        civilReg.put(new CivilObject(Blocks.glass_pane, 0), civilized);
        civilReg.put(new CivilObject(Blocks.stained_glass, 0), civilized);
        civilReg.put(new CivilObject(Blocks.chest, 0), civilized);
        civilReg.put(new CivilObject(Blocks.cobblestone_wall, 0), civilized);
        civilReg.put(new CivilObject(Blocks.oak_fence, 0), civilized);
        civilReg.put(new CivilObject(Blocks.oak_fence_gate, 0), civilized);
        //TODO: more fences?
        civilReg.put(new CivilObject(Blocks.nether_brick_fence, 0), civilized);
        civilReg.put(new CivilObject(Blocks.brick_block, 0), civilized);
        civilReg.put(new CivilObject(Blocks.nether_brick, 0), civilized);
        civilReg.put(new CivilObject(Blocks.beacon, 0), civilized);
        civilReg.put(new CivilObject(Blocks.bed, 0), civilized);
                
    }

    private void registerUnCivilBlocks(CivilStatus uncivilized) {
        civilReg.put(new CivilObject(Blocks.anvil, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.dirt, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.lava, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.flowing_lava, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.cobblestone, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.stone, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.gravel, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.grass, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.tallgrass, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.vine, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.pumpkin, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.web, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.deadbush, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.waterlily, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.cactus, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.coal_ore, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.tnt, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.sticky_piston, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.mob_spawner, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.netherrack, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.nether_wart, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.tripwire, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.tripwire_hook, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.trapped_chest, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.clay, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.stained_hardened_clay, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.hardened_clay, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.soul_sand, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.sand, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.oak_door, 0), uncivilized);
        //TODO: add more fences
        civilReg.put(new CivilObject(Blocks.ice, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.packed_ice, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.piston, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.piston_extension, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.piston_head, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.hardened_clay, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.hay_block, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.obsidian, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.iron_ore, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.gold_ore, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.lapis_ore, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.quartz_ore, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.coal_block, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.log, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.log, 1), uncivilized);
        civilReg.put(new CivilObject(Blocks.log, 2), uncivilized);
        civilReg.put(new CivilObject(Blocks.log, 3), uncivilized);
        civilReg.put(new CivilObject(Blocks.log2, 0), uncivilized);
        civilReg.put(new CivilObject(Blocks.log2, 1), uncivilized);
    }

    private void registerUnCivilItems(CivilStatus uncivilized) {        
        civilReg.put(new CivilObject(Items.wooden_axe, 0), uncivilized);
        civilReg.put(new CivilObject(Items.oak_door, 0), uncivilized);
        //TODO: Add more doors
        civilReg.put(new CivilObject(Items.wooden_hoe, 0), uncivilized);
        civilReg.put(new CivilObject(Items.wooden_pickaxe, 0), uncivilized);
        civilReg.put(new CivilObject(Items.wooden_shovel, 0), uncivilized);
        civilReg.put(new CivilObject(Items.wooden_sword, 0), uncivilized);
        civilReg.put(new CivilObject(Items.stick, 0), uncivilized);
        civilReg.put(new CivilObject(Items.arrow, 0), uncivilized);
        civilReg.put(new CivilObject(Items.blaze_powder, 0), uncivilized);
        civilReg.put(new CivilObject(Items.blaze_rod, 0), uncivilized);
        civilReg.put(new CivilObject(Items.bed, 0), uncivilized);
        civilReg.put(new CivilObject(Items.boat, 0), uncivilized);
        civilReg.put(new CivilObject(Items.bone, 0), uncivilized);
        civilReg.put(new CivilObject(Items.bow, 0), uncivilized);
        civilReg.put(new CivilObject(Items.bowl, 0), uncivilized);
        civilReg.put(new CivilObject(Items.bread, 0), uncivilized);
        civilReg.put(new CivilObject(Items.bucket, 0), uncivilized);
        civilReg.put(new CivilObject(Items.carrot_on_a_stick, 0), uncivilized);
        civilReg.put(new CivilObject(Items.carrot, 0), uncivilized);
        civilReg.put(new CivilObject(Items.chest_minecart, 0), uncivilized);
        civilReg.put(new CivilObject(Items.chicken, 0), uncivilized);
        civilReg.put(new CivilObject(Items.clay_ball, 0), uncivilized);
        civilReg.put(new CivilObject(Items.coal, 0), uncivilized);
        civilReg.put(new CivilObject(Items.comparator, 0), uncivilized);
        civilReg.put(new CivilObject(Items.cooked_beef, 0), uncivilized);
        civilReg.put(new CivilObject(Items.cooked_fish, 0), uncivilized);
        civilReg.put(new CivilObject(Items.cooked_chicken, 0), uncivilized);
        civilReg.put(new CivilObject(Items.cooked_porkchop, 0), uncivilized);
        civilReg.put(new CivilObject(Items.cookie, 0), uncivilized);
        civilReg.put(new CivilObject(Items.egg, 0), uncivilized);
        civilReg.put(new CivilObject(Items.ender_eye, 0), uncivilized);
        civilReg.put(new CivilObject(Items.ender_pearl, 0), uncivilized);
        civilReg.put(new CivilObject(Items.experience_bottle, 0), uncivilized);
        civilReg.put(new CivilObject(Items.fermented_spider_eye, 0), uncivilized);
        civilReg.put(new CivilObject(Items.fire_charge, 0), uncivilized);
        civilReg.put(new CivilObject(Items.fish, 0), uncivilized);
        civilReg.put(new CivilObject(Items.fishing_rod, 0), uncivilized);
        civilReg.put(new CivilObject(Items.flint, 0), uncivilized);
        civilReg.put(new CivilObject(Items.flint_and_steel, 0), uncivilized);
        civilReg.put(new CivilObject(Items.furnace_minecart, 0), uncivilized);
        civilReg.put(new CivilObject(Items.glowstone_dust, 0), uncivilized);
        civilReg.put(new CivilObject(Items.gunpowder, 0), uncivilized);
        civilReg.put(new CivilObject(Items.hopper_minecart, 0), uncivilized);
        civilReg.put(new CivilObject(Items.iron_axe, 0), uncivilized);
        civilReg.put(new CivilObject(Items.iron_boots, 0), uncivilized);
        civilReg.put(new CivilObject(Items.iron_chestplate, 0), uncivilized);
        civilReg.put(new CivilObject(Items.iron_helmet, 0), uncivilized);
        civilReg.put(new CivilObject(Items.iron_hoe, 0), uncivilized);
        civilReg.put(new CivilObject(Items.iron_horse_armor, 0), uncivilized);
        civilReg.put(new CivilObject(Items.iron_ingot, 0), uncivilized);
        civilReg.put(new CivilObject(Items.iron_leggings, 0), uncivilized);
        civilReg.put(new CivilObject(Items.iron_pickaxe, 0), uncivilized);
        civilReg.put(new CivilObject(Items.iron_shovel, 0), uncivilized);
        civilReg.put(new CivilObject(Items.iron_sword, 0), uncivilized);
        civilReg.put(new CivilObject(Items.lava_bucket, 0), uncivilized);
        civilReg.put(new CivilObject(Items.leather, 0), uncivilized);
        civilReg.put(new CivilObject(Items.leather_boots, 0), uncivilized);
        civilReg.put(new CivilObject(Items.leather_helmet, 0), uncivilized);
        civilReg.put(new CivilObject(Items.leather_chestplate, 0), uncivilized);
        civilReg.put(new CivilObject(Items.leather_leggings, 0), uncivilized);
        civilReg.put(new CivilObject(Items.magma_cream, 0), uncivilized);
        civilReg.put(new CivilObject(Items.melon, 0), uncivilized);
        civilReg.put(new CivilObject(Items.melon_seeds, 0), uncivilized);
        civilReg.put(new CivilObject(Items.minecart, 0), uncivilized);
        civilReg.put(new CivilObject(Items.mushroom_stew, 0), uncivilized);
        civilReg.put(new CivilObject(Items.nether_wart, 0), uncivilized);
        civilReg.put(new CivilObject(Items.poisonous_potato, 0), uncivilized);
        civilReg.put(new CivilObject(Items.porkchop, 0), uncivilized);
        civilReg.put(new CivilObject(Items.potato, 0), uncivilized);
        civilReg.put(new CivilObject(Items.pumpkin_pie, 0), uncivilized);
        civilReg.put(new CivilObject(Items.pumpkin_seeds, 0), uncivilized);
        civilReg.put(new CivilObject(Items.repeater, 0), uncivilized);
        civilReg.put(new CivilObject(Items.rotten_flesh, 0), uncivilized);
        civilReg.put(new CivilObject(Items.reeds, 0), uncivilized);
        civilReg.put(new CivilObject(Items.redstone, 0), uncivilized);
        civilReg.put(new CivilObject(Items.shears, 0), uncivilized);
        civilReg.put(new CivilObject(Items.skull, 0), uncivilized);
        civilReg.put(new CivilObject(Items.slime_ball, 0), uncivilized);
        civilReg.put(new CivilObject(Items.snowball, 0), uncivilized);
        civilReg.put(new CivilObject(Items.spawn_egg, 0), uncivilized);
        civilReg.put(new CivilObject(Items.speckled_melon, 0), uncivilized);
        civilReg.put(new CivilObject(Items.spider_eye, 0), uncivilized);
        civilReg.put(new CivilObject(Items.sugar, 0), uncivilized);
        civilReg.put(new CivilObject(Items.stone_axe, 0), uncivilized);
        civilReg.put(new CivilObject(Items.stone_hoe, 0), uncivilized);
        civilReg.put(new CivilObject(Items.stone_pickaxe, 0), uncivilized);
        civilReg.put(new CivilObject(Items.stone_shovel, 0), uncivilized);
        civilReg.put(new CivilObject(Items.stone_sword, 0), uncivilized);
        civilReg.put(new CivilObject(Items.tnt_minecart, 0), uncivilized);
        civilReg.put(new CivilObject(Items.water_bucket, 0), uncivilized);
        civilReg.put(new CivilObject(Items.wheat, 0), uncivilized);
        civilReg.put(new CivilObject(Items.wheat_seeds, 0), uncivilized);
        
    }

    private void registerCivilItems(CivilStatus civilized) {
        civilReg.put(new CivilObject(Items.apple, 0), civilized);
        civilReg.put(new CivilObject(Items.book, 0), civilized);
        civilReg.put(new CivilObject(Items.brewing_stand, 0), civilized);
        civilReg.put(new CivilObject(Items.brick, 0), civilized);
        civilReg.put(new CivilObject(Items.cake, 0), civilized);
        civilReg.put(new CivilObject(Items.baked_potato, 0), civilized);
        civilReg.put(new CivilObject(Items.chainmail_boots, 0), civilized);
        civilReg.put(new CivilObject(Items.chainmail_chestplate, 0), civilized);
        civilReg.put(new CivilObject(Items.chainmail_helmet, 0), civilized);
        civilReg.put(new CivilObject(Items.chainmail_leggings, 0), civilized);
        civilReg.put(new CivilObject(Items.cauldron, 0), civilized);
        civilReg.put(new CivilObject(Items.clock, 0), civilized);
        civilReg.put(new CivilObject(Items.compass, 0), civilized);
        civilReg.put(new CivilObject(Items.diamond, 0), civilized);
        civilReg.put(new CivilObject(Items.diamond_axe, 0), civilized); //?
        civilReg.put(new CivilObject(Items.diamond_boots, 0), civilized); //?
        civilReg.put(new CivilObject(Items.diamond_chestplate, 0), civilized); //?
        civilReg.put(new CivilObject(Items.diamond_helmet, 0), civilized);
        civilReg.put(new CivilObject(Items.diamond_hoe, 0), civilized); //? could make it uncivilized for the sake of a dirty joke
        civilReg.put(new CivilObject(Items.diamond_horse_armor, 0), civilized); //?
        civilReg.put(new CivilObject(Items.diamond_leggings, 0), civilized); //?
        civilReg.put(new CivilObject(Items.diamond_pickaxe, 0), civilized); //?
        civilReg.put(new CivilObject(Items.diamond_shovel, 0), civilized); //?
        civilReg.put(new CivilObject(Items.diamond_sword, 0), civilized); //?
        civilReg.put(new CivilObject(Items.dye, 0), civilized);
        civilReg.put(new CivilObject(Items.emerald, 0), civilized);
        civilReg.put(new CivilObject(Items.enchanted_book, 0), civilized);
        civilReg.put(new CivilObject(Items.feather, 0), civilized);
        civilReg.put(new CivilObject(Items.filled_map, 0), civilized);
        civilReg.put(new CivilObject(Items.firework_charge, 0), civilized);
        civilReg.put(new CivilObject(Items.fireworks, 0), civilized);
        civilReg.put(new CivilObject(Items.flower_pot, 0), civilized);
        civilReg.put(new CivilObject(Items.ghast_tear, 0), civilized);
        civilReg.put(new CivilObject(Items.glass_bottle, 0), civilized);
        civilReg.put(new CivilObject(Items.gold_ingot, 0), civilized);
        civilReg.put(new CivilObject(Items.gold_nugget, 0), civilized);
        civilReg.put(new CivilObject(Items.golden_apple, 0), civilized);
        civilReg.put(new CivilObject(Items.golden_boots, 0), civilized);
        civilReg.put(new CivilObject(Items.golden_carrot, 0), civilized);
        civilReg.put(new CivilObject(Items.golden_chestplate, 0), civilized);
        civilReg.put(new CivilObject(Items.golden_helmet, 0), civilized);
        civilReg.put(new CivilObject(Items.golden_hoe, 0), civilized);
        civilReg.put(new CivilObject(Items.golden_horse_armor, 0), civilized);
        civilReg.put(new CivilObject(Items.golden_leggings, 0), civilized);
        civilReg.put(new CivilObject(Items.golden_leggings, 0), civilized);
        civilReg.put(new CivilObject(Items.golden_pickaxe, 0), civilized);
        civilReg.put(new CivilObject(Items.golden_shovel, 0), civilized);
        civilReg.put(new CivilObject(Items.golden_sword, 0), civilized);
        civilReg.put(new CivilObject(Items.item_frame, 0), civilized);
        civilReg.put(new CivilObject(Items.lead, 0), civilized);
        civilReg.put(new CivilObject(Items.map, 0), civilized);
        civilReg.put(new CivilObject(Items.milk_bucket, 0), civilized);
        civilReg.put(new CivilObject(Items.netherbrick, 0), civilized);
        civilReg.put(new CivilObject(Items.name_tag, 0), civilized);
        civilReg.put(new CivilObject(Items.nether_star, 0), civilized);
        civilReg.put(new CivilObject(Items.painting, 0), civilized);
        civilReg.put(new CivilObject(Items.paper, 0), civilized);
        civilReg.put(new CivilObject(Items.quartz, 0), civilized);
        civilReg.put(new CivilObject(Items.record_13, 0), civilized);
        civilReg.put(new CivilObject(Items.record_blocks, 0), civilized);
        civilReg.put(new CivilObject(Items.record_cat, 0), civilized);
        civilReg.put(new CivilObject(Items.record_chirp, 0), civilized);
        civilReg.put(new CivilObject(Items.record_far, 0), civilized);
        civilReg.put(new CivilObject(Items.record_mall, 0), civilized);
        civilReg.put(new CivilObject(Items.record_mellohi, 0), civilized);
        civilReg.put(new CivilObject(Items.record_stal, 0), civilized);
        civilReg.put(new CivilObject(Items.record_strad, 0), civilized);
        civilReg.put(new CivilObject(Items.record_wait, 0), civilized);
        civilReg.put(new CivilObject(Items.record_ward, 0), civilized);
        civilReg.put(new CivilObject(Items.sign, 0), civilized);
        civilReg.put(new CivilObject(Items.saddle, 0), civilized);
        civilReg.put(new CivilObject(Items.string, 0), civilized);
        civilReg.put(new CivilObject(Items.writable_book, 0), civilized);
        civilReg.put(new CivilObject(Items.written_book, 0), civilized);
        
    }


}
