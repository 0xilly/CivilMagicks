package us.illyohs.civilmagiks.client.core.util;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.FMLClientHandler;

import java.awt.*;

public class FxUtil {

    public static void bindBasicItemModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    public static void bindTexture(ResourceLocation texture) {
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
    }

    public static void renderSpellCircle(ResourceLocation texture, double x, double y, double z, int color, int blend) {
        Tessellator tess = Tessellator.getInstance();
        VertexBuffer buff = tess.getBuffer();

        GlStateManager.pushMatrix();
        bindTexture(texture);
        GlStateManager.disableCull();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(770, blend);
        GlStateManager.translate(x, y, z);
        GlStateManager.pushMatrix();

        Color col = new Color(color);
        float r = col.getRed();
        float g = col.getGreen();
        float b = col.getBlue();

        GlStateManager.color(r, g, b, 1f);
        buff.begin(7, DefaultVertexFormats.POSITION_TEX);
        // buff.setBrightness(200);
        buff.pos(1 / 2f, 1 / 2f, 0.0D).tex(1, 1).endVertex();
        buff.pos(1 / 2f, -1 / 2f, 0.0D).tex(1, 0).endVertex();
        buff.pos(-1 / 2f, -1 / 2f, 0.0D).tex(0, 0).endVertex();
        buff.pos(-1 / 2f, 1 / 2f, 0.0D).tex(0, 1).endVertex();
        tess.draw();

        GlStateManager.popMatrix();

        // GlStateManager.depthMask(true);
        GlStateManager.disableBlend();
        GlStateManager.enableCull();
        // GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

        GlStateManager.popMatrix();

    }

}
