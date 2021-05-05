package io.ansan.mods.civilmagicks.common.block

import io.ansan.mods.civilmagicks.api.sigil.ISigil
import io.ansan.mods.civilmagicks.common.CivilMagicks
import net.minecraft.block.AbstractBlock.Properties
import net.minecraft.block.{Block, BlockState}
import net.minecraft.nbt.CompoundNBT
import net.minecraft.tileentity.{ITickableTileEntity, TileEntity}
import net.minecraft.util.ResourceLocation
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.shapes.{ISelectionContext, VoxelShape, VoxelShapes}
import net.minecraft.world.IBlockReader

class BlockSigil(properties: Properties) extends Block(properties) {

  override def getShape(state: BlockState, world: IBlockReader, pos: BlockPos, context: ISelectionContext): VoxelShape = {
    VoxelShapes.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D)
  }

  //NOTE ENTITYBLOCK_ANIMATED is TESR
//  override def getRenderType(state: BlockState): BlockRenderType = BlockRenderType.ENTITYBLOCK_ANIMATED
//
//  override def isNormalCube(state: BlockState, worldIn: IBlockReader, pos: BlockPos): Boolean = false

//  override def getRenderLayer: BlockRenderLayer = BlockRenderLayer.TRANSLUCENT

  override def createTileEntity(state: BlockState, world: IBlockReader): TileEntity = new TileSigil
}

class TileSigil extends TileEntity(ModTileTypes.SIGIL) with ITickableTileEntity {

  private val SIGIL_REGISTRY = CivilMagicks.INSTANCE.getAPI.getSigilRegistry
  private var sigil: ISigil  = _

  override def tick(): Unit = {
    sigil.onRandomTick(this.level, this.getBlockPos)
  }

  override def save(compound: CompoundNBT): CompoundNBT = {
    super.save(compound)
    this.sigil.serializeNBT()
  }

  override def load(state:BlockState, nbt: CompoundNBT): Unit = {
    super.load(state, nbt)
    if (nbt.contains("sigil")) {
      sigil = SIGIL_REGISTRY.getSigilByKey(new ResourceLocation(nbt.getString("sigil"))).get
    } else {
      CivilMagicks.INSTANCE.LOGGER.info("Sigil tile created with no Sigil bound at ()", this.getBlockPos.toString)
    }

    this.sigil.deserializeNBT(nbt)
  }
}
