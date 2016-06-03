package us.illyohs.civilmagiks.common.core.capability.handler;

import us.illyohs.civilmagiks.api.capability.IManaHandler;
import us.illyohs.civilmagiks.api.mana.ManaType;

public class ManaHandler implements IManaHandler {

    private int currentMana, maxMana;
    private ManaType type;

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    public void addMana(int add) {
        if (getCurrentMana() + add > maxMana) {
            this.currentMana = getCurrentMana() + 0;
        } else if (getCurrentMana() + add <= maxMana) {
            this.currentMana = getCurrentMana() + add;
        }
    }

    @Override
    public int getMaxStorage() {
        return maxMana;
    }

    @Override
    public int getCurrentMana() {
        return currentMana;
    }

    public void setType(ManaType type) {
        this.type = type;
    }

    @Override
    public ManaType getManaType() {
        return ManaType.GREY;
    }

}
