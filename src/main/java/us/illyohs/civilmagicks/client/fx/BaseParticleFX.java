/**
 * Copyright (c) 2014, Anthony Anderson(Lord Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
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

package us.illyohs.civilmagicks.client.fx;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import us.illyohs.civilmagicks.client.core.helper.FXHelper;
import us.illyohs.civilmagicks.client.core.lib.LibAssets;

import java.awt.Color;


public class BaseParticleFX extends EntityFX {

    public ResourceLocation resourceLocation;
    public int brightness;
    double red, green, blue;

    public BaseParticleFX(World world, double xCoord, double yCoord, double zCoord, double xSpeed, double ySpeed, double zSpeed, float red, float green, float blue, float alpha, float gravity, int age) {
        super(world, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed);
        this.motionX            = xSpeed;
        this.motionY            = ySpeed;
        this.motionZ            = zSpeed;
        this.red                = red;
        this.green              = green;
        this.blue               = blue;
        this.particleAlpha      = alpha;
        this.particleGravity    = gravity;

    }

    public BaseParticleFX(World world, double xCoord, double yCoord, double zCoord, double xSpeed, double ySpeed, double zSpeed, int color, float alpha, float gravity, int brightness, int age, ResourceLocation texture) {
        super(world, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed);
        Color HEXTORGB = new Color(color);
        this.motionX            = xSpeed;
        this.motionY            = ySpeed;
        this.motionZ            = zSpeed;
        this.red                = (float)HEXTORGB.getRed();
        this.green              = (float)HEXTORGB.getGreen();
        this.blue               = (float)HEXTORGB.getBlue();
        this.particleAlpha      = alpha;
        this.particleGravity    = gravity;
        this.particleMaxAge     = age;
        this.brightness         = brightness;
        this.resourceLocation   = texture;

    }




    public int getFXLayer() {
        return 3;
    }

    public void renderParticle(WorldRenderer wr, Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
        GlStateManager.disableLighting();
        GlStateManager.depthMask(false);
        GlStateManager.enableBlend();
        GlStateManager.alphaFunc(GL11.GL_GREATER, particleAlpha);
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);

        float pScale = 0.1F*particleScale;
        float x = (float)(this.prevPosX+(this.posX-this.prevPosX)*par2-interpPosX);
        float y = (float)(this.prevPosY+(this.posY-this.prevPosY)*par2-interpPosY);
    	float z = (float)(this.prevPosZ+(this.posZ-this.prevPosZ)*par2-interpPosZ);

        FXHelper.bindTextureMC(LibAssets.spark);

        wr.startDrawingQuads();
        wr.setColorRGBA_F((float) red, (float) green, (float) blue, particleAlpha);

        wr.setBrightness(brightness);
        wr.addVertexWithUV((double) (x - par3 * pScale - par6 * pScale), (double) (y - par4 * pScale), (double) (z - par5 * pScale - par7 * pScale), 0, 0);
        wr.addVertexWithUV((double) (x - par3 * pScale - par6 * pScale), (double) (y - par4 * pScale), (double) (z - par5 * pScale - par7 * pScale), 1, 0);
        wr.addVertexWithUV((double) (x - par3 * pScale - par6 * pScale), (double) (y - par4 * pScale), (double) (z - par5 * pScale - par7 * pScale), 1, 1);
        wr.addVertexWithUV((double) (x - par3 * pScale - par6 * pScale), (double) (y - par4*  pScale), (double) (z - par5 * pScale - par7 * pScale), 0, 1);

        wr.finishDrawing();

        GlStateManager.disableBlend();
        GlStateManager.depthMask(true);
        GlStateManager.alphaFunc(GL11.GL_GREATER, particleAlpha);
        GlStateManager.enableLighting();

    }

    public void onUpdate() {
        super.onUpdate();
        if(particleAge >= particleMaxAge) {
            this.setDead();
        }
//        System.out.println("foo");
        if(Minecraft.getMinecraft().gameSettings.particleSetting==2) {
            this.setDead();
        }

        if (worldObj.isRemote) {
            this.motionHandeler();
        }
        this.particleAge++;
    }

    public void motionHandeler() {
        this.motionX *= 0.9800000190734863D;
        this.motionY *= 0.9800000190734863D;
        this.motionZ *= 0.9800000190734863D;
    }

    public int getBrightness() {
        return brightness;
    }

    public ResourceLocation getResourceLocation() {
        return resourceLocation;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setResourceLocation(ResourceLocation resourceLocation) {
        this.resourceLocation = resourceLocation;
    }
}
