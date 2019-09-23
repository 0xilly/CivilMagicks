/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.common.apiimpl.brew

import com.google.common.collect.ImmutableList
import info.mdhs.mods.civilmagicks.api.brew.{IBrew, IBrewRegistry}
import java.util
import java.util.Optional
import net.minecraft.util.ResourceLocation

class BrewRegistry extends IBrewRegistry {

  private val brewRegistry: util.List[IBrew] = new util.ArrayList[IBrew]()

  // format: off
  override def getBrews: util.List[IBrew] = ImmutableList.copyOf(this.brewRegistry)

  override def registerBrew(brew: IBrew): Unit = {
    brewRegistry.forEach(brew => {
      if (brew.getKey == brew.getKey) {
        //TODO really annoying nag
      } else {
        brewRegistry.add(brew)
      }
    })
  }

  override def getBrewByKey(key: ResourceLocation): Optional[IBrew] = {
    brewRegistry.forEach(brew => if(brew.getKey == key) return Optional.of(brew))
    Optional.empty()
  }
  // format: on
}
