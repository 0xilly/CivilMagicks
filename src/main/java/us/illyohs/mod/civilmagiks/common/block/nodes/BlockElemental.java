package us.illyohs.mod.civilmagiks.common.block.nodes;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import us.illyohs.mod.civilmagiks.api.block.BlockAiry;
import us.illyohs.mod.civilmagiks.common.core.lib.LibStrings;

public class BlockElemental extends BlockAiry implements ITileEntityProvider {

    public BlockElemental(Material material) {
        super(material);
        setUnlocalizedName(LibStrings.BLOCK_ELEMENTAL);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return null;
    }
}
