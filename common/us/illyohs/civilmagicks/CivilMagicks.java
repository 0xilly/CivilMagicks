package us.illyohs.civilmagicks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import us.illyohs.civilmagicks.common.block.ModBlock;
import us.illyohs.civilmagicks.common.civil.CivilRegistry;
import us.illyohs.civilmagicks.common.civil.CivilStatus;
import us.illyohs.civilmagicks.common.civil.RegCivilObjects;
import us.illyohs.civilmagicks.common.lib.IProxy;
import us.illyohs.civilmagicks.common.lib.LibInfo;
import us.illyohs.civilmagicks.common.tile.TileHomeCore;
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
    	ModBlock.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.registerTileEntitys();
//    	DimensionManager.registerProviderType(demID, CivilWorldProvider.class, false);
//    	DimensionManager.registerDimension(demID, demID);
    	
    	
    	
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {
    	RegCivilObjects.blocks();
    	
    }
}
