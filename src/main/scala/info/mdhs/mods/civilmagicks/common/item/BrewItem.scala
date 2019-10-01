package info.mdhs.mods.civilmagicks.common.item

import net.minecraft.item.{Item, ItemGroup, ItemStack}
import net.minecraft.item.Item.Properties
import net.minecraft.util.NonNullList

import info.mdhs.mods.civilmagicks.common.CivilMagicks
import info.mdhs.mods.civilmagicks.common.util.helpers.BrewHelper

class BrewItem(properties: Properties) extends Item(properties) {

  override def fillItemGroup(group: ItemGroup, items: NonNullList[ItemStack]): Unit = {
    if (this.isInGroup(group)) {
      val brews = CivilMagicks.INSTANCE.getAPI.getBrewRegistry.getBrews
      brews.forEach(b => {
        if (b != null) {
          items.add(BrewHelper.addBrewToItemStack(new ItemStack(this), b))
        }
      })
    }
  }
}

/**
  * Consumable
  *    Three tiers {POOR, ADEQUATE, GREAT} maybe more in the future
  *    Tiers have mulipile on how many uses a brew can have and its effectivness
  *    base usages is poor is 1 use adequate is 3 great 9 may
  *
  * */
