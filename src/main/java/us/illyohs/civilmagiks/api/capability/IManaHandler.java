package us.illyohs.civilmagiks.api.capability;

import us.illyohs.civilmagiks.api.mana.Mana;

public interface IManaHandler {

    int getMaxStorage();

    int getCurrentMana();

    Mana getManaType();

}
