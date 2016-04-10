package us.illyohs.civilmagiks.api.capability;

import us.illyohs.civilmagiks.api.mana.ManaType;

public interface IManaHandler {

    int getMaxStorage();

    int getCurrentMana();

    ManaType getManaType();

}
