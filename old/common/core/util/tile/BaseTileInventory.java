package us.illyohs.civilmagiks.common.core.util.tile;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.ItemStackHandler;

/**
 * I stole this from williewillus see https://git.io/vV0rC
 * This class is NOT LICENCED under the BSD2
 */
public abstract class BaseTileInventory extends BaseTile {

    protected SimpleItemStackHandler iHandler = createItemHandler();

    public void readFromModNBT(NBTTagCompound tagCompound) {
        iHandler = createItemHandler();
        iHandler.deserializeNBT(tagCompound);
    }

    public NBTTagCompound writeToModNBT(NBTTagCompound tag) {
        //tagCompound.merge(iHandler.serializeNBT());
        return tag.merge(iHandler.serializeNBT());
    }

	public abstract int getSizeInventory();

	protected SimpleItemStackHandler createItemHandler() {
		return new SimpleItemStackHandler(this, true);
	}

	public IItemHandlerModifiable getItemHandler() {
		return iHandler;
	}

	@Override
	public boolean hasCapability(Capability<?> cap, EnumFacing side) {
		return cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY || super.hasCapability(cap, side);
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> T getCapability(Capability<T> cap, EnumFacing side) {
		if(cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
			return (T) iHandler;
		return super.getCapability(cap, side);
	}
    protected static class SimpleItemStackHandler extends ItemStackHandler {

		private final boolean allowWrite;
		private final BaseTileInventory tile;

		public SimpleItemStackHandler(BaseTileInventory inv, boolean allowWrite) {
			super(inv.getSizeInventory());
			this.allowWrite = allowWrite;
			this.tile = inv;
		}

		@Override
		public ItemStack insertItem(int slot, ItemStack stack, boolean simulate) {
			if(allowWrite) {
				return super.insertItem(slot, stack, simulate);
			} else return stack;
		}

		@Override
		public ItemStack extractItem(int slot, int amount, boolean simulate) {
			if(allowWrite) {
				return super.extractItem(slot, amount, simulate);
			} else return null;
		}

		@Override
		public void onContentsChanged(int slot) {
			tile.markDirty();
		}
	}
}
