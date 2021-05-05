/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package io.ansan.mods.civilmagicks.common.apiimpl.brew

import net.minecraft.util.ResourceLocation
import io.ansan.mods.civilmagicks.api.brew.{IBrew, IBrewRegistry}

import java.util
import java.util.Optional

class BrewRegistry extends IBrewRegistry {

  private val brewRegistry: util.List[IBrew] = new util.ArrayList[IBrew]()

  override def getBrews: util.List[IBrew] = this.brewRegistry

  override def getBrewByKey(key: ResourceLocation): Optional[IBrew] = {
    brewRegistry.forEach(brew => if (brew.getKey.equals(key)) return Optional.of(brew))
    Optional.empty()
  }
}
