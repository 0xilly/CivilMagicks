package us.illyohs.civilmagicks.common.block.crafting;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockParchmentEnchanter extends Block implements ITileEntityProvider{

     public BlockParchmentEnchanter() {
        super(Material.rock);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return null;
    }
}
