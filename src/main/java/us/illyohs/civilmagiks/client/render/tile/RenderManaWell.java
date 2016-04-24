package us.illyohs.civilmagiks.client.render.tile;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import us.illyohs.civilmagiks.common.tile.node.TileManSpring;

public class RenderManaWell extends TileEntitySpecialRenderer<TileManSpring> {


    @Override
    public void renderTileEntityAt(TileManSpring te, double x, double y, double z, float partialTicks, int destroyStage) {
        renderCircle(te.getManaType().getColor(), x, y, z);
    }

    private void renderCircle(int color, double x, double y, double z) {

    }
}
