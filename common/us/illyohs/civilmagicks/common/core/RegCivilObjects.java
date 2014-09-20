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
import us.illyohs.civilmagicks.api.civilregistry.CivilRegistry;
import us.illyohs.civilmagicks.api.civilregistry.CivilStatus;
//import thaumcraft.common.config.ConfigBlocks;

public class RegCivilObjects {

    public static void nonModObjects() {

        /**
         * Blocks
         */
        //Civilized
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

        //Uncivilized
        CivilRegistry.registerBlock(Blocks.anvil, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.dirt, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.lava, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.flowing_lava, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.cobblestone, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerBlock(Blocks.stone, 0, CivilStatus.UNCIVILIZED); //NOTE: not sure if this should be uncivilized is it to common to be civilized?
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
        CivilRegistry.registerBlock(Blocks.bed, 0, CivilStatus.UNCIVILIZED); //NOTE: Could this be civilized?
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

        /**
         * Items
         */
        //Civilized
        CivilRegistry.registerItem(Items.apple, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.book, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.brewing_stand, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.brick, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.cake, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.baked_potato, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.chainmail_boots, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.chainmail_chestplate, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.chainmail_helmet, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.chainmail_leggings, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.cauldron, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.clock, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.compass, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerItem(Items.diamond, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerItem(Items.diamond_axe, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerItem(Items.diamond_boots, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerItem(Items.diamond_chestplate, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerItem(Items.diamond_helmet, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerItem(Items.diamond_hoe, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerItem(Items.diamond_horse_armor, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerItem(Items.diamond_leggings, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerItem(Items.diamond_pickaxe, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerItem(Items.diamond_shovel, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
        CivilRegistry.registerItem(Items.diamond_sword, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerItem(Items.dye, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.emerald, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.enchanted_book, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.feather, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.filled_map, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.firework_charge, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.fireworks, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.flower_pot, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.ghast_tear, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.glass_bottle, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.gold_ingot, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerItem(Items.gold_nugget, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.golden_apple, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerItem(Items.golden_boots, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerItem(Items.golden_carrot, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerItem(Items.golden_chestplate, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerItem(Items.golden_helmet, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerItem(Items.golden_hoe, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerItem(Items.golden_horse_armor, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerItem(Items.golden_leggings, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerItem(Items.golden_leggings, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerItem(Items.golden_pickaxe, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerItem(Items.golden_shovel, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerItem(Items.golden_sword, 0, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
        CivilRegistry.registerItem(Items.item_frame, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.lead, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.map, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.milk_bucket, 0, CivilStatus.CIVILIZED); //Note: MILK IS ALWAYS CIVIL :P
        CivilRegistry.registerItem(Items.netherbrick, 0, CivilStatus.CIVILIZED); //Note: Should this be civilized?
        CivilRegistry.registerItem(Items.name_tag, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.nether_star, 0, CivilStatus.CIVILIZED); //Note: Should this be civilized?
        CivilRegistry.registerItem(Items.painting, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.paper, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.quartz, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.record_13, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.record_blocks, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.record_cat, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.record_chirp, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.record_far, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.record_mall, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.record_mellohi, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.record_stal, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.record_strad, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.record_wait, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.record_ward, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.sign, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.saddle, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.string, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.writable_book, 0, CivilStatus.CIVILIZED);
        CivilRegistry.registerItem(Items.written_book, 0, CivilStatus.CIVILIZED);

        //Uncivilized
        CivilRegistry.registerItem(Items.wooden_axe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.wooden_door, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.wooden_hoe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.wooden_pickaxe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.wooden_shovel, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.wooden_sword, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.stick, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.arrow, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.blaze_powder, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.blaze_rod, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.bed, 0, CivilStatus.UNCIVILIZED); //NOTE: Should this be uncivilized? 
        CivilRegistry.registerItem(Items.boat, 0, CivilStatus.UNCIVILIZED); //NOTE: Should this be uncivilized?
        CivilRegistry.registerItem(Items.bone, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.bow, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.bowl, 0, CivilStatus.UNCIVILIZED); //NOTE: Should this be uncivilized?
        CivilRegistry.registerItem(Items.bread, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.bucket, 0, CivilStatus.UNCIVILIZED); //Note: Should this be uncivilized?
        CivilRegistry.registerItem(Items.carrot_on_a_stick, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.carrot, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.chest_minecart, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.chicken, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.clay_ball, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.coal, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.comparator, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.cooked_beef, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.cooked_fished, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.cooked_chicken, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.cooked_porkchop, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.cookie, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.egg, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.ender_eye, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.ender_pearl, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.experience_bottle, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.fermented_spider_eye, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.fire_charge, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.fish, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.fishing_rod, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.flint, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.flint_and_steel, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.furnace_minecart, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.glowstone_dust, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.gunpowder, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.hopper_minecart, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.iron_axe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.iron_boots, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.iron_chestplate, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.iron_helmet, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.iron_hoe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.iron_horse_armor, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.iron_ingot, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.iron_leggings, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.iron_pickaxe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.iron_shovel, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.iron_sword, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.lava_bucket, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.leather, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.leather_boots, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.leather_helmet, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.leather_chestplate, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.leather_leggings, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.magma_cream, 0, CivilStatus.UNCIVILIZED); //NOTE: Should this be uncivilized?
        CivilRegistry.registerItem(Items.melon, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.melon_seeds, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.minecart, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.mushroom_stew, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.nether_wart, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.poisonous_potato, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.porkchop, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.potato, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.pumpkin_pie, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.pumpkin_seeds, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.repeater, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.rotten_flesh, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.reeds, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.redstone, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.shears, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.skull, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.slime_ball, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.snowball, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.spawn_egg, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.speckled_melon, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.spider_eye, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.sugar, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.stone_axe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.stone_hoe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.stone_pickaxe, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.stone_shovel, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.stone_sword, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.tnt_minecart, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.water_bucket, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.wheat, 0, CivilStatus.UNCIVILIZED);
        CivilRegistry.registerItem(Items.wheat_seeds, 0, CivilStatus.UNCIVILIZED);

    }

    public static void ModObjects() {
        
        /**
         * Blocks
         */
        //Civilized
//        CivilRegistry.registerBlock(ModBlock.civilStar, 0, CivilStatus.CIVILIZED);
//        CivilRegistry.registerBlock(ModBlock.brewChamber, 0, CivilStatus.CIVILIZED);
        
        /**
         * Items
         */
        //Civilized
//        CivilRegistry.registerItem(ModItem.callingWhistle, 0, CivilStatus.CIVILIZED);

    }

    	public static void Thaumcraft() {
//    	    CivilRegistry.registerStatus(ConfigBlocks.blockAiry, 0, CivilStatus.CIVILIZED);
//    	    CivilRegistry.registerStatus(ConfigBlocks.blockArcaneDoor, 0, CivilStatus.CIVILIZED);
    	}

}