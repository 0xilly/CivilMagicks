package us.illyohs.civilmagiks.client.render.entity

import java.util.Random

import net.minecraft.client.renderer.GlStateManager
import net.minecraft.client.renderer.entity.{Render, RenderManager}
import net.minecraft.entity.Entity
import net.minecraft.util.ResourceLocation
import net.minecraft.util.math.MathHelper

import net.minecraftforge.fml.relauncher.{Side, SideOnly}

import us.illyohs.civilmagiks.common.entity.mics.EntityGrimoire

@SideOnly(Side.CLIENT)
class RenderGrimoire(manger: RenderManager)
  extends Render[EntityGrimoire](manger) {



  private val rand: Random = new Random

  override def getEntityTexture(entity: EntityGrimoire): ResourceLocation = ???

  override def doRender(entity: EntityGrimoire, x: Double, y: Double, z: Double, yaw: Float, ticks: Float): Unit = {

  }
}
