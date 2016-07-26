package us.illyohs.civilmagiks.client.core.util


import java.awt.Color

import net.minecraft.client.gui.Gui
import net.minecraft.client.particle.Particle
import net.minecraft.client.renderer.GlStateManager
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.Item
import net.minecraft.util.{EnumParticleTypes, ResourceLocation}
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.fml.client.FMLClientHandler
import net.minecraftforge.fml.relauncher.{Side, SideOnly}
import us.illyohs.civilmagiks.common.core.util.math.MathUtils

object FxUtil {

  def bindBasicItemModel(item: Item): Unit = ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName, "inventory"))


  def bindTexture(texture: ResourceLocation): Unit = FMLClientHandler.instance.getClient.renderEngine.bindTexture(texture)

  def shaderBind(path: String) {
  }

  def renderCircle(x:Int, y:Int, z:Int, color:Int, blend:Int, scale:Float, time:Float, texture:Array[ResourceLocation]): Unit = {

    val col:Color = new Color(color)

    val RED   = col.getRed / 255f
    val GREEN = col.getGreen / 255f
    val BLUE  = col.getBlue / 255f

    GlStateManager pushMatrix()
    GlStateManager.disableCull()
    GlStateManager.enableBlend()
    GlStateManager.disableAlpha()
    GlStateManager.translate(x + .5, y + .025, z + .5)
    GlStateManager.scale(x, y, z)
    GlStateManager.rotate(90f, 1f, 0f, 0f)
    GlStateManager.disableCull()
    GlStateManager.disableLighting()
    GlStateManager.color(RED, GREEN, BLUE)
    for (i <- texture.indices){
      bindTexture(texture.apply(i))
      Gui.drawModalRectWithCustomSizedTexture(0, 0, 0, 0, 64, 64, 64, 64)
    }

    GlStateManager.enableCull()
    GlStateManager.popMatrix()

  }

  @SideOnly(Side.CLIENT)
  def renderParticleRing(radius:Double, doMirror:Boolean, pos: BlockPos, particle:Particle, color: Color): Unit = {

    val x = pos.getX.toDouble
    val y = pos.getY.toDouble
    val z = pos.getZ.toDouble

    val red   = color.getRed
    val blur  = color.getBlue
    val green = color.getGreen

    val flame = EnumParticleTypes.FLAME

  }

  @SideOnly(Side.CLIENT)
  def renderParticleOnPoints(radius:Int, points:Array[Int], world:World, pos:BlockPos, color:Color,
                             paricle:Particle): Unit = {
    for (i <- 0 to points.length if i > 360 || i < 0) {
      val x = pos.getX / radius * Math.cos(MathUtils.degreesToRadians_D(i))
      val y = pos.getY / radius * Math.cos(MathUtils.degreesToRadians_D(i))
    }
  }


}