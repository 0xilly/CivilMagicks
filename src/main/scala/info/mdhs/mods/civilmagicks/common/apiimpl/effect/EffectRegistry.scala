/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.common.apiimpl.effect

import net.minecraft.util.ResourceLocation

import info.mdhs.mods.civilmagicks.api.effect.{IEffect, IEffectRegistry}
import java.util
import java.util.Optional

class EffectRegistry extends IEffectRegistry {

  private val effectRegistry: util.List[IEffect] = new util.ArrayList[IEffect]()

  override def getEffects: util.List[IEffect] = this.effectRegistry

  override def getEffectByKey(key: ResourceLocation): Optional[IEffect] = {
    effectRegistry.forEach(effect => { if (effect.getKey.equals(key)) return Optional.of(effect) })
    Optional.empty()
  }
}
