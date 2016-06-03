package us.illyohs.civilmagiks.client.util

import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraft.util.ResourceLocation
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.fml.client.FMLClientHandler

object FxUtil {
  def bindBasicItemModel(item: Item) {
    ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName, "inventory"))
  }

  def bindTexture(texture: ResourceLocation) {
    FMLClientHandler.instance.getClient.renderEngine.bindTexture(texture)
  }

  def shaderBind(path: String) {
  }
}