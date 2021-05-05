package io.ansan.mods.civilmagicks.common.brew

import net.minecraft.item.{ItemStack, Items}
import net.minecraft.util.ResourceLocation
import io.ansan.mods.civilmagicks.api.brew.IBrew
import io.ansan.mods.civilmagicks.api.effect.IEffect
import io.ansan.mods.civilmagicks.api.mana.ManaType
import io.ansan.mods.civilmagicks.api.util.ManaTypes

// format: off
class Brew(key: String, catalyst: ItemStack, inputs: Array[ItemStack], manaTypes: Array[ManaType], color: Int, effect: IEffect) extends IBrew {
// format: on

  override def getKey: ResourceLocation = new ResourceLocation("civilmagicks:brew_" + key)

  override def getCatalyst: ItemStack = this.catalyst

  override def getInputs: Array[ItemStack] = this.inputs

  override def getManaTypes: Array[ManaType] = this.manaTypes

  override def getColor: Int = this.color

  override def effect(): IEffect = this.effect
}

//case object HasteBrew
//    extends Brew("haste",
//                 Items.RABBIT_FOOT.getDefaultInstance,
//                 Array(Items.RABBIT_FOOT.getDefaultInstance),
//                 Array(ManaTypes.AIR.get()),
//                 0xfcffb3,
//                 new SpeedEffect)
//
//case object FireWalking
//    extends Brew(
//      "firewalk",
//      Items.NETHERRACK.getDefaultInstance,
//      Array(Items.WATER_BUCKET.getDefaultInstance, Items.BLAZE_ROD.getDefaultInstance),
//      Array(ManaTypes.FIRE.get()),
//      0xff6666,
//      new SpeedEffect
//    )
//case object WaterBreathing
//    extends Brew(
//      "waterbreath",
//      Items.TROPICAL_FISH.getDefaultInstance,
//      Array(Items.WATER_BUCKET.getDefaultInstance,
//            Items.BUCKET.getDefaultInstance,
//            Items.WATER_BUCKET.getDefaultInstance),
//      Array(ManaTypes.AIR.get(), ManaTypes.WATER.get()),
//      0xF1FFFE,
//      new SpeedEffect //TODO: CHANGE
//    )
