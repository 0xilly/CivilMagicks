package us.illyohs.civilmagiks.common.core.util

import java.util
import java.util.Random

import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import net.minecraft.world.biome.Biome
import net.minecraftforge.common.BiomeDictionary
import net.minecraftforge.common.BiomeDictionary.Type
import us.illyohs.civilmagiks.api.mana.ManaType

object ManaUtils {
  private[util] val manaTypeReg: util.HashMap[BiomeDictionary.Type, ManaType] = new util.HashMap[BiomeDictionary.Type, ManaType]

  def manaRegInit() {
    setEarth(ManaType.EARTH)
    setFire(ManaType.FIRE)
    setWater(ManaType.WATER)
    setWind(ManaType.WIND)
  }

  def getBiome(world: World, pos: BlockPos): Biome = {
    return world.getBiome(pos)
  }

  def getAllBiomeTypesForBiome(biome: Biome): Array[BiomeDictionary.Type] = {
    return BiomeDictionary.getTypesForBiome(biome)
  }

  def getRandomTypeFromBiome(world: World, pos: BlockPos): BiomeDictionary.Type = {
    val tupe: Array[BiomeDictionary.Type] = getAllBiomeTypesForBiome(getBiome(world, pos))
    val random: Random = new Random
    val index: Int = random.nextInt(tupe.length)
    return tupe(index)
  }

  def getManaTypeFromBiomeType(`type`: BiomeDictionary.Type): ManaType = {
    return manaTypeReg.get(`type`)
  }

  def getManaFromPos(world: World, pos: BlockPos): ManaType = {
    if (getManaTypeFromBiomeType(getRandomTypeFromBiome(world, pos)) == null) {
      return ManaType.GREY
    }
    else {
      return getManaTypeFromBiomeType(getRandomTypeFromBiome(world, pos))
    }
  }

  private def setWind(wind: ManaType) {
    manaTypeReg.put(Type.SPARSE, wind)
    manaTypeReg.put(Type.DRY, wind)
    manaTypeReg.put(Type.SPOOKY, wind)
    manaTypeReg.put(Type.DEAD, wind)
    manaTypeReg.put(Type.HILLS, wind)
    manaTypeReg.put(Type.MOUNTAIN, wind)
  }

  private def setWater(water: ManaType) {
    manaTypeReg.put(Type.WET, water)
    manaTypeReg.put(Type.COLD, water)
    manaTypeReg.put(Type.BEACH, water)
    manaTypeReg.put(Type.OCEAN, water)
    manaTypeReg.put(Type.RIVER, water)
    manaTypeReg.put(Type.WATER, water)
    manaTypeReg.put(Type.SWAMP, water)
  }

  private def setEarth(earth: ManaType) {
    manaTypeReg.put(Type.DENSE, earth)
    manaTypeReg.put(Type.SAVANNA, earth)
    manaTypeReg.put(Type.CONIFEROUS, earth)
    manaTypeReg.put(Type.JUNGLE, earth)
    manaTypeReg.put(Type.DENSE, earth)
    manaTypeReg.put(Type.LUSH, earth)
    manaTypeReg.put(Type.FOREST, earth)
    manaTypeReg.put(Type.PLAINS, earth)
    manaTypeReg.put(Type.SWAMP, earth)
  }

  private def setFire(fire: ManaType) {
    manaTypeReg.put(Type.HOT, fire)
    manaTypeReg.put(Type.NETHER, fire)
    manaTypeReg.put(Type.MESA, fire)
    manaTypeReg.put(Type.SANDY, fire)
    manaTypeReg.put(Type.WASTELAND, fire)
  }
}
