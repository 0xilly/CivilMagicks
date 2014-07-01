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
 * Class created on Jul 1, 2014 at 2:28:00 PM
 * 
 */
package us.illyohs.civilmagicks.client.fx;

import us.illyohs.civilmagicks.client.lib.LibAssets;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class StarFx extends EntityFX {
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(LibAssets.FLARE);

	public StarFx(World world, double x, double y, double z, float size, float red, float blue, float green) {
		super(world, x, y, z);
		particleRed = red;
		particleBlue = blue;
		particleGreen = green;
		setPosition(x, y, z);
		particleScale *=size;
		
	}
	
	public void renderParticle(Tessellator tess, float f0, float f1, float f2, float f3, float f4, float f5) {
		
		float f6 = (float)this.particleTextureIndexX / 16.0F;
		float f7 = f6 + 0.0624375F;
		float f8 = (float)this.particleTextureIndexY / 16.0F;
		float f9 = f8 + 0.0624375F;
		float f10 = 0.1F * this.particleScale;

		if (this.particleIcon != null) {
			f6 = this.particleIcon.getMinU();
			f7 = this.particleIcon.getMaxU();
			f8 = this.particleIcon.getMinV();
			f9 = this.particleIcon.getMaxV();
		}
		
		Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE);

		float f11 = (float)(this.prevPosX + (this.posX - this.prevPosX) * (double)f0 - interpPosX);
		float f12 = (float)(this.prevPosY + (this.posY - this.prevPosY) * (double)f0 - interpPosY);
		float f13 = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * (double)f0 - interpPosZ);
		tess.setColorRGBA_F(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha);
		tess.addVertexWithUV((double)(f11 - f1 * f10 - f4 * f10), (double)(f12 - f2 * f10), (double)(f13 - f3 * f10 - f5 * f10), (double)f7, (double)f9);
		tess.addVertexWithUV((double)(f11 - f1 * f10 + f4 * f10), (double)(f12 + f2 * f10), (double)(f13 - f3 * f10 + f5 * f10), (double)f7, (double)f8);
		tess.addVertexWithUV((double)(f11 + f1 * f10 + f4 * f10), (double)(f12 + f2 * f10), (double)(f13 + f3 * f10 + f5 * f10), (double)f6, (double)f8);
		tess.addVertexWithUV((double)(f11 + f1 * f10 - f4 * f10), (double)(f12 - f2 * f10), (double)(f13 + f3 * f10 - f5 * f10), (double)f6, (double)f9);
	}

}
