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
 * Class created on Jul 20, 2014 at 4:39:33 PM
 * 
 */
package us.illyohs.civilmagicks.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelBrewChamber extends ModelBase {
	
    ModelRenderer Base;
    ModelRenderer Wall1;
    ModelRenderer Wall2;
    ModelRenderer Wall3;
    ModelRenderer Wall4;
	
	public ModelBrewChamber() {
	    
	    textureHeight = 64;
	    textureWidth = 64;
		
        Base =  new ModelRenderer(this, 0, 0);
        Base.addBox(-7f, 0f, -7f, 14, 1, 14);
        Base.setRotationPoint(0f, 23f, 0);
        setRotation(Base, 0f, 0f, 0f);

        Wall1 = new ModelRenderer(this, 0, 0);
        Wall1.addBox(-7f, -15f, -7f, 1, 15, 14);
        Wall1.setRotationPoint(0f, 23f, 0);
        setRotation(Base, 0f, 0f, 0f);
		
        Wall2 = new ModelRenderer(this, 0, 0);
        Wall2.addBox(6f, -15f, -7f, 1, 15, 14);
        Wall2.setRotationPoint(0f, 23f, 0);
        setRotation(Base, 0f, 0f, 0f);
        
        Wall3 = new ModelRenderer(this, 0, 3);
        Wall3.addBox(-6f, -15f, 6f, 12, 15, 1);
        Wall3.setRotationPoint(0f, 23f, 0);
        setRotation(Base, 0f, 0f, 0f);
        
        Wall4 = new ModelRenderer(this, 0, 3);
        Wall4.addBox(-6f, -15f, -7f, 12, 15, 1);
        Wall4.setRotationPoint(0f, 23f, 0);
        setRotation(Base, 0f, 0f, 0f);
		
	}

	public void render(float f) {
	    Base.render(f);
	    Wall1.render(f);
	    Wall2.render(f);
	    Wall3.render(f);
	    Wall4.render(f);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z) {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;

	}

}
