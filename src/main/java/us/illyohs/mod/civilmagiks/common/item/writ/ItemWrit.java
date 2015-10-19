package us.illyohs.mod.civilmagiks.common.item.writ;

import static net.minecraft.util.EnumChatFormatting.AQUA;
import static net.minecraft.util.EnumChatFormatting.RED;
import static net.minecraft.util.EnumChatFormatting.RESET;

import java.util.List;

import us.illyohs.mod.civilmagiks.client.core.creativetab.CivilTab;
import us.illyohs.mod.civilmagiks.common.core.handler.WritHandler;
import us.illyohs.mod.civilmagiks.common.core.lib.LibStrings;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemWrit extends Item {
    
	public ItemWrit() {
		setCreativeTab(CivilTab.BLOCKS);
		setUnlocalizedName(LibStrings.ITEM_WRIT);
        setMaxStackSize(1);
	}
	
    public String getWritName(ItemStack is) {
        return is.getTagCompound().getString("WritName");
    }
    
    public void onCreated(ItemStack is, World world, EntityPlayer player) {
        is.stackTagCompound = new NBTTagCompound();
//        is.stackTagCompound.setString("spellname", "nillspell");
//        is.stackTagCompound.setString("spellname", "heathWrit");

        is.stackTagCompound.setString("spellname", "testwrit");
    }

    public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player) {
        if (is.stackTagCompound != null) {
            WritHandler.instance().initSpell(is, player, is.getTagCompound().getString("spellname"));
        } else {
            System.out.println("Really your stupid illy you suck and should stop");
        }
        return is;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack is, EntityPlayer player, List tip, boolean advanced) {
        if (is.stackTagCompound !=null) {
            if (is.stackTagCompound.getString("spellname") == "nillSpell") {
                tip.add(RED + "No spell has been bound to this writ");
            } else {

            tip.add(RED + "Spell " + RESET +": " + AQUA + is.stackTagCompound.getString("spellname"));
            }
        } else {
            tip.add(RED + "No spell has been bound to this writ");
        }
    }
}
