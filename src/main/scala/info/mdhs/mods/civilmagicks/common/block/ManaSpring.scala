/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.common.block

import net.minecraft.block.Block.Properties
import net.minecraft.block.{Block, BlockRenderType, BlockState}
import net.minecraft.block.material.Material
import net.minecraft.tileentity.{ITickableTileEntity, TileEntity}
import net.minecraft.util.BlockRenderLayer
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.shapes.{ISelectionContext, VoxelShape}
import net.minecraft.world.IBlockReader

import info.mdhs.mods.civilmagicks.api.mana.ManaType
import info.mdhs.mods.civilmagicks.common.util.{BiomeManaLocator, ModTileTypes}

class BlockManaSpring()
    extends BaseBlock("manaspring", Properties.create(Material.ROCK).tickRandomly.hardnessAndResistance(1)) {

  override def getShape(state: BlockState, world: IBlockReader, pos: BlockPos, context: ISelectionContext): VoxelShape =
    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D)

  //NOTE ENTITYBLOCK_ANIMATED is TESR
  override def getRenderType(state: BlockState): BlockRenderType = BlockRenderType.ENTITYBLOCK_ANIMATED

  override def isNormalCube(state: BlockState, worldIn: IBlockReader, pos: BlockPos): Boolean = false

  override def getRenderLayer: BlockRenderLayer = BlockRenderLayer.TRANSLUCENT

  override def createTileEntity(state: BlockState, world: IBlockReader): TileEntity = new TileManaSpring
}

class TileManaSpring extends TileEntity(ModTileTypes.MANA_SPRING) with ITickableTileEntity {

  override def tick(): Unit = {}

  /**
    * Gets a random ManaType for the current biome
    * @return ManaType
    */
  def getMana: ManaType = BiomeManaLocator.getRandomManaType(this.world.getBiome(this.pos))
}
