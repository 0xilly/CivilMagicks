package io.ansan.mods.civilmagicks.common.sigil

import io.ansan.mods.civilmagicks.api.sigil.ISigil
import net.minecraft.util.ResourceLocation

abstract class Sigil(key: String, texture: String) extends ISigil {

  override def getKey(): ResourceLocation  = new ResourceLocation("civilmagicks:sigil_" + key)
  override def texture(): ResourceLocation = new ResourceLocation("civilmagicks:sigils/" + texture + ".png")
}
