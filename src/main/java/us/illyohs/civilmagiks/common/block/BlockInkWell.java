package us.illyohs.civilmagiks.common.block;

import us.illyohs.libilly.block.BlockBase;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockInkWell extends BlockBase implements ITileEntityProvider{

    public BlockInkWell(Material material, String name, float hardness, float resistance, float light, boolean tick,
            CreativeTabs tab) {
        super(material, name, hardness, resistance, light, tick, tab);
        // TODO Auto-generated constructor stub
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        // TODO Auto-generated method stub
        return null;
    }

}
