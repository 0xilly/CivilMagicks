/**
 * Copyright (c) 2014, Anthony Anderson(Lord Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
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
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package us.illyohs.civilmagicks.magicks;

import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;
import us.illyohs.azathoth.pulsar.pulse.Handler;
import us.illyohs.azathoth.pulsar.pulse.Pulse;
import us.illyohs.civilmagicks.core.lib.IProxy;
import us.illyohs.civilmagicks.core.lib.LibInfo;
import us.illyohs.civilmagicks.magicks.blocks.MagicksBlocks;
import us.illyohs.civilmagicks.magicks.items.MagicksItems;

@Pulse(id = "CivilMagicks|Magicks", description = "The magicks module for CivilMagicks")
public class Magicks {

    @Instance("CivilMagicks|Magicks")
    public static Magicks instance;

    @SidedProxy(clientSide = "us.illyohs.civilmagicks.magicks.proxy.MagicksClientProxy", 
                serverSide = "us.illyohs.civilmagicks.magicks.proxy.MagicksCommonProxy")
    public static IProxy proxy;
    
    @Handler
    public void preInit(FMLPreInitializationEvent event) {
        
        MagicksBlocks.init();
        MagicksItems.init();
        
    }
    
    @Handler
    public void init(FMLInitializationEvent event) {
        proxy.registerTileEntitys();
        proxy.bindModelsAndTextures();
    }
    
    @Handler
    public void postInit(FMLPostInitializationEvent event) {
        
    }
    
}
