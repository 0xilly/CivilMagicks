package us.illyohs.civilmagiks.common.core.util

import net.minecraft.nbt.NBTTagCompound
import net.minecraft.tileentity.TileEntity
import us.illyohs.civilmagiks.api.mana.ManaType

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

  private var _manaType: ManaType = null

  def getManaType: ManaType= _manaType

  def setManaType(manaType: ManaType) = _manaType = manaType
}
