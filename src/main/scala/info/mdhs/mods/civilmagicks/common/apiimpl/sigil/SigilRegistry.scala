package info.mdhs.mods.civilmagicks.common.apiimpl.sigil

import net.minecraft.util.ResourceLocation

import info.mdhs.mods.civilmagicks.api.sigil.{ISigil, ISigilRegistry}
import java.util
import java.util.Optional

class SigilRegistry extends ISigilRegistry {
  private val sigilRegistry: util.List[ISigil] = new util.ArrayList[ISigil]()

  override def getSigils: util.List[ISigil] = this.sigilRegistry

  override def getSigilByKey(key: ResourceLocation): Optional[ISigil] = {
    sigilRegistry.forEach(sigil => { if (sigil.getKey.equals(key)) return Optional.of(sigil) })
    Optional.empty()
  }
}
