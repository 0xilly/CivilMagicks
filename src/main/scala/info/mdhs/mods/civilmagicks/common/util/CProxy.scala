package info.mdhs.mods.civilmagicks.common.util

import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import net.minecraftforge.registries.{IForgeRegistry, RegistryBuilder}

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.tileentity.TileEntityType
import net.minecraft.util.ResourceLocation

import info.mdhs.mods.civilmagicks.api.mana.ManaType
import info.mdhs.mods.civilmagicks.common.block.ModBlocks
import info.mdhs.mods.civilmagicks.common.mana.ManaTypes

trait CProxy {

  val manaRegistry: IForgeRegistry[ManaType] = new RegistryBuilder[ManaType]
    .setName(new ResourceLocation("civilmagicks:mana"))
    .setIDRange(0, Short.MaxValue)
    .setType(classOf[ManaType])
    .create()

  def registerBlocks(event: RegistryEvent.Register[Block]): Unit = {
    val ctx = event.getRegistry
    ctx.register(ModBlocks.MANA_SPRING)
  }

  def registerTileType(event: RegistryEvent.Register[TileEntityType[_]]): Unit = {
    val ctx = event.getRegistry
    ctx.register(ModTileTypes.MANA_SPRING)
  }

  def registerItem(event: RegistryEvent.Register[Item]): Unit = {}

  def registerManaType(event: RegistryEvent.Register[ManaType]): Unit = {
    val ctx = event.getRegistry
    ctx.register(ManaTypes.AIR)
    ctx.register(ManaTypes.EARTH)
    ctx.register(ManaTypes.FIRE)
    ctx.register(ManaTypes.INERT)
  }

  def clientSetup(event: FMLClientSetupEvent): Unit = {}
}
