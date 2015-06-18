package us.illyohs.civilmagicks.common.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ItemWrit extends Item {

    int     mobid;
    int     lastfor;
    String  mobname;
    boolean isInfinite;
    boolean isSigned;

    public ItemWrit() {
        super();
        setMaxStackSize(1);
    }
    
    public int getMobid() {
        return mobid;
    }
    
    public int getLastfor() {
        return lastfor;
    }
    
    public String getMobname() {
        return mobname;
    }
    
    public boolean isInfinite() {
        return isInfinite;
    }
    
    public boolean isSigned() {
        return isSigned;
    }
    
    public void setMobid(int mobid) {
        this.mobid = mobid;
    }
    
    public void setLastfor(int lastfor) {
        this.lastfor = lastfor;
    }
    
    public void setMobname(String mobname) {
        this.mobname = mobname;
    }
    
    public void setInfinite(boolean isInfinite) {
        this.isInfinite = isInfinite;
    }
    
    public void setSigned(boolean isSigned) {
        this.isSigned = isSigned;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player) {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setString("owner", player.getDisplayNameString());
        nbt.setInteger("lastsfor", 5); // Number of jobs a writ is good for
        // nbt.setString("", value);
        return is;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void addInformation(ItemStack is, EntityPlayer player, List tooltip, boolean advanced) {
                
        if (is.stackTagCompound != null) {
            
            String signer = is.stackTagCompound.getString("owner");
            int duraion = is.stackTagCompound.getInteger("lastsfor");
            
//            String sig = String.format("This writ is signed by " + EnumChatFormatting.AQUA +" %s." + EnumChatFormatting.RESET, signer);
            tooltip.add("This writ is signed by: " + EnumChatFormatting.AQUA + signer);
            tooltip.add("This is valid for: " + duraion);
            
        }
    }

}
