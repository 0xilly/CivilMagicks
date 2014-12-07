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
package us.illyohs.civilmagicks.api;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fluids.Fluid;

import us.illyohs.civilmagicks.api.civilregistry.CivilObject;
import us.illyohs.civilmagicks.api.civilregistry.CivilStatus;
import us.illyohs.civilmagicks.api.mana.BiomeStatus;
import us.illyohs.civilmagicks.api.mana.ManaType;

public class CivilMagicksAPI {
    
    
    public static HashMap<Object, CivilObject> civilRegistry = new HashMap<Object, CivilObject>();
    public static Set<BiomeStatus> biomeManaRegesty = new HashSet<BiomeStatus>();

    private static void registerObjectStatus(Object object, int meta, CivilStatus civilstatus) {
        if (object instanceof Block || object instanceof Item || object instanceof Fluid) {
            civilRegistry.put(civilstatus, new CivilObject(object, meta));
        } else {
            throw new IllegalArgumentException();
        }

    }

    private static void registerManaBiome(BiomeGenBase biome, ManaType type) {
        biomeManaRegesty.add(new BiomeStatus(biome, type));
    }
    
    /**
     * This Registers blocks into the civilregistry as civilized 
     * @param block
     * @param meta
     */
    public static void registerCivilizedBlock(Block block, int meta) {
        registerObjectStatus(block, meta, CivilStatus.CIVILIZED);
    }

    /**
     * This Registers blocks into the civilregistry as uncivilized 
     * @param block
     * @param meta
     */
    public static void registerUnCivilizedBlock(Block block, int meta) {
        registerObjectStatus(block, meta, CivilStatus.UNCIVILIZED);
    }
    
    /**
     * This Registers items into the civilregistry as civilized
     * @param item
     * @param meta
     */
    public static void registerCivilizedItem(Item item, int meta) {
        registerObjectStatus(item, meta, CivilStatus.CIVILIZED);
    }
    
    /**
     * This Registers items into the civilregistry as civilized
     * @param item
     * @param meta
     */
    public static void registerUnCivilizedItem(Item item, int meta) {
        registerObjectStatus(item, meta, CivilStatus.UNCIVILIZED);
    }

    
    /**
     * 
     */
    public static void registerLightBiome(BiomeGenBase biome) {
        registerManaBiome(biome, ManaType.LIGHT);
    }
    
    /**
     * 
     */
    public static void registerDarkBiome(BiomeGenBase biome) {
        registerManaBiome(biome, ManaType.DARK);
    }
    
    /**
     * 
     */
    public static void registerNeutralBiome(BiomeGenBase biome) {
        registerManaBiome(biome, ManaType.NEUTRAL);
    }
    
}
