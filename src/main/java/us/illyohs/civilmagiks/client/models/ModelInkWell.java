package us.illyohs.civilmagiks.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelInkWell extends ModelBase {
    public ModelRenderer Base;
    public ModelRenderer Top;
    public ModelRenderer Pillar1;
    public ModelRenderer Pillar2;
    public ModelRenderer Pillar3;
    public ModelRenderer Pillar4;
    public ModelRenderer Wall1;
    public ModelRenderer Wall2;
    public ModelRenderer Wall3;
    public ModelRenderer Wall4;

    public ModelInkWell() {
        
        this.textureWidth = 64;
        this.textureHeight = 32;
        
        this.Base = new ModelRenderer(this, 0, 0);
        this.Base.setRotationPoint(-4.0F, 23.0F, -4.0F);
        this.Base.addBox(0.0F, 0.0F, 0.0F, 8, 1, 8, 0.0F);
        
        this.Top = new ModelRenderer(this, 0, 0);
        this.Top.setRotationPoint(-4.0F, 7.0F, -4.0F);
        this.Top.addBox(0.0F, 0.0F, 0.0F, 8, 1, 8, 0.0F);
        
        this.Pillar1 = new ModelRenderer(this, 0, 9);
        this.Pillar1.setRotationPoint(3.0F, 8.0F, 3.0F);
        this.Pillar1.addBox(0.0F, 0.0F, 0.0F, 1, 15, 1, 0.0F);
        
        this.Pillar2 = new ModelRenderer(this, 0, 9);
        this.Pillar2.setRotationPoint(-4.0F, 8.0F, 3.0F);
        this.Pillar2.addBox(0.0F, 0.0F, 0.0F, 1, 15, 1, 0.0F);
        
        this.Pillar3 = new ModelRenderer(this, 0, 9);
        this.Pillar3.setRotationPoint(-4.0F, 8.0F, -4.0F);
        this.Pillar3.addBox(0.0F, 0.0F, 0.0F, 1, 15, 1, 0.0F);
        
        this.Pillar4 = new ModelRenderer(this, 0, 9);
        this.Pillar4.setRotationPoint(3.0F, 8.0F, -4.0F);
        this.Pillar4.addBox(0.0F, 0.0F, 0.0F, 1, 15, 1, 0.0F);
        
        this.Wall1 = new ModelRenderer(this, 5, 10);
        this.Wall1.setRotationPoint(-3.0F, 8.0F, 3.0F);
        this.Wall1.addBox(0.0F, 0.0F, 0.0F, 6, 15, 0, 0.0F);
        
        this.Wall2 = new ModelRenderer(this, 5, 10);
        this.Wall2.setRotationPoint(-3.0F, 8.0F, -3.0F);
        this.Wall2.addBox(0.0F, 0.0F, 0.0F, 6, 15, 0, 0.0F);
        
        this.Wall3 = new ModelRenderer(this, 17, 4);
        this.Wall3.addBox(0.0F, 0.0F, 0.0F, 0, 15, 6, 0.0F);
        this.Wall3.setRotationPoint(-3.0F, 8.0F, -3.0F);
        
        this.Wall4 = new ModelRenderer(this, 0, 0);
        this.Wall4.setRotationPoint(3.0F, 8.0F, -3.0F);
        this.Wall4.addBox(0.0F, 0.0F, 0.0F, 0, 15, 6, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Base.render(f5);
        this.Top.render(f5);
        this.Pillar1.render(f5);
        this.Pillar2.render(f5);
        this.Pillar3.render(f5);
        this.Pillar4.render(f5);
        this.Wall1.render(f5);
        this.Wall2.render(f5);
        this.Wall3.render(f5);
        this.Wall4.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
