package us.illyohs.civilmagiks.common.entity.mics

import net.minecraft.entity.EntityLivingBase
import net.minecraft.inventory.EntityEquipmentSlot
import net.minecraft.item.ItemStack
import net.minecraft.util.EnumHandSide
import net.minecraft.world.World

class EntityGrimoire(world: World) extends EntityLivingBase(world) {

  override def getItemStackFromSlot(slotIn: EntityEquipmentSlot): ItemStack = ???

  override def getPrimaryHand: EnumHandSide = ???
}
