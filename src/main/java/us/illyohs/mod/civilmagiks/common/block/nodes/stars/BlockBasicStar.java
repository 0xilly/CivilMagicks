package us.illyohs.mod.civilmagiks.common.block.nodes.stars;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import us.illyohs.mod.civilmagiks.common.block.tile.star.TileBasicStar;
import us.illyohs.mod.civilmagiks.common.core.lib.LibStrings;

public class BlockBasicStar extends StarBlock {

    public BlockBasicStar() {
        setUnlocalizedName(LibStrings.STAR_BASIC);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileBasicStar();
    }
}
