package info.mdhs.mods.civilmagicks.common.effect
import net.minecraft.entity.{Entity, LivingEntity}
import net.minecraft.potion.Effects
import net.minecraft.util.ActionResultType

class SpeedEffect extends Effect("speed", "Gota go fast", true) {

  override def execute(caster: Entity, target: Entity): ActionResultType = {

    target match {
      case entity: LivingEntity =>
        Effects.SPEED.performEffect(entity, 3);

        ActionResultType.SUCCESS
      case _ =>
        ActionResultType.FAIL
    }

  }
}
