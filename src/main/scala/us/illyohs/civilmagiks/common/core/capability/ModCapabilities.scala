package us.illyohs.civilmagiks.common.core.capability

import net.minecraftforge.common.capabilities.CapabilityManager
import us.illyohs.civilmagiks.common.core.capability.ManaStorage.ManaCallable
import us.illyohs.civilmagiks.api.capability.IManaHandler

object ModCapabilities {
  def init = {
    CapabilityManager.INSTANCE.register(classOf[IManaHandler], new ManaStorage, new ManaCallable)
  }
}