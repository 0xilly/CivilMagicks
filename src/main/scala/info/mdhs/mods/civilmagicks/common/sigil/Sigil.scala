package info.mdhs.mods.civilmagicks.common.sigil

import net.minecraft.util.ResourceLocation

import info.mdhs.mods.civilmagicks.api.sigil.ISigil

abstract class Sigil(key: String, texture: String) extends ISigil {

  override def getKey(): ResourceLocation  = new ResourceLocation("civilmagicks:sigil_" + key)
  override def texture(): ResourceLocation = new ResourceLocation("civilmagicks:sigils/" + texture + ".png")
}
