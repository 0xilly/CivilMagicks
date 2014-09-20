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
 * Class created on Sep 5, 2014 at 6:11:41 PM
 * 
 */
package us.illyohs.civilmagicks.client.render.tile;

import org.lwjgl.opengl.GL11;

import us.illyohs.civilmagicks.client.model.ModelTeaTank;
import us.illyohs.civilmagicks.common.lib.LibInfo;
import us.illyohs.civilmagicks.common.tile.TileTeaTank;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;


public class RenderTileTank extends TileEntitySpecialRenderer {
    
    private ModelTeaTank model;
    

    public RenderTileTank() {
        model = new ModelTeaTank();
    }
    
    private static final ResourceLocation TEXTURE = new ResourceLocation(LibInfo.MOD_ID, "textures/models/glassslate.png");

    @Override
    public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float tick) {
        TileTeaTank tt =  (TileTeaTank)tile;
        GL11.glPushMatrix(); 

        GL11.glTranslated((float)x + 0.5, (float)y + 1.5, (float)z + 0.5);
        GL11.glScalef(1F, -1F, -1F);
        GL11.glEnable(GL11.GL_BLEND);;
        Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE);
        model.render(.0625F);
        GL11.glScalef(1F, -1F, -1F);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
//        GL11.glClearColor(0.7f, 0.7f, 0.7f, 1.0f);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glPopMatrix();
    }

}
