/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.common.block

import net.minecraft.block.Block.Properties
import net.minecraft.block.material.Material
import net.minecraft.tileentity.{ITickableTileEntity, TileEntity}

import info.mdhs.mods.civilmagicks.common.util.ModTileTypes

class FireBox extends BaseBlock("firebox", Properties.create(Material.ROCK).harvestLevel(3).noDrops()) {}

class TileFireBox extends TileEntity(ModTileTypes.FIRE_BOX) with ITickableTileEntity {
  override def tick(): Unit = {}
}
