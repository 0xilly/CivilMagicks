package us.illyohs.civilmagicks.common.item.writ;

import us.illyohs.civilmagicks.client.core.creativetab.CivilTab;
import us.illyohs.civilmagicks.common.core.lib.LibInfo;
import net.minecraft.item.Item;

public class ItemWrit extends Item {
    
	public ItemWrit() {
		setCreativeTab(CivilTab.BLOCKS);
		setUnlocalizedName(LibInfo.MOD_NAME + ":writ");
	}
	
	

}
