package info.mdhs.mods.civilmagicks.common.util.helpers

import info.mdhs.mods.civilmagicks.api.effect.IEffect
import info.mdhs.mods.civilmagicks.common.CivilMagicks
import info.mdhs.mods.civilmagicks.common.effect.{EffectLightning, SpeedEffect}

object EffectsHelper {

  def init: Unit = {
    regEffect(new EffectLightning)
    regEffect(new SpeedEffect)
  }

  private def regEffect(effect: IEffect) = CivilMagicks.INSTANCE.getAPI.getEffectsRegistry.getEffects.add(effect)
}
