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
package us.illyohs.civilmagicks.client;

import us.illyohs.civilmagicks.client.render.tile.RenderAccumulator;
import us.illyohs.civilmagicks.client.render.tile.RenderBrewChamber;
import us.illyohs.civilmagicks.client.render.tile.RenderCivilStar;
import us.illyohs.civilmagicks.common.lib.IProxy;
import us.illyohs.civilmagicks.common.tile.TileAccumulator;
import us.illyohs.civilmagicks.common.tile.TileBrewChamber;
import us.illyohs.civilmagicks.common.tile.TileCivilStar;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy implements IProxy {

    @Override
    public void ModelsRenederers() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileCivilStar.class, new RenderCivilStar());
        ClientRegistry.bindTileEntitySpecialRenderer(TileAccumulator.class, new RenderAccumulator());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBrewChamber.class, new RenderBrewChamber());
//        MinecraftForgeClient.registerItemRenderer(Mo, renderer);

    }

    @Override
    public void registerTileEntitys() {} //NO OP

}
