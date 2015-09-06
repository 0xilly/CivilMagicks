package us.illyohs.civilmagicks.api.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import us.illyohs.civilmagicks.api.mana.IManaBlock;
import us.illyohs.civilmagicks.api.mana.ManaType;

/**
 * This is the base class for all nodes within the ManaNetwork
 */
public class TileNode extends TileBase implements IUpdatePlayerListBox, IManaBlock {

    int mana;
    boolean isLocked;

    @Override
    public void update() {

    }
    
    @Override
    public void onModDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {

    }
    
    @Override
    public void readFromModNBT(NBTTagCompound bNBT) {
        mana = bNBT.getInteger("mana");
        isLocked = bNBT.getBoolean("isManalocked");
    }
    
    @Override
    public void writeToModNBT(NBTTagCompound bNBT) {
        bNBT.setInteger("mana", mana);
        bNBT.setBoolean("isManalocked", isManaLocked());
    }

    @Override
    public int addMana(int add) {
        return getCurrentMana() + add;
    }

    @Override
    public int subtractMana(int subtract) {
        return getCurrentMana() - subtract;
    }

    @Override
    public int getCurrentMana() {
        return mana;
    }

    @Override
    public boolean isManaLocked() {
        return false;
    }

    @Override
    public ManaType canAcceptManaType() {
        return null;
    }

}
