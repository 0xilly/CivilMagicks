package us.illyohs.civilmagiks.api.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.util.IChatComponent;

/**
 * Note this class is based off of Vazkii's TileSimpleInventory see http://git.io/vCisi
 * for her implementation.
 */
public class TileBaseInventory extends TileBase implements IInventory {

    ItemStack[] inv = new ItemStack[getSizeInventory()];

    @Override
    public void updateTB() {

    }

    @Override
    public void readFromModNBT(NBTTagCompound bNBT) {
        NBTTagList tag = bNBT.getTagList("Items", 10);
        inv = new ItemStack[getSizeInventory()];

    }

    @Override
    public void writeToModNBT(NBTTagCompound bNBT) {

    }

    @Override
    public int getSizeInventory() {
        return 0;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return null;
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int index) {
        return null;
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {

    }

    @Override
    public int getInventoryStackLimit() {
        return 0;
    }

    @Override
    public void markDirty() {

    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return false;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return false;
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void setField(int id, int value) {

    }

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public String getCommandSenderName() {
        return null;
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public IChatComponent getDisplayName() {
        return null;
    }

    @Override
    public void onModDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        // TODO Auto-generated method stub
        
    }
}
