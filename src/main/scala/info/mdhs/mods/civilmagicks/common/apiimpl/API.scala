/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.common.apiimpl

import info.mdhs.mods.civilmagicks.api.ICivilMagicksAPI
import info.mdhs.mods.civilmagicks.api.brew.IBrewRegistry
import info.mdhs.mods.civilmagicks.api.effect.IEffectRegistry
import info.mdhs.mods.civilmagicks.common.apiimpl.brew.BrewRegistry
import info.mdhs.mods.civilmagicks.common.apiimpl.effect.EffectRegistry

class API extends ICivilMagicksAPI {

  private val effectRegistry = new EffectRegistry
  private val brewRegistry   = new BrewRegistry

  override def getBrewRegistry: IBrewRegistry = this.brewRegistry

  override def getEffectsRegistry: IEffectRegistry = this.effectRegistry
}
