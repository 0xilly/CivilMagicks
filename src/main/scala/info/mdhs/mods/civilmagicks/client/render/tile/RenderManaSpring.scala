package info.mdhs.mods.civilmagicks.client.render.tile

import com.mojang.blaze3d.platform.GlStateManager
import info.mdhs.mods.civilmagicks.common.block.TileManaSpring
import java.awt.Color
import net.minecraft.client.renderer.Tessellator
import net.minecraft.client.renderer.tileentity.TileEntityRenderer
import net.minecraft.client.renderer.vertex.DefaultVertexFormats
import net.minecraft.util.ResourceLocation
import net.minecraftforge.api.distmarker.{Dist, OnlyIn}
import org.apache.logging.log4j.LogManager
import org.lwjgl.opengl.GL11

@OnlyIn(Dist.CLIENT)
class RenderManaSpring extends TileEntityRenderer[TileManaSpring] {

  private val LOGGER  = LogManager.getLogger("CivilMagicks")
  private val TEXTURE = new ResourceLocation("civilmagicks:textures/fx/manasigil.png")

  override def render(te: TileManaSpring, x: Double, y: Double, z: Double, tick: Float, destroyStage: Int): Unit = {
    super.render(te, x, y, z, tick, destroyStage)

    LOGGER.info("BEEEES")

    val _color = new Color(0xff3030)
    val tes    = Tessellator.getInstance
    val buffer = tes.getBuffer

    GlStateManager.pushMatrix()
    bindTexture(TEXTURE)
    GlStateManager.disableCull()
    GlStateManager.enableBlend()
    GlStateManager.disableAlphaTest()
    GlStateManager.blendFunc(770, 1)
    GlStateManager.color4f(_color.getRed, _color.getGreen, _color.getBlue, 300.0F)
    GlStateManager.translated(x + .5, y + .025, z + .5)
    GlStateManager.scaled(10, 10, 10)
    GlStateManager.rotatef(90.0f, 1, 0, 0)
    GlStateManager.pushMatrix()

    val spin: Float = tick / 16F
    GlStateManager.rotatef(-spin, 0, 0, 1)

    buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX)

    buffer.pos(1 / 2f, 1 / 2f, 0.0D).tex(1, 1).endVertex()
    buffer.pos(1 / 2f, -1 / 2f, 0.0D).tex(1, 0).endVertex()
    buffer.pos(-1 / 2f, -1 / 2f, 0.0D).tex(0, 0).endVertex()
    buffer.pos(-1 / 2f, 1 / 2f, 0.0D).tex(0, 1).endVertex()
    tes.draw()

    GlStateManager.popMatrix()

    GlStateManager.depthMask(true);
    GlStateManager.disableBlend()
    GlStateManager.enableCull()
    GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA)

    GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA)

    GlStateManager.popMatrix()

  }
}
