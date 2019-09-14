/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.common.effect

import net.minecraft.util.ResourceLocation

import info.mdhs.mods.civilmagicks.api.effect.IEffect

abstract class BaseEffect(key: String, description: String, isBottleAble: Boolean) extends IEffect {
  override def getKey: ResourceLocation = new ResourceLocation("civilmagicks:effect_" + this.key)

  override def isBottleAble: Boolean = this.isBottleAble

  override def getDescription: String = this.description
}
