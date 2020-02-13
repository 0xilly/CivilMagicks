package info.mdhs.mods.civilmagicks.common.entity

import net.minecraft.entity.Entity
import net.minecraft.nbt.CompoundNBT
import net.minecraft.network.IPacket
import net.minecraft.network.play.server.SSpawnObjectPacket
import net.minecraft.world.World

class SigilEntity(world: World) extends Entity(ModEntityTypes.SIGI_ENTITY, world) {

  override def registerData(): Unit = {}

  override def readAdditional(compound: CompoundNBT): Unit = {}

  override def writeAdditional(compound: CompoundNBT): Unit = {}

  override def createSpawnPacket(): IPacket[_] = new SSpawnObjectPacket(this)
}
