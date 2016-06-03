package us.illyohs.civilmagiks.api.crafting;

import net.minecraft.item.ItemStack;

public class SpinningWheelRecipe {

    Object      input;
    ItemStack   output;

    public SpinningWheelRecipe(Object input, ItemStack output) {
        this.input  = input;
        this.output = output;
    }
}
