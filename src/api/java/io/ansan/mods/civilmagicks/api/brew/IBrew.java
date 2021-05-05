package io.ansan.mods.civilmagicks.api.brew;

import io.ansan.mods.civilmagicks.api.effect.IEffect;
import io.ansan.mods.civilmagicks.api.mana.ManaType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public interface IBrew
{
    ResourceLocation getKey();

    ItemStack getCatalyst();

    ItemStack[] getInputs();

    ManaType[] getManaTypes();

    int getColor();

    IEffect effect();
}
