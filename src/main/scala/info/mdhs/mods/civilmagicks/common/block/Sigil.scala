package info.mdhs.mods.civilmagicks.common.block

import net.minecraft.block.{Block, BlockRenderType, BlockState}
import net.minecraft.block.Block.Properties
import net.minecraft.nbt.CompoundNBT
import net.minecraft.tileentity.{ITickableTileEntity, TileEntity}
import net.minecraft.util.{ResourceLocation}
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.shapes.{ISelectionContext, VoxelShape}
import net.minecraft.world.IBlockReader

import info.mdhs.mods.civilmagicks.api.sigil.ISigil
import info.mdhs.mods.civilmagicks.common.CivilMagicks

class BlockSigil(properties: Properties) extends Block(properties) {

  override def getShape(state: BlockState, world: IBlockReader, pos: BlockPos, context: ISelectionContext): VoxelShape =
    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D)

  //NOTE ENTITYBLOCK_ANIMATED is TESR
  override def getRenderType(state: BlockState): BlockRenderType = BlockRenderType.ENTITYBLOCK_ANIMATED

  override def isNormalCube(state: BlockState, worldIn: IBlockReader, pos: BlockPos): Boolean = false

//  override def getRenderLayer: BlockRenderLayer = BlockRenderLayer.TRANSLUCENT

  override def createTileEntity(state: BlockState, world: IBlockReader): TileEntity = new TileSigil
}

class TileSigil extends TileEntity(ModTileTypes.SIGIL) with ITickableTileEntity {

  private val SIGIL_REGISTRY = CivilMagicks.INSTANCE.getAPI.getSigilRegistry
  private var sigil: ISigil  = _

  override def tick(): Unit = {
    sigil.onRandomTick(this.world, this.pos)
  }

  override def write(compound: CompoundNBT): CompoundNBT = {
    super.write(compound)
    this.sigil.serializeNBT()
  }

  override def read(nbt: CompoundNBT): Unit = {
    super.read(nbt)
    if (nbt.contains("sigil")) {
      sigil = SIGIL_REGISTRY.getSigilByKey(new ResourceLocation(nbt.getString("sigil"))).get
    } else {
      CivilMagicks.INSTANCE.LOGGER.info("Sigil tile created with no Sigil bound at ()", this.getPos.toString)
    }

    this.sigil.deserializeNBT(nbt)
  }
}
