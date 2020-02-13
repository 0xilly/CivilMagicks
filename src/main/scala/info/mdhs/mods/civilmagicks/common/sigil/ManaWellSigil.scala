package info.mdhs.mods.civilmagicks.common.sigil
import net.minecraft.entity.Entity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.nbt.CompoundNBT
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

class ManaWellSigil extends Sigil("manawell", "manasigil") {

  override def onColliedWithEntity(entity: Entity, pos: BlockPos): Unit = {}

  override def onEntityRightClick(entity: PlayerEntity, pos: BlockPos): Unit = {}

  override def onRandomTick(world: World, pso: BlockPos): Unit = {}

  override def serializeNBT(): CompoundNBT = {
    null
  }

  override def deserializeNBT(nbt: CompoundNBT): Unit = {}
}
