package us.illyohs.civilmagiks.common.block.nodes;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import us.illyohs.civilmagiks.common.tile.TileSigil;
import us.illyohs.libilly.block.BlockBase;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSigil extends BlockBase implements ITileEntityProvider{

    public BlockSigil(Material material, String name, float hardness, float resistance, float light, boolean tick,
            CreativeTabs tab) {
        super(material, name, hardness, resistance, light, tick, tab);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
    }

    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT_MIPPED;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean isFullCube() {
        return false;
    }

    @Override
    public int getRenderType() {
        return 3;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileSigil();
    }
}
