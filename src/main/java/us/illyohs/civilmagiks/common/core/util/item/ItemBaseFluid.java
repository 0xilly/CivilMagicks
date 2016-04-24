package us.illyohs.civilmagiks.common.core.util.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidContainerItem;

/**
 * Mostly opied from net.minecraftforge.fluids.ItemFluidContainer
 * removed itemID and extended BaseMod
 */
public class ItemBaseFluid extends ItemBase implements IFluidContainerItem {

    protected int capacity;

    /**
     *
     * @param name
     * @param hasSubtypes
     * @param tabs
     * @param capacity
     */
    public ItemBaseFluid(String name, boolean hasSubtypes, CreativeTabs tabs, int capacity) {
        super(name, hasSubtypes, tabs);
        this.capacity = capacity;
    }

    /**
     *
     * @param name
     * @param hasSubtypes
     * @param capacity
     */
    public ItemBaseFluid(String name, boolean hasSubtypes, int capacity) {
        super(name, hasSubtypes);
        this.capacity = capacity;
        ;

    }



    public ItemBaseFluid setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    @Override
    public FluidStack getFluid(ItemStack container) {
        if (!container.hasDisplayName() || ! container.getTagCompound().hasKey("Fluid")) {
            return null;
        }
        return FluidStack.loadFluidStackFromNBT(container.getTagCompound().getCompoundTag("Fluid"));
    }

    @Override
    public int getCapacity(ItemStack container) {
        return capacity;
    }

    @Override
    public int fill(ItemStack container, FluidStack resource, boolean doFill) {
        if (resource == null)  {
            return 0;
        }

        if (!doFill) {
            if (!container.hasTagCompound() || !container.getTagCompound().hasKey("Fluid")) {
                return Math.min(capacity, resource.amount);
            }

            FluidStack stack = FluidStack.loadFluidStackFromNBT(container.getTagCompound().getCompoundTag("Fluid"));

            if (stack == null) {
                return Math.min(capacity, resource.amount);
            }

            if (!stack.isFluidEqual(resource)) {
                return 0;
            }

            return Math.min(capacity - stack.amount, resource.amount);
        }

        if (!container.hasTagCompound()) {
            container.setTagCompound(new NBTTagCompound());
        }

        if (!container.getTagCompound().hasKey("Fluid")) {
            NBTTagCompound fluidTag = resource.writeToNBT(new NBTTagCompound());

            if (capacity < resource.amount) {
                fluidTag.setInteger("Amount", capacity);
                container.getTagCompound().setTag("Fluid", fluidTag);
                return capacity;
            }

            container.getTagCompound().setTag("Fluid", fluidTag);
            return resource.amount;
        }

        NBTTagCompound fluidTag = container.getTagCompound().getCompoundTag("Fluid");
        FluidStack stack = FluidStack.loadFluidStackFromNBT(fluidTag);

        if (!stack.isFluidEqual(resource)) {
            return 0;
        }

        int filled = capacity - stack.amount;
        if (resource.amount < filled) {
            stack.amount += resource.amount;
            filled = resource.amount;
        } else {
            stack.amount = capacity;
        }

        container.getTagCompound().setTag("Fluid", stack.writeToNBT(fluidTag));
        return filled;
    }

    @Override
    public FluidStack drain(ItemStack container, int maxDrain, boolean doDrain) {
        if (!container.hasTagCompound() || !container.getTagCompound().hasKey("Fluid")) {
            return null;
        }

        FluidStack stack = FluidStack.loadFluidStackFromNBT(container.getTagCompound().getCompoundTag("Fluid"));
        if (stack == null) {
            return null;
        }

        int currentAmount = stack.amount;
        stack.amount = Math.min(stack.amount, maxDrain);
        if (doDrain) {
            if (currentAmount == stack.amount) {
                container.getTagCompound().removeTag("Fluid");

                if (container.getTagCompound().hasNoTags()) {
                    container.setTagCompound(null);
                }
                return stack;
            }

            NBTTagCompound fluidTag = container.getTagCompound().getCompoundTag("Fluid");
            fluidTag.setInteger("Amount", currentAmount - stack.amount);
            container.getTagCompound().setTag("Fluid", fluidTag);
        }
        return stack;
    }
}