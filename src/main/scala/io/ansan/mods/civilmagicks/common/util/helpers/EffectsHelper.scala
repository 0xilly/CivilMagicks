package io.ansan.mods.civilmagicks.common.util.helpers

import io.ansan.mods.civilmagicks.api.effect.IEffect
import io.ansan.mods.civilmagicks.common.CivilMagicks

object EffectsHelper {

  def init: Unit = {
//    regEffect(new EffectLightning)
//    regEffect(new SpeedEffect)
  }

  private def regEffect(effect: IEffect) = CivilMagicks.INSTANCE.getAPI.getEffectsRegistry.getEffects.add(effect)
}
