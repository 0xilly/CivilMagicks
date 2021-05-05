package io.ansan.mods.civilmagicks.common.entity

import net.minecraft.entity.Entity
import net.minecraft.nbt.CompoundNBT
import net.minecraft.network.IPacket
import net.minecraft.network.play.server.SSpawnObjectPacket
import net.minecraft.world.World

class SigilEntity(world: World) extends Entity(ModEntityTypes.SIGI_ENTITY, world) {

  override def defineSynchedData(): Unit = ???

  override def readAdditionalSaveData(p_70037_1_ : CompoundNBT): Unit = ???

  override def addAdditionalSaveData(p_213281_1_ : CompoundNBT): Unit = ???

  override def getAddEntityPacket: IPacket[_] = ???
}
