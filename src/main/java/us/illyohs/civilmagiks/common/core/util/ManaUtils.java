/**
 * Copyright (c) 2016, Anthony Anderson(Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright notice, this
 *        list of conditions and the following disclaimer.
 *
 *     * Redistributions in binary form must reproduce the above copyright notice,
 *        this list of conditions and the following disclaimer in the documentation
 *        and/or other materials provided with the distribution.
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

package us.illyohs.civilmagiks.common.core.util;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import us.illyohs.civilmagiks.api.mana.ManaType;

import java.util.HashMap;
import java.util.Random;

public class ManaUtils {

    static HashMap<Type, ManaType> manaTypeReg = new HashMap<Type, ManaType>();


    public static void manaRegInit() {
        setEarth(ManaType.EARTH);
        setFire(ManaType.FIRE);
        setWater(ManaType.WATER);
        setWind(ManaType.WIND);
    }
    /**
     *
     * @param pos
     * @return
     */
    public static BiomeGenBase getBiome(World world, BlockPos pos) {
        return world.getBiomeGenForCoords(pos);
    }

    /**
     *
     * @param biome
     * @return
     */
    public static Type[] getAllBiomeTypesForBiome(BiomeGenBase biome) {
        return BiomeDictionary.getTypesForBiome(biome);
    }

    public static Type getRandomTypeFromBiome(World world,BlockPos pos) {
        Type[] tupe = getAllBiomeTypesForBiome(getBiome(world, pos));
        Random random = new Random();
        int index = random.nextInt(tupe.length);
        return tupe[index];
    }

    public static ManaType getManaTypeFromBiomeType(Type type) {
        return manaTypeReg.get(type);
    }

    public static ManaType getManaFromPos(World world, BlockPos pos) {
        return getManaTypeFromBiomeType(getRandomTypeFromBiome(world, pos));
    }

    private static void setWind(ManaType wind) {
        manaTypeReg.put(Type.SPARSE, wind);
        manaTypeReg.put(Type.DRY, wind);
        manaTypeReg.put(Type.SPOOKY, wind);
        manaTypeReg.put(Type.DEAD, wind);
        manaTypeReg.put(Type.HILLS, wind);
        manaTypeReg.put(Type.MOUNTAIN, wind);
    }

    private static void setWater(ManaType water) {
        manaTypeReg.put(Type.WET, water);
        manaTypeReg.put(Type.COLD, water);
        manaTypeReg.put(Type.BEACH, water);
        manaTypeReg.put(Type.OCEAN, water);
        manaTypeReg.put(Type.RIVER, water);
        manaTypeReg.put(Type.WATER, water);
    }

    private static void setEarth(ManaType earth) {
        manaTypeReg.put(Type.DENSE, earth);
        manaTypeReg.put(Type.SAVANNA, earth);
        manaTypeReg.put(Type.CONIFEROUS, earth);
        manaTypeReg.put(Type.JUNGLE, earth);
        manaTypeReg.put(Type.DENSE, earth);
        manaTypeReg.put(Type.LUSH, earth);
        manaTypeReg.put(Type.FOREST, earth);
        manaTypeReg.put(Type.PLAINS, earth);

    }

    private static void setFire(ManaType fire) {
        manaTypeReg.put(Type.HOT, fire);
        manaTypeReg.put(Type.NETHER, fire);
        manaTypeReg.put(Type.MESA, fire);
        manaTypeReg.put(Type.SANDY, fire);
        manaTypeReg.put(Type.WASTELAND, fire);
    }

}
