package info.mdhs.mods.civilmagicks.common.entity

import net.minecraft.entity.{Entity, EntityType}
import net.minecraftforge.registries.{IForgeRegistry, RegistryManager}

object ModEntityTypes {
  // format : off
  private final val ENTITY_REGISTRY: IForgeRegistry[EntityType[_]] = RegistryManager.ACTIVE.getRegistry(classOf[EntityType[_]])
  // format: on
}
