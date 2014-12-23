package us.illyohs.civilmagicks.magicks.blocks.node;

import us.illyohs.civilmagicks.api.block.BlockStar;
import us.illyohs.civilmagicks.core.lib.LibInfo;
import us.illyohs.civilmagicks.magicks.tile.nodes.TileStarPassive;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class StarPassive extends BlockStar {
    
    public StarPassive() {
        setBlockName(LibInfo.MOD_ID + ":passivestar");
    }
    
    

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileStarPassive();
    }

}
