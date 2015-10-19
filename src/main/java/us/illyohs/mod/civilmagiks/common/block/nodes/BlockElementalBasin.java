package us.illyohs.mod.civilmagiks.common.block.nodes;

import us.illyohs.mod.civilmagiks.client.core.creativetab.CivilTab;
import us.illyohs.mod.civilmagiks.common.block.tile.TileElementalBasin;
import us.illyohs.mod.civilmagiks.common.core.lib.LibStrings;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockElementalBasin extends Block implements ITileEntityProvider {

    public BlockElementalBasin() {
        super(Material.rock);
        setCreativeTab(CivilTab.BLOCKS);
        setUnlocalizedName(LibStrings.BLOCK_ELEMENTAL_BASIN);
    }

    @Override
    public boolean isOpaqueCube() { return false; }

    @Override
    public boolean isFullCube() { return false; }

    @Override
    public boolean isVisuallyOpaque() { return false; }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileElementalBasin();
    }
}
