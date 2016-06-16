package us.illyohs.civilmagiks.common.core.util

import net.minecraft.nbt.NBTTagCompound
import net.minecraft.tileentity.TileEntity

import us.illyohs.civilmagiks.api.mana.Mana


abstract class CivilTile extends TileEntity {

  def readFromModNBT(mNBT: NBTTagCompound)

  def writeToModNBT(mNBT: NBTTagCompound): NBTTagCompound

  override def readFromNBT(tag: NBTTagCompound) {
    super.readFromNBT(tag)
    readFromModNBT(tag)
  }

  override def writeToNBT(tag: NBTTagCompound): NBTTagCompound = {
    super.writeToNBT(tag)
    return writeToModNBT(tag)
  }
}

abstract class ManaTile extends CivilTile {

  private var _manaType: Mana = null

  def getManaType: Mana= _manaType

  def setManaType(manaType: Mana) = _manaType = manaType
}
