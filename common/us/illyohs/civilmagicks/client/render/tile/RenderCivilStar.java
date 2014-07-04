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
 * Class created on Jul 2, 2014 at 3:35:39 PM
 * 
 */
package us.illyohs.civilmagicks.client.render.tile;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import us.illyohs.civilmagicks.client.lib.LibAssets;
import us.illyohs.civilmagicks.common.lib.LibInfo;

public class RenderCivilStar extends TileEntitySpecialRenderer {
	
//	private static ResourceLocation star = LibAssets.FLARE; 
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(LibInfo.MOD_ID, "textures/fx/flare.png");

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float tick) {
		this.bindTexture(TEXTURE);
		Tessellator tess = Tessellator.instance;
		GL11.glPushMatrix();
		GL11.glTranslated(x, y + 1, z);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glColor3f(2.5f, 0.0f, 0.5f);
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
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();

	}

}
