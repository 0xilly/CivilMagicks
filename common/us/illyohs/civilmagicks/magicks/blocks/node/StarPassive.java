package us.illyohs.civilmagicks.magicks.blocks.node;

import us.illyohs.civilmagicks.api.block.BlockStar;
import us.illyohs.civilmagicks.core.lib.LibInfo;
import us.illyohs.civilmagicks.magicks.tile.nodes.TileStarPassive;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class StarPassive extends BlockStar {
    
    public StarPassive() {
        setBlockName(LibInfo.MOD_ID + ":starpassive");
        setCreativeTab(CreativeTabs.tabBrewing);
    }
    
    public void onBlockClicked(World w, int x, int y, int z, EntityPlayer player) {
        TileStarPassive tile = (TileStarPassive) w.getTileEntity(x, y, z);
        if(tile != null) {
            int mana = tile.mana;
            System.out.println(mana);
        }
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileStarPassive();
    }

}
