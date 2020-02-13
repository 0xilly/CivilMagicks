package info.mdhs.mods.civilmagicks.common.util

import net.minecraftforge.common.BiomeDictionary
import net.minecraftforge.common.BiomeDictionary.Type
import net.minecraftforge.registries.{IForgeRegistry, RegistryManager}

import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import net.minecraft.world.biome.Biome

import info.mdhs.mods.civilmagicks.api.mana.ManaType
import java.util

import scala.util.Random

object BiomeManaLocator {

  def getRandomManaType(biome: Biome): ManaType = {
    val mana: util.List[ManaType] = new util.ArrayList[ManaType](getManaTypes(biome))

    val rand = new Random().nextInt(mana.size() - 1)

    mana.get(rand)
  }

  def getRandomManaType(world: World, pos: BlockPos): ManaType = {
    val getBiomeManager = world.getBiomeManager
    val getBiome        = getBiomeManager.getBiome(pos)

    getRandomManaType(getBiome)
  }

  def getManaTypes(biome: Biome): util.Set[ManaType] = {
    val biomeTypes: util.Set[Type]          = BiomeDictionary.getTypes(biome)
    val manaTypes: IForgeRegistry[ManaType] = RegistryManager.ACTIVE.getRegistry(classOf[ManaType])
    val manaSet: util.Set[ManaType]         = new util.HashSet[ManaType]()

    biomeTypes.forEach(bType =>
      manaTypes.forEach(mType =>
        mType.getBiomeTypes.foreach(mtbType => {
          if (bType == mtbType) {
            manaSet.add(mType)
          }
        })))

    manaSet
  }
}
