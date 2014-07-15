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
import net.minecraftforge.fluids.Fluid;
import us.illyohs.civilmagicks.common.core.helper.LogHelper;

public class CivilRegistry {
	
	private static HashMap<Object, CivilStatus> civilRegistry = new HashMap<Object, CivilStatus>();
	
	/**
	 * This registers the status of a blocks/item in the civilRegistry
	 * Only BLOCkS, ITEMS, and FLUIDS my be registered in the civilRegistry the game will crash if you don't register things correctly
	 * @param object Blocks/Items/Fluid
	 * @param CivilStatus @see CivilStatus
	 */
	public static void registerStatus(Object object, CivilStatus civilstatus) { //FIXME: Add a option meta value or just wait for blocks states in 1.8?
		if (object instanceof Block || object instanceof Item || object instanceof Fluid) {
			civilRegistry.put(object, civilstatus);
			System.out.println(object.toString() + " has been registered in the civil registery as " + civilstatus.toString());
		} else {
			System.err.println("YOU CAN ONLY REGISTER BLOCKS, ITEMS, and FLUIDS INTO THE CIVILREGISTRY FIX THIS! \n");
			throw new IllegalArgumentException();
		}

	}
	
	
}