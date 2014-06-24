package us.illyohs.civilmagicks.common.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlock {
	
	public static Block homeCore;

	public static void init() {
		
		homeCore = new BlockHomeCore();
		
		GameReg();
		
	}

	private static void GameReg() {
		GameRegistry.registerBlock(homeCore, "HomeCore");
		
	}


}
