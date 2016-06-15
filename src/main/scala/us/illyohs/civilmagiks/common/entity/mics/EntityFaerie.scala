package us.illyohs.civilmagiks.common.entity.mics

import net.minecraft.entity.Entity
import net.minecraft.nbt.NBTTagCompound
import net.minecraft.world.World

class EntityFaerie(world:World) extends Entity(world) {
  override def writeEntityToNBT(compound: NBTTagCompound): Unit = ???

  override def entityInit(): Unit = ???

  override def readEntityFromNBT(compound: NBTTagCompound): Unit = ???
}
