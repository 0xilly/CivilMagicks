package us.illyohs.civilmagicks.api.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import us.illyohs.civilmagicks.api.mana.IManaBlock;
import us.illyohs.civilmagicks.api.mana.ManaType;

/**
 * Created by anthony on 9/3/15.
 */
public class TileNode extends TileBase implements IUpdatePlayerListBox, IManaBlock{


    @Override
    public void readFromModNBT(NBTTagCompound bNBT) {

    }

    @Override
    public void writeToModNBT(NBTTagCompound bNBT) {

    }

    @Override
    public void update() {

    }

    @Override
    public int addMana(int mana) {
        return 0;
    }

    @Override
    public int currentMana(int current) {
        return 0;
    }

    @Override
    public int getCurrentMana() {
        return 0;
    }

    @Override
    public ManaType canAccept() {
        return null;
    }
}
