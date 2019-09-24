package info.mdhs.mods.civilmagicks.client

import net.minecraftforge.fml.client.registry.ClientRegistry
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent

import info.mdhs.mods.civilmagicks.client.render.tile.RenderManaSpring
import info.mdhs.mods.civilmagicks.common.block.TileManaSpring

object ClientRegistryListener {
  def RegisterRenders(event: FMLClientSetupEvent): Unit = {
    ClientRegistry.bindTileEntitySpecialRenderer(classOf[TileManaSpring], new RenderManaSpring())
  }

}
