package io.ansan.mods.civilmagicks.common.apiimpl.civil

import io.ansan.mods.civilmagicks.api.civil.{ICivil, ICivilRegistry}

import java.util

class CivilRegistry extends ICivilRegistry {
  private val registry: util.List[ICivil[_]] = new util.ArrayList[ICivil[_]]

  override def getCivilRegistry: util.List[ICivil[_]] = this.registry
}
