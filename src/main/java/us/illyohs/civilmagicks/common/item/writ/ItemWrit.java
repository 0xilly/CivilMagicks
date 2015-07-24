package us.illyohs.civilmagicks.common.item.writ;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import us.illyohs.civilmagicks.client.core.creativetab.CivilTab;
import us.illyohs.civilmagicks.common.core.handler.WritHandler;
import us.illyohs.civilmagicks.common.core.lib.LibInfo;

public class ItemWrit extends Item {
    
	public ItemWrit() {
		setCreativeTab(CivilTab.BLOCKS);
		setUnlocalizedName(LibInfo.MOD_NAME + "writ");
        setMaxStackSize(1);
	}
	
    public String getWritName(ItemStack is) {
        return is.getTagCompound().getString("WritName");
    }
    
    public void onCreated(ItemStack is, World world, EntityPlayer player) {
        is.stackTagCompound = new NBTTagCompound();
        is.stackTagCompound.setString("spellname", "nillspell");
    }
    
    public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player) {
        WritHandler.castSpell(is, player, "testwrit");
        return is;
    }

    

}
