package us.illyohs.mod.civilmagiks.client.render.tile;

import us.illyohs.mod.civilmagiks.client.core.lib.LibAssets;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class RenderBasicStar extends TileEntitySpecialRenderer {

    public RenderBasicStar() {

    }

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float tick, int blockdamnage) {

        GlStateManager.pushMatrix();
        GlStateManager.pushAttrib();

        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer tes = tessellator.getWorldRenderer();

        tes.startDrawingQuads();
        //
//        tes.addVertexWithUV(x, y, z , u, v);
//                          x  y  z  tX tY
//        tes.addVertexWithUV(0, 0, 1, 1, 1);
//        tes.addVertexWithUV(0, 0, 1, 1, 1);
//        tes.addVertexWithUV(0, 0, 1, 1, 1);
//        tes.addVertexWithUV(0, 0, 1, 1, 1);

        this.bindTexture(LibAssets.star);
        tessellator.draw();

        GlStateManager.popMatrix();
        GlStateManager.popAttrib();

    }
}
