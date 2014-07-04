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
package us.illyohs.civilmagicks.api;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import us.illyohs.civilmagicks.common.core.helper.LogHelper;

public class CivilRegistry {
	
	public static HashMap<Object, CivilStatus> civilRegistry = new HashMap<Object, CivilStatus>();
	
	/**
	 * This registers the status of a blocks/item in the civilRegistry
	 * @param object Blocks/Items
	 * @param CivilStatus @see CivilStatus
	 */
	public static void registerStatus(Object object, CivilStatus civilstatus) {
		if (object instanceof Block || object instanceof Item) {
			civilRegistry.put(object, civilstatus);
			System.out.println(object.toString() + " has been registerd in the civil registery as " + civilstatus.toString());
		} else {
			LogHelper.fatal("YOU CAN ONLY REGISTER BLOCKS AND ITEMS INTO THE CIVILREGISTRY FIX THIS MEOW!!!!");
		}

	}
	
	
}