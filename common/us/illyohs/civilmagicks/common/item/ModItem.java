/**
 * This class was created by Anthony Anderson(Lord Illyohs)
 * It is distributed as part of CivilMagicks
 * Source Code: https://github.com/LordIllyohs/CivilMagicks
 *
 * CivilMagicks is Open Source and distributed under a
 * Attribution-NonCommercial-ShareAlike 3.0 Unported license.
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/)
 *
 * 
 * Class created on Jul 8, 2014 at 2:47:40 AM
 * 
 */
package us.illyohs.civilmagicks.common.item;

import us.illyohs.civilmagicks.common.lib.LibInfo;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItem {
	
	public static Item manaKeep;
	
	public static Item wand;
	
	public static Item callingWhistle;
	
	public static Item temp;
	
	public static void init() {
	    
//	    wand = Iteme
	    
	    callingWhistle = new ItemCallingWhistle();
	    
	    temp = new TempItem();
	    
	    
	    gameReg();
		
	}

    private static void gameReg() {
        GameRegistry.registerItem(callingWhistle, LibInfo.MOD_ID + "callingwhsitle");
        GameRegistry.registerItem(temp, LibInfo.MOD_ID + "temps");
        
    }

}
