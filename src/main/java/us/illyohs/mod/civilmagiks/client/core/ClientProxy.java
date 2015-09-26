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

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;

import us.illyohs.mod.civilmagiks.client.core.lib.RenderUtils;
import us.illyohs.mod.civilmagiks.client.render.tile.RenderSigil;
import us.illyohs.mod.civilmagiks.common.block.ModBlocks;
import us.illyohs.mod.civilmagiks.common.core.lib.IProxy;

public class ClientProxy implements IProxy {

    @Override
    public void initModelLoaders() {
        RenderUtils.initB3DLOADER();

    }

    @Override
    public void bindModelsAndTextures() {
//        ClientRegistry.bindTileEntitySpecialRenderer(TileSigil.class, new RenderSigil());
//        ModelLoader.setCustomModelResourceLocation();

    }

    @Override
    public void registerTileEntitys() {
        //NO-OP
    }

    @Override
    public void registerMobs() {
        //NO-OP
    }

    @Override
    public void renderBlockItems() {
        RenderUtils.renderItemsBlocks(ModBlocks.blockManaStone, "manastone");
        RenderUtils.renderItemsBlocks(ModBlocks.starBasic, "civilanalyzer");
    }

}
