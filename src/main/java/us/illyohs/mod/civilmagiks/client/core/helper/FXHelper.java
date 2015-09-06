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
package us.illyohs.mod.civilmagiks.client.core.helper;

import java.awt.Color;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;

import us.illyohs.mod.civilmagiks.client.core.lib.LibAssets;
import us.illyohs.mod.civilmagiks.common.core.lib.LibInfo;

public class FXHelper {
    
    static int red;
    static int blue;
    static int green;
    static int alpha;
    
    static int hex;
    
    public static void bindTextureMC(ResourceLocation texture) {
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
    }

    public static void bindTextureFML(ResourceLocation texture) {
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
    }
    
    public static void renderItemsBlocks(Block block, String texture) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(LibInfo.MOD_ID + ":" + texture));
    }
    
//    Minecraft.getMinecraft().effectRenderer.addEffect(new BaseParticleFX(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(),2.0, 2.0, 2.0, "0xffff7e", 0.5F, .05F, 200, 200, LibAssets.spark))
    public static void bindEffect(EntityFX entity){
        Minecraft.getMinecraft().effectRenderer.addEffect(entity);
    }
    
    public static void spark(World world, double xCoord,double yCoord,double zCoord,double xSpeed, double ySpeed, double zSpeed, int color, float alpha, float gravity, int brightness, int age) {
        ResourceLocation texture = LibAssets.spark;
//        bindEffect(new BaseParticleFX(world, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed, color, alpha, gravity, brightness, age, texture));
    }
    
    public static void renderAnimatedSpritSheet(World world, double xCoord, double yCoord,double zCoord,double xSpeed, double ySpeed, double zSpeed, float red, float green, float blue, float alpha, ResourceLocation spriteSheet) {
//        red = getRed();
        WorldRenderer wr = Tessellator.getInstance().getWorldRenderer();
        GlStateManager.pushAttrib();
        GlStateManager.pushMatrix();
        
        
        wr.setColorRGBA_F((float)getRed(), (float)getGreen(), (float)getBlue(), alpha);
       
        wr.startDrawingQuads();
        
        Tessellator.getInstance().draw();
        
        GlStateManager.popAttrib();
        GlStateManager.popMatrix();
    }

    public void HexToRgb(int hex) {
        Color color = new Color(hex);
        setRed(color.getRed());
        setBlue(color.getBlue());
        setGreen(color.getGreen());
    }
    
    public void HexToRgba(int hex) {
        Color color = new Color(hex);
        setRed(color.getRed());
        setBlue(color.getBlue());
        setGreen(color.getGreen());
        setAlpha(color.getAlpha());
    }
    
    public static int getRed() {
        return red;
    }
    
    public void setRed(int red) {
        this.red = red;
    }
    
    public static int getBlue() {
        return blue;
    }
    
    public void setBlue(int blue) {
        this.blue = blue;
    }
    
    public static int getGreen() {
        return green;
    }
    
    public void setGreen(int green) {
        this.green = green;
    }
    
    public static int getAlpha() {
        return alpha;
    }
    
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    
    public static int getHex() {
        return hex;
    }
    
    public static void setHex(int hex) {
        FXHelper.hex = hex;
    }

}
