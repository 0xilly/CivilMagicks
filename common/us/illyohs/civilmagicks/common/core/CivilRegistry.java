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
 * Class created on ?
 * 
 */
package us.illyohs.civilmagicks.common.core;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import us.illyohs.civilmagicks.api.civilregistry.CivilStatus;
import us.illyohs.civilmagicks.common.core.helper.LogHelper;

public class CivilRegistry {
	
	public static HashMap<Object, CivilInfo> civilRegistry = new HashMap<Object, CivilInfo>();
	
	/**
	 * This registers the status of a blocks/item in the civilRegistry
	 * Only BLOCkS, ITEMS, and FLUIDS my be registered in the civilRegistry the game will crash if you don't register things correctly
	 * @param object Blocks/Items/Fluid
	 * @param meta meta value of a block/item
	 * @param CivilStatus @see CivilStatus
	 */
	
	private static void registerStatus(Object object, int meta, CivilStatus civilstatus) {
		if (object instanceof Block || object instanceof Item || object instanceof Fluid) {
			civilRegistry.put(civilstatus, new CivilInfo(object, meta));
			LogHelper.info(object.toString()+":"+ meta + " has been register in the civil registry as " + civilstatus.toString());
		} else {
			LogHelper.fatal("YOU CAN ONLY REGISTER BLOCKS, ITEMS, and FLUIDS INTO THE CIVILREGISTRY FIX THIS NOW!");
			throw new IllegalArgumentException();
		}
		
	}
	
	public static void registerBlock(Block block, int meta, CivilStatus civilstatus) {
	    registerStatus(block, meta, civilstatus);
	}
	
	public static void registerItem(Item item, int meta, CivilStatus civilstatus) {
	    registerStatus(item, meta, civilstatus);
	}

}