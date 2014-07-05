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
package us.illyohs.civilmagicks.common;

import cpw.mods.fml.common.registry.GameRegistry;
import us.illyohs.civilmagicks.common.lib.IProxy;
import us.illyohs.civilmagicks.common.tile.TileCivilStar;
import us.illyohs.civilmagicks.common.tile.TileHomeCore;

public class CommonProxy implements IProxy {

	@Override
	public void ModelsRenederers() {}//NO OP

	@Override
	public void registerTileEntitys() {
		GameRegistry.registerTileEntity(TileHomeCore.class, "TileHomeCore");
		GameRegistry.registerTileEntity(TileCivilStar.class, "TileCivilStar");
		
	}

}
