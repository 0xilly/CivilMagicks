/*
 *  Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.common.mana

import info.mdhs.mods.civilmagicks.api.mana.ManaType
import net.minecraft.util.ResourceLocation
import net.minecraftforge.common.BiomeDictionary.Type

class BaseMana(name: String, color: Int, biomes: Array[Type]) extends ManaType(name, color, biomes) {
  this.setRegistryName(new ResourceLocation("civilmagicks:" + name.toLowerCase))
}

class FireMana  extends BaseMana("ingus", 0xff1a1a, Array(Type.HOT, Type.NETHER))
class AirMana   extends BaseMana("aer", 0xff1a1a, Array(Type.SPARSE, Type.PLAINS))
class EarthMana extends BaseMana("terra", 0xff1a1a, Array(Type.MOUNTAIN, Type.MESA))
class WaterMana extends BaseMana("aqua", 0xff1a1a, Array(Type.WATER, Type.WET, Type.OCEAN, Type.RIVER))
class InertMana extends BaseMana("inert", 0xff1a1a, Array())
