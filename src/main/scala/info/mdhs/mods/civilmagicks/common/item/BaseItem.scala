package info.mdhs.mods.civilmagicks.common.item

import net.minecraft.item.Item
import net.minecraft.item.Item.Properties

class BaseItem(name: String, properties: Properties) extends Item(properties) {
  this.setRegistryName("civilmagicks", name)

}
