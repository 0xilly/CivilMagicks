package us.illyohs.civilmagiks.common.core.capability.handler

import us.illyohs.civilmagiks.api.capability.IManaHandler
import us.illyohs.civilmagiks.api.init.Mana
import us.illyohs.civilmagiks.api.mana.ManaType

class ManaHandler extends IManaHandler {

  private var currentMana: Int = 0
  private var maxMana: Int = 0
  private var manaType: ManaType = null

  def setMaxMana(maxMana: Int) {
    this.maxMana = maxMana
  }

  def addMana(add: Int) {
    if (getCurrentMana + add > maxMana) {
      this.currentMana = getCurrentMana + 0
    }
    else if (getCurrentMana + add <= maxMana) {
      this.currentMana = getCurrentMana + add
    }
  }

  def getMaxStorage: Int = {
    return maxMana
  }

  def getCurrentMana: Int = {
    return currentMana
  }

  def setType(`type`: ManaType) {
    this.manaType = `type`
  }

  def getManaType: ManaType = {
    Mana.GREY
  }
}