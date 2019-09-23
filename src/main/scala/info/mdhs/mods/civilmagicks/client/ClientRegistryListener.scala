package info.mdhs.mods.civilmagicks.client

import info.mdhs.mods.civilmagicks.client.render.tile.RenderManaSpring
import info.mdhs.mods.civilmagicks.common.block.TileManaSpring
import net.minecraftforge.fml.client.registry.{ClientRegistry, RenderingRegistry}
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent

object ClientRegistryListener {
    def RegisterRenders(event: FMLClientSetupEvent): Unit = {
      ClientRegistry.bindTileEntitySpecialRenderer(classOf[TileManaSpring], new RenderManaSpring())
    }

}
