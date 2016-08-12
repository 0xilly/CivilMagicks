package us.illyohs.civilmagiks.common.effect

import net.minecraft.block.Block
import net.minecraft.entity.EntityLivingBase
import net.minecraft.entity.player.EntityPlayer
import us.illyohs.civilmagiks.api.spell.AbstractEffect

/**
  * Created by illyohs on 8/2/16.
  */
class FireBallEffect
  extends AbstractEffect("fireball", true){

  override def effectPlayer(player: EntityPlayer): Unit = null

  override def effectTarget(player: EntityPlayer, target: Object): Unit = {
    if (target.isInstanceOf[Block] || target.isInstanceOf[EntityLivingBase]) {
//      player.get
    }
  }
}
