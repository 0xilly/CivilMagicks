package info.mdhs.mods.civilmagicks.common.util.helpers

import net.minecraft.item.ItemStack
import net.minecraft.util.ResourceLocation

import info.mdhs.mods.civilmagicks.api.brew.IBrew
import info.mdhs.mods.civilmagicks.common.CivilMagicks
import info.mdhs.mods.civilmagicks.common.brew.{Brew, FireWalking, HasteBrew, WaterBreathing}
import java.util.Optional

object BrewHelper {

  def init: Unit = {
    regBrew(HasteBrew)
    regBrew(FireWalking)
    regBrew(WaterBreathing)
  }

  def addBrewToItemStack(stack: ItemStack, brew: IBrew): ItemStack = {
    if (brew != null) {
      stack.getOrCreateTag().putString("Brew", brew.getKey.toString)
      stack.getOrCreateTag().putString("color", brew.getColor.toHexString)
    } else {
      stack.removeChildTag("Brew")
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
