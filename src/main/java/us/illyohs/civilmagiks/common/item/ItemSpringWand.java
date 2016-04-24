package us.illyohs.civilmagiks.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import us.illyohs.civilmagiks.common.core.util.ManaUtils;
import us.illyohs.civilmagiks.common.core.util.item.ItemBase;

public class ItemSpringWand extends ItemBase {

    public ItemSpringWand(String name, boolean hasSubtypes, CreativeTabs tabs) {
        super(name, hasSubtypes, tabs);
    }

    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand,
                                      EnumFacing facing, float hitX, float hitY, float hitZ) {

//        world.setBlockState(pos.up(), ModBlocks.manaSpring.getDefaultState());
        System.out.println(ManaUtils.getManaFromPos(world, pos).getLocalizedName());
        return EnumActionResult.PASS;
    }



}
