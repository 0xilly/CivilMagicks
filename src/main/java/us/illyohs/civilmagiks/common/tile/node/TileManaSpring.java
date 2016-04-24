package us.illyohs.civilmagiks.common.tile.node;

import net.minecraft.nbt.NBTTagCompound;

import net.minecraft.util.ITickable;
import us.illyohs.civilmagiks.api.mana.ManaType;
import us.illyohs.civilmagiks.common.core.util.ManaUtils;
import us.illyohs.civilmagiks.common.core.util.tile.BaseTile;

public class TileManaSpring extends BaseTile implements ITickable {

    public ManaType manaType;

    @Override
    public void update() {
        if (!worldObj.isRemote) {
//            System.out.println(getManaType().getLocalizedName());
        }
    }

    @Override
    public void readFromModNBT(NBTTagCompound mNBT) {

    }

    @Override
    public void writeToModNBT(NBTTagCompound mNBT) {
        mNBT.setString("manatype", getManaType().getLocalizedName());
    }

    public ManaType getManaType() {
        return ManaUtils.getManaFromPos(getWorld(), getPos());
    }

}
