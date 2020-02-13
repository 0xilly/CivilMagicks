package info.mdhs.mods.civilmagicks.api;

import info.mdhs.mods.civilmagicks.api.brew.IBrewRegistry;
import info.mdhs.mods.civilmagicks.api.civil.ICivilRegistry;
import info.mdhs.mods.civilmagicks.api.effect.IEffectRegistry;
import info.mdhs.mods.civilmagicks.api.sigil.ISigilRegistry;

public interface ICivilMagicksAPI
{
    IBrewRegistry getBrewRegistry();

    IEffectRegistry getEffectsRegistry();

    ICivilRegistry getCivilRegistry();

    ISigilRegistry getSigilRegistry();
}
