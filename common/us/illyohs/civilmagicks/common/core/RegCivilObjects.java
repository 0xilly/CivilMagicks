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
import thaumcraft.common.config.ConfigBlocks;
import us.illyohs.civilmagicks.common.core.civilreg.CivilRegistry;
import us.illyohs.civilmagicks.common.core.civilreg.CivilStatus;

public class RegCivilObjects {
	
	public static void nonModblocks() {
//		
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
		

	}

//	public static void nonModItems() {
//		
//		//Civilized
//		CivilRegistry.registerStatus(Items.apple, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.book, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.brewing_stand, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.brick, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.cake, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.baked_potato, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.chainmail_boots, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.chainmail_chestplate, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.chainmail_helmet, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.chainmail_leggings, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.cauldron, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.clock, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.compass, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
//		CivilRegistry.registerStatus(Items.diamond, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
//		CivilRegistry.registerStatus(Items.diamond_axe, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
//		CivilRegistry.registerStatus(Items.diamond_boots, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
//		CivilRegistry.registerStatus(Items.diamond_chestplate, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
//		CivilRegistry.registerStatus(Items.diamond_helmet, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
//		CivilRegistry.registerStatus(Items.diamond_hoe, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
//		CivilRegistry.registerStatus(Items.diamond_horse_armor, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
//		CivilRegistry.registerStatus(Items.diamond_leggings, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
//		CivilRegistry.registerStatus(Items.diamond_pickaxe, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
//		CivilRegistry.registerStatus(Items.diamond_shovel, CivilStatus.CIVILIZED); //NOTE: Should this be civilized? 
//		CivilRegistry.registerStatus(Items.diamond_sword, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
//		CivilRegistry.registerStatus(Items.dye, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.emerald, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.enchanted_book, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.feather, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.filled_map, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.firework_charge, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.fireworks, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.flower_pot, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.ghast_tear, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.glass_bottle, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.gold_ingot, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
//		CivilRegistry.registerStatus(Items.gold_nugget, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.golden_apple, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
//		CivilRegistry.registerStatus(Items.golden_boots, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
//		CivilRegistry.registerStatus(Items.golden_carrot, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
//		CivilRegistry.registerStatus(Items.golden_chestplate, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
//		CivilRegistry.registerStatus(Items.golden_helmet, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
//		CivilRegistry.registerStatus(Items.golden_hoe, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
//		CivilRegistry.registerStatus(Items.golden_horse_armor, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
//		CivilRegistry.registerStatus(Items.golden_leggings, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
//		CivilRegistry.registerStatus(Items.golden_leggings, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
//		CivilRegistry.registerStatus(Items.golden_pickaxe, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
//		CivilRegistry.registerStatus(Items.golden_shovel, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
//		CivilRegistry.registerStatus(Items.golden_sword, CivilStatus.CIVILIZED); //NOTE: Should this be civilized?
//		CivilRegistry.registerStatus(Items.item_frame, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.lead, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.map, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.milk_bucket, CivilStatus.CIVILIZED); //Note: MILK IS ALWAYS CIVIL :P
//		CivilRegistry.registerStatus(Items.netherbrick, CivilStatus.CIVILIZED); //Note: Should this be civilized?
//		CivilRegistry.registerStatus(Items.name_tag, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.nether_star, CivilStatus.CIVILIZED); //Note: Should this be civilized?
//		CivilRegistry.registerStatus(Items.painting, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.paper, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.quartz, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.record_13, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.record_blocks, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.record_cat, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.record_chirp, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.record_far, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.record_mall, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.record_mellohi, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.record_stal, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.record_strad, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.record_wait, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.record_ward, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.sign, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.saddle, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.string, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.writable_book, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(Items.written_book, CivilStatus.CIVILIZED);
//		
//		//Uncivilized
//		CivilRegistry.registerStatus(Items.wooden_axe, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.wooden_door, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.wooden_hoe, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.wooden_pickaxe, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.wooden_shovel, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.wooden_sword, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.stick, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.arrow, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.blaze_powder, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.blaze_rod, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.bed, CivilStatus.UNCIVILIZED); //NOTE: Should this be uncivilized? 
//		CivilRegistry.registerStatus(Items.boat, CivilStatus.UNCIVILIZED); //NOTE: Should this be uncivilized?
//		CivilRegistry.registerStatus(Items.bone, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.bow, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.bowl, CivilStatus.UNCIVILIZED); //NOTE: Should this be uncivilized?
//		CivilRegistry.registerStatus(Items.bread, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.bucket, CivilStatus.UNCIVILIZED); //Note: Should this be uncivilized?
//		CivilRegistry.registerStatus(Items.carrot_on_a_stick, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.carrot, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.chest_minecart, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.chicken, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.clay_ball, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.coal, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.comparator, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.cooked_beef, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.cooked_fished, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.cooked_chicken, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.cooked_porkchop, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.cookie, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.egg, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.ender_eye, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.ender_pearl, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.experience_bottle, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.fermented_spider_eye, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.fire_charge, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.fish, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.fishing_rod, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.flint, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.flint_and_steel, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.furnace_minecart, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.glowstone_dust, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.gunpowder, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.hopper_minecart, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.iron_axe, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.iron_boots, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.iron_chestplate, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.iron_helmet, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.iron_hoe, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.iron_horse_armor, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.iron_ingot, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.iron_leggings, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.iron_pickaxe, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.iron_shovel, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.iron_sword, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.lava_bucket, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.leather, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.leather_boots, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.leather_helmet, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.leather_chestplate, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.leather_leggings, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.magma_cream, CivilStatus.UNCIVILIZED); //NOTE: Should this be uncivilized?
//		CivilRegistry.registerStatus(Items.melon, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.melon_seeds, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.minecart, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.mushroom_stew, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.nether_wart, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.poisonous_potato, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.porkchop, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.potato, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.pumpkin_pie, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.pumpkin_seeds, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.repeater, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.rotten_flesh, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.reeds, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.redstone, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.shears, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.skull, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.slime_ball, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.snowball, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.spawn_egg, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.speckled_melon, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.spider_eye, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.sugar, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.stone_axe, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.stone_hoe, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.stone_pickaxe, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.stone_shovel, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.stone_sword, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.tnt_minecart, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.water_bucket, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.wheat, CivilStatus.UNCIVILIZED);
//		CivilRegistry.registerStatus(Items.wheat_seeds, CivilStatus.UNCIVILIZED);
//		
//	}
//	
//	public static void Thaumcraft() {
//		CivilRegistry.registerStatus(ConfigBlocks.blockAiry, CivilStatus.CIVILIZED);
//		CivilRegistry.registerStatus(ConfigBlocks.blockArcaneDoor, CivilStatus.CIVILIZED);
//	}
	
}