package us.illyohs.mod.civilmagiks.common.block.nodes;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import us.illyohs.mod.civilmagiks.common.block.BaseBlock;
import us.illyohs.mod.civilmagiks.common.block.tile.TileElementalBasin;

public class BlockElementalBasin extends BaseBlock implements ITileEntityProvider {

//    public BlockElementalBasin() {
//        super(Material.rock);
//        setCreativeTab(CivilTab.BLOCKS);
//        setUnlocalizedName(LibStrings.BLOCK_ELEMENTAL_BASIN);
//    }

    public BlockElementalBasin(Material material, String name, float hardness, float resistance, float light,
            boolean tick, CreativeTabs tab) {
        super(material, name, hardness, resistance, light, tick, tab);
        // TODO Auto-generated constructor stub
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
