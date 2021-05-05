/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package io.ansan.mods.civilmagicks.common.apiimpl

import io.ansan.mods.civilmagicks.api.ICivilMagicksAPI
import io.ansan.mods.civilmagicks.api.brew.IBrewRegistry
import io.ansan.mods.civilmagicks.api.civil.ICivilRegistry
import io.ansan.mods.civilmagicks.api.effect.IEffectRegistry
import io.ansan.mods.civilmagicks.api.sigil.ISigilRegistry
import io.ansan.mods.civilmagicks.common.apiimpl.brew.BrewRegistry
import io.ansan.mods.civilmagicks.common.apiimpl.civil.CivilRegistry
import io.ansan.mods.civilmagicks.common.apiimpl.effect.EffectRegistry
import io.ansan.mods.civilmagicks.common.apiimpl.sigil.SigilRegistry

class API extends ICivilMagicksAPI {

  private val effectRegistry = new EffectRegistry
  private val brewRegistry   = new BrewRegistry
  private val civilRegistry  = new CivilRegistry
  private val sigilRegistry  = new SigilRegistry

  override def getBrewRegistry: IBrewRegistry = this.brewRegistry

  override def getEffectsRegistry: IEffectRegistry = this.effectRegistry

  override def getCivilRegistry: ICivilRegistry = this.civilRegistry

  override def getSigilRegistry: ISigilRegistry = this.sigilRegistry
}
