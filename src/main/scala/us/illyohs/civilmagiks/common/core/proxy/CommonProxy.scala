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

import java.util

import net.minecraft.util.ResourceLocation

import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import net.minecraftforge.fml.common.registry.{EntityRegistry, FMLControlledNamespacedRegistry, IForgeRegistry, PersistentRegistryManager}

import us.illyohs.civilmagiks.api.mana.Mana
import us.illyohs.civilmagiks.api.sigil.Sigil
import us.illyohs.civilmagiks.common.core.util.callback.{ManaCallBack, SigilCallBack}
import us.illyohs.civilmagiks.common.manatype.ModMana

class CommonProxy {

  final private val SIGILS: ResourceLocation = new ResourceLocation("civilmagiks:sigils")
  final private val MANATYPES: ResourceLocation = new ResourceLocation("civilmagiks:manatypes")
  final private var iSigilRegistry: FMLControlledNamespacedRegistry[Sigil] = null
  final private var iManaRegistry: FMLControlledNamespacedRegistry[Mana] = null

  this.iSigilRegistry = PersistentRegistryManager.createRegistry(SIGILS, classOf[Sigil], null, 0, 255, false, SigilCallBack.INSTANCE, SigilCallBack.INSTANCE, SigilCallBack.INSTANCE)
  this.iManaRegistry = PersistentRegistryManager.createRegistry(MANATYPES, classOf[Mana], null, 0, 255, false, ManaCallBack.INSTANCE, ManaCallBack.INSTANCE, ManaCallBack.INSTANCE)

  def preInit(event: FMLPreInitializationEvent): Unit = {
    ModMana.init
    //    ModBlocks.init
  }

  def init(event: FMLInitializationEvent): Unit = {

  }

  def postInit(event: FMLPostInitializationEvent): Unit = {

  }

}



