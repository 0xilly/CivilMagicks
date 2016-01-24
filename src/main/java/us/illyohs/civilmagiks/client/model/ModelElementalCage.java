/**
 * Copyright (c) 2016, Anthony Anderson(Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright notice, this
 *        list of conditions and the following disclaimer.
 *
 *     * Redistributions in binary form must reproduce the above copyright notice,
 *        this list of conditions and the following disclaimer in the documentation
 *        and/or other materials provided with the distribution.
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
 */

package us.illyohs.civilmagiks.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelElementalCage extends ModelBase {

    //Base
    ModelRenderer Base;

    //Pillar group 1
    ModelRenderer Pillar1;
    ModelRenderer Pillar2;
    ModelRenderer Pillar3;

    //Pillar group 2
    ModelRenderer Pillar4;
    ModelRenderer Pillar5;
    ModelRenderer Pillar6;

    //Pillar group 3
    ModelRenderer Pillar7;
    ModelRenderer Pillar8;
    ModelRenderer Pillar9;

    //Pillar group 4
    ModelRenderer Pillar10;
    ModelRenderer Pillar11;
    ModelRenderer Pillar12;

    //Top
    ModelRenderer Top;

    public ModelElementalCage() {

        textureWidth = 128;
        textureHeight = 128;

        //Top
        Base = new ModelRenderer(this, 0, 0);
        Base.addBox(-8f, 0f, -8f, 48, 1, 48);
        Base.setRotationPoint(0f, 23f, 0);
        setRotation(Base, 0f, 0f, 0f);

        //Pillar group 1
        Pillar1 = new ModelRenderer(this, 0, 0);
        Pillar1.addBox(-8f, -46f, -8f, 1, 46, 1);
        Pillar1.setRotationPoint(0f, 23f, 0);
        setRotation(Pillar1, 0f, 0f, 0f);

        Pillar2 = new ModelRenderer(this, 0, 0);
        Pillar2.addBox(-7f, -46f, -8f, 1, 46, 1);
        Pillar2.setRotationPoint(0f, 23f, 0);
        setRotation(Pillar2, 0f, 0f, 0f);

        Pillar3 = new ModelRenderer(this, 0, 0);
        Pillar3.addBox(-8f, -46f, -7f, 1, 46, 1);
        Pillar3.setRotationPoint(0f, 23f, 0);
        setRotation(Pillar3, 0f, 0f, 0f);

        //Pillar group 2
        Pillar4 = new ModelRenderer(this, 0, 0);
        Pillar4.addBox(39f, -46f, -8f, 1, 46, 1);
        Pillar4.setRotationPoint(0f, 23f, 0);
        setRotation(Pillar4, 0f, 0f, 0f);

        Pillar5 = new ModelRenderer(this, 0, 0);
        Pillar5.addBox(39f, -46f, -7f, 1, 46, 1);
        Pillar5.setRotationPoint(0f, 23f, 0);
        setRotation(Pillar5, 0f, 0f, 0f);

        Pillar6 = new ModelRenderer(this, 0, 0);
        Pillar6.addBox(38f, -46f, -8f, 1, 46, 1);
        Pillar6.setRotationPoint(0f, 23f, 0);
        setRotation(Pillar6, 0f, 0f, 0f);

        //Pillar group 3
        Pillar7 = new ModelRenderer(this, 0, 0);
        Pillar7.addBox(-8f, -46f, 39f, 1, 46, 1);
        Pillar7.setRotationPoint(0f, 23f, 0);
        setRotation(Pillar7, 0f, 0f, 0f);

        Pillar8 = new ModelRenderer(this, 0, 0);
        Pillar8.addBox(-8f, -46f, 38f, 1, 46, 1);
        Pillar8.setRotationPoint(0f, 23f, 0);
        setRotation(Pillar8, 0f, 0f, 0f);

        Pillar9 = new ModelRenderer(this, 0, 0);
        Pillar9.addBox(-7f, -46f, 39f, 1, 46, 1);
        Pillar9.setRotationPoint(0f, 23f, 0);
        setRotation(Pillar9, 0f, 0f, 0f);

        //Pillar group 4
        Pillar10 = new ModelRenderer(this, 0, 0);
        Pillar10.addBox(39f, -46f, 39f, 1, 46, 1);
        Pillar10.setRotationPoint(0f, 23f, 0);
        setRotation(Pillar10, 0f, 0f, 0f);

        Pillar11 = new ModelRenderer(this, 0, 0);
        Pillar11.addBox(39f, -46f, 38f, 1, 46, 1);
        Pillar11.setRotationPoint(0f, 23f, 0);
        setRotation(Pillar11, 0f, 0f, 0f);

        Pillar12 = new ModelRenderer(this, 0, 0);
        Pillar12.addBox(38f, -46f, 39f, 1, 46, 1);
        Pillar12.setRotationPoint(0f, 23f, 0);
        setRotation(Pillar12, 0f, 0f, 0f);

        //Base
        Top = new ModelRenderer(this, 0, 0);
        Top.addBox(-8f, -47f, -8f, 48, 1, 48);
        Top.setRotationPoint(0f, 23f, 0);
        setRotation(Top, 0f, 0f, 0f);
    }

    public void render(float f) {
        Base.render(f);

        //Pillar group 1
        Pillar1.render(f);
        Pillar2.render(f);
        Pillar3.render(f);

        //Pillar group 2
        Pillar4.render(f);
        Pillar5.render(f);
        Pillar6.render(f);

        //Pillar group 3
        Pillar7.render(f);
        Pillar8.render(f);
        Pillar9.render(f);

        //Pillar group 4
        Pillar10.render(f);
        Pillar11.render(f);
        Pillar12.render(f);

        Top.render(f);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;

    }
}
