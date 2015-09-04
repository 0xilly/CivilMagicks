package us.illyohs.civilmagicks.api.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import us.illyohs.civilmagicks.api.mana.IManaBlock;
import us.illyohs.civilmagicks.api.mana.ManaType;

public class TileNode extends TileBase implements IUpdatePlayerListBox, IManaBlock{

    int current;
    
    @Override
    public void update() {

    }
    
    @Override
    public void onModDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        
    }
    
    @Override
    public void readFromModNBT(NBTTagCompound bNBT) {
        
    }
    
    @Override
    public void writeToModNBT(NBTTagCompound bNBT) {
        bNBT.setInteger("mana", 100);
    }

    @Override
    public int addMana(int mana) {
        return getCurrentMana() + mana;
    }

    @Override
    public int getCurrentMana() {
        return current;
    }

    @Override
    public ManaType canAccept() {
        return null;
    }

}
