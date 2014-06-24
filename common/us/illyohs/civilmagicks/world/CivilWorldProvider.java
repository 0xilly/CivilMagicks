package us.illyohs.civilmagicks.world;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;

public class CivilWorldProvider extends WorldProvider {

	public void registerWorldChunkManager(){
//		this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.desertHills, 0.8F, 0.0F);
	}
	
	@Override
	public String getDimensionName() {
		return "CivilAge";
	}

}
