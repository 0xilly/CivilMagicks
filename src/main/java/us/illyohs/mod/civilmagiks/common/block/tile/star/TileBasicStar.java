package us.illyohs.mod.civilmagiks.common.block.tile.star;

import net.minecraft.nbt.NBTTagCompound;
import us.illyohs.mod.civilmagiks.api.mana.ManaType;
import us.illyohs.mod.civilmagiks.api.tile.TileNode;
import us.illyohs.mod.civilmagiks.common.core.helper.BiomaHelper;

public class TileBasicStar extends TileNode {


    public TileBasicStar() {

    }

    @Override
    public void update() {

    }

    @Override
    public void readFromModNBT(NBTTagCompound bNBT) {

    }

    @Override
    public void writeToModNBT(NBTTagCompound bNBT) {

    }

    @Override
    public ManaType canAcceptManaType() {
        return BiomaHelper.getManaType(getWorld(), getPos());
    }
}
