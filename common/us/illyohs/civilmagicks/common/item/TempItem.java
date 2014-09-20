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
 * Class created on Sep 19, 2014 at 10:44:51 PM
 * 
 */
package us.illyohs.civilmagicks.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TempItem extends Item {
    
    public TempItem() {
        super();
        setTextureName("minecraft:stick");
        setCreativeTab(CreativeTabs.tabBrewing);
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player) {
        
        return is;
        
    }

}
