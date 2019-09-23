package info.mdhs.mods.civilmagicks.common.tileentity

import net.minecraft.tileentity.TileEntityType
import net.minecraft.util.ResourceLocation
import net.minecraftforge.registries.{IForgeRegistry, RegistryManager}

object ModTileTypes {
  // format: off
  final val TILE_REGISTRY: IForgeRegistry[TileEntityType[_]] = RegistryManager.ACTIVE.getRegistry(classOf[TileEntityType[_]])
  // format: on
  val FIRE_BOX: TileEntityType[_] = TILE_REGISTRY.getValue(new ResourceLocation("civilmagicks", "firebox"))
  val MANA_SPRING: TileEntityType[_] = TILE_REGISTRY.getValue(new ResourceLocation("civilmagicks", "manaspring"))
}
