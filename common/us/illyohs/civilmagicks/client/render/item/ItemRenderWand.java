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
package us.illyohs.civilmagicks.client.render.item;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import us.illyohs.civilmagicks.client.model.ModelWand;
import us.illyohs.civilmagicks.common.lib.LibInfo;
import cpw.mods.fml.client.FMLClientHandler;

public class ItemRenderWand implements IItemRenderer {

    private ModelWand model;

    public ItemRenderWand() {
        model = new ModelWand();
    }

    private static final ResourceLocation TEXTURE = new ResourceLocation(
            LibInfo.MOD_ID, "textures/models/transrod.png");

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        switch (type) {

        case ENTITY:
        case EQUIPPED_FIRST_PERSON:
        case EQUIPPED:
        case INVENTORY:
            return true;
        default:
            return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
            ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch (type) {
        case EQUIPPED: {
            GL11.glPushMatrix();

            GL11.glRotatef(20F, 0.0F, 0.0F, 20.0F);
            GL11.glRotatef(29F, 5.0F, 0.0F, 0.0F);
            GL11.glTranslatef(0.5F, 0.2F, -0.1F);
            GL11.glScalef(1.5F, 1.5F, 1.5F);
            FMLClientHandler.instance().getClient().renderEngine
                    .bindTexture(TEXTURE);
            model.render(.0625F);
            GL11.glPopMatrix();
            break;
        }
        case EQUIPPED_FIRST_PERSON: {
            GL11.glPushMatrix();

            GL11.glRotatef(5F, 0.0F, 0.0F, 20.0F);
            GL11.glRotatef(60F, 5.0F, 0.0F, 0.0F);
            GL11.glTranslatef(0.5F, 0.2F, -0.1F);
            GL11.glScalef(1.5F, 1.5F, 1.5F);
            FMLClientHandler.instance().getClient().renderEngine
                    .bindTexture(TEXTURE);
            model.render(.0625F);
            GL11.glPopMatrix();
            break;
        }
        case ENTITY: {
            GL11.glPushMatrix();

            GL11.glRotatef(5F, 0.0F, 0.0F, 20.0F);
            GL11.glRotatef(57F, 5.0F, 0.0F, 0.0F);
            GL11.glTranslatef(0.5F, 0.2F, -0.1F);
            GL11.glScalef(0.9F, 0.9F, 0.9F);
            FMLClientHandler.instance().getClient().renderEngine
                    .bindTexture(TEXTURE);
            model.render(.0625F);
            GL11.glPopMatrix();
            break;
        }
        case INVENTORY: {// LordIllyohs: I was a little lazy when modeling this
                         // while either fix in the renderer or remodel the rod
                         // not sure yet
            GL11.glPushMatrix();

            GL11.glRotatef(5F, 0.0F, 0.0F, 20.0F);
            GL11.glRotatef(57F, 5.0F, 0.0F, 0.0F);
            GL11.glTranslatef(0.5F, 0.2F, -0.1F);
            GL11.glScalef(0.5F, 0.9F, 0.9F);
            FMLClientHandler.instance().getClient().renderEngine
                    .bindTexture(TEXTURE);
            model.render(.0625F);
            GL11.glPopMatrix();
            break;
        }
        default:
            break;

        }

    }

}
