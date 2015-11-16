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
package us.illyohs.civilmagiks.client.render.tile;

import us.illyohs.civilmagiks.common.core.lib.LibInfo;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderSigil extends TileEntitySpecialRenderer {

    
    private static final ResourceLocation TEXTURE = new ResourceLocation(LibInfo.MOD_ID, "textures/fx/summoningsigil.png");
    
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float yaw, int pitcch) {
        WorldRenderer wr = Tessellator.getInstance().getWorldRenderer();
        GlStateManager.pushAttrib();
        GlStateManager.pushMatrix();
        
        this.bindTexture(TEXTURE);
        
        wr.startDrawingQuads();
        wr.addVertex(0, 0, 0);
        wr.addVertex(0, 1, 0);
        wr.addVertex(1, 1, 0);
        wr.addVertex(1, 0, 0);
                
        Tessellator.getInstance().draw();

        GlStateManager.translate(0, 2, 0);
        GlStateManager.enableBlend(); 
        GlStateManager.popAttrib();
        GlStateManager.popMatrix();
        
    }

}
