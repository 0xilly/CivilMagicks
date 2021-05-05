package io.ansan.mods.civilmagicks.common.item;

public enum BrewTiers
{
    POOR(1),
    ADEQUATE(3),
    GREAT(9);

    private int modifier;

    BrewTiers(int modifier)
    {
        modifier = this.modifier;
    }

    public int getModifier()
    {
        return modifier;
    }
}
