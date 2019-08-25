package info.mdhs.mods.civilmagicks.common.mana

import info.mdhs.mods.civilmagicks.api.mana.ManaType

object ManaTypes {
  val AIR: ManaType   = new AirMana
  val EARTH: ManaType = new EarthMana
  val FIRE: ManaType  = new FireMana
  val INERT: ManaType = new InertMana
}
