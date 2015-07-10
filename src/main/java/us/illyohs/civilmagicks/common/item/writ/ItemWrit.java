package us.illyohs.civilmagicks.common.item.writ;

import us.illyohs.civilmagicks.api.CivilMagicksAPI;
import us.illyohs.civilmagicks.api.writ.WritBase;
import us.illyohs.civilmagicks.client.core.creativetab.CivilTab;
import us.illyohs.civilmagicks.common.writ.TestWrit;
import net.minecraft.item.Item;

public class ItemWrit extends Item {
    
    public static WritBase testWrit;
    
    public ItemWrit() {
        testWrit = new TestWrit();;
        
        regWrit();
    }

    /**
     * 
     */
    private void regWrit() {
        CivilMagicksAPI.registerWrit(testWrit);
        
    }

}
