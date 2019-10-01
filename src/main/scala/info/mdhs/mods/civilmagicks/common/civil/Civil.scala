package info.mdhs.mods.civilmagicks.common.civil

import net.minecraft.block.Block
import net.minecraft.item.Item

import info.mdhs.mods.civilmagicks.api.civil.{Civility, ICivil}

class CivilBlock(block: Block, civility: Civility) extends ICivil[Block] {
  override def getTypeObject: Block = this.block

  override def getCivility: Civility = this.civility
}

class CivilItem(item: Item, civility: Civility) extends ICivil[Item] {
  override def getTypeObject: Item = this.item

  override def getCivility: Civility = this.civility
}
