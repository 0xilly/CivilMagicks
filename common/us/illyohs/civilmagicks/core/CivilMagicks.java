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
 *   and/or other materials provided with the distribution.
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
package us.illyohs.civilmagicks.core;

import us.illyohs.azathoth.pulsar.config.ForgeCFG;
import us.illyohs.azathoth.pulsar.control.PulseManager;
import us.illyohs.civilmagicks.core.lib.LibInfo;
import us.illyohs.civilmagicks.core.regestry.RegisterBlocks;
import us.illyohs.civilmagicks.core.regestry.RegisterItems;
import us.illyohs.civilmagicks.magicks.Magicks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LibInfo.MOD_ID, name = LibInfo.MOD_NAME, version = LibInfo.VERSION)
public class CivilMagicks {

    @Instance
    public static CivilMagicks instance;

    public static PulseManager puls = new PulseManager(LibInfo.MOD_ID, new ForgeCFG("CivilPulses",
            "Don't disable these unless you want some wierd randomnes to happen"));

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        puls.registerPulse(new Magicks());

        RegisterBlocks.reg();
        RegisterItems.reg();
        puls.preInit(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        puls.init(event);

    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {

        puls.postInit(event);

    }
}
