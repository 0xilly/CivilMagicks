/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.common

import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.fml.DistExecutor
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import net.minecraftforge.scorge.lang.ScorgeModLoadingContext

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.tileentity.TileEntityType

import info.mdhs.mods.civilmagicks.api.ICivilMagicksAPI
import info.mdhs.mods.civilmagicks.api.mana.ManaType
import info.mdhs.mods.civilmagicks.client.ClientProxy
import info.mdhs.mods.civilmagicks.common.apiimpl.API
import info.mdhs.mods.civilmagicks.common.util.CProxy
import info.mdhs.mods.civilmagicks.server.ServerProxy

object CivilMagicks {
  private val instance = new CivilMagicks

  def INSTANCE: CivilMagicks = this.instance
}

class CivilMagicks {

  private val modBus: IEventBus     = ScorgeModLoadingContext.get.getModEventBus
  val forgeBus: IEventBus           = MinecraftForge.EVENT_BUS
  private val api: ICivilMagicksAPI = new API

  private val proxy: CProxy =
    DistExecutor.runForDist(() => () => (new ClientProxy: CProxy), () => () => (new ServerProxy: CProxy))

  modBus.addGenericListener(classOf[Block], this.registerBlocks)
  modBus.addGenericListener(classOf[Item], this.registerItem)
  modBus.addGenericListener(classOf[TileEntityType[_]], this.registerTileType)
  modBus.addGenericListener(classOf[ManaType], this.registerManaType)
  modBus.addListener(clientSetup)

  private def registerBlocks(event: RegistryEvent.Register[Block]): Unit               = proxy.registerBlocks(event)
  private def registerTileType(event: RegistryEvent.Register[TileEntityType[_]]): Unit = proxy.registerTileType(event)
  private def registerItem(event: RegistryEvent.Register[Item]): Unit                  = proxy.registerItem(event)
  private def registerManaType(event: RegistryEvent.Register[ManaType]): Unit          = proxy.registerManaType(event)
  private def clientSetup(event: FMLClientSetupEvent): Unit                            = proxy.clientSetup(event)

  def getAPI: ICivilMagicksAPI = this.api
}
