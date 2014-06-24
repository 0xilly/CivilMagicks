package us.illyohs.civilmagicks.common;

import cpw.mods.fml.common.registry.GameRegistry;
import us.illyohs.civilmagicks.common.lib.IProxy;
import us.illyohs.civilmagicks.common.tile.TileHomeCore;

public class CommonProxy implements IProxy {

	@Override
	public void registerModelsRenederers() {}//NO OP

	@Override
	public void registerTileEntitys() {
		
		GameRegistry.registerTileEntity(TileHomeCore.class, "TileHomeCore");
	}

}
