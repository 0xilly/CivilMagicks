package us.illyohs.civilmagiks.client.core.util

import java.awt.Color

import net.minecraft.client.gui.Gui
import net.minecraft.client.renderer.GlStateManager
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraft.util.ResourceLocation

import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.fml.client.FMLClientHandler

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

}