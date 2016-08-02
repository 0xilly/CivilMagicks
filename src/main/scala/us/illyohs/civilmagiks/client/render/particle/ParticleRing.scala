package us.illyohs.civilmagiks.client.render.particle

import java.awt.Color

import net.minecraft.client.particle.Particle
import net.minecraft.world.World

/**
  * Created by illyohs on 7/26/16.
  */
class ParticleRing(world:World, x:Double, y:Double, z:Double)
  extends Particle(world,x,y,z) {

  setMaxAge(5)

  def setColor(color:Color): Unit = {
    this.setRBGColorF(color.getRed.toFloat, color.getGreen.toFloat, color.getRed.toFloat)
  }



}
