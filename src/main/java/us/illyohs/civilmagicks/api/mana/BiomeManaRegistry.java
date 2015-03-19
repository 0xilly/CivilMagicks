/*
 * Copyright (c) 2014, Anthony Anderson(Lord Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
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

package us.illyohs.civilmagicks.api.mana;

import net.minecraft.world.biome.BiomeGenBase;

import java.util.HashMap;

public class BiomeManaRegistry {

    public static HashMap<ManaType, BiomeGenBase> biomeManaRegistry = new HashMap<ManaType, BiomeGenBase>();

    public BiomeManaRegistry() {
        darkManaBiomes(ManaType.DARK);
        neutralManaBiomes(ManaType.NEUTRAL);
        lightManaBiome(ManaType.LIGHT);
    }

    private void lightManaBiome(ManaType light) {
        biomeManaRegistry.put(light, BiomeGenBase.forest);
        biomeManaRegistry.put(light, BiomeGenBase.icePlains); //should this bea dark
        biomeManaRegistry.put(light, BiomeGenBase.plains);
        biomeManaRegistry.put(light, BiomeGenBase.jungle);
        biomeManaRegistry.put(light, BiomeGenBase.jungleEdge);
        biomeManaRegistry.put(light, BiomeGenBase.jungleHills);
        biomeManaRegistry.put(light, BiomeGenBase.birchForest);
        biomeManaRegistry.put(light, BiomeGenBase.birchForestHills);
    }

    private void neutralManaBiomes(ManaType neutral) {
        biomeManaRegistry.put(neutral, BiomeGenBase.extremeHills);
        biomeManaRegistry.put(neutral, BiomeGenBase.extremeHillsEdge);
        biomeManaRegistry.put(neutral, BiomeGenBase.extremeHillsPlus);
        biomeManaRegistry.put(neutral, BiomeGenBase.megaTaiga);
        biomeManaRegistry.put(neutral, BiomeGenBase.megaTaigaHills);
        biomeManaRegistry.put(neutral, BiomeGenBase.stoneBeach);
        biomeManaRegistry.put(neutral, BiomeGenBase.ocean);
        biomeManaRegistry.put(neutral, BiomeGenBase.deepOcean);
        biomeManaRegistry.put(neutral, BiomeGenBase.frozenOcean); //Should this be Dark?
        biomeManaRegistry.put(neutral, BiomeGenBase.river);
        biomeManaRegistry.put(neutral, BiomeGenBase.frozenRiver); //Should this be Dark?
        biomeManaRegistry.put(neutral, BiomeGenBase.beach);
        biomeManaRegistry.put(neutral, BiomeGenBase.coldBeach); // Should this be Dark?
        biomeManaRegistry.put(neutral, BiomeGenBase.sky);
        biomeManaRegistry.put(neutral, BiomeGenBase.mushroomIsland);
        biomeManaRegistry.put(neutral, BiomeGenBase.mushroomIslandShore);
        biomeManaRegistry.put(neutral, BiomeGenBase.desert);
        biomeManaRegistry.put(neutral, BiomeGenBase.desertHills);
        biomeManaRegistry.put(neutral, BiomeGenBase.savanna);
        biomeManaRegistry.put(neutral, BiomeGenBase.savannaPlateau);
        biomeManaRegistry.put(neutral, BiomeGenBase.mesa);
        biomeManaRegistry.put(neutral, BiomeGenBase.mesaPlateau);
        biomeManaRegistry.put(neutral, BiomeGenBase.mesaPlateau_F);
        
    }

    private void darkManaBiomes(ManaType dark) {
        biomeManaRegistry.put(dark, BiomeGenBase.coldTaiga);
        biomeManaRegistry.put(dark, BiomeGenBase.coldTaigaHills);
        biomeManaRegistry.put(dark, BiomeGenBase.hell);
        biomeManaRegistry.put(dark, BiomeGenBase.taiga);
        biomeManaRegistry.put(dark, BiomeGenBase.swampland);
        biomeManaRegistry.put(dark, BiomeGenBase.roofedForest);
        biomeManaRegistry.put(dark, BiomeGenBase.iceMountains);
    }
}
