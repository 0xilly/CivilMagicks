package info.mdhs.mods.civilmagicks.common.item

import net.minecraft.item.Item
import net.minecraft.util.ResourceLocation
import net.minecraftforge.registries.{IForgeRegistry, RegistryManager}

object ModItems {
  // format: off
  private final val ITEM_REGISTRY :IForgeRegistry[Item] = RegistryManager.ACTIVE.getRegistry(classOf[Item])
  // format: on
  final val MANA_SPRING = ITEM_REGISTRY.getValue(new ResourceLocation("civilmagicks", "manaspring"))
  final val FIRE_BOX    = ITEM_REGISTRY.getValue(new ResourceLocation("civilmagicks", "firebox"))
}
