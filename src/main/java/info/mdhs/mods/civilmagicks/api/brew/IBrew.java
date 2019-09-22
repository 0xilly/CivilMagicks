package info.mdhs.mods.civilmagicks.api.brew;

import info.mdhs.mods.civilmagicks.api.effect.IEffect;
import info.mdhs.mods.civilmagicks.api.mana.ManaType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public interface IBrew
{
    ResourceLocation getKey();

    ItemStack getCatalyst();

    ItemStack[] getInputs();

    ManaType[] getManaTypes();

    IEffect effect();
}
