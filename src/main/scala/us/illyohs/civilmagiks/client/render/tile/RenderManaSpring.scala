package us.illyohs.civilmagiks.client.render.tile


import net.minecraft.client.renderer.{GlStateManager, Tessellator, VertexBuffer}
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer
import net.minecraft.client.renderer.vertex.DefaultVertexFormats
import net.minecraft.util.ResourceLocation
import org.lwjgl.opengl.GL11
import us.illyohs.civilmagiks.common.tile.TileManaSpring

import scala.swing.Color


object RenderManaSpring extends TileEntitySpecialRenderer[TileManaSpring] {

  private val TEXTURE:ResourceLocation = new ResourceLocation("civilmagicks", "textures/models/manaspring.png")

  override def renderTileEntityAt(te:TileManaSpring, x: Double, y: Double, z: Double, tick: Float, dtick: Int): Unit = {
    val color:Color = new Color(te.getManaType.getColor)

    val tess:Tessellator = Tessellator.getInstance()
    val buff:VertexBuffer = tess.getBuffer

    GlStateManager.pushMatrix()
    bindTexture(TEXTURE)
    GlStateManager.disableCull()
    GlStateManager.enableBlend()
    GlStateManager.disableAlpha()
    GlStateManager.blendFunc(770, 1)
    GlStateManager.color(color.getRed, color.getGreen(), color.getBlue(), 300.0F)
    GlStateManager.translate(x + .5, y + .025, z + .5)
    GlStateManager.scale(10, 10, 10)
    GlStateManager.rotate(90.0f, 1, 0, 0)
    GlStateManager.pushMatrix()

    val spin: Float = tick / 16F
    GlStateManager.rotate(-spin, 0, 0, 1)

    buff.begin(7, DefaultVertexFormats.POSITION_TEX)

    buff.pos(1 / 2f, 1 / 2f, 0.0D).tex(1, 1).endVertex()
    buff.pos(1 / 2f, -1 / 2f, 0.0D).tex(1, 0).endVertex()
    buff.pos(-1 / 2f, -1 / 2f, 0.0D).tex(0, 0).endVertex()
    buff.pos(-1 / 2f, 1 / 2f, 0.0D).tex(0, 1).endVertex()

    tess.draw()

    GlStateManager.popMatrix

    // GlStateManager.depthMask(true);
    GlStateManager.disableBlend
    GlStateManager.enableCull
    GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA)

    GlStateManager.popMatrix
  }
}
