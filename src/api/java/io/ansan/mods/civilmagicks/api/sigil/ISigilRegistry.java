package io.ansan.mods.civilmagicks.api.sigil;

import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.Optional;

public interface ISigilRegistry
{
    List<ISigil> getSigils();

    Optional<ISigil> getSigilByKey(ResourceLocation key);
}
