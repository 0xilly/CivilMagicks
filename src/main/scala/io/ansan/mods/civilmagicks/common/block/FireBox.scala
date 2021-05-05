/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package io.ansan.mods.civilmagicks.common.block

import net.minecraft.block.AbstractBlock.Properties
import net.minecraft.block.Block
import net.minecraft.tileentity.{ITickableTileEntity, TileEntity}

class FireBox(properties: Properties) extends Block(properties) {}

class TileFireBox extends TileEntity(ModTileTypes.FIRE_BOX) with ITickableTileEntity {
  override def tick(): Unit = {}
}
