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
 * Class created on Jul 8, 2014 at 10:22:06 PM
 * 
 */
package us.illyohs.civilmagicks.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelWand extends ModelBase {
	
	ModelRenderer Wand;

	public ModelWand() {
		textureHeight = 32;
		textureWidth = 32;

		Wand = new ModelRenderer(this, 0, 0);
		Wand.addBox(-1f, -15f, 1f, 2, 30, 2);
		Wand.setRotationPoint(6f, 10f, 0f);
		Wand.setTextureSize(32, 32);
		setRotation(Wand, -1.07818F, 0F, 0F);
	}

	public void render(float f) {
		Wand.render(f);

	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;

	}

}
