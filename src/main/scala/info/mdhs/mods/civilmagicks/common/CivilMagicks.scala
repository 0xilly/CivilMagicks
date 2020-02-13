/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.common

import net.minecraftforge.client.event.ColorHandlerEvent
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.fml.event.lifecycle.{FMLClientSetupEvent, FMLLoadCompleteEvent}
import net.minecraftforge.fml.loading.LogMarkers
import net.minecraftforge.scorge.lang.ScorgeModLoadingContext

import net.minecraft.block.Block
import net.minecraft.item.{Item, ItemGroup, ItemStack}
import net.minecraft.tileentity.TileEntityType

import info.mdhs.mods.civilmagicks.api.ICivilMagicksAPI
import info.mdhs.mods.civilmagicks.api.mana.ManaType
import info.mdhs.mods.civilmagicks.client.ClientRegistryListener
import info.mdhs.mods.civilmagicks.common.apiimpl.API
import info.mdhs.mods.civilmagicks.common.eventhandler.RegistryHandler
import info.mdhs.mods.civilmagicks.common.item.ModItems
import info.mdhs.mods.civilmagicks.common.util.helpers.{BrewHelper, EffectsHelper}
import org.apache.logging.log4j.{LogManager, Logger}

object CivilMagicks {
  private var instance: CivilMagicks = _

  def INSTANCE: CivilMagicks = instance
  final val ITEM_GROUP: ItemGroup = new ItemGroup("civilmagicks") {
    override def createIcon(): ItemStack = new ItemStack(ModItems.MANA_SPRING)
  }
  final val BREW_GROUP: ItemGroup = new ItemGroup("Brews") {
    override def createIcon(): ItemStack = new ItemStack(ModItems.BREW)
  }
}

class CivilMagicks {
  CivilMagicks.instance = this
  private val api: API     = new API
  final val LOGGER: Logger = LogManager.getLogger("CivilMagicks")
  LOGGER.debug(LogMarkers.LOADING, "Constructing CivilMagicks...")

  val forgeBus: IEventBus       = MinecraftForge.EVENT_BUS
  private val modBus: IEventBus = ScorgeModLoadingContext.get.getModEventBus

  // format: off
  modBus.addListener(RegistryHandler.CreateRegistries(_: RegistryEvent.NewRegistry))
  modBus.addGenericListener(classOf[Block], RegistryHandler.RegisterBlocks(_: RegistryEvent.Register[Block]))
  modBus.addGenericListener(classOf[Item], RegistryHandler.RegisterItems(_: RegistryEvent.Register[Item]))
  modBus.addGenericListener(classOf[TileEntityType[_]], RegistryHandler.RegisterTiles(_: RegistryEvent.Register[TileEntityType[_]]))
  modBus.addGenericListener(classOf[ManaType], RegistryHandler.RegisterManas(_: RegistryEvent.Register[ManaType]))
  
  //Client stuff
  modBus.addListener(ClientRegistryListener.RegisterItemColorHandler(_:ColorHandlerEvent.Item))
  modBus.addListener(ClientRegistryListener.RegisterRenders(_: FMLClientSetupEvent))
  modBus.addListener(this.fmlLoadCompleted)
  // format: on

  private def fmlLoadCompleted(event: FMLLoadCompleteEvent): Unit = {
    EffectsHelper.init
    BrewHelper.init
    api.getEffectsRegistry.getEffects.forEach(ef => LOGGER.info("Registered effect {}" + ef.getKey))
  }

  def getAPI: ICivilMagicksAPI = this.api
}
