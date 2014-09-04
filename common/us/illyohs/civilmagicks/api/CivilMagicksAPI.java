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
 * Class created on Sep 3, 2014 at 2:09:47 PM
 * 
 */
package us.illyohs.civilmagicks.api;

import java.lang.reflect.Method;

import cpw.mods.fml.common.FMLLog;
import net.minecraft.block.Block;
import us.illyohs.civilmagicks.api.civilregistry.CivilStatus;

public class CivilMagicksAPI {
    
    static Method registerBlock;
    static Method registerItem;
    
    public static void registerBlock(Block block, int meta, CivilStatus civilstatus) {
        try {
            if(registerBlock == null) {
                Class clazz = Class.forName("us.illyohs.civilmagicks.common.core.CivilRegistry");
                registerBlock = clazz.getMethod("registerBlock", Object.class, int.class, int.class);
            }
            
        } catch(Exception e) {
            FMLLog.warning("[CivilMagicks API] unable to invoke us.illyohs.civilmagicks.common.core.CivilRegistry method registerBlock");
        }
    }
}
