package us.illyohs.civilmagiks.common.entity

import net.minecraftforge.fml.common.registry.EntityRegistry

import us.illyohs.civilmagiks.common.core.CivilMagicks
import us.illyohs.civilmagiks.common.entity.mics.EntitySigil

object ModEnitites {


  def init: Unit ={

    EntityRegistry.registerModEntity(classOf[EntitySigil], "sigil", 1, CivilMagicks.instance, 64, 10, true)
  }

}
