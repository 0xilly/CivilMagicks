package info.mdhs.mods.civilmagicks.api.util;

import info.mdhs.mods.civilmagicks.api.mana.ManaType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Optional;

public class ManaTypes
{
    public static Optional<ManaType> AIR     = Optional.ofNullable(GameRegistry.findRegistry(ManaType.class).getValue(new ResourceLocation("civilmagicks:aer")));
    public static Optional<ManaType> EARTH   = Optional.ofNullable(GameRegistry.findRegistry(ManaType.class).getValue(new ResourceLocation("civilmagicks:terra")));
    public static Optional<ManaType> FIRE    = Optional.ofNullable(GameRegistry.findRegistry(ManaType.class).getValue(new ResourceLocation("civilmagicks:ingus")));
    public static Optional<ManaType> WATER   = Optional.ofNullable(GameRegistry.findRegistry(ManaType.class).getValue(new ResourceLocation("civilmagicks:aqua")));
    public static Optional<ManaType> INERT   = Optional.ofNullable(GameRegistry.findRegistry(ManaType.class).getValue(new ResourceLocation("civilmagicks:inert")));
}
