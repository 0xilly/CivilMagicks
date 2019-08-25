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

class BrewRegistry extends IBrewRegistry {

  private val brewRegistry: util.List[IBrew] = new util.ArrayList[IBrew]()

  override def getBrews: util.List[IBrew] = ImmutableList.copyOf(this.brewRegistry)

  override def registerBrew(brew: IBrew): Unit = {
    brewRegistry.forEach(b => {
      if (b.getName == brew.getName) {
        //TODO really annoying nag
      } else {
        brewRegistry.add(brew)
      }
    })
  }
}
