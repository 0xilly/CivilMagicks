package us.illyohs.civilmagiks.common.tile.node;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;

import net.minecraft.util.ITickable;
import us.illyohs.civilmagiks.api.mana.ManaType;
import us.illyohs.civilmagiks.common.core.util.WorldUtils;
import us.illyohs.libilly.tile.BaseTile;

public class TileManaWell extends BaseTile implements ITickable {

    public ManaType manaType;

    @Override
    public void update() {

    }

    @Override
    public void readFromModNBT(NBTTagCompound mNBT) {

    }

    @Override
    public void writeToModNBT(NBTTagCompound mNBT) {

    }



    public ManaType getManaType() {
        return WorldUtils.getManaFromPos(getWorld(), getPos());
    }

}
