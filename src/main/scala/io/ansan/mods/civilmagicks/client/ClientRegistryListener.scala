package io.ansan.mods.civilmagicks.client

import net.minecraftforge.client.event.ColorHandlerEvent
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import io.ansan.mods.civilmagicks.client.util.ColorUtil
import io.ansan.mods.civilmagicks.common.item.ModItems
import io.ansan.mods.civilmagicks.common.util.helpers.BrewHelper

object ClientRegistryListener {

  def RegisterRenders(event: FMLClientSetupEvent): Unit = {
//    ClientRegistry.bindTileEntitySpecialRenderer(classOf[TileManaSpring], new RenderManaSpring())
  }

  def RegisterItemColorHandler(event: ColorHandlerEvent.Item): Unit = {

    event.getItemColors.register(
      (stack, provider) => {
        val brew        = BrewHelper.getBrewFromItem(stack)
        var bColor: Int = 0
        if (brew.isPresent) {
          bColor = brew.get().getColor
        } else {
          bColor = 0xF1FFFE
        }

        val color = ColorUtil.hex2RgbI(bColor)

        val col = if (provider != 1) -1 else color
        col

      },
      ModItems.BREW
    )
  }

}
