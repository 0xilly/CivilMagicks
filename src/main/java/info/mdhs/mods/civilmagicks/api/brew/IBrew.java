package info.mdhs.mods.civilmagicks.api.brew;

import info.mdhs.mods.civilmagicks.api.effect.IEffect;
import info.mdhs.mods.civilmagicks.api.mana.ManaType;
import net.minecraft.item.ItemStack;

public interface IBrew
{
    String getName();
    ItemStack getCatalyst();
    ItemStack[] getInputs();
    ManaType[] getManaTypes();
    IEffect effect();
}
