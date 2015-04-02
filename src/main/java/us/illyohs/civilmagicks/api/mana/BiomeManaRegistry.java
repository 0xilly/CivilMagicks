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

    public static HashMap<BiomeGenBase, ManaType> biomeManaRegistry = new HashMap<BiomeGenBase, ManaType>();

    public BiomeManaRegistry() {
        darkManaBiomes(ManaType.DARK);
        neutralManaBiomes(ManaType.NEUTRAL);
        lightManaBiome(ManaType.LIGHT);
    }

    private void lightManaBiome(ManaType light) {
        biomeManaRegistry.put(BiomeGenBase.forest, light);
        biomeManaRegistry.put(BiomeGenBase.icePlains, light); //should this bea dark
        biomeManaRegistry.put(BiomeGenBase.plains, light);
        biomeManaRegistry.put(BiomeGenBase.jungle, light);
        biomeManaRegistry.put(BiomeGenBase.jungleEdge, light);
        biomeManaRegistry.put(BiomeGenBase.jungleHills, light);
        biomeManaRegistry.put(BiomeGenBase.birchForest, light);
        biomeManaRegistry.put(BiomeGenBase.birchForestHills, light);
    }

    private void neutralManaBiomes(ManaType neutral) {
        biomeManaRegistry.put(BiomeGenBase.extremeHills, neutral);
        biomeManaRegistry.put(BiomeGenBase.extremeHillsEdge, neutral);
        biomeManaRegistry.put(BiomeGenBase.extremeHillsPlus, neutral);
        biomeManaRegistry.put(BiomeGenBase.megaTaiga, neutral);
        biomeManaRegistry.put(BiomeGenBase.megaTaigaHills, neutral);
        biomeManaRegistry.put(BiomeGenBase.stoneBeach, neutral);
        biomeManaRegistry.put(BiomeGenBase.ocean, neutral);
        biomeManaRegistry.put(BiomeGenBase.deepOcean, neutral);
        biomeManaRegistry.put(BiomeGenBase.frozenOcean, neutral); //Should this be Dark?
        biomeManaRegistry.put(BiomeGenBase.river, neutral);
        biomeManaRegistry.put(BiomeGenBase.frozenRiver, neutral); //Should this be Dark?
        biomeManaRegistry.put(BiomeGenBase.beach, neutral);
        biomeManaRegistry.put(BiomeGenBase.coldBeach, neutral); // Should this be Dark?
        biomeManaRegistry.put(BiomeGenBase.sky, neutral);
        biomeManaRegistry.put(BiomeGenBase.mushroomIsland, neutral);
        biomeManaRegistry.put(BiomeGenBase.mushroomIslandShore, neutral);
        biomeManaRegistry.put(BiomeGenBase.desert, neutral);
        biomeManaRegistry.put(BiomeGenBase.desertHills, neutral);
        biomeManaRegistry.put(BiomeGenBase.savanna, neutral);
        biomeManaRegistry.put(BiomeGenBase.savannaPlateau, neutral);
        biomeManaRegistry.put(BiomeGenBase.mesa, neutral);
        biomeManaRegistry.put(BiomeGenBase.mesaPlateau, neutral);
        biomeManaRegistry.put(BiomeGenBase.mesaPlateau_F, neutral);
        
    }

    private void darkManaBiomes(ManaType dark) {
        biomeManaRegistry.put(BiomeGenBase.coldTaiga, dark);
        biomeManaRegistry.put(BiomeGenBase.coldTaigaHills, dark);
        biomeManaRegistry.put(BiomeGenBase.hell, dark);
        biomeManaRegistry.put(BiomeGenBase.taiga, dark);
        biomeManaRegistry.put(BiomeGenBase.swampland, dark);
        biomeManaRegistry.put(BiomeGenBase.roofedForest, dark);
        biomeManaRegistry.put(BiomeGenBase.iceMountains, dark);
    }
    
}
