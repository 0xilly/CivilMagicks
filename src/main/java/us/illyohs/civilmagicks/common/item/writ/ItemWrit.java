package us.illyohs.civilmagicks.common.item.writ;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import us.illyohs.civilmagicks.client.core.creativetab.CivilTab;
import us.illyohs.civilmagicks.common.core.lib.LibInfo;

public class ItemWrit extends Item {
    
	public ItemWrit() {
		setCreativeTab(CivilTab.BLOCKS);
		setUnlocalizedName(LibInfo.MOD_NAME + getWritName());
	}
	
    public String getWritName() {
        ItemStack is = null;
        return is.getTagCompound().getString("WritName");
    }
    
    public void onCreated(ItemStack is, World world, EntityPlayer player) {
//        is.setTagCompound(new NBTTagCompound().setString("spellname", ""));
    }
    
    public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player) {
        return is;
    }

    

}
