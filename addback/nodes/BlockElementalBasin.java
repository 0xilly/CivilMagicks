package us.illyohs.civilmagiks.common.block.nodes;

import us.illyohs.civilmagiks.common.tile.TileElementalBasin;
import us.illyohs.libilly.block.BlockBase;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockElementalBasin extends BlockBase implements ITileEntityProvider {

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
