package io.ansan.mods.civilmagicks.api.mana;

import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.registries.ForgeRegistryEntry;

public class ManaType extends ForgeRegistryEntry<ManaType>
{
    private String name;
    private int color;
    private Type[] biomeTypes;

    public ManaType(String name, int color, Type[] biomeTypes)
    {
        this.name = name;
        this.color = color;
        this.biomeTypes = biomeTypes;
    }

    public String getName()
    {
        return name;
    }

    public int getColor()
    {
        return color;
    }

    public Type[] getBiomeTypes()
    {
        return biomeTypes;
    }
}
