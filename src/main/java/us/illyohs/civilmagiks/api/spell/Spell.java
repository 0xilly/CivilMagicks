package us.illyohs.civilmagiks.api.spell;

import net.minecraft.item.EnumRarity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;
import us.illyohs.civilmagiks.api.CivilMagicksApi;
import us.illyohs.civilmagiks.api.mana.Mana;

/**
 * Created by illyohs on 4/24/16.
 */
public abstract class Spell implements ISpell, INBTSerializable<NBTTagCompound>
{

    String              name;
    Mana                mana;
    boolean             playerBound;
    int                 cost;
    int                 duration;
    EnumRarity          rarity;

    @Override
    public String name()
    {
        return this.name;
    }

    @Override
    public Mana manaType()
    {
        return this.mana;
    }

    @Override
    public boolean playerBound()
    {
        return false;
    }

    @Override
    public int cost()
    {
        return 0;
    }

    @Override
    public int duration()
    {
        return 0;
    }

    @Override
    public EnumRarity rarity()
    {
        return null;
    }

    @Override
    public NBTTagCompound serializeNBT()
    {
        NBTTagCompound tag = new NBTTagCompound();
        tag.setString("name", name());
        tag.setString("mana", manaType().getKey());
        tag.setBoolean("isPlayerBound", playerBound());
        tag.setInteger("cost", cost());
        tag.setString("rarity", rarity().rarityName);
        return tag;
    }

    @Override
    public void deserializeNBT(NBTTagCompound tag)
    {

        name        = tag.getString("name");
        playerBound = tag.getBoolean("isPlayerBound");
        cost        = tag.getInteger("cost");
        for (int i = 0; i < CivilMagicksApi.MANA.getValues().size(); ++i)
        {
            Mana supmana = CivilMagicksApi.MANA.getValues().get(i);
            if (supmana.getKey() == tag.getString("mana"))
            {
                mana = supmana;
            }
        }
        rarity      = EnumRarity.valueOf(tag.getString("rarity"));
    }
}
