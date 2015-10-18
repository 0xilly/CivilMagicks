/**
 * Copyright (c) 2015, Anthony Anderson(Illyohs)
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
package us.illyohs.mod.civilmagiks.client.core;

import us.illyohs.mod.civilmagiks.client.core.lib.RenderUtils;
import us.illyohs.mod.civilmagiks.client.render.tile.RenderBasin;
import us.illyohs.mod.civilmagiks.common.block.ModBlocks;
import us.illyohs.mod.civilmagiks.common.block.tile.TileElementalBasin;
import us.illyohs.mod.civilmagiks.common.core.lib.IProxy;

import net.minecraftforge.fml.client.registry.ClientRegistry;


public class ClientProxy implements IProxy {

	@Override
	public void renderModels() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileElementalBasin.class, new RenderBasin());
	}

	@Override
	public void renderBlockItems() {
		RenderUtils.renderItemsBlocks(ModBlocks.blockManaStone, "manastone");
	}

	@Override
	public void regMobs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderMobs() {
		// TODO Auto-generated method stub
		
	}

//    @Override
//    public void preInit(FMLPreInitializationEvent event) {
//        super.preInit(event);
//                
//        RenderUtils.initB3DLOADER();
//    }
//
//    @Override
//    public void init(FMLInitializationEvent event) {
//        super.init(event);
//        RenderUtils.renderItemsBlocks(ModBlocks.blockManaStone, "manastone");
//        System.out.println("----------------------------------------test------------------------------------");
//
//    }
//
//    @Override
//    public void postInit(FMLPostInitializationEvent event) {
//        super.postInit(event);
//
//    }

}