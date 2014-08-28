/**
 * This class was created by Anthony Anderson(Lord Illyohs)
 * It is distributed as part of CivilMagicks
 * Source Code: https://github.com/LordIllyohs/CivilMagicks
 *
 * CivilMagicks is Open Source and distributed under a
 * Attribution-NonCommercial-ShareAlike 3.0 Unported license.
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/)
 *
 * 
 * Class created on Aug 27, 2014 at 7:52:21 PM
 * 
 */
package us.illyohs.civilmagicks.client.render.item;

import org.lwjgl.opengl.GL11;

import us.illyohs.civilmagicks.client.lib.LibAssets;
import us.illyohs.civilmagicks.client.model.ModelBrewChamber;
import us.illyohs.civilmagicks.common.lib.LibInfo;
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
    
    private static final ResourceLocation TEXTURE = new ResourceLocation(LibInfo.MOD_ID, LibAssets.BREWCHAMER);
    
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
    public void renderItem(ItemRenderType itemRenderType, ItemStack itemStack, Object... data) {
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
        
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(TEXTURE);
        
        GL11.glPushMatrix();
        GL11.glTranslatef(x, y, z);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(-90, 0, 1, 0);
        model.render(.0625f);
        GL11.glPopMatrix();
        
    }
    
    
}
