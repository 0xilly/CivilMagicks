package io.ansan.mods.civilmagicks.client.render.tile

import net.minecraftforge.api.distmarker.{Dist, OnlyIn}
import net.minecraft.client.renderer.{IRenderTypeBuffer, Tessellator}
import net.minecraft.client.renderer.tileentity.{TileEntityRenderer, TileEntityRendererDispatcher}
import net.minecraft.client.renderer.vertex.VertexBuffer
import net.minecraft.util.ResourceLocation
import com.mojang.blaze3d.matrix.MatrixStack
import io.ansan.mods.civilmagicks.common.block.TileManaSpring
import org.apache.logging.log4j.LogManager

@OnlyIn(Dist.CLIENT)
class RenderManaSpring(erd: TileEntityRendererDispatcher) extends TileEntityRenderer[TileManaSpring](erd) {

  private val LOGGER  = LogManager.getLogger("CivilMagicks")
  private val TEXTURE = new ResourceLocation("civilmagicks:textures/fx/manasigil.png")

  // format: off
  //format: on
  override def render(tileEntityIn: TileManaSpring, partialTicks: Float, matrixStackIn: MatrixStack, bufferIn: IRenderTypeBuffer, combinedLightIn: Int, combinedOverlayIn: Int): Unit = {
    
  }
}
