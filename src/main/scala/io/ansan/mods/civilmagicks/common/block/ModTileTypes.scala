package io.ansan.mods.civilmagicks.common.block

import net.minecraftforge.registries.{IForgeRegistry, RegistryManager}

import net.minecraft.tileentity.TileEntityType
import net.minecraft.util.ResourceLocation

object ModTileTypes {
  // format: off
  private final val TILE_REGISTRY: IForgeRegistry[TileEntityType[_]] = RegistryManager.ACTIVE.getRegistry(classOf[TileEntityType[_]])
  // format: on
  val FIRE_BOX: TileEntityType[_]    = TILE_REGISTRY.getValue(new ResourceLocation("civilmagicks", "firebox"))
  val MANA_SPRING: TileEntityType[_] = TILE_REGISTRY.getValue(new ResourceLocation("civilmagicks", "manaspring"))
  val SIGIL: TileEntityType[_]       = TILE_REGISTRY.getValue(new ResourceLocation("civilmagicks", "sigil"))
}
