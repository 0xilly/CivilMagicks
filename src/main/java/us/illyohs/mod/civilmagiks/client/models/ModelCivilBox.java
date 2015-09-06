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
package us.illyohs.mod.civilmagiks.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelCivilBox extends ModelBase {

    ModelRenderer Base1;
    ModelRenderer Base2;
    ModelRenderer Base3;
    ModelRenderer Base4;

    ModelRenderer Pillar1;
    ModelRenderer Pillar2;
    ModelRenderer Pillar3;
    ModelRenderer Pillar4;

    ModelRenderer Top1;
    ModelRenderer Top2;
    ModelRenderer Top3;

    ModelRenderer Window1;
    ModelRenderer Window2;
    ModelRenderer Window3;
    ModelRenderer Window4;

    public ModelCivilBox() {

        textureWidth = 64;
        textureHeight = 128;

        Base1 = new ModelRenderer(this, 0, 0);
        Base1.addBox(-8F, 0F, -8F, 16, 1, 16);
        Base1.setRotationPoint(0F, 23F, 0F);
        Base1.setTextureSize(64, 128);
        setRotation(Base1, 0F, 0F, 0F);

        Base2 = new ModelRenderer(this, 0, 17);
        Base2.addBox(-7F, 0F, -7F, 14, 1, 14);
        Base2.setRotationPoint(0F, 22F, 0F);
        Base2.setTextureSize(64, 128);
        setRotation(Base2, 0F, 0F, 0F);

        Base3 = new ModelRenderer(this, 0, 32);
        Base3.addBox(-6F, 0F, -6F, 12, 1, 12);
        Base3.setRotationPoint(0F, 21F, 0F);
        Base3.setTextureSize(64, 128);
        setRotation(Base3, 0F, 0F, 0F);

        Base4 = new ModelRenderer(this, 0, 45);
        Base4.addBox(-5F, 0F, -5F, 10, 1, 10);
        Base4.setRotationPoint(0F, 20F, 0F);
        Base4.setTextureSize(64, 128);
        setRotation(Base4, 0F, 0F, 0F);

        Pillar1 = new ModelRenderer(this, 0, 56);
        Pillar1.addBox(0F, 0F, 0F, 1, 8, 1);
        Pillar1.setRotationPoint(-5F, 12F, 4F);
        Pillar1.setTextureSize(64, 128);
        setRotation(Pillar1, 0F, 0F, 0F);

        Pillar2 = new ModelRenderer(this, 4, 56);
        Pillar2.addBox(0F, 0F, 0F, 1, 8, 1);
        Pillar2.setRotationPoint(-5F, 12F, -5F);
        Pillar2.setTextureSize(64, 128);
        setRotation(Pillar2, 0F, 0F, 0F);

        Pillar3 = new ModelRenderer(this, 8, 56);
        Pillar3.addBox(0F, 0F, 0F, 1, 8, 1);
        Pillar3.setRotationPoint(4F, 12F, 4F);
        Pillar3.setTextureSize(64, 128);
        setRotation(Pillar3, 0F, 0F, 0F);

        Pillar4 = new ModelRenderer(this, 12, 56);
        Pillar4.addBox(0F, 0F, 0F, 1, 8, 1);
        Pillar4.setRotationPoint(4F, 12F, -5F);
        Pillar4.setTextureSize(64, 128);
        setRotation(Pillar4, 0F, 0F, 0F);

        Top1 = new ModelRenderer(this, 0, 65);
        Top1.addBox(-5F, 0F, -5F, 10, 1, 10);
        Top1.setRotationPoint(0F, 11F, 0F);
        Top1.setTextureSize(64, 128);
        setRotation(Top1, 0F, 0F, 0F);

        Top2 = new ModelRenderer(this, 0, 76);
        Top2.addBox(-4F, 0F, -4F, 8, 1, 8);
        Top2.setRotationPoint(0F, 10F, 0F);
        Top2.setTextureSize(64, 128);
        Top2.mirror = true;
        setRotation(Top2, 0F, 0F, 0F);

        Top3 = new ModelRenderer(this, 0, 85);
        Top3.addBox(-3F, 0F, -3F, 6, 1, 6);
        Top3.setRotationPoint(0F, 9F, 0F);
        Top3.setTextureSize(64, 128);
        setRotation(Top3, 0F, 0F, 0F);

        Window1 = new ModelRenderer(this, 0, 84);
        Window1.addBox(0F, -4F, -4F, 0, 8, 8);
        Window1.setRotationPoint(-5F, 16F, 0F);
        Window1.setTextureSize(64, 128);
        setRotation(Window1, 0F, 0F, 0F);

        Window2 = new ModelRenderer(this, 16, 92);
        Window2.addBox(-4F, -4F, 0F, 8, 8, 0);
        Window2.setRotationPoint(0F, 16F, -5F);
        Window2.setTextureSize(64, 128);
        setRotation(Window2, 0F, 0F, 0F);

        Window3 = new ModelRenderer(this, 0, 92);
        Window3.addBox(0F, -4F, -4F, 0, 8, 8);
        Window3.setRotationPoint(5F, 16F, 0F);
        Window3.setTextureSize(64, 128);
        setRotation(Window3, 0F, 0F, 0F);

        Window4 = new ModelRenderer(this, 16, 100);
        Window4.addBox(-4F, -4F, 0F, 8, 8, 0);
        Window4.setRotationPoint(0F, 16F, 5F);
        Window4.setTextureSize(64, 128);
        setRotation(Window4, 0F, 0F, 0F);
    }

    public void render(float f) {
        Base1.render(f);
        Base2.render(f);
        Base3.render(f);
        Base4.render(f);

        Pillar1.render(f);
        Pillar2.render(f);
        Pillar3.render(f);
        Pillar4.render(f);

        Top1.render(f);
        Top2.render(f);
        Top3.render(f);

        Window1.render(f);
        Window2.render(f);
        Window3.render(f);
        Window4.render(f);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
