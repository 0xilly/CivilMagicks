package info.mdhs.mods.civilmagicks.common.util

import net.minecraft.entity.Entity
import net.minecraft.util.{ActionResultType, ResourceLocation}

import info.mdhs.mods.civilmagicks.api.effect.IEffect
import info.mdhs.mods.civilmagicks.common.CivilMagicks

object EffectExecutor {
  def exec(effect: IEffect, caster: Entity, target: Entity): ActionResultType = effect.execute(caster, target)

  def execByKey(key: ResourceLocation, caster: Entity, target: Entity): Unit = {
    CivilMagicks.INSTANCE.getAPI.getEffectsRegistry.getEffectByKey(key).ifPresent(eff => eff.execute(caster, target))
  }
}
