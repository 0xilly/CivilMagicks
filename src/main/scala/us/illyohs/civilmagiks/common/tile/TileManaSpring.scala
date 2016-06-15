package us.illyohs.civilmagiks.common.tile

import net.minecraft.nbt.NBTTagCompound
import net.minecraft.util.ITickable
import us.illyohs.civilmagiks.common.core.util.ManaTile
import us.illyohs.civilmagiks.common.core.util.mana.ManaUtils

class TileManaSpring extends ManaTile with ITickable {


//  setManaType(ManaUtils.getManaFromPos(worldObj, pos))

  override def update(): Unit = {

  }

  override def readFromModNBT(mNBT: NBTTagCompound) {

  }

  override def writeToModNBT(mNBT: NBTTagCompound): NBTTagCompound = {
    mNBT.setString("ManaType", getManaType.getLocalizedName)

    mNBT
  }

}
