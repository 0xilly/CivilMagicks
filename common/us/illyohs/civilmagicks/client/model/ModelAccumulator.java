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
 * Class created on Jul 8, 2014 at 2:59:06 AM
 * 
 */
package us.illyohs.civilmagicks.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelAccumulator extends ModelBase {
	
	ModelRenderer Base;
	
	ModelRenderer Pillar;
	

	public ModelAccumulator() {
		
		textureHeight = 64;
		textureWidth = 124;
		
		Base = new ModelRenderer(this, 0, 0);
		Base.addBox(-8F, 0F, -8F, 16, 1, 16);
		Base.setRotationPoint(0F, 23F, 0F);
		Base.setTextureSize(textureHeight, textureHeight);
		setRotation(Base, 0F, 0F, 0F);
		
		Pillar= new ModelRenderer(this, 1, 56);
	}

	public void render(float f) {
		Base.render(f);

	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;

	}

}
