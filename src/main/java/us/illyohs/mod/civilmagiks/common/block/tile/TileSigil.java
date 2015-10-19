package us.illyohs.mod.civilmagiks.common.block.tile;

import us.illyohs.mod.civilmagiks.api.tile.TileBase;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;

public class TileSigil extends TileBase {

    @Override
    public void updateTB() {

    }

    public void readFromModNBT(NBTTagCompound bNBT) {

    }

    @Override
    public void writeToModNBT(NBTTagCompound bNBT) {

    }

    @Override
    public void onModDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {

    }
}
