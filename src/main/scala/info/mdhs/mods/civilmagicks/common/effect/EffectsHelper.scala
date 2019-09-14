package info.mdhs.mods.civilmagicks.common.effect

import info.mdhs.mods.civilmagicks.api.effect.IEffect
import info.mdhs.mods.civilmagicks.common.CivilMagicks

object EffectsHelper {

  def init: Unit = {
    regEffect(new EffectLightning)
    regEffect(new SpeedEffect)
  }

  private def regEffect(effect: IEffect) = CivilMagicks.INSTANCE.getAPI.getEffectsRegistry.registerEffect(effect)
}
