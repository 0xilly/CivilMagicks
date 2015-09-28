package us.illyohs.mod.civilmagiks.api.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;

public abstract class TileBase extends TileEntity implements IUpdatePlayerListBox{

    public abstract void updateTB();

    public abstract void readFromModNBT(NBTTagCompound bNBT);
    
    public abstract void writeToModNBT(NBTTagCompound bNBT);
    
    public abstract void onModDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt);


    public void update(){
        updateTB();
    }
    
    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        readFromModNBT(nbt);
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        writeToModNBT(nbt);
    }
    
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        super.onDataPacket(net, pkt);
        onModDataPacket(net, pkt);
    }

}
