package us.illyohs.civilmagicks.magicks.blocks.node;

import us.illyohs.civilmagicks.api.block.BlockStar;
import us.illyohs.civilmagicks.core.lib.LibInfo;
import us.illyohs.civilmagicks.magicks.tile.nodes.TileStarPassive;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class StarPassive extends BlockStar {
    
    public StarPassive() {
        setUnlocalizedName(LibInfo.MOD_ID + ":starpassive");
        setCreativeTab(CreativeTabs.tabBrewing);
    }
    
    public void onBlockClicked(World world, BlockPos pos, EntityPlayer playerIn) {
    	
        TileStarPassive tile = (TileStarPassive) world.getTileEntity(pos);
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
