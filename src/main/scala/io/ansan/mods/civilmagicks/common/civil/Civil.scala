package io.ansan.mods.civilmagicks.common.civil

import io.ansan.mods.civilmagicks.api.civil.{Civility, ICivil}
import net.minecraft.block.Block
import net.minecraft.item.Item

class CivilBlock(block: Block, civility: Civility) extends ICivil[Block] {
  override def getTypeObject: Block = this.block

  override def getCivility: Civility = this.civility
}

class CivilItem(item: Item, civility: Civility) extends ICivil[Item] {
  override def getTypeObject: Item = this.item

  override def getCivility: Civility = this.civility
}
