package us.illyohs.civilmagiks.common.entity.servants

import java.util.UUID
import javax.annotation.Nullable

import com.google.common.base.Optional
import net.minecraft.entity.EntityLiving
import net.minecraft.inventory.EntityEquipmentSlot
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NBTTagCompound
import net.minecraft.network.datasync.{DataParameter, DataSerializers, EntityDataManager}
import net.minecraft.util.EnumHandSide
import net.minecraft.world.World

class ServantEntity(world: World)
  extends EntityLiving(world) {

  val MASTER_ID:DataParameter[Optional[UUID]] = EntityDataManager.createKey[Optional[UUID]](classOf[ServantEntity], DataSerializers.OPTIONAL_UNIQUE_ID)

  var masterId: UUID = null
  this.dataManager.register(MASTER_ID, Optional.absent[UUID])
  this.isImmuneToFire = true

  override def entityInit(): Unit = {
    super.entityInit()
    this.dataManager.register(MASTER_ID, Optional.absent()[UUID])
  }

  override def initEntityAI(): Unit = {

  }

  override def writeEntityToNBT(tag: NBTTagCompound): Unit = {
    super.writeToNBT(tag)
    if (this.masterId == null) {
      tag.setString("MasterId","")
    } else {
      tag.setString("MasterId", this.masterId.toString)
    }
  }

  override def readEntityFromNBT(tag: NBTTagCompound): Unit = {
    super.readFromNBT(tag)
    var mast:String = ""

    if (tag.hasKey("MasterId")) {
      mast = tag.getString("MasterId")
    }

    if (!mast.isEmpty) {
      try {
        this.setMasterId(UUID.fromString(mast))
      } catch {
        case e: Throwable =>
      }

    }
  }

  override def getItemStackFromSlot(slot: EntityEquipmentSlot): ItemStack = null

  override def getPrimaryHand: EnumHandSide = EnumHandSide.RIGHT

  @Nullable
  def getMasterId: UUID = this.dataManager.get(MASTER_ID).orNull

  def setMasterId(@Nullable uUID: UUID): Unit = this.dataManager.set(MASTER_ID, Optional.fromNullable(uUID))

  override def canBreatheUnderwater: Boolean = {
    true
  }

  override def isImmuneToExplosions: Boolean = {
    true
  }

}
