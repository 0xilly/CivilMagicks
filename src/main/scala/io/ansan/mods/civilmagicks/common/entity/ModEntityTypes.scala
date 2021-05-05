package io.ansan.mods.civilmagicks.common.entity

import net.minecraftforge.registries.{IForgeRegistry, RegistryManager}

import net.minecraft.entity.EntityType
import net.minecraft.util.ResourceLocation

object ModEntityTypes {
  // format: off
  private final val ENTITY_REGISTRY: IForgeRegistry[EntityType[_]] =
    RegistryManager.ACTIVE.getRegistry(classOf[EntityType[_]])

  val SIGI_ENTITY: EntityType[_] = ENTITY_REGISTRY.getValue(new ResourceLocation("civilmagicks", "sigil"))
  // format: on
}
