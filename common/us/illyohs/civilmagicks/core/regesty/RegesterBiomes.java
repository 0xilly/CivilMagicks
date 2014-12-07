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
package us.illyohs.civilmagicks.core.regesty;

import net.minecraft.world.biome.BiomeGenBase;

import us.illyohs.civilmagicks.api.CivilMagicksAPI;

public class RegesterBiomes {
    
    public void reg() {
        
        //Dark mana type
        CivilMagicksAPI.registerDarkBiome(BiomeGenBase.coldTaiga);
        CivilMagicksAPI.registerDarkBiome(BiomeGenBase.coldTaigaHills);
        CivilMagicksAPI.registerDarkBiome(BiomeGenBase.hell);
        CivilMagicksAPI.registerDarkBiome(BiomeGenBase.taiga);
        CivilMagicksAPI.registerDarkBiome(BiomeGenBase.taigaHills);
        CivilMagicksAPI.registerDarkBiome(BiomeGenBase.swampland);
        CivilMagicksAPI.registerDarkBiome(BiomeGenBase.roofedForest);
        
        //Neutral mana type
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.extremeHills);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.extremeHillsEdge);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.extremeHillsPlus);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.megaTaiga);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.megaTaigaHills);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.stoneBeach);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.ocean);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.deepOcean);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.river);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.frozenRiver);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.beach);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.coldBeach);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.sky);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.mushroomIsland);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.mushroomIslandShore);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.desert);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.desertHills);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.savanna);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.savannaPlateau);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.mesa);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.mesaPlateau);
        CivilMagicksAPI.registerNeutralBiome(BiomeGenBase.mesaPlateau_F);
        
        //Light mana type
        CivilMagicksAPI.registerLightBiome(BiomeGenBase.forest);
        CivilMagicksAPI.registerLightBiome(BiomeGenBase.icePlains);
        CivilMagicksAPI.registerLightBiome(BiomeGenBase.plains);
        CivilMagicksAPI.registerLightBiome(BiomeGenBase.jungle);
        CivilMagicksAPI.registerLightBiome(BiomeGenBase.jungleEdge);
        CivilMagicksAPI.registerLightBiome(BiomeGenBase.jungleHills);
        CivilMagicksAPI.registerLightBiome(BiomeGenBase.birchForest);
        CivilMagicksAPI.registerLightBiome(BiomeGenBase.birchForestHills);
        
        
    }
}
