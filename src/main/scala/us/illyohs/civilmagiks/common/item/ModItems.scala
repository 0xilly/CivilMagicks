package us.illyohs.civilmagiks.common.item

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraftforge.fml.common.registry.GameRegistry

object ModItems {

  var springWand: Item = null

  def init: Unit = {
    this.springWand = new ItemBaseSpringWand("springwand", true, CreativeTabs.FOOD)
    gameReg
  }

  private def gameReg: Unit = {
    println("---------------------------------------------" + springWand.getUnlocalizedName)
    GameRegistry.register(springWand)
  }

}