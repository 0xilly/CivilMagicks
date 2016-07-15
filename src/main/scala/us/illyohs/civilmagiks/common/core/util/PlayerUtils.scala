/**
  * Copyright (c) 2016, Anthony Anderson(Illyohs)
  * All rights reserved.
  *
  * Redistribution and use in source and binary forms, with or without
  * modification, are permitted provided that the following conditions are met:
  *
  * * Redistributions of source code must retain the above copyright notice, this
  * list of conditions and the following disclaimer.
  *
  * * Redistributions in binary form must reproduce the above copyright notice,
  * this list of conditions and the following disclaimer in the documentation
  * and/or other materials provided with the distribution.
  *
  * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
  * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
  * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
  * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
  * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
  * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
  * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
  * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
  * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
  */
package us.illyohs.civilmagiks.common.core.util

import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.{Item, ItemStack}
import net.minecraft.util.EnumHand
import net.minecraft.util.math.BlockPos
import net.minecraft.util.text.ITextComponent

import us.illyohs.civilmagiks.common.core.util.math.WorldPos

object PlayerUtils {
  def getHeldItem(player:EntityPlayer, hand: EnumHand) = player.getHeldItem(hand).getItem

  def setHeldItem(player:EntityPlayer, iStack:ItemStack, hand:EnumHand) = player.setHeldItem(hand, iStack)

  def clearHeldItem(player: EntityPlayer): Unit = player.inventory.setInventorySlotContents(player.inventory.currentItem, null)

  def sendMessage(player:EntityPlayer, text:ITextComponent) = player.addChatComponentMessage(text)

  def teleportPlayer(player:EntityPlayer, pos:BlockPos) = player.setPositionAndUpdate(pos.getX+.5, pos.getY, pos.getZ+.5)

  def teleportPlayer(player:EntityPlayer, pos : WorldPos): Unit = {
    player.changeDimension(pos.getDem)
    player.setPositionAndUpdate(pos.getX+.5, pos.getY, pos.getZ+.5)
  }

}