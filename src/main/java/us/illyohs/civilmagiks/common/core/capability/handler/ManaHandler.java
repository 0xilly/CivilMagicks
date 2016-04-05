package us.illyohs.civilmagiks.common.core.capability.handler;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;
import us.illyohs.civilmagiks.api.capability.IManaHandler;
import us.illyohs.civilmagiks.api.mana.ManaType;

public class ManaHandler implements IManaHandler, INBTSerializable<NBTTagCompound> {

    @Override
    public NBTTagCompound serializeNBT() {
        return null;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {

    }

    @Override
    public int getMaxStorage() {
        return 0;
    }

    @Override
    public int getMana() {
        return 0;
    }

    @Override
    public ManaType getManaType() {
        return null;
    }

    @Override
    public boolean canAcceptMana() {
        return false;
    }
}
