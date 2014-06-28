package us.illyohs.civilmagicks.common.core;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import us.illyohs.civilmagicks.api.CivilStatus;
import us.illyohs.civilmagicks.common.helper.LogHelper;

public class CivilRegistry {
	
	private static HashMap<Object, CivilStatus> civilRegistry = new HashMap<Object, CivilStatus>();

	
	private  CivilRegistry() {
		
	}
	
	/**
	 * This registers the status of a blocks/item in the civil registry
	 * @param object Blocks/Items
	 * @param CivilStatus @see CivilStatus
	 */
	public static void registerStatus(Object object, CivilStatus civilstatus) {
		if (object instanceof Block || object instanceof Item) {
			civilRegistry.put(object, civilstatus);
		} else {
			LogHelper.fatal("YOU CAN ONLY REGISTER BLOCKS AND ITEMS INTO THE CIVILREGISTRY FIX THIS MEOW!!!!");
		}

	}
	
}
