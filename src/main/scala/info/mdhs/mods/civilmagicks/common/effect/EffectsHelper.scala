package info.mdhs.mods.civilmagicks.common.effect

import info.mdhs.mods.civilmagicks.api.effect.IEffect
import info.mdhs.mods.civilmagicks.common.apiimpl.API

class EffectsHelper {

  regEffect(new EffectLightning())
  regEffect(new SpeedEffect())

  private def regEffect(effect: IEffect) = API.INSTANCE.getEffectsRegistry.getEffects.add(effect)
}
