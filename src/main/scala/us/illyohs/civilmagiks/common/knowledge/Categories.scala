package us.illyohs.civilmagiks.common.knowledge

import net.minecraft.util.ResourceLocation
import us.illyohs.civilmagiks.api.knowledge.Category

class Categories(category: String, description: String, lore: String, texture: ResourceLocation)
  extends Category("ct." + category, "desc." + description, "lore." + lore, texture){

}

class CateGeneral
  extends Categories("General", "SomeGeneralStuff", "lore", new ResourceLocation("minecraft:items/book_normal")) {
  linkPage(PageInfo)
}
