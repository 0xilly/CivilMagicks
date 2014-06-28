package us.illyohs.civilmagicks.common.core;

import net.minecraft.init.Blocks;
import us.illyohs.civilmagicks.api.CivilStatus;

public class RegCivilObjects {
	
	public static void blocks() {
		
		//Civilized
		CivilRegistry.registerStatus(Blocks.acacia_stairs, CivilStatus.CIVILIZED);
		CivilRegistry.registerStatus(Blocks.oak_stairs, CivilStatus.CIVILIZED);
		CivilRegistry.registerStatus(Blocks.oak_stairs, CivilStatus.CIVILIZED);
		CivilRegistry.registerStatus(Blocks.birch_stairs, CivilStatus.CIVILIZED);
		CivilRegistry.registerStatus(Blocks.brick_stairs, CivilStatus.CIVILIZED);
		CivilRegistry.registerStatus(Blocks.nether_brick_stairs, CivilStatus.CIVILIZED);
		CivilRegistry.registerStatus(Blocks.quartz_stairs, CivilStatus.CIVILIZED);
		CivilRegistry.registerStatus(Blocks.dark_oak_stairs, CivilStatus.CIVILIZED);
		CivilRegistry.registerStatus(Blocks.gold_block, CivilStatus.CIVILIZED);
		CivilRegistry.registerStatus(Blocks.iron_block, CivilStatus.CIVILIZED);

		//Uncivilized
		CivilRegistry.registerStatus(Blocks.anvil, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.dirt, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.lava, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.flowing_lava, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.cobblestone, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.stone, CivilStatus.UNCIVILIZED); //NOTE: not sure if this should be uncivilized is it to common to be civilized?
		CivilRegistry.registerStatus(Blocks.gravel, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.grass, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.tallgrass, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.vine, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.pumpkin, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.web, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.deadbush, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.waterlily, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.cactus, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.coal_ore, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.tnt, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.sticky_piston, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.mob_spawner, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.netherrack, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.nether_wart, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.tripwire, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.tripwire_hook, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.trapped_chest, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.clay, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.soul_sand, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.sand, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.wooden_door, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.ice, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.packed_ice, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.bed, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.piston, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.piston_extension, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.piston_head, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.hardened_clay, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.hay_block, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.obsidian, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.iron_ore, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.gold_ore, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.lapis_ore, CivilStatus.UNCIVILIZED);
		CivilRegistry.registerStatus(Blocks.quartz_ore, CivilStatus.UNCIVILIZED);

	}

}
