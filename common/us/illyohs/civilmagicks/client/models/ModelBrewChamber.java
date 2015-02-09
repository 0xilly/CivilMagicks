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
package us.illyohs.civilmagicks.client.models;

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

        Base = new ModelRenderer(this, 0, 0);
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
