package us.illyohs.civilmagiks.client.render.tile;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import us.illyohs.civilmagiks.client.core.util.AssetUtils;
import us.illyohs.civilmagiks.client.core.util.FxUtil;
import us.illyohs.civilmagiks.common.tile.node.TileManaSpring;

public class RenderManaSpring extends TileEntitySpecialRenderer<TileManaSpring> {


    @Override
    public void renderTileEntityAt(TileManaSpring te, double x, double y, double z, float partialTicks, int destroyStage) {
        renderCircle(te.getManaType().getColor(), x, y, z);
    }

    private void renderCircle(int color, double x, double y, double z) {
        FxUtil.renderSpellCircle(AssetUtils.getModelAsset("manaspring"), x, y, z, color, 1);
    }
}
