/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.server

import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.tileentity.TileEntityType

import info.mdhs.mods.civilmagicks.api.mana.ManaType
import info.mdhs.mods.civilmagicks.common.util.CProxy

class ServerProxy extends CProxy {

  override def registerBlocks(event: RegistryEvent.Register[Block]): Unit = super.registerBlocks(event)

  override def registerItem(event: RegistryEvent.Register[Item]): Unit = super.registerItem(event)

  override def registerManaType(event: RegistryEvent.Register[ManaType]): Unit = super.registerManaType(event)

  override def registerTileType(event: RegistryEvent.Register[TileEntityType[_]]): Unit = super.registerTileType(event)

  override def clientSetup(event: FMLClientSetupEvent): Unit = { /* NO-OP*/ }
}
