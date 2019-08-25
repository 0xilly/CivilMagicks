package info.mdhs.mods.civilmagicks.api;

import info.mdhs.mods.civilmagicks.api.brew.IBrewRegistry;
import info.mdhs.mods.civilmagicks.api.effect.IEffectRegistry;

public interface ICivilMagicksAPI
{
    IBrewRegistry getBrewRegistry();

    IEffectRegistry getEffectsRegistry();
}
