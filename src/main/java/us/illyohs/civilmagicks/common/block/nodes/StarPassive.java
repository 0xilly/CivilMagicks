package us.illyohs.civilmagicks.common.block.nodes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import us.illyohs.civilmagicks.api.block.BlockStar;
import us.illyohs.civilmagicks.common.block.tile.node.TileInteranalStar;
import us.illyohs.civilmagicks.common.core.lib.LibInfo;

public class StarPassive extends BlockStar {
    
    public StarPassive() {
        setUnlocalizedName(LibInfo.MOD_ID + ":starpassive");
        setCreativeTab(CreativeTabs.tabBrewing);
    }
    
    public void onBlockClicked(World world, BlockPos pos, EntityPlayer playerIn) {
    	
        TileInteranalStar tile = (TileInteranalStar) world.getTileEntity(pos);
        if(tile != null) {
            int mana = tile.mana;
            System.out.println(mana);
        }
    	
    }
    
    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileInteranalStar();
    }

}
