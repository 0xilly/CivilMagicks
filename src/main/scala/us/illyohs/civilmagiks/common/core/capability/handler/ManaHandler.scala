package us.illyohs.civilmagiks.common.core.capability.handler

import us.illyohs.civilmagiks.api.capability.IManaHandler
import us.illyohs.civilmagiks.api.init.ManaTypes
import us.illyohs.civilmagiks.api.mana.Mana

class ManaHandler extends IManaHandler {

  private var currentMana: Int = 0
  private var maxMana: Int = 0
  private var manaType: Mana = null

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
    maxMana
  }

  def getCurrentMana: Int = {
    currentMana
  }

  def setType(mana: Mana) {
    this.manaType = mana
  }

  def getManaType: Mana = {
    ManaTypes.GREY
  }
}