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
package us.illyohs.civilmagicks.common.block;

import us.illyohs.civilmagicks.common.block.star.BlockCivilStar;
import us.illyohs.civilmagicks.common.block.tea.BlockBrewChamber;
import us.illyohs.civilmagicks.common.lib.LibAddons;
import us.illyohs.civilmagicks.common.tile.TileCivilStar;
import us.illyohs.civilmagicks.common.tile.TileHomeCore;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlock {
	
	public static Block homeCore;
	public static Block cage;
	
	public static Block civilStar;
	
	public static Block accumulator;
	
	public static Block brewChamber;

	public static void initCivil() {
		
		homeCore = new BlockHomeCore();
		cage = new BlockCage();
		
		civilStar = new BlockCivilStar();
		
		accumulator = new BlockAccumulator();
		
		brewChamber = new BlockBrewChamber();
		
		gameRegCivil();
		
	}
	
	
	public static void initThaumcraft() {
		if(Loader.isModLoaded(LibAddons.Thaumcraft)) {
			
		}
	}

	private static void gameRegCivil() {
		GameRegistry.registerBlock(homeCore, "HomeCore");
		GameRegistry.registerBlock(civilStar, "civilStar");
		GameRegistry.registerBlock(accumulator, "Accumulator");
		GameRegistry.registerBlock(brewChamber, "BrewChamber");
		
	}


}
