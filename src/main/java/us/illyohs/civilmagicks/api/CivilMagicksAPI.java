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

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.Fluid;

import us.illyohs.civilmagicks.api.civilregistry.CivilObject;
import us.illyohs.civilmagicks.api.civilregistry.CivilRegistry;
import us.illyohs.civilmagicks.api.civilregistry.CivilStatus;
import us.illyohs.civilmagicks.api.mana.BiomeManaRegistry;
import us.illyohs.civilmagicks.api.mana.ManaType;
import us.illyohs.civilmagicks.api.writ.WritBase;

public class CivilMagicksAPI {

    public static ArmorMaterial             armorCivil = EnumHelper.addArmorMaterial("CIVILARMOR", null, 50, new int[]{4, 6, 6, 4}, 25);
    //    public static ArrayList<Writ> writReg = new ArrayList<Writ>();
    public static HashMap<String, WritBase> writReg    = new HashMap<String, WritBase>();

    private static void registerObjectStatus(Object object, int meta, CivilStatus civilstatus) {
        if (object instanceof Block || object instanceof Item || object instanceof Fluid) {
            CivilRegistry.civilReg.put(new CivilObject(object, meta), civilstatus);
        } else {
            throw new IllegalArgumentException();
        }

    }

    private static void registerManaBiome(BiomeGenBase biome, ManaType type) {
        BiomeManaRegistry.biomeManaRegistry.put(biome, type);
    }

    /**
     * Adds a writ/spell to the base item
     * @param writ
     */
    public static void registerWrit(String name, WritBase writ) {
//        writReg.add(new Writ(name, writ));
        writReg.put(name, writ);
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
     * Register a biome to generate light mana
     * @param biome
     */
    public static void registerLightBiome(BiomeGenBase biome) {
        registerManaBiome(biome, ManaType.LIGHT);
    }

    /**
     * Register a biome to generate dark mana
     * @param biome
     */
    public static void registerDarkBiome(BiomeGenBase biome) {
        registerManaBiome(biome, ManaType.DARK);
    }

    /**
     * Register a biome to generate neutral mana
     * @param biome
     */
    public static void registerNeutralBiome(BiomeGenBase biome) {
        registerManaBiome(biome, ManaType.NEUTRAL);
    }
    
    /**
     * 
     * @param biome The biome were you want to get the mana from
     * @return ManaType
     */
    public static ManaType getManaTypeFromBiome(BiomeGenBase biome) {
        if(!BiomeManaRegistry.biomeManaRegistry.containsKey(biome)) {
            return ManaType.NEUTRAL;
        }
        return BiomeManaRegistry.biomeManaRegistry.get(biome);
    }
    
    public static CivilStatus getStCivilStatus(Object object) {
        return CivilRegistry.civilReg.get(object);
        
    }
    
//    public static ArrayList<Writ> getWritList() {
//        return writReg;
//    }
    
}
