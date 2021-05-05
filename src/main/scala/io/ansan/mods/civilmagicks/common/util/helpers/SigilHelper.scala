package io.ansan.mods.civilmagicks.common.util.helpers

import io.ansan.mods.civilmagicks.api.sigil.ISigil
import io.ansan.mods.civilmagicks.common.CivilMagicks
import io.ansan.mods.civilmagicks.common.sigil.ManaWellSigil

object SigilHelper {

  def init: Unit = {
    register(new ManaWellSigil)
  }

  private def register(sigil: ISigil): Unit = CivilMagicks.INSTANCE.getAPI.getSigilRegistry.getSigils.add(sigil)

}
