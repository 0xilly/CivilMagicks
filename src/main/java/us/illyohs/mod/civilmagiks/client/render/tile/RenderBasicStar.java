package us.illyohs.mod.civilmagiks.client.render.tile;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class RenderBasicStar extends TileEntitySpecialRenderer {

    public RenderBasicStar() {

    }

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float p_180535_8_, int tick) {

        GlStateManager.pushMatrix();
        GlStateManager.pushAttrib();

        Tessellator tess = Tessellator.getInstance();
        WorldRenderer wr = tess.getWorldRenderer();

        GlStateManager.popMatrix();
        GlStateManager.popAttrib();

    }
}
