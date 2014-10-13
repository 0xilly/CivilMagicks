/**
 * Copyright (c) 2014, Anthony Anderson(Lord Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package us.illyohs.civilmagicks.client;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import us.illyohs.civilmagicks.client.render.item.ItemRenderBrewChamber;
import us.illyohs.civilmagicks.client.render.tile.RenderAccumulator;
import us.illyohs.civilmagicks.client.render.tile.RenderBrewChamber;
import us.illyohs.civilmagicks.client.render.tile.RenderCivilStar;
import us.illyohs.civilmagicks.client.render.tile.RenderTileTank;
import us.illyohs.civilmagicks.common.block.ModBlock;
import us.illyohs.civilmagicks.common.lib.IProxy;
import us.illyohs.civilmagicks.common.tile.TileAccumulator;
import us.illyohs.civilmagicks.common.tile.TileBrewChamber;
import us.illyohs.civilmagicks.common.tile.TileTeaTank;
import us.illyohs.civilmagicks.common.tile.star.TileCivilStar;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy implements IProxy {

    @Override
    public void ModelsRenederers() {
        // Render Blocks
        ClientRegistry.bindTileEntitySpecialRenderer(TileCivilStar.class, new RenderCivilStar());
        ClientRegistry.bindTileEntitySpecialRenderer(TileAccumulator.class, new RenderAccumulator());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBrewChamber.class, new RenderBrewChamber());
        ClientRegistry.bindTileEntitySpecialRenderer(TileTeaTank.class, new RenderTileTank());

        // Render Items
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlock.brewChamber), new ItemRenderBrewChamber());

    }

    @Override
    public void registerTileEntitys() {
    } /* NO OP */

    @Override
    public void registerMobs() {
    } /* NO OP */

}
