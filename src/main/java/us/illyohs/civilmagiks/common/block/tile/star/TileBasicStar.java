package us.illyohs.civilmagiks.common.block.tile.star;

import us.illyohs.civilmagiks.api.mana.ManaType;
import us.illyohs.civilmagiks.api.tile.TileNode;
import us.illyohs.civilmagiks.common.core.util.BiomeUtils;

import net.minecraft.nbt.NBTTagCompound;

public class TileBasicStar extends TileNode {


    public TileBasicStar() {

    }


    @Override
    public void updateTB() {

    }

    @Override
    public void readFromModNBT(NBTTagCompound bNBT) {

    }

    @Override
    public void writeToModNBT(NBTTagCompound bNBT) {

    }

    @Override
    public ManaType canAcceptManaType() {
        return BiomeUtils.getManaType(getWorld(), getPos());
    }
}
