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
 * Class created on Jul 8, 2014 at 10:29:20 PM
 * 
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
	private static final ResourceLocation TEXTURE = new ResourceLocation(LibInfo.MOD_ID, "textures/models/transrod.png");

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch(type) {

		case ENTITY:
		case EQUIPPED_FIRST_PERSON:
		case EQUIPPED:
		case INVENTORY: return true;
		default: return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,ItemRendererHelper helper) {
				return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch(type) {
			case EQUIPPED: {
				GL11.glPushMatrix();

				GL11.glRotatef(20F, 0.0F, 0.0F, 20.0F);
				GL11.glRotatef(29F, 5.0F, 0.0F, 0.0F);
				GL11.glTranslatef(0.5F, 0.2F, -0.1F);
				GL11.glScalef(1.5F, 1.5F, 1.5F);
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(TEXTURE);
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
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(TEXTURE);
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
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(TEXTURE);
				model.render(.0625F);
				GL11.glPopMatrix();
				break;
			}
			case INVENTORY: {//LordIllyohs: I was a little lazy when modeling this while either fix in the renderer or remodel the rod not sure yet
				GL11.glPushMatrix();

				GL11.glRotatef(5F, 0.0F, 0.0F, 20.0F);
				GL11.glRotatef(57F, 5.0F, 0.0F, 0.0F);
				GL11.glTranslatef(0.5F, 0.2F, -0.1F);
				GL11.glScalef(0.5F, 0.9F, 0.9F);
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(TEXTURE);
				model.render(.0625F);
				GL11.glPopMatrix();
				break;				
			}
			default: break;

		}

	}

}
