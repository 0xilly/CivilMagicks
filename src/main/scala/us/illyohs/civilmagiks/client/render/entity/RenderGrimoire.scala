package us.illyohs.civilmagiks.client.render.entity

import net.minecraft.client.renderer.entity.{Render, RenderManager}
import net.minecraft.util.ResourceLocation
import net.minecraftforge.fml.relauncher.{Side, SideOnly}
import us.illyohs.civilmagiks.common.entity.mics.EntityGrimoire

@SideOnly(Side.CLIENT)
class RenderGrimoire(manger: RenderManager)
  extends Render[EntityGrimoire](manger) {


  override def getEntityTexture(entity: EntityGrimoire): ResourceLocation = ???

  override def doRender(entity: EntityGrimoire, x: Double, y: Double, z: Double, yaw: Float, ticks: Float): Unit = {

  }
}
