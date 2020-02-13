package info.mdhs.mods.civilmagicks.common.util.helpers

import info.mdhs.mods.civilmagicks.api.sigil.ISigil
import info.mdhs.mods.civilmagicks.common.CivilMagicks
import info.mdhs.mods.civilmagicks.common.sigil.ManaWellSigil

object SigilHelper {

  def init: Unit = {
    register(new ManaWellSigil)
  }

  private def register(sigil: ISigil): Unit = CivilMagicks.INSTANCE.getAPI.getSigilRegistry.getSigils.add(sigil)

}
