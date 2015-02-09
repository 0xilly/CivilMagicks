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
package us.illyohs.civilmagicks.client.render.tile;

import org.lwjgl.opengl.GL11;

import us.illyohs.civilmagicks.client.models.ModelTeaTank;
import us.illyohs.civilmagicks.common.core.lib.LibInfo;
import us.illyohs.civilmagicks.common.entity.tile.brewing.TileTeaTank;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderTileTank extends TileEntitySpecialRenderer {

    private ModelTeaTank model;

    public RenderTileTank() {
        model = new ModelTeaTank();
    }

    private static final ResourceLocation TEXTURE = new ResourceLocation(
            LibInfo.MOD_ID, "textures/models/glassslate.png");

	@Override
	public void renderTileEntityAt(TileEntity tile, double x,double y, double z, float tick,
			int p_180535_9_) {
		TileTeaTank tt = (TileTeaTank) tile;
        GL11.glPushMatrix();

        GL11.glTranslated((float) x + 0.5, (float) y + 1.5, (float) z + 0.5);
        GL11.glScalef(1F, -1F, -1F);
        GL11.glEnable(GL11.GL_BLEND);

        Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE);
        model.render(.0625F);
        GL11.glScalef(1F, -1F, -1F);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        // GL11.glClearColor(0.7f, 0.7f, 0.7f, 1.0f);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glPopMatrix();
		
	}

}
