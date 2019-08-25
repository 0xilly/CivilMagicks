package info.mdhs.mods.civilmagicks.common.util

import net.minecraft.tileentity.TileEntityType
import net.minecraft.util.ResourceLocation

import info.mdhs.mods.civilmagicks.common.block.{TileFireBox, TileManaSpring}

object ModTileTypes {
  val FIRE_BOX: TileEntityType[TileFireBox] = TileEntityType.Builder
    .create(() => new TileFireBox)
    .build(null)

  val MANA_SPRING: TileEntityType[_] = TileEntityType.Builder
    .create(() => new TileManaSpring)
    .build(null)
    .setRegistryName(new ResourceLocation("civilmagicks:manaspring"))
}
