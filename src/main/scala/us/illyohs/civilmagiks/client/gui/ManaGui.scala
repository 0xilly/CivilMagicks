package us.illyohs.civilmagiks.client.gui

import net.minecraft.client.gui.GuiScreen

import us.illyohs.civilmagiks.api.CivilMagicksApi

object ManaGui
  extends GuiScreen {


  val mana = CivilMagicksApi.MANA

  override def drawScreen(mouseX: Int, mouseY: Int, partialTicks: Float): Unit = {
    super.drawScreen(mouseX, mouseY, partialTicks)
    val man = mana.getValues.get(0)

    mc.fontRendererObj.drawString(man.getLocalizedName, 20, 20, man.getColor)
//    mc.fontRendererObj.drawString(man.getLocalizedName, 20, 20, man.getColor)

    for (manaList <- 0 to mana.getValues.size()) {
//      mc.fontRendererObj.drawString(ma,20, 20)
    }

  }
}
