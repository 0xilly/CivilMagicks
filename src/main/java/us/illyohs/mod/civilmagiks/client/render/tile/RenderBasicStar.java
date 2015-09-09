package us.illyohs.mod.civilmagiks.client.render.tile;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class RenderBasicStar extends TileEntitySpecialRenderer {



    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float p_180535_8_, int tick) {

        Tessellator tess = Tessellator.getInstance();
        WorldRenderer wr = tess.getWorldRenderer();

    }
}
