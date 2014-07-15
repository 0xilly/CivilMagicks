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
 * Class created on Jul 8, 2014 at 3:15:04 AM
 * 
 */
package us.illyohs.civilmagicks.client.render.tile;

import org.lwjgl.opengl.GL11;

import us.illyohs.civilmagicks.client.model.ModelAccumulator;
import us.illyohs.civilmagicks.common.lib.LibInfo;
import us.illyohs.civilmagicks.common.tile.TileAccumulator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderAccumulator extends TileEntitySpecialRenderer {

	private ModelAccumulator model;

	public RenderAccumulator() {
		model = new ModelAccumulator();

	}

	private static final ResourceLocation TEXTURE = new ResourceLocation(LibInfo.MOD_ID, "textures/models/keeper.png");

	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float tick)  {
		TileAccumulator ta =(TileAccumulator) tileentity;

		GL11.glPushMatrix(); 

		GL11.glTranslated((float)x + 0.5, (float)y + 1.5, (float)z + 0.5);
		GL11.glScalef(1F, -1F, -1F);
		Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE);
		model.render(.0625F);
		GL11.glScalef(1F, -1F, -1F);
		GL11.glBlendFunc(0, 1);
		GL11.glClearColor(0.7f, 0.7f, 0.7f, 1.0f);

		GL11.glPopMatrix();
	}

}
