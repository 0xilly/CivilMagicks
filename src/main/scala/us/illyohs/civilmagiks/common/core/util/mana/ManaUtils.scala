/**
 * Copyright (c) 2016, Anthony Anderson<Illyohs>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
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

package us.illyohs.civilmagiks.common.core.util.mana

import java.util.{HashMap, Random}

import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import net.minecraft.world.biome.Biome

import net.minecraftforge.common.BiomeDictionary
import net.minecraftforge.common.BiomeDictionary.Type

import us.illyohs.civilmagiks.api.mana.Mana

object ManaUtils {
//  private val manaTypeReg: HashMap[BiomeDictionary.Type, ManaTypes] = new HashMap[BiomeDictionary.Type, ManaTypes]
//
//  def manaRegInit() {
//    setEarth(Man.EARTH)
//    setFire(ManaTypes.FIRE)
//    setWater(ManaTypes.WATER)
//    setWind(ManaTypes.WIND)
//  }
//
//  def getBiome(world: World, pos: BlockPos): Biome = {
//    world.getBiome(pos)
//  }
//
//  def getAllBiomeTypesForBiome(biome: Biome): Array[BiomeDictionary.Type] = {
//    BiomeDictionary.getTypesForBiome(biome)
//  }
//
//  def getRandomTypeFromBiome(world: World, pos: BlockPos): BiomeDictionary.Type = {
//    val tupe: Array[BiomeDictionary.Type] = getAllBiomeTypesForBiome(getBiome(world, pos))
//    val random: Random = new Random
//    val index: Int = random.nextInt(tupe.length)
//    tupe(index)
//  }
//
//  def getManaTypeFromBiomeType(`type`: BiomeDictionary.Type): ManaTypes = {
//    manaTypeReg.get(`type`)
//  }
//
//  def getManaFromPos(world: World, pos: BlockPos): ManaTypes = {
//    if (getManaTypeFromBiomeType(getRandomTypeFromBiome(world, pos)) == null) {
//      ManaTypes.GREY
//    } else {
//      getManaTypeFromBiomeType(getRandomTypeFromBiome(world, pos))
//    }
//  }
//
//  private def setWind(wind: ManaTypes) {
//    manaTypeReg.put(Type.SPARSE, wind)
//    manaTypeReg.put(Type.DRY, wind)
//    manaTypeReg.put(Type.SPOOKY, wind)
//    manaTypeReg.put(Type.DEAD, wind)
//    manaTypeReg.put(Type.HILLS, wind)
//    manaTypeReg.put(Type.MOUNTAIN, wind)
//  }
//
//  private def setWater(water: ManaTypes) {
//    manaTypeReg.put(Type.WET, water)
//    manaTypeReg.put(Type.COLD, water)
//    manaTypeReg.put(Type.BEACH, water)
//    manaTypeReg.put(Type.OCEAN, water)
//    manaTypeReg.put(Type.RIVER, water)
//    manaTypeReg.put(Type.WATER, water)
//    manaTypeReg.put(Type.SWAMP, water)
//  }
//
//  private def setEarth(earth: ManaTypes) {
//    manaTypeReg.put(Type.DENSE, earth)
//    manaTypeReg.put(Type.SAVANNA, earth)
//    manaTypeReg.put(Type.CONIFEROUS, earth)
//    manaTypeReg.put(Type.JUNGLE, earth)
//    manaTypeReg.put(Type.DENSE, earth)
//    manaTypeReg.put(Type.LUSH, earth)
//    manaTypeReg.put(Type.FOREST, earth)
//    manaTypeReg.put(Type.PLAINS, earth)
//    manaTypeReg.put(Type.SWAMP, earth)
//  }
//
//  private def setFire(fire: ManaTypes) {
//    manaTypeReg.put(Type.HOT, fire)
//    manaTypeReg.put(Type.NETHER, fire)
//    manaTypeReg.put(Type.MESA, fire)
//    manaTypeReg.put(Type.SANDY, fire)
//    manaTypeReg.put(Type.WASTELAND, fire)
//  }
}
