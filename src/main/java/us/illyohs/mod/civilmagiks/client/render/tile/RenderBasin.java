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
package us.illyohs.mod.civilmagiks.client.render.tile;

import java.util.Map;

import us.illyohs.mod.civilmagiks.client.core.lib.RenderUtils;
import us.illyohs.mod.civilmagiks.common.block.tile.TileElementalBasin;
import us.illyohs.mod.civilmagiks.common.core.lib.LibInfo;

import codechicken.lib.render.CCModel;
import codechicken.lib.render.CCRenderState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderBasin extends TileEntitySpecialRenderer {

    public static CCModel basin;

    static {
        Map<String, CCModel> model = CCModel.parseObjModels(new ResourceLocation(LibInfo.MOD_ID, "models/block/elementalbasin.obj"));
        basin = model.get("Basin");
        // CCModel.
    }

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float p_180535_8_, int p_180535_9_) {
        TileElementalBasin tile = (TileElementalBasin) te;

//        GlStateManager.pushMatrix();
//        GlStateManager.pushAttrib();
//        CCRenderState.changeTexture(LibInfo.MOD_ID + ":textures/basin.png");
////        CCRenderState.changeTexture(new ResourceLocation(LibInfo.MOD_ID, "block/basin.png"));
//        CCRenderState.startDrawing();
//        basin.render();
//        CCRenderState.draw();
//
//        GlStateManager.popMatrix();
//        GlStateManager.popAttrib();

        RenderUtils.renderFloatingTexts("Testing ths", x, y + 1, z, true);

    }

}
