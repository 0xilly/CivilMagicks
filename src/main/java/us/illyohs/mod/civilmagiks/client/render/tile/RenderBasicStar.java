package us.illyohs.mod.civilmagiks.client.render.tile;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import us.illyohs.mod.civilmagiks.client.core.lib.LibAssets;

public class RenderBasicStar extends TileEntitySpecialRenderer {

    public RenderBasicStar() {

    }

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float tick, int blockdamnage) {

        GlStateManager.pushMatrix();
        GlStateManager.pushAttrib();

        Tessellator tess = Tessellator.getInstance();
        WorldRenderer wr = tess.getWorldRenderer();

        wr.startDrawingQuads();

        this.bindTexture(LibAssets.star);
        tess.draw();

//        wr.addVertexWithUV();


        GlStateManager.popMatrix();
        GlStateManager.popAttrib();

    }
}
