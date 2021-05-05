package io.ansan.mods.civilmagicks.api;

import io.ansan.mods.civilmagicks.api.brew.IBrewRegistry;
import io.ansan.mods.civilmagicks.api.civil.ICivilRegistry;
import io.ansan.mods.civilmagicks.api.effect.IEffectRegistry;
import io.ansan.mods.civilmagicks.api.sigil.ISigilRegistry;

public interface ICivilMagicksAPI
{
    IBrewRegistry getBrewRegistry();

    IEffectRegistry getEffectsRegistry();

    ICivilRegistry getCivilRegistry();

    ISigilRegistry getSigilRegistry();
}
