package us.illyohs.civilmagicks.common.civil;

import us.illyohs.civilmagicks.common.tile.TileHomeCore;
import net.minecraft.init.Blocks;

public class RegCivilObjects {
	
	public static void blocks() {
		
		//Civilized
		
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
		CivilRegistry.registerStatus(TileHomeCore.class, CivilStatus.UNCIVILIZED);
	}

}
