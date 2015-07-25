package us.illyohs.civilmagicks.common.item.writ;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import us.illyohs.civilmagicks.client.core.creativetab.CivilTab;
import us.illyohs.civilmagicks.common.core.handler.WritHandler;
import us.illyohs.civilmagicks.common.core.lib.LibInfo;
//import us.illyohs.civilmagicks.common.writ.TestWrit;

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
//        is.stackTagCompound.setString("spellname", "nillspell");
        is.stackTagCompound.setString("spellname", "testwrit");
    }

//    private TestWrit testWrit = new TestWrit();

    public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player) {
        if (is != null) {
            WritHandler.instance().initSpell(is, player, is.getTagCompound().getString("spellname"));
        } else {
            System.out.println("Really your stupid illy you suck and should stop");
        }
//        testWrit.spell(player);
        return is;
    }


}
