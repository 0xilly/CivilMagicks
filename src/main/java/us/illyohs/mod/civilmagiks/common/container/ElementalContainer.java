package us.illyohs.mod.civilmagiks.common.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ElementalContainer extends Container {
    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
