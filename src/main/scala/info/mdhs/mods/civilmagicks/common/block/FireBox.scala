/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.common.block

import info.mdhs.mods.civilmagicks.common.tileentity.ModTileTypes
import net.minecraft.block.Block
import net.minecraft.block.Block.Properties
import net.minecraft.tileentity.{ITickableTileEntity, TileEntity}

class FireBox(properties: Properties) extends Block(properties) {}

class TileFireBox extends TileEntity(ModTileTypes.FIRE_BOX) with ITickableTileEntity {
  override def tick(): Unit = {}
}
