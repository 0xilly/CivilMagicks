package io.ansan.mods.civilmagicks.common.item

import net.minecraft.client.util.ITooltipFlag
import net.minecraft.item.{Item, ItemGroup, ItemStack}
import net.minecraft.item.Item.Properties
import net.minecraft.util.NonNullList
import net.minecraft.util.text.{ITextComponent, StringTextComponent}
import net.minecraft.world.World

import java.util.List
import io.ansan.mods.civilmagicks.common.CivilMagicks
import io.ansan.mods.civilmagicks.common.util.helpers.BrewHelper

import java.util

class BrewItem(properties: Properties) extends Item(properties) {

  override def fillItemCategory(group: ItemGroup, items: NonNullList[ItemStack]): Unit = {
    if (this.allowdedIn(group)) {
      val brews = CivilMagicks.INSTANCE.getAPI.getBrewRegistry.getBrews
      brews.forEach(b => {
        if (b != null) {
          items.add(BrewHelper.addBrewToItemStack(new ItemStack(this), b))
        }
      })
    }
  }


  override def getName(stack: ItemStack): ITextComponent = {
    val brew = BrewHelper.getBrewFromItem(stack).get()

    new StringTextComponent(brew.getKey.getPath)
  }

  override def appendHoverText(stack: ItemStack, world: World, tip: List[ITextComponent], flag: ITooltipFlag): Unit = {
    val brew = BrewHelper.getBrewFromItem(stack).get()
    tip.add(new StringTextComponent(s"Added by: ${brew.getKey.getNamespace}"))
    tip.add(new StringTextComponent(s"Color: ${brew.getColor}"))
  }
}
