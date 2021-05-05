package io.ansan.mods.civilmagicks.common.util.helpers

import net.minecraft.item.ItemStack
import net.minecraft.util.ResourceLocation
import io.ansan.mods.civilmagicks.api.brew.IBrew
import io.ansan.mods.civilmagicks.common.CivilMagicks
import io.ansan.mods.civilmagicks.common.brew.Brew

import java.util.Optional

object BrewHelper {

  def init: Unit = {
//    regBrew(HasteBrew)
//    regBrew(FireWalking)
//    regBrew(WaterBreathing)
  }

  def addBrewToItemStack(stack: ItemStack, brew: IBrew): ItemStack = {
    if (brew != null) {
      stack.getOrCreateTag().putString("Brew", brew.getKey.toString)
      stack.getOrCreateTag().putString("color", brew.getColor.toHexString)
    } else {
      stack.removeTagKey("Brew")
    }
    stack
  }

  private def regBrew(brew: Brew): Unit = CivilMagicks.INSTANCE.getAPI.getBrewRegistry.getBrews.add(brew)

  def getBrewFromItem(stack: ItemStack): Optional[IBrew] = {
    val key         = stack.getOrCreateTag().getString("Brew")
    val keyResource = new ResourceLocation(key)
    val brew        = CivilMagicks.INSTANCE.getAPI.getBrewRegistry.getBrewByKey(keyResource)
    brew
  }
}
