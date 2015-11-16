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
package us.illyohs.civilmagiks.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelTransferNode extends ModelBase {
	
    public ModelRenderer Arm1;
    public ModelRenderer Arm4;
    public ModelRenderer Arm2;
    public ModelRenderer Arm3;
    public ModelRenderer Arm5;
    public ModelRenderer Arm6;
    public ModelRenderer Arm7;
    public ModelRenderer Arm8;

    public ModelTransferNode() {
    	
        this.textureWidth = 16;
        this.textureHeight = 16;
        
        this.Arm1 = new ModelRenderer(this, 0, 0);
        this.Arm1.setRotationPoint(-4.0F, 23.0F, -8.0F);
        this.Arm1.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        
        this.Arm2 = new ModelRenderer(this, 0, 0);
        this.Arm2.setRotationPoint(-4.0F, 23.0F, 7.1F);
        this.Arm2.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        
        this.Arm3 = new ModelRenderer(this, 0, 0);
        this.Arm3.setRotationPoint(-8.0F, 23.0F, -4.0F);
        this.Arm3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
        
        this.Arm4 = new ModelRenderer(this, 0, 0);
        this.Arm4.setRotationPoint(7.0F, 23.0F, -4.0F);
        this.Arm4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
        
        this.Arm5 = new ModelRenderer(this, 0, 0);
        this.Arm5.setRotationPoint(-8.0F, 23.0F, -3.8F);
        this.Arm5.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        this.setRotateAngle(Arm5, 0.0F, 0.7853981633974483F, 0.0F);
        
        this.Arm6 = new ModelRenderer(this, 0, 0);
        this.Arm6.setRotationPoint(3.1F, 23.0F, 7.5F);
        this.Arm6.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        this.setRotateAngle(Arm6, 0.0F, 0.7853981633974483F, 0.0F);
        
        this.Arm7 = new ModelRenderer(this, 0, 0);
        this.Arm7.setRotationPoint(3.1F, 23.0F, -7.3F);
        this.Arm7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(Arm7, 0.0F, 0.7637560806727186F, 0.0F);
        
        this.Arm8 = new ModelRenderer(this, 0, 0);
        this.Arm8.setRotationPoint(-7.3F, 23.0F, 3.0F);
        this.Arm8.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        this.setRotateAngle(Arm8, 0.0F, -0.8196066167365371F, 0.0F);
                
    }




    public void render(float f) { 

    	this.Arm1.render(f);
    	this.Arm2.render(f);
    	this.Arm3.render(f);
    	this.Arm4.render(f);
    	this.Arm5.render(f);
    	this.Arm6.render(f);
        this.Arm7.render(f);
        this.Arm8.render(f);

    }
    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
