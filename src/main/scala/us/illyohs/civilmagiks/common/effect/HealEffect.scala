package us.illyohs.civilmagiks.common.effect

import net.minecraft.entity.EntityLivingBase
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.init.MobEffects
import net.minecraft.potion.PotionEffect
import us.illyohs.civilmagiks.api.spell.AbstractEffect

/**
  * Created by illyohs on 8/2/16.
  */
class HealEffect(seconds:Int)
  extends AbstractEffect(seconds, "heal", true) {

  override def effectPlayer(player: EntityPlayer): Unit = {
    player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, getTime, 4))
  }

  override def effectTarget(player: EntityPlayer, target: Object): Unit = {
    if (target.isInstanceOf[EntityLivingBase]) {
      player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, getTime, 4))
    }
  }
}