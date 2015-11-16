package us.illyohs.mod.civilmagiks.common.block.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import us.illyohs.libilly.block.BaseBlock;

public class BlockClearFarmland extends BaseBlock {

    public BlockClearFarmland(Material material, String name, float hardness, float resistance, float light, boolean tick, CreativeTabs tab) {
        super(material, name, hardness, resistance, light, tick, tab);
        
    }
     
    @Override
    public boolean isOpaqueCube() {
        return false;
    }

 
    @Override
    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.TRANSLUCENT;
    }
    
    @Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
        hasCrops(world, pos);
    }
    
    private boolean hasCrops(World world, BlockPos pos) {
        Block block = world.getBlockState(pos.up()).getBlock();
        return block instanceof IPlantable;
    }
    
    @Override
    public boolean canSustainPlant(IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable){
        return true;
    }
}
