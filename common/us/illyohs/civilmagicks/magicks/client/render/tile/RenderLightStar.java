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
package us.illyohs.civilmagicks.magicks.client.render.tile;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import us.illyohs.civilmagicks.core.lib.LibInfo;

public class RenderLightStar extends TileEntitySpecialRenderer {


    private static final ResourceLocation TEXTURE = new ResourceLocation(LibInfo.MOD_ID, "textures/fx/starflares.png");

    @Override
    public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float tick, int arg) {
        
        this.bindTexture(TEXTURE);
        WorldRenderer tess = Tessellator.getInstance().getWorldRenderer();
        GlStateManager.pushAttrib();
        GlStateManager.pushMatrix();
        
        GlStateManager.translate(x, y +1 , z);
        GlStateManager.enableBlend();
//        GL11.glColor3f(2.5f, 0.0f, 0.5f);

        tess.startDrawingQuads();

        tess.addVertexWithUV(0, 0, 0, 0, 0);
        tess.addVertexWithUV(0, 1, 0, 0, 1);
        tess.addVertexWithUV(1, 1, 0, 1, 1);
        tess.addVertexWithUV(1, 0, 0, 1, 0);
        tess.addVertexWithUV(0, 0, 0, 0, 0);
        tess.addVertexWithUV(1, 0, 0, 1, 0);
        tess.addVertexWithUV(1, 1, 0, 1, 1);
        tess.addVertexWithUV(0, 1, 0, 0, 1);

        tess.draw();
        
        
//        GL11.glDisable(GL11.GL_BLEND);
        GlStateManager.disableBlend();
        
        GlStateManager.popAttrib();
        GlStateManager.popMatrix();

    }



}
