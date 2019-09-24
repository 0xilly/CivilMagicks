/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.common.block

import net.minecraft.block.Block
import net.minecraft.util.ResourceLocation
import net.minecraftforge.registries.{IForgeRegistry, RegistryManager}

object ModBlocks {
  // format: off
  private final val BLOCK_REGISTRY: IForgeRegistry[Block] = RegistryManager.ACTIVE.getRegistry(classOf[Block])
  // format: on
  final val FIRE_BOX    = BLOCK_REGISTRY.getValue(new ResourceLocation("civilmagicks", "firebox"))
  final val MANA_SPRING = BLOCK_REGISTRY.getValue(new ResourceLocation("civilmagicks", "manaspring"))
}
