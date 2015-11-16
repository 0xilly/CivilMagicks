package us.illyohs.civilmagiks.common.core.util;

import us.illyohs.civilmagiks.api.mana.BiomeManaRegistry;
import us.illyohs.civilmagiks.api.mana.ManaType;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeUtils {

    public static  ManaType getManaType(World world, BlockPos pos) {
       BiomeGenBase biome = world.getBiomeGenForCoords(pos);
        if (!BiomeManaRegistry.biomeManaRegistry.containsKey(biome)) {
            return ManaType.NEUTRAL;
        } else {
            return BiomeManaRegistry.biomeManaRegistry.get(biome);
        }
    }
}
