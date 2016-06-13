package us.illyohs.civilmagiks.common.core

import net.minecraftforge.fml.client.registry.ClientRegistry
import net.minecraftforge.fml.common.Mod._
import net.minecraftforge.fml.common.SidedProxy
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import us.illyohs.civilmagiks.client.render.tile.RenderManaSpring
import us.illyohs.civilmagiks.common.block.ModBlocks
import us.illyohs.civilmagiks.common.core.capability.ModCapabilities
import us.illyohs.civilmagiks.common.core.proxy.CommonProxy
import us.illyohs.civilmagiks.common.core.util.{ManaUtils, ModInfo}
import us.illyohs.civilmagiks.common.item.ModItems
import us.illyohs.civilmagiks.common.tile.TileManaSpring


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
  def preInit(event: FMLPreInitializationEvent): Unit = {
    ModBlocks.init
    ModItems.init
    ManaUtils.manaRegInit
    ModCapabilities.init
  }

  @EventHandler
  def init(event: FMLInitializationEvent) {


    ClientRegistry.bindTileEntitySpecialRenderer(classOf[TileManaSpring], RenderManaSpring)
  }

  @EventHandler
  def postInit(event: FMLPostInitializationEvent) {
  }
}
