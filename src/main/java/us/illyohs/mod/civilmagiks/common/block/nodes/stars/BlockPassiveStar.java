package us.illyohs.mod.civilmagiks.common.block.nodes.stars;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import us.illyohs.mod.civilmagiks.common.block.tile.star.TilePassiveStar;
import us.illyohs.mod.civilmagiks.common.core.lib.LibStrings;

public class BlockPassiveStar extends BlockStar {

    public BlockPassiveStar(){
        setUnlocalizedName(LibStrings.STAR_PASSIVE);
        setTickRandomly(true);
    }


    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TilePassiveStar();
    }
}
