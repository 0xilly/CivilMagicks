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
 * Class created on Jul 26, 2014 at 3:48:03 PM
 * 
 */
package us.illyohs.civilmagicks.client.render.tile;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySignRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import us.illyohs.civilmagicks.client.lib.LibAssets;
import us.illyohs.civilmagicks.client.model.ModelBrewChamber;
import us.illyohs.civilmagicks.common.lib.LibInfo;
import us.illyohs.civilmagicks.common.tile.TileBrewChamber;

public class RenderBrewChamber extends TileEntitySignRenderer {

    private ModelBrewChamber model;

    public RenderBrewChamber() {
        model = new ModelBrewChamber();
    }

    private static final ResourceLocation TEXTURE = new ResourceLocation(LibInfo.MOD_ID, LibAssets.BREWCHAMER);

    @Override
    public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float tick) {
        TileBrewChamber tbc = (TileBrewChamber) tile;

        GL11.glPushMatrix(); 

        GL11.glTranslated((float)x + 0.5, (float)y + 1.5, (float)z + 0.5);
        GL11.glScalef(1F, -1F, -1F);
        Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE);
        model.render(.0625F);
        GL11.glScalef(1F, -1F, -1F);
        GL11.glBlendFunc(0, 1);
        GL11.glClearColor(0.7f, 0.7f, 0.7f, 1.0f);
        GL11.glPopMatrix();

    }

}
