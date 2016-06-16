package us.illyohs.civilmagiks.common.core

import net.minecraftforge.fml.common.Mod.{EventHandler, Instance}
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import net.minecraftforge.fml.common.{Mod, SidedProxy}

import us.illyohs.civilmagiks.common.core.util.ModInfo
import us.illyohs.civilmagiks.common.core.proxy.CommonProxy



@Mod(
  modid = ModInfo.MOD_ID,
  name = ModInfo.MOD_NAME,
  version = ModInfo.MOD_VERSION,
  modLanguage = "scala"
)
object CivilMagicks {

  @Instance(ModInfo.MOD_NAME)
  var instance = this

  @SidedProxy(modId = ModInfo.MOD_ID, clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.COMMON_PROXY)
  var proxy: CommonProxy = null

  @EventHandler
  def preInit(event: FMLPreInitializationEvent): Unit = {

    proxy.preInit(event)
  }

  @EventHandler
  def init(event: FMLInitializationEvent) {
    this.proxy.init(event)
  }

  @EventHandler
  def postInit(event: FMLPostInitializationEvent): Unit = {
    this.proxy.postInit(event)
  }
}
