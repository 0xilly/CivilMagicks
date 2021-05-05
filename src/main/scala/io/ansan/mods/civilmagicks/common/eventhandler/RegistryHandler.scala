package io.ansan.mods.civilmagicks.common.eventhandler

import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.loading.LogMarkers
import net.minecraftforge.registries.RegistryBuilder
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.entity.EntityType
import net.minecraft.item.{BlockItem, Item}
import net.minecraft.tileentity.TileEntityType
import net.minecraft.util.ResourceLocation
import io.ansan.mods.civilmagicks.api.mana.ManaType
import io.ansan.mods.civilmagicks.common.CivilMagicks
import io.ansan.mods.civilmagicks.common.block.{BlockManaSpring, FireBox, ModBlocks, TileFireBox, TileManaSpring}
import io.ansan.mods.civilmagicks.common.item.BrewItem
import io.ansan.mods.civilmagicks.common.mana.{AirMana, EarthMana, FireMana, InertMana, WaterMana}
import net.minecraft.item.Item.{Properties => ItemProperties}
import net.minecraft.block.AbstractBlock.{Properties => BlockProperties}

object RegistryHandler {
  def CreateRegistries(event: RegistryEvent.NewRegistry): Unit = {
    new RegistryBuilder()
      .setMaxID(Short.MaxValue)
      .setType(classOf[ManaType])
      .setName(new ResourceLocation("civilmagicks", "mana"))
      .create()
  }

  def RegisterBlocks(event: RegistryEvent.Register[Block]): Unit = {
    CivilMagicks.INSTANCE.LOGGER.debug(LogMarkers.LOADING, "Registering Blocks for CivilMagicks...")

    event.getRegistry.registerAll(
      new FireBox(
        BlockProperties
          .of(Material.STONE)
          .harvestLevel(3)
          .noDrops())
        .setRegistryName("civilmagicks", "firebox"),
      new BlockManaSpring(
        BlockProperties
          .of(Material.STONE)
          .randomTicks()
          .strength(2))
        .setRegistryName("civilmagicks", "manaspring")
    )
  }

  def RegisterItems(event: RegistryEvent.Register[Item]): Unit = {
    CivilMagicks.INSTANCE.LOGGER.debug(LogMarkers.LOADING, "Registering Items for CivilMagicks...")

    event.getRegistry.registerAll(
      new BlockItem(ModBlocks.FIRE_BOX, new ItemProperties().tab(CivilMagicks.ITEM_GROUP)).setRegistryName(ModBlocks.FIRE_BOX.getRegistryName),
      new BlockItem(ModBlocks.MANA_SPRING, new ItemProperties().tab(CivilMagicks.ITEM_GROUP)).setRegistryName(ModBlocks.MANA_SPRING.getRegistryName),
      new BrewItem(new ItemProperties().stacksTo(1).tab(CivilMagicks.BREW_GROUP)).setRegistryName("civilmagicks:brew")
    )
  }

  def RegisterManas(event: RegistryEvent.Register[ManaType]): Unit = {
    CivilMagicks.INSTANCE.LOGGER.debug(LogMarkers.LOADING, "Registering Manas for CivilMagicks...")

    event.getRegistry.registerAll(
      new FireMana,
      new AirMana,
      new EarthMana,
      new WaterMana,
      new InertMana
    )
  }

  def RegisterEntities(event: RegistryEvent.Register[EntityType[_]]): Unit = {
    CivilMagicks.INSTANCE.LOGGER.debug(LogMarkers.LOADING, "Registering Entities for CivilMagicks...")

    event.getRegistry.registerAll(
      )
  }

  def RegisterTiles(event: RegistryEvent.Register[TileEntityType[_]]): Unit = {
    CivilMagicks.INSTANCE.LOGGER.debug(LogMarkers.LOADING, "Registering TileEntities for CivilMagicks...")

    event.getRegistry.registerAll(
      TileEntityType.Builder
        .of(() => new TileFireBox)
        .build(null)
        .setRegistryName("civilmagicks", "firebox"),
      TileEntityType.Builder
        .of(() => new TileManaSpring)
        .build(null)
        .setRegistryName("civilmagicks", "manaspring")
    )
  }

}
