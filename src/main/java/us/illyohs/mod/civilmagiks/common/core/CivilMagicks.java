/**
 * Copyright (c) 2014, Anthony Anderson(Illyohs)
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
package us.illyohs.mod.civilmagiks.common.core;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.fml.common.registry.GameRegistry;
import us.illyohs.mod.civilmagiks.common.block.ModBlocks;
import us.illyohs.mod.civilmagiks.common.core.config.ConfigurationHandler;
import us.illyohs.mod.civilmagiks.common.core.handler.CivilEventHandler;
import us.illyohs.mod.civilmagiks.common.core.handler.WritHandler;
import us.illyohs.mod.civilmagiks.common.core.lib.IProxy;
import us.illyohs.mod.civilmagiks.common.core.lib.LibInfo;
import us.illyohs.mod.civilmagiks.common.item.ModItems;

@Mod(modid = LibInfo.MOD_ID, name = LibInfo.MOD_NAME, version = LibInfo.VERSION)
public class CivilMagicks {

    @Instance
    public static CivilMagicks instance;
    
    @SidedProxy(serverSide = LibInfo.COMMON_PROXY, clientSide = LibInfo.CLIENT_PROXY)
    public static IProxy proxy;
    
    public WritHandler writhandler;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        ModBlocks.init();
        ModItems.init();
        //VanillaCrafting.init();
        proxy.initModelLoaders();

        
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.bindModelsAndTextures();
        proxy.renderBlockItems();
        GameRegistry.addRecipe(new ItemStack(ModItems.itemWrit),
                "ddd",
                "dpd",
                "ddd", 'd', Items.stick, 'p', Items.paper);

    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        writhandler = new WritHandler();
        MinecraftForge.EVENT_BUS.register(new CivilEventHandler());
    }
}
