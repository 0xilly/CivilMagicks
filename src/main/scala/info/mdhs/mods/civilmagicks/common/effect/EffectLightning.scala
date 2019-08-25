/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.common.effect
import net.minecraft.entity.Entity
import net.minecraft.util.{ActionResultType, DamageSource}

class EffectLightning extends BaseEffect("lightning") {
  override def execute(caster: Entity, target: Entity): ActionResultType = {
    val world     = target.getEntityWorld
    val targetPos = target.getPosition

    target.attackEntityFrom(DamageSource.LIGHTNING_BOLT, 1F)
    ActionResultType.PASS
  }
}
