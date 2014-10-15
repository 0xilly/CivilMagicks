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
package us.illyohs.civilmagicks.teaurgy.client.render.item;

import org.lwjgl.opengl.GL11;

import us.illyohs.civilmagicks.core.lib.LibAssets;
import us.illyohs.civilmagicks.core.lib.LibInfo;
import us.illyohs.civilmagicks.teaurgy.client.model.ModelBrewChamber;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

@SideOnly(Side.CLIENT)
public class ItemRenderBrewChamber implements IItemRenderer {

    private final ModelBrewChamber model;

    public ItemRenderBrewChamber() {
        model = new ModelBrewChamber();
    }

    private static final ResourceLocation TEXTURE = new ResourceLocation(
            LibInfo.MOD_ID, LibAssets.BREWCHAMER);

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
            ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType itemRenderType, ItemStack itemStack,
            Object... data) {
        switch (itemRenderType) {
        case ENTITY: {
            renderBrewChamber(0.5f, 0.5f, 0.5f, itemStack.getItemDamage());
            break;
        }

        case EQUIPPED: {
            renderBrewChamber(0.20f, 1.2f, 0.075f, itemStack.getItemDamage());
            break;
        }

        case EQUIPPED_FIRST_PERSON: {
            renderBrewChamber(0.01f, 2.0f, 1.0f, itemStack.getItemDamage());
            break;
        }

        case INVENTORY: {
            renderBrewChamber(0.0f, 1.0f, 0.0f, itemStack.getItemDamage());
            break;
        }

        default:
            break;
        }
    }

    private void renderBrewChamber(float x, float y, float z, int itemDamage) {

        FMLClientHandler.instance().getClient().renderEngine
                .bindTexture(TEXTURE);

        GL11.glPushMatrix();
        GL11.glTranslatef(x, y, z);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(-90, 0, 1, 0);
        model.render(.0625f);
        GL11.glPopMatrix();

    }

}
