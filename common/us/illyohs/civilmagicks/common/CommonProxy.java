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

import net.minecraft.entity.EnumCreatureType;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import us.illyohs.civilmagicks.common.lib.IProxy;
import us.illyohs.civilmagicks.common.mob.EntitySprite;
import us.illyohs.civilmagicks.common.tile.TileAccumulator;
import us.illyohs.civilmagicks.common.tile.TileBrewChamber;
import us.illyohs.civilmagicks.common.tile.TileHomeCore;
import us.illyohs.civilmagicks.common.tile.star.TileCivilStar;

public class CommonProxy implements IProxy {

	@Override
	public void ModelsRenederers() {}//NO OP

	@Override
	public void registerTileEntitys() {
		GameRegistry.registerTileEntity(TileHomeCore.class, "TileHomeCore");
		GameRegistry.registerTileEntity(TileCivilStar.class, "TileCivilStar");
		GameRegistry.registerTileEntity(TileAccumulator.class, "TileAccumulator");
		GameRegistry.registerTileEntity(TileBrewChamber.class, "TileBrewChamber");
		
	}

    @Override
    public void registerMobs() {
        EntityRegistry.registerModEntity(EntitySprite.class, "sprite", 0, this, 80, 1, true);
    }

}
