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
package us.illyohs.civilmagicks;

import us.illyohs.civilmagicks.common.block.ModBlock;
import us.illyohs.civilmagicks.common.core.RegCivilObjects;
import us.illyohs.civilmagicks.common.item.ModItem;
import us.illyohs.civilmagicks.common.lib.IProxy;
import us.illyohs.civilmagicks.common.lib.LibInfo;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=LibInfo.MOD_ID, name=LibInfo.MOD_NAME, version=LibInfo.VERSION)
public class CivilMagicks {

	@Instance
    public static CivilMagicks instance;
	
	public static final int demID = 5; //TODO: MAke a config option

    @SidedProxy(clientSide = LibInfo.CLIENT_PROXY, serverSide = LibInfo.COMMON_PROXY)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	   	
    	ModBlock.initCivil();;
    	
    	ModItem.init();
    	
    	proxy.registerTileEntitys();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.ModelsRenederers();
    	RegCivilObjects.nonModblocks();
//    	RegCivilObjects.nonModItems();
    	
    	
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {
    	
    	
    }
}
