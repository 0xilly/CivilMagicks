package us.illyohs.civilmagiks.common.block

import net.minecraft.block.ITileEntityProvider
import net.minecraft.block.material.Material._
import net.minecraft.block.state.IBlockState
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.tileentity.TileEntity
import net.minecraft.util.math.{AxisAlignedBB, BlockPos}
import net.minecraft.world.{IBlockAccess, World}

import us.illyohs.civilmagiks.common.core.util.{BlockBase, BlockBaseAir}
import us.illyohs.civilmagiks.common.tile.TileManaSpring


object ManaSpring
  extends BlockBaseAir(AIR, "manaspring", 50, 2000, 15, true, null)
    with ITileEntityProvider {

  override def getBoundingBox(state: IBlockState, source: IBlockAccess, pos: BlockPos): AxisAlignedBB = new AxisAlignedBB(0, 0, 0, 1, 0.1, 1)

  override def createNewTileEntity(worldIn: World, meta: Int): TileEntity = new TileManaSpring
}

object ManaObelisk
  extends BlockBase(ROCK, "manaobelisk", 50, 2000, 15, true, CreativeTabs.BREWING)
    with ITileEntityProvider {
  override def createNewTileEntity(worldIn: World, meta: Int): TileEntity = ???
}