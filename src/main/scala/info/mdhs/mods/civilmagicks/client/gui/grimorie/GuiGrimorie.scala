package info.mdhs.mods.civilmagicks.client.gui.grimorie

import net.minecraftforge.api.distmarker.{Dist, OnlyIn}

import net.minecraft.client.Minecraft
import net.minecraft.client.gui.screen.Screen
import net.minecraft.util.ResourceLocation
import net.minecraft.util.text.StringTextComponent

import com.mojang.blaze3d.platform.GlStateManager

@OnlyIn(Dist.CLIENT)
class GuiGrimorie extends Screen(new StringTextComponent("")) {
  private val TEXTURE: ResourceLocation = new ResourceLocation("civilmaigcks:textures/gui/grimore.png")

  private val mc             = Minecraft.getInstance();
  private var top: Int       = _
  private var left: Int      = _
  private val guiHeight: Int = 180
  private val guiWidth: Int  = 256

  override final def init(): Unit = {
    super.init()
    onGuiInit()
  }

  def onGuiInit(): Unit = {
    val scale: Int = mc.gameSettings.guiScale

    top = height / 2 - guiHeight / 2
    left = width / 2 - guiWidth / 2
  }

  override def render(x: Int, y: Int, ticks: Float): Unit = {
    super.render(x, y, ticks)
    GlStateManager.pushMatrix()
    mc.getTextureManager.bindTexture(TEXTURE)
    GlStateManager.popMatrix()
  }
}
