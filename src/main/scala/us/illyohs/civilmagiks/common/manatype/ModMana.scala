/**
 * Copyright (c) 2016, Anthony Anderson<Illyohs>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package us.illyohs.civilmagiks.common.manatype

import javax.annotation.Nonnull

import net.minecraftforge.common.BiomeDictionary._
import net.minecraftforge.fml.common.registry.GameRegistry

import us.illyohs.civilmagiks.api.init.ManaTypes
import us.illyohs.civilmagiks.api.mana.Mana
import us.illyohs.civilmagiks.common.core.util.ModInfo

class CivilMana(@Nonnull key: String,
                @Nonnull spawnable: Boolean,
                @Nonnull color: Int,
                @Nonnull blend: Int,
                @Nonnull biome:Type*)
  extends Mana(key, spawnable, color, blend, biome.toArray) {
  this.setRegistryName(ModInfo.MOD_ID, key)

}

object ModMana {

  private var _Earth  = ManaTypes.EARTH
  private var _Fire   = ManaTypes.FIRE
  private var _Water  = ManaTypes.WATER
  private var _Wind   = ManaTypes.WIND
  private var _Grey   = ManaTypes.GREY

  def init: Unit = {
    _Earth  = new CivilMana("earth", true, 0x4ca54c, 1)
    _Fire   = new CivilMana("fire", true, 0xffb732, 1)
    _Water  = new CivilMana("water", true, 0x3030ff, 1)
    _Wind   = new CivilMana("wind", true, 0x8c8c8c, 1)
    _Grey   = new CivilMana("grey", true, 0x34332d, 1)

    gameReg
  }

  private def gameReg(): Unit = {
    GameRegistry.register(_Earth)
    GameRegistry.register(_Fire)
    GameRegistry.register(_Water)
    GameRegistry.register(_Wind)
    GameRegistry.register(_Grey)

  }
}
