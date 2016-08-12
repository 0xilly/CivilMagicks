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
package us.illyohs.civilmagiks.common.core.proxy

import net.minecraft.entity.player.EntityPlayer
import net.minecraft.util.ResourceLocation
import net.minecraft.world.World

import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import net.minecraftforge.fml.common.registry.{FMLControlledNamespacedRegistry, RegistryBuilder}

import us.illyohs.civilmagiks.api.CivilMagicksApi
import us.illyohs.civilmagiks.api.mana.Mana
import us.illyohs.civilmagiks.api.sigil.Sigil
import us.illyohs.civilmagiks.common.core.util.LogUtils
import us.illyohs.civilmagiks.common.manatype.ModMana

class CommonProxy {


  final private val SIGIL: ResourceLocation = new ResourceLocation("civilmagiks:sigils")
  final private val MANA: ResourceLocation  = new ResourceLocation("civilmagiks:mana")

  final private var iSigilRegistry: FMLControlledNamespacedRegistry[Sigil]  = null
  final private var iManaRegistry: FMLControlledNamespacedRegistry[Mana]    = null

  this.iSigilRegistry = new RegistryBuilder[Sigil]
    .setName(SIGIL)
    .setIDRange(0, Short.MaxValue)
    .setType(classOf[Sigil])
    .asInstanceOf[FMLControlledNamespacedRegistry[Sigil]]


  this.iManaRegistry = new RegistryBuilder[Mana]
    .setName(MANA)
    .setIDRange(0, Short.MaxValue)
    .setType(classOf[Mana])
    .asInstanceOf[FMLControlledNamespacedRegistry[Mana]]

  def preInit(event: FMLPreInitializationEvent): Unit = {
    ModMana.init
    //    ModBlocks.init
  }

  def init(event: FMLInitializationEvent): Unit = {
    val manType = CivilMagicksApi.MANA
    for (i <- 0 until manType.getValues.size()) {
      LogUtils.info("Found ManaType: " + manType.getValues.get(i).getRegistryName)
    }
  }

  def postInit(event: FMLPostInitializationEvent): Unit = {

  }

  def particleRing(world: World, x:Int, y:Int, z:Int): Unit = {
    /** NO-OP **/
  }

  def openGui(id: Int, player: EntityPlayer): Unit = {
    /** NO-OP **/
  }

}



