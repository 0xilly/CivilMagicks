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
package us.illyohs.mod.civilmagiks.client.core.lib;

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

public class RenderUtils {
    
    int red;
    int blue;
    int green;
    int alpha;
    int hex;
    
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

    //Note this will only work for horizontal texturessheets not vertivle could add to it but lazy
//    public static void renderAnaimatedTexture(int HIGHT, int LENGTH, ResourceLocation texture) {
//
//        int frames = LENGTH/HIGHT;
//        GlStateManager.pushMatrix();
//        GlStateManager.popAttrib();
//
//        Tessellator     tessellator = Tessellator.getInstance();
//        WorldRenderer   tes         = tessellator.getWorldRenderer();
//
//        tes.startDrawingQuads();
//
//        tes.addVertexWithUV();
//
//        bindTextureFML(texture);
//
//        tes.finishDrawing();
//
//        GlStateManager.popMatrix();
//        GlStateManager.popAttrib();
//    }

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
    
    public int getRed() {
        return red;
    }
    
    public void setRed(int red) {
        this.red = red;
    }
    
    public int getBlue() {
        return blue;
    }
    
    public void setBlue(int blue) {
        this.blue = blue;
    }
    
    public int getGreen() {
        return green;
    }
    
    public void setGreen(int green) {
        this.green = green;
    }
    
    public int getAlpha() {
        return alpha;
    }
    
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    
    public int getHex() {
        return hex;
    }
    
    public void setHex(int hex) {
        this.hex = hex;
    }

}
