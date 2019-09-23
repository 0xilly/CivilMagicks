/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.common.apiimpl.effect

import com.google.common.collect.ImmutableList
import info.mdhs.mods.civilmagicks.api.effect.{IEffect, IEffectRegistry}
import java.util
import java.util.Optional
import net.minecraft.util.ResourceLocation

class EffectRegistry extends IEffectRegistry {

  private val effectRegistry: util.List[IEffect] = new util.ArrayList[IEffect]()

  // format: off
  override def getEffects: util.List[IEffect] = ImmutableList.copyOf(this.effectRegistry);

  override def registerEffect(effect: IEffect): Unit = {
    effectRegistry.forEach(ef => {
      if (ef.getKey == effect.getKey) {
         //TODO nag or hard crash on conflicting effects also how would you do that these are resource locations!?!!?!?
      } else {
        effectRegistry.add(effect)
      }
    })
  }
  
  override def getEffectByKey(key: ResourceLocation): Optional[IEffect] = {
    effectRegistry.forEach(effect => { if (effect.getKey == key) return Optional.of(effect) })
    Optional.empty()
  }
  // format: on
}
