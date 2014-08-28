/**
 * This class was created by Anthony Anderson(Lord Illyohs)
 * It is distributed as part of CivilMagicks
 * Source Code: https://github.com/LordIllyohs/CivilMagicks
 *
 * CivilMagicks is Open Source and distributed under a
 * Attribution-NonCommercial-ShareAlike 3.0 Unported license.
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/)
 *
 * 
 * Class created on ?
 * 
 */
package us.illyohs.civilmagicks.common.core;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
//import thaumcraft.common.config.ConfigBlocks;
import us.illyohs.civilmagicks.common.block.ModBlock;
import us.illyohs.civilmagicks.common.core.civilreg.CivilRegistry;
import us.illyohs.civilmagicks.common.core.civilreg.CivilStatus;
import us.illyohs.civilmagicks.common.item.ModItem;

public class RegCivilObjects {



    public static void nonModObjects() {

        /**
         * Blocks
         */
        //Civilized
        CivilRegistry.registerStatus(Blocks.acacia_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.oak_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.oak_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.birch_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.brick_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.nether_brick_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.quartz_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.dark_oak_stairs, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.gold_block, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.iron_block, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.emerald_block, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.lapis_block, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.quartz_block, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.bookshelf, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.cake, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.cauldron, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.carpet, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.glass, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.glass_pane, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.stained_glass, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.chest, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.cobblestone_wall, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.fence, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.fence_gate, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.nether_brick_fence, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.brick_block, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.nether_brick, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Blocks.beacon, 0, CivilStatus.CIVILIZED);


        //Uncivilized
        CivilRegistry.registerStatus(Blocks.anvil, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.dirt, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.lava, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.flowing_lava, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.cobblestone, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.stone, 0, CivilStatus.UNCIVILIZED); //NOTE: not sure if this should be uncivilized is it to common to be civilized?
        CivilRegistry.registerStatus(Blocks.gravel, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.grass, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.tallgrass, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.vine, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.pumpkin, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.web, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.deadbush, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.waterlily, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.cactus, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.coal_ore, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.tnt, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.sticky_piston, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.mob_spawner, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.netherrack, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.nether_wart, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.tripwire, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.tripwire_hook, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.trapped_chest, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.clay, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.stained_hardened_clay, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.hardened_clay, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.soul_sand, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.sand, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.wooden_door, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.ice, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.packed_ice, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.bed, 0, CivilStatus.UNCIVILIZED); //NOTE: Could this be civilized?
        CivilRegistry.registerStatus(Blocks.piston, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.piston_extension, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.piston_head, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.hardened_clay, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.hay_block, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.obsidian, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.iron_ore, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.gold_ore, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.lapis_ore, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.quartz_ore, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.coal_block, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.log, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.log, 1, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.log, 2, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.log, 3, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.log2, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Blocks.log2, 1, CivilStatus.UNCIVILIZED);


        /**
         * Items
         */
        //Civilized
        CivilRegistry.registerStatus(Items.apple, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.book, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.brewing_stand, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.brick, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.cake, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.baked_potato, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.chainmail_boots, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.chainmail_chestplate, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.chainmail_helmet, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.chainmail_leggings, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.cauldron, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.clock, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.compass, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerStatus(Items.diamond, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerStatus(Items.diamond_axe, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerStatus(Items.diamond_boots, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerStatus(Items.diamond_chestplate, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerStatus(Items.diamond_helmet, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerStatus(Items.diamond_hoe, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerStatus(Items.diamond_horse_armor, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerStatus(Items.diamond_leggings, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerStatus(Items.diamond_pickaxe, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerStatus(Items.diamond_shovel, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerStatus(Items.diamond_sword, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerStatus(Items.dye, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.emerald, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.enchanted_book, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.feather, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.filled_map, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.firework_charge, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.fireworks, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.flower_pot, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.ghast_tear, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.glass_bottle, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.gold_ingot, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerStatus(Items.gold_nugget, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.golden_apple, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerStatus(Items.golden_boots, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerStatus(Items.golden_carrot, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerStatus(Items.golden_chestplate, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerStatus(Items.golden_helmet, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerStatus(Items.golden_hoe, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerStatus(Items.golden_horse_armor, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerStatus(Items.golden_leggings, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerStatus(Items.golden_leggings, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerStatus(Items.golden_pickaxe, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerStatus(Items.golden_shovel, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerStatus(Items.golden_sword, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerStatus(Items.item_frame, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.lead, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.map, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.milk_bucket, 0, CivilStatus.CIVILIZED); //Note: MILK IS ALWAYS CIVIL :P
        CivilRegistry.registerStatus(Items.netherbrick, 0, CivilStatus.CIVILIZED); //Note: Should this be civilized?
        CivilRegistry.registerStatus(Items.name_tag, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.nether_star, 0, CivilStatus.CIVILIZED); //Note: Should this be civilized?
        CivilRegistry.registerStatus(Items.painting, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.paper, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.quartz, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.record_13, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.record_blocks, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.record_cat, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.record_chirp, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.record_far, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.record_mall, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.record_mellohi, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.record_stal, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.record_strad, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.record_wait, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.record_ward, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.sign, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.saddle, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.string, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.writable_book, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerStatus(Items.written_book, 0, CivilStatus.CIVILIZED);

        //Uncivilized
        CivilRegistry.registerStatus(Items.wooden_axe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.wooden_door, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.wooden_hoe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.wooden_pickaxe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.wooden_shovel, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.wooden_sword, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.stick, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.arrow, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.blaze_powder, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.blaze_rod, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.bed, 0, CivilStatus.UNCIVILIZED); //NOTE: Should this be uncivilized? 
        CivilRegistry.registerStatus(Items.boat, 0, CivilStatus.UNCIVILIZED); //NOTE: Should this be uncivilized?
        CivilRegistry.registerStatus(Items.bone, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.bow, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.bowl, 0, CivilStatus.UNCIVILIZED); //NOTE: Should this be uncivilized?
        CivilRegistry.registerStatus(Items.bread, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.bucket, 0, CivilStatus.UNCIVILIZED); //Note: Should this be uncivilized?
        CivilRegistry.registerStatus(Items.carrot_on_a_stick, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.carrot, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.chest_minecart, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.chicken, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.clay_ball, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.coal, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.comparator, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.cooked_beef, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.cooked_fished, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.cooked_chicken, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.cooked_porkchop, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.cookie, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.egg, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.ender_eye, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.ender_pearl, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.experience_bottle, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.fermented_spider_eye, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.fire_charge, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.fish, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.fishing_rod, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.flint, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.flint_and_steel, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.furnace_minecart, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.glowstone_dust, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.gunpowder, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.hopper_minecart, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.iron_axe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.iron_boots, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.iron_chestplate, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.iron_helmet, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.iron_hoe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.iron_horse_armor, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.iron_ingot, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.iron_leggings, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.iron_pickaxe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.iron_shovel, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.iron_sword, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.lava_bucket, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.leather, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.leather_boots, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.leather_helmet, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.leather_chestplate, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.leather_leggings, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.magma_cream, 0, CivilStatus.UNCIVILIZED); //NOTE: Should this be uncivilized?
        CivilRegistry.registerStatus(Items.melon, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.melon_seeds, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.minecart, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.mushroom_stew, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.nether_wart, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.poisonous_potato, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.porkchop, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.potato, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.pumpkin_pie, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.pumpkin_seeds, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.repeater, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.rotten_flesh, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.reeds, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.redstone, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.shears, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.skull, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.slime_ball, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.snowball, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.spawn_egg, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.speckled_melon, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.spider_eye, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.sugar, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.stone_axe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.stone_hoe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.stone_pickaxe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.stone_shovel, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.stone_sword, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.tnt_minecart, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.water_bucket, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.wheat, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerStatus(Items.wheat_seeds, 0, CivilStatus.UNCIVILIZED);

    }


    public static void ModObjects() {
        
        /**
         * Blocks
         */
        //Civilized
        CivilRegistry.registerStatus(ModBlock.civilStar, 0, CivilStatus.CIVILIZED);
        
        /**
         * Items
         */
        //Civilized
        CivilRegistry.registerStatus(ModItem.callingWhistle, 0, CivilStatus.CIVILIZED);

    }

    	public static void Thaumcraft() {
//    	    CivilRegistry.registerStatus(ConfigBlocks.blockAiry, 0, CivilStatus.CIVILIZED);
//    	    CivilRegistry.registerStatus(ConfigBlocks.blockArcaneDoor, 0, CivilStatus.CIVILIZED);
    	}

}