package info.mdhs.mods.civilmagicks.common.eventhandler

import com.google.common.base.Stopwatch
import info.mdhs.mods.civilmagicks.api.mana.ManaType
import info.mdhs.mods.civilmagicks.common.CivilMagicks
import info.mdhs.mods.civilmagicks.common.block.{BlockManaSpring, FireBox, ModBlocks, TileFireBox, TileManaSpring}
import info.mdhs.mods.civilmagicks.common.mana.{AirMana, EarthMana, FireMana, InertMana, WaterMana}
import net.minecraft.block.Block
import net.minecraft.block.Block.Properties
import net.minecraft.block.material.Material
import net.minecraft.entity.EntityType
import net.minecraft.item.{BlockItem, Item}
import net.minecraft.tileentity.TileEntityType
import net.minecraft.util.ResourceLocation
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.loading.LogMarkers
import net.minecraftforge.registries.{RegistryBuilder, RegistryManager}

object RegistryHandler {
    def CreateRegistries(event: RegistryEvent.NewRegistry): Unit = {
      new RegistryBuilder().setMaxID(Short.MaxValue).setType(classOf[ManaType]).setName(new ResourceLocation("civilmagicks","mana")).create()
    }

    def RegisterBlocks(event: RegistryEvent.Register[Block]): Unit = {
    CivilMagicks.INSTANCE.LOGGER.debug(LogMarkers.LOADING, "Registering Blocks for CivilMagicks...")
    val clock: Stopwatch = Stopwatch.createStarted()
    event.getRegistry.registerAll(
      new FireBox(Properties.create(Material.ROCK).harvestLevel(3).noDrops()).setRegistryName("civilmagicks", "firebox"),
      new BlockManaSpring(Properties.create(Material.ROCK).tickRandomly.hardnessAndResistance(1)).setRegistryName("civilmagicks", "manaspring")
      )
    CivilMagicks.INSTANCE.LOGGER.debug(LogMarkers.LOADING, "Registered Blocks for CivilMagicks in {}", clock.stop().toString)
  }

  def RegisterItems(event: RegistryEvent.Register[Item]): Unit = {
      CivilMagicks.INSTANCE.LOGGER.debug(LogMarkers.LOADING, "Registering Items for CivilMagicks...")
      val clock: Stopwatch = Stopwatch.createStarted()
      event.getRegistry.registerAll(
        new BlockItem(ModBlocks.FIRE_BOX,new Item.Properties().group(CivilMagicks.ITEM_GROUP)).setRegistryName(ModBlocks.FIRE_BOX.getRegistryName),
        new BlockItem(ModBlocks.MANA_SPRING,new Item.Properties().group(CivilMagicks.ITEM_GROUP)).setRegistryName(ModBlocks.MANA_SPRING.getRegistryName)
      )
      CivilMagicks.INSTANCE.LOGGER.debug(LogMarkers.LOADING, "Registered Items for CivilMagicks in {}", clock.stop().toString)
  }

  def RegisterManas(event: RegistryEvent.Register[ManaType]): Unit = {
      CivilMagicks.INSTANCE.LOGGER.debug(LogMarkers.LOADING, "Registering Manas for CivilMagicks...")
      val clock: Stopwatch = Stopwatch.createStarted()
      event.getRegistry.registerAll(
          new FireMana,
          new AirMana,
          new EarthMana,
          new WaterMana,
          new InertMana
      )
      CivilMagicks.INSTANCE.LOGGER.debug(LogMarkers.LOADING, "Registered Manas for CivilMagicks in {}", clock.stop().toString)
  }

def RegisterEntities(event: RegistryEvent.Register[EntityType[_]]): Unit = {
    CivilMagicks.INSTANCE.LOGGER.debug(LogMarkers.LOADING, "Registering Entities for CivilMagicks...")
    val clock: Stopwatch = Stopwatch.createStarted()
    event.getRegistry.registerAll(

    )
    CivilMagicks.INSTANCE.LOGGER.debug(LogMarkers.LOADING, "Registered Entities for CivilMagicks in {}", clock.stop().toString)
}

  def RegisterTiles(event: RegistryEvent.Register[TileEntityType[_]]): Unit = {
      CivilMagicks.INSTANCE.LOGGER.debug(LogMarkers.LOADING, "Registering TileEntities for CivilMagicks...")
      val clock: Stopwatch = Stopwatch.createStarted()
      event.getRegistry.registerAll(
          TileEntityType.Builder.create(() => new TileFireBox).build(null).setRegistryName("civilmagicks", "firebox"),
          TileEntityType.Builder.create(() => new TileManaSpring).build(null).setRegistryName("civilmagicks", "manaspring")
      )
      CivilMagicks.INSTANCE.LOGGER.debug(LogMarkers.LOADING, "Registered TileEntities for CivilMagicks in {}", clock.stop().toString)
  }

}
