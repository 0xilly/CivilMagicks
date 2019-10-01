package info.mdhs.mods.civilmagicks.common.network

import net.minecraftforge.fml.network.NetworkRegistry
import net.minecraftforge.fml.network.simple.SimpleChannel

import net.minecraft.util.ResourceLocation

class PacketHandler {
  private val VERSION: String = 1.toString
  private val HANDLER: SimpleChannel = NetworkRegistry.ChannelBuilder
    .named(new ResourceLocation("civilmagicks", "networkchannel"))
    .clientAcceptedVersions(VERSION.equals)
    .serverAcceptedVersions(VERSION.equals)
    .networkProtocolVersion(() => VERSION)
    .simpleChannel

}
