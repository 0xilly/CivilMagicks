/**
 * This class was created by Anthony Anderson(Lord Illyohs)
 * It is distributed as part of CivilMagicks
 * Source Code: https://github.com/LordIllyohs/CivilMagicks
 *
 * CivilMagicks is Open Source and distributed under a
 * Attribution-NonCommercial-ShareAlike 3.0 Unported license.
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/)
 *
 * 
 * Class created on Aug 12, 2014 at 3:03:52 AM
 * 
 */
package us.illyohs.civilmagicks.common.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import us.illyohs.civilmagicks.common.core.handlers.SoundHandler;
import us.illyohs.civilmagicks.common.lib.LibInfo;

public class ItemCallingWhistle extends Item {

    public ItemCallingWhistle() {
        super();
        setCreativeTab(CreativeTabs.tabFood);
        setTextureName(LibInfo.MOD_ID + ":whistle");
        setUnlocalizedName(LibInfo.MOD_ID + ":whistle");
    }

//    @Override
//    public void onCreated(ItemStack is, World world, EntityPlayer player) {
//        is.stackTagCompound = new NBTTagCompound();
//        is.stackTagCompound.setString("master", player.getDisplayName());
//        is.stackTagCompound.setString("UUID", player.getUniqueID().toString());
//        is.stackTagCompound.setBoolean("activated", false);
//    }
//
//    @Override
//    public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player) {
//        if (is.stackTagCompound != null) {
//            String master = is.stackTagCompound.getString("master");
//            String id = is.stackTagCompound.getString(player.getUniqueID().toString());
//            boolean activated = is.stackTagCompound.getBoolean("activated");
//            if (id == player.getUniqueID().toString() && activated == false) {
//                is.stackTagCompound.setBoolean("activated", true);
//                player.addChatComponentMessage(new ChatComponentText("The Aether grants your request"));
//
//                SoundHandler.whisle(world, player, 1.5f, 1.0f);
//
//            } else if (id == player.getUniqueID().toString() && activated == true) {
//                is.stackTagCompound.setBoolean("activated", false);
//                player.addChatComponentMessage(new ChatComponentText( "The Aether grants your request"));
//            } else {
//                player.addChatComponentMessage(new ChatComponentText( "The Aether rejects your greedy attempt to activate these goggles. Please return to the rightful owner" + " " + master));
//            }
//        } else {
//            SoundHandler.whisle(world, player, 1.0f, 0.01f);
//        }
//        return is;
//
//    }

//    @SuppressWarnings({ "rawtypes", "unchecked" })
//    @Override
//    @SideOnly(Side.CLIENT)
//    public void addInformation(ItemStack is, EntityPlayer player, List list, boolean par4) {
//        if (is.stackTagCompound !=null) {
//            String master = is.stackTagCompound.getString("master");
//            String id = is.stackTagCompound.getString(player.getUniqueID().toString());
//            boolean activated = is.stackTagCompound.getBoolean("activated");
//            list.add(StatCollector.translateToLocal(EnumChatFormatting.DARK_PURPLE + "This tool is Bound to: " + EnumChatFormatting.DARK_AQUA + master));
//            list.add(is);
//            if (activated == true) {
//                list.add(StatCollector.translateToLocal(EnumChatFormatting.DARK_PURPLE + "Is attuned: " + EnumChatFormatting.DARK_AQUA + "True"));
//            } else if (master == null) {
//                list.add(StatCollector.translateToLocal(EnumChatFormatting.RED + "Not attuned"));
//            } else {
//                list.add(StatCollector.translateToLocal(EnumChatFormatting.DARK_PURPLE + "Is attuned: " + EnumChatFormatting.DARK_AQUA + "False"));
//            }
//        }
//
//    }

}
