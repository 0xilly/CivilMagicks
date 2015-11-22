package us.illyohs.civilmagiks.common.core.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;

/**
 * Created by illyohs on 11/21/15.
 */
public class PlayerUtils {

    public static Item getHeldItem(EntityPlayer player) {
        return  player.getHeldItem().getItem();
    }

    public static String getPlayerName(EntityPlayer player) {
        return player.getDisplayNameString();
    }
}
