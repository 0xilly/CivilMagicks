package us.illyohs.civilmagiks.common.core.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;

public class PlayerUtils {

    public static Item getHeldItem(EntityPlayer player) {
        return  player.getHeldItem().getItem();
    }

    public static String getPlayerName(EntityPlayer player) {
        return player.getDisplayNameString();
    }
}
