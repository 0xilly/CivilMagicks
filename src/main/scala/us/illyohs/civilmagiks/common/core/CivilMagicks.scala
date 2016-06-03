package us.illyohs.civilmagiks.common.core

import net.minecraftforge.fml.common.Mod._
import net.minecraftforge.fml.common.SidedProxy
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import us.illyohs.civilmagiks.common.core.proxy.CommonProxy
import us.illyohs.civilmagiks.common.core.util.ModInfo


@Mod(
  modid = ModInfo.MOD_ID,
  name = ModInfo.MOD_NAME,
  version = ModInfo.MOD_VERSION,
  modLanguage = "scala"
)
object CivilMagicks {

  @Instance(ModInfo.MOD_NAME)
  var instance = this

  @SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.COMMON_PROXY)
  var proxy: CommonProxy = null

  @EventHandler
  def preInit(event: FMLPreInitializationEvent) {
    proxy.preInit(event)
  }

  @EventHandler
  def init(event: FMLInitializationEvent) {
    proxy.init(event)
  }

  @EventHandler
  def postInit(event: FMLPostInitializationEvent) {
    proxy.postInit(event)
  }
}
