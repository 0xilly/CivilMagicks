package info.mdhs.mods.civilmagicks.common.util.helpers

import net.minecraft.item.ItemStack

import info.mdhs.mods.civilmagicks.api.brew.IBrew
import info.mdhs.mods.civilmagicks.common.CivilMagicks
import info.mdhs.mods.civilmagicks.common.brew.{Brew, HasteBrew}

object BrewHelper {

  def init: Unit = {
    regBrew(HasteBrew)
  }

  def addBrewToItemStack(stack: ItemStack, brew: IBrew): ItemStack = {
    if (brew != null) {
      stack.getOrCreateTag().putString("Brew", brew.getKey.toString)
    } else {
      stack.removeChildTag("Brew")
    }
    stack
  }

  private def regBrew(brew: Brew) = CivilMagicks.INSTANCE.getAPI.getBrewRegistry.getBrews.add(brew)
}
