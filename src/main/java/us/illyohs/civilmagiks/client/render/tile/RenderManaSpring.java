package us.illyohs.civilmagiks.client.render.tile;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import us.illyohs.civilmagiks.client.core.util.AssetUtils;
import us.illyohs.civilmagiks.client.core.util.FxUtil;
import us.illyohs.civilmagiks.common.tile.node.TileManaSpring;

import java.awt.*;

public class RenderManaSpring extends TileEntitySpecialRenderer<TileManaSpring> {

    private ResourceLocation TEXTURE = new ResourceLocation("civilmagicks", "textures/models/manaspring.png");

    @Override
    public void renderTileEntityAt(TileManaSpring te, double x, double y, double z, float tick, int destroyStage) {
        renderCircle(te.getManaType().getColor(), x, y, z, tick);
    }

    private void renderCircle(int color, double x, double y, double z, float tick) {

        Tessellator tess = Tessellator.getInstance();
        VertexBuffer buff = tess.getBuffer();

        GlStateManager.pushMatrix();
//        GL11.glStencilFunc();
        bindTexture(TEXTURE);
        GlStateManager.disableCull();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(770, 1);
        GlStateManager.translate(x+.5, y+.025, z+.5);
        GlStateManager.scale(3,3,3);
        GlStateManager.rotate(90.0f, 1, 0, 0);
        GlStateManager.pushMatrix();

        float spin = tick / 16F;
        GlStateManager.rotate(-spin, 0, 0, 1);
        Color col = new Color(color);
        float r = col.getRed();
        float g = col.getGreen();
        float b = col.getBlue();

        GlStateManager.color(r, g, b, 1f);
        buff.begin(7, DefaultVertexFormats.POSITION_TEX);

        buff.pos(1 / 2f, 1 / 2f, 0.0D).tex(1, 1).endVertex();
        buff.pos(1 / 2f, -1 / 2f, 0.0D).tex(1, 0).endVertex();
        buff.pos(-1 / 2f, -1 / 2f, 0.0D).tex(0, 0).endVertex();
        buff.pos(-1 / 2f, 1 / 2f, 0.0D).tex(0, 1).endVertex();
        tess.draw();

        GlStateManager.popMatrix();

        // GlStateManager.depthMask(true);
        GlStateManager.disableBlend();
        GlStateManager.enableCull();
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

        GlStateManager.popMatrix();
    }

}
