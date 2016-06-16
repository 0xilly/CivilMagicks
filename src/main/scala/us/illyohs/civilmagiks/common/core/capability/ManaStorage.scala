package us.illyohs.civilmagiks.common.core.capability

import net.minecraft.nbt.NBTBase
import net.minecraft.nbt.NBTTagCompound
import net.minecraft.util.EnumFacing

import net.minecraftforge.common.capabilities.Capability
import net.minecraftforge.common.capabilities.Capability.IStorage

import us.illyohs.civilmagiks.api.capability.IManaHandler
import us.illyohs.civilmagiks.common.core.capability.handler.ManaHandler
import java.util.concurrent.Callable

import us.illyohs.civilmagiks.api.mana.Mana


object ManaStorage {

  class ManaCallable extends Callable[IManaHandler] {
    @throws[Exception]
    def call: IManaHandler = {
      new ManaHandler
    }
  }

}

class ManaStorage extends IStorage[IManaHandler] {
  def writeNBT(capability: Capability[IManaHandler], instance: IManaHandler, side: EnumFacing): NBTBase = {
    if (!instance.isInstanceOf[IManaHandler]) return null
    val tag: NBTTagCompound = new NBTTagCompound
    val imh: IManaHandler = instance.asInstanceOf[IManaHandler]
    val manalevel: Int = imh.getCurrentMana
    val getType: Mana = imh.getManaType
    tag
  }

  def readNBT(capability: Capability[IManaHandler], instance: IManaHandler, side: EnumFacing, nbt: NBTBase) {
  }
}