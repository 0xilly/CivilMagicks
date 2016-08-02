package us.illyohs.civilmagiks.api.spell;

import net.minecraft.item.EnumRarity;
import us.illyohs.civilmagiks.api.mana.Mana;

/**
 * Created by illyohs on 7/26/16.
 */
public interface ISpell
{
    String name();

    Mana manaType();

    boolean playerBound();

    int cost();

    int duration();

    EnumRarity rarity();

    AbstractEffect[] effect();


}
