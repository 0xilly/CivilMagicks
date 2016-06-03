package us.illyohs.civilmagiks.common.core.util

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.block.state.IBlockState
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.util.EnumBlockRenderType
import net.minecraft.util.math.{AxisAlignedBB, BlockPos}
import net.minecraft.world.{IBlockAccess, World}


class CivilBlock(material: Material, name: String, hardness:Float, resistance:Float,light:Float, tick:Boolean, tab: CreativeTabs)
  extends Block(material) {
  this.setRegistryName(name)
  this.setUnlocalizedName(ModInfo.MOD_ID + ":" + name)
  this.setLightLevel(light)
  this.setTickRandomly(tick)
  this.setHardness(hardness)
  this.setResistance(resistance)
  if(tab != null) {
    this.setCreativeTab(tab)
  }
}

class CivilBlockAir(material: Material, name: String, hardness:Float, resistance:Float,light:Float, tick:Boolean, tab: CreativeTabs)
  extends CivilBlock(material, name, hardness, resistance,light,tick,tab) {

  if(tab != null) {
    this.setCreativeTab(tab)
  }

  override def getCollisionBoundingBox(blockState: IBlockState, worldIn: World, pos: BlockPos): AxisAlignedBB = return null
  override def getRenderType(state: IBlockState): EnumBlockRenderType = EnumBlockRenderType.INVISIBLE
  override def isOpaqueCube(state: IBlockState): Boolean = false
  override def isReplaceable(worldIn: IBlockAccess, pos: BlockPos): Boolean = true

}
