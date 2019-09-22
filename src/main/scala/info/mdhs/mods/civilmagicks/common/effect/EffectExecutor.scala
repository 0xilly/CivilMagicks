/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.common.effect

import net.minecraft.entity.Entity
import net.minecraft.util.{ActionResultType, ResourceLocation}

import info.mdhs.mods.civilmagicks.api.effect.IEffect
import info.mdhs.mods.civilmagicks.common.apiimpl.API

object EffectExecutor {
  def exec(effect: IEffect, caster: Entity, target: Entity): ActionResultType = effect.execute(caster, target)

  def execByKey(key: ResourceLocation, caster: Entity, target: Entity): Unit = {
    API.INSTANCE.getEffectsRegistry.getEffectByKey(key).ifPresent(eff => eff.execute(caster, target))
  }
}
