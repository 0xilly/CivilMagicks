/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.common.block

import net.minecraft.block.Block
import net.minecraft.block.Block.Properties
import net.minecraft.util.ResourceLocation

class BaseBlock(name: String, properties: Properties) extends Block(properties) {
  this.setRegistryName(new ResourceLocation("civilmagicks:" + name))
}
