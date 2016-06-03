package us.illyohs.civilmagiks.common.item;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import us.illyohs.civilmagiks.common.block.ModBlocks;
import us.illyohs.civilmagiks.common.core.util.ManaUtils;
import us.illyohs.civilmagiks.common.core.util.item.ItemBase;

public class ItemSpringWand extends ItemBase {

    public ItemSpringWand(String name, boolean hasSubtypes, CreativeTabs tabs) {
        super(name, hasSubtypes, tabs);
    }

    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand,
                                      EnumFacing facing, float hitX, float hitY, float hitZ) {


//        world.setBlockState(pos.up(), ModBlocks.manaSpring.getDefaultState());


        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        IBlockState stone = Blocks.STONEBRICK.getDefaultState();
        IBlockState lamp  = Blocks.SEA_LANTERN.getDefaultState();
        IBlockState glass = Blocks.GLASS.getDefaultState();
//
//        //core
        world.setBlockState(new BlockPos(x, y+1, z), ModBlocks.manaSpring.getDefaultState());
        world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState());
        world.setBlockState(new BlockPos(x, y-1, z), lamp);

        //wellkeep
        world.setBlockState(new BlockPos(x, y, z-1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x+1, y, z), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(1)); //East
        world.setBlockState(new BlockPos(x, y, z+1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(3)); //South
        world.setBlockState(new BlockPos(x-1, y, z), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(0)); //West
        world.setBlockState(new BlockPos(x-1, y, z+1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(0)); //corner
        world.setBlockState(new BlockPos(x-1, y, z-1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(0)); //corner
        world.setBlockState(new BlockPos(x+1, y, z+1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(1)); //corner
        world.setBlockState(new BlockPos(x+1, y, z-1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(1)); //corner

        //keepstep
        world.setBlockState(new BlockPos(x, y, z-2), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(3)); //North
        world.setBlockState(new BlockPos(x+1, y, z-2), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(3)); //North
        world.setBlockState(new BlockPos(x-1, y, z-2), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(3)); //North
        world.setBlockState(new BlockPos(x+2, y, z), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(0)); //East
        world.setBlockState(new BlockPos(x+2, y, z-1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(0)); //East
        world.setBlockState(new BlockPos(x+2, y, z+1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(0)); //East
        world.setBlockState(new BlockPos(x, y, z+2), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x+1, y, z+2), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x-1, y, z+2), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x-2, y, z), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(1)); //East
        world.setBlockState(new BlockPos(x-2, y, z-1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(1)); //East
        world.setBlockState(new BlockPos(x-2, y, z+1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(1)); //East
        world.setBlockState(new BlockPos(x-2, y, z+2), Blocks.STONEBRICK.getStateFromMeta(2)); //corner
        world.setBlockState(new BlockPos(x-2, y, z-2), Blocks.STONEBRICK.getStateFromMeta(2)); //corner
        world.setBlockState(new BlockPos(x+2, y, z+2), Blocks.STONEBRICK.getStateFromMeta(2)); //corner
        world.setBlockState(new BlockPos(x+2, y, z-2), Blocks.STONEBRICK.getStateFromMeta(2)); //corner

        //Floor
        for (int i = 0; i <= 7; i++) {
            world.setBlockState(new BlockPos(x+1, y, z-(3+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //North
            world.setBlockState(new BlockPos(x-1, y, z-(3+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //North
            world.setBlockState(new BlockPos(x, y, z-(3+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //North
            world.setBlockState(new BlockPos(x-2, y, z-(3+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //North
            world.setBlockState(new BlockPos(x+2, y, z-(3+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //North
            world.setBlockState(new BlockPos(x+(3+i), y, z), Blocks.STONEBRICK.getStateFromMeta(2)); //East
            world.setBlockState(new BlockPos(x+(3+i), y, z-1), Blocks.STONEBRICK.getStateFromMeta(2)); //East
            world.setBlockState(new BlockPos(x+(3+i), y, z+1), Blocks.STONEBRICK.getStateFromMeta(2)); //East
            world.setBlockState(new BlockPos(x+(3+i), y, z-2), Blocks.STONEBRICK.getStateFromMeta(2)); //East
            world.setBlockState(new BlockPos(x+(3+i), y, z+2), Blocks.STONEBRICK.getStateFromMeta(2)); //East
            world.setBlockState(new BlockPos(x+1, y, z+(3+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //South
            world.setBlockState(new BlockPos(x-1, y, z+(3+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //South
            world.setBlockState(new BlockPos(x, y, z+(3+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //South
            world.setBlockState(new BlockPos(x-2, y, z+(3+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //South
            world.setBlockState(new BlockPos(x+2, y, z+(3+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //South
            world.setBlockState(new BlockPos(x-(3+i), y, z), Blocks.STONEBRICK.getStateFromMeta(2)); //West
            world.setBlockState(new BlockPos(x-(3+i), y, z-1), Blocks.STONEBRICK.getStateFromMeta(2)); //West
            world.setBlockState(new BlockPos(x-(3+i), y, z+1), Blocks.STONEBRICK.getStateFromMeta(2)); //West
            world.setBlockState(new BlockPos(x-(3+i), y, z-2), Blocks.STONEBRICK.getStateFromMeta(2)); //West
            world.setBlockState(new BlockPos(x-(3+i), y, z+2), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        }

        for (int i = 0; i <= 6; i++) {
            world.setBlockState(new BlockPos(x+3, y, z-(3+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //North East
            world.setBlockState(new BlockPos(x+(3+i), y, z-3), Blocks.STONEBRICK.getStateFromMeta(2)); //North East
            world.setBlockState(new BlockPos(x+3, y, z+(3+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //South East
            world.setBlockState(new BlockPos(x+(3+i), y, z+3), Blocks.STONEBRICK.getStateFromMeta(2)); //South East
            world.setBlockState(new BlockPos(x-3, y, z-(3+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //North West
            world.setBlockState(new BlockPos(x-(3+i), y, z-3), Blocks.STONEBRICK.getStateFromMeta(2)); //North West
            world.setBlockState(new BlockPos(x-3, y, z+(3+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //South West
            world.setBlockState(new BlockPos(x-(3+i), y, z+3), Blocks.STONEBRICK.getStateFromMeta(2)); //South West
        }

        for (int i = 0; i <= 5; i++) {
            world.setBlockState(new BlockPos(x+4, y, z-(4+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //North East
            world.setBlockState(new BlockPos(x+(4+i), y, z-4), Blocks.STONEBRICK.getStateFromMeta(2)); //North East
            world.setBlockState(new BlockPos(x+4, y, z+(4+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //South East
            world.setBlockState(new BlockPos(x+(4+i), y, z+4), Blocks.STONEBRICK.getStateFromMeta(2)); //South East
            world.setBlockState(new BlockPos(x-4, y, z-(4+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //North West
            world.setBlockState(new BlockPos(x-(4+i), y, z-4), Blocks.STONEBRICK.getStateFromMeta(2)); //North West
            world.setBlockState(new BlockPos(x-4, y, z+(4+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //South West
            world.setBlockState(new BlockPos(x-(4+i), y, z+4), Blocks.STONEBRICK.getStateFromMeta(2)); //South West
        }

        for (int i = 0; i <= 3; i++) {
            world.setBlockState(new BlockPos(x+5, y, z-(5+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //North East
            world.setBlockState(new BlockPos(x+(5+i), y, z-5), Blocks.STONEBRICK.getStateFromMeta(2)); //North East
            world.setBlockState(new BlockPos(x+5, y, z+(5+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //South East
            world.setBlockState(new BlockPos(x+(5+i), y, z+5), Blocks.STONEBRICK.getStateFromMeta(2)); //South East
            world.setBlockState(new BlockPos(x-5, y, z-(5+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //North West
            world.setBlockState(new BlockPos(x-(5+i), y, z-5), Blocks.STONEBRICK.getStateFromMeta(2)); //North West
            world.setBlockState(new BlockPos(x-5, y, z+(5+i)), Blocks.STONEBRICK.getStateFromMeta(2)); //South West
            world.setBlockState(new BlockPos(x-(5+i), y, z+5), Blocks.STONEBRICK.getStateFromMeta(2)); //South West
        }

        world.setBlockState(new BlockPos(x+6, y, z-6), Blocks.STONEBRICK.getStateFromMeta(2)); //North East
        world.setBlockState(new BlockPos(x+6, y, z-7), Blocks.STONEBRICK.getStateFromMeta(2)); //North East
        world.setBlockState(new BlockPos(x+7, y, z-6), Blocks.STONEBRICK.getStateFromMeta(2)); //North East
        world.setBlockState(new BlockPos(x+6, y, z+6), Blocks.STONEBRICK.getStateFromMeta(2)); //South East
        world.setBlockState(new BlockPos(x+6, y, z+7), Blocks.STONEBRICK.getStateFromMeta(2)); //South East
        world.setBlockState(new BlockPos(x+7, y, z+6), Blocks.STONEBRICK.getStateFromMeta(2)); //South East
        world.setBlockState(new BlockPos(x-6, y, z-6), Blocks.STONEBRICK.getStateFromMeta(2)); //North West
        world.setBlockState(new BlockPos(x-6, y, z-7), Blocks.STONEBRICK.getStateFromMeta(2)); //North West
        world.setBlockState(new BlockPos(x-7, y, z-6), Blocks.STONEBRICK.getStateFromMeta(2)); //North West
        world.setBlockState(new BlockPos(x-6, y, z+6), Blocks.STONEBRICK.getStateFromMeta(2)); //South West
        world.setBlockState(new BlockPos(x-6, y, z+7), Blocks.STONEBRICK.getStateFromMeta(2)); //South West
        world.setBlockState(new BlockPos(x-7, y, z+6), Blocks.STONEBRICK.getStateFromMeta(2)); //South West
        //Wall
        world.setBlockState(new BlockPos(x, y+1, z-10), Blocks.STONEBRICK.getStateFromMeta(1)); //North
        world.setBlockState(new BlockPos(x+1, y+1, z-10), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x+2, y+1, z-10), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x-1, y+1, z-10), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x-2, y+1, z-10), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x+3, y+1, z-9), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x+4, y+1, z-9), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x+5, y+1, z-8), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x+6, y+1, z-7), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x+7, y+1, z-6), Blocks.STONEBRICK.getStateFromMeta(1)); //North
        world.setBlockState(new BlockPos(x-3, y+1, z-9), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x-4, y+1, z-9), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x-5, y+1, z-8), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x-6, y+1, z-7), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x-7, y+1, z-6), Blocks.STONEBRICK.getStateFromMeta(1)); //North
        world.setBlockState(new BlockPos(x+10, y+1, z), Blocks.STONEBRICK.getStateFromMeta(1)); //East
        world.setBlockState(new BlockPos(x+10, y+1, z+1), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+10, y+1, z+2), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+10, y+1, z-1), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+10, y+1, z-2), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+9, y+1, z+3), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+9, y+1, z+4), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+8, y+1, z+5), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+7, y+1, z+6), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+6, y+1, z+7), Blocks.STONEBRICK.getStateFromMeta(1)); //East
        world.setBlockState(new BlockPos(x-9, y+1, z+3), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x-9, y+1, z+4), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x-8, y+1, z+5), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x-7, y+1, z+6), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x, y+1, z+10), Blocks.STONEBRICK.getStateFromMeta(1)); //South
        world.setBlockState(new BlockPos(x+1, y+1, z+10), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x+2, y+1, z+10), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x-1, y+1, z+10), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x-2, y+1, z+10), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x+3, y+1, z+9), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x+4, y+1, z+9), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x+5, y+1, z+8), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x+6, y+1, z+7), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x+7, y+1, z+6), Blocks.STONEBRICK.getStateFromMeta(1)); //South
        world.setBlockState(new BlockPos(x-3, y+1, z+9), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x-4, y+1, z+9), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x-5, y+1, z+8), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x-6, y+1, z+7), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x-7, y+1, z+6), Blocks.STONEBRICK.getStateFromMeta(1)); //South
        world.setBlockState(new BlockPos(x-10, y+1, z), Blocks.STONEBRICK.getStateFromMeta(1)); //West
        world.setBlockState(new BlockPos(x-10, y+1, z+1), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x-10, y+1, z+2), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x-10, y+1, z-1), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x-10, y+1, z-2), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x+9, y+1, z-3), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x+9, y+1, z-4), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x+8, y+1, z-5), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x+7, y+1, z-6), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x+6, y+1, z-7), Blocks.STONEBRICK.getStateFromMeta(1)); //West
        world.setBlockState(new BlockPos(x-9, y+1, z-3), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x-9, y+1, z-4), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x-8, y+1, z-5), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x-7, y+1, z-6), Blocks.STONEBRICK.getStateFromMeta(2)); //West

        //Pillars
        for (int i = 0; i <= 6; i++) {
            world.setBlockState(new BlockPos(x-2, y+(2+i), z-10), Blocks.COBBLESTONE_WALL.getStateFromMeta(0)); //North
            world.setBlockState(new BlockPos(x+2, y+(2+i), z-10), Blocks.COBBLESTONE_WALL.getStateFromMeta(0)); //North
            world.setBlockState(new BlockPos(x+10, y+(2+i), z-2), Blocks.COBBLESTONE_WALL.getStateFromMeta(0)); //East
            world.setBlockState(new BlockPos(x+10, y+(2+i), z+2), Blocks.COBBLESTONE_WALL.getStateFromMeta(0)); //East
            world.setBlockState(new BlockPos(x-2, y+(2+i), z+10), Blocks.COBBLESTONE_WALL.getStateFromMeta(0)); //South
            world.setBlockState(new BlockPos(x+2, y+(2+i), z+10), Blocks.COBBLESTONE_WALL.getStateFromMeta(0)); //South
            world.setBlockState(new BlockPos(x-10, y+(2+i), z-2), Blocks.COBBLESTONE_WALL.getStateFromMeta(0)); //West
            world.setBlockState(new BlockPos(x-10, y+(2+i), z+2), Blocks.COBBLESTONE_WALL.getStateFromMeta(0)); //West
        }

        world.setBlockState(new BlockPos(x-7, y+2, z-6), Blocks.COBBLESTONE_WALL.getStateFromMeta(1));
        world.setBlockState(new BlockPos(x+7, y+2, z-6), Blocks.COBBLESTONE_WALL.getStateFromMeta(1));
        world.setBlockState(new BlockPos(x-7, y+2, z+6), Blocks.COBBLESTONE_WALL.getStateFromMeta(1));
        world.setBlockState(new BlockPos(x+7, y+2, z+6), Blocks.COBBLESTONE_WALL.getStateFromMeta(1));


        //Roof
        for (int i = 0; i <= 6; i++) {
            world.setBlockState(new BlockPos(x+1, y+9, z-(3+i)), glass); //North
            world.setBlockState(new BlockPos(x-1, y+9, z-(3+i)), glass); //North
            world.setBlockState(new BlockPos(x, y+9, z-(3+i)), glass); //North
            world.setBlockState(new BlockPos(x-2, y+9, z-(3+i)), glass); //North
            world.setBlockState(new BlockPos(x+2, y+9, z-(3+i)), glass); //North
            world.setBlockState(new BlockPos(x+(3+i), y+9, z), glass); //East
            world.setBlockState(new BlockPos(x+(3+i), y+9, z-1), glass); //East
            world.setBlockState(new BlockPos(x+(3+i), y+9, z+1), glass); //East
            world.setBlockState(new BlockPos(x+(3+i), y+9, z-2), glass); //East
            world.setBlockState(new BlockPos(x+(3+i), y+9, z+2), glass); //East
            world.setBlockState(new BlockPos(x+1, y+9, z+(3+i)), glass); //South
            world.setBlockState(new BlockPos(x-1, y+9, z+(3+i)), glass); //South
            world.setBlockState(new BlockPos(x, y+9, z+(3+i)), glass); //South
            world.setBlockState(new BlockPos(x-2, y+9, z+(3+i)), glass); //South
            world.setBlockState(new BlockPos(x+2, y+9, z+(3+i)), glass); //South
            world.setBlockState(new BlockPos(x-(3+i), y+9, z), glass); //West
            world.setBlockState(new BlockPos(x-(3+i), y+9, z-1), glass); //West
            world.setBlockState(new BlockPos(x-(3+i), y+9, z+1), glass); //West
            world.setBlockState(new BlockPos(x-(3+i), y+9, z-2), glass); //West
            world.setBlockState(new BlockPos(x-(3+i), y+9, z+2), glass); //West
        }

        for (int i = 0; i <= 5; i++) {
            world.setBlockState(new BlockPos(x+3, y+9, z-(3+i)), glass); //North East
            world.setBlockState(new BlockPos(x+(3+i), y+9, z-3), glass); //North East
            world.setBlockState(new BlockPos(x+3, y+9, z+(3+i)), glass); //South East
            world.setBlockState(new BlockPos(x+(3+i), y+9, z+3), glass); //South East
            world.setBlockState(new BlockPos(x-3, y+9, z-(3+i)), glass); //North West
            world.setBlockState(new BlockPos(x-(3+i), y+9, z-3), glass); //North West
            world.setBlockState(new BlockPos(x-3, y+9, z+(3+i)), glass); //South West
            world.setBlockState(new BlockPos(x-(3+i), y+9, z+3), glass); //South West
        }

        for (int i = 0; i <= 4; i++) {
            world.setBlockState(new BlockPos(x+4, y+9, z-(4+i)), glass); //North East
            world.setBlockState(new BlockPos(x+(4+i), y+9, z-4), glass); //North East
            world.setBlockState(new BlockPos(x+4, y+9, z+(4+i)), glass); //South East
            world.setBlockState(new BlockPos(x+(4+i), y+9, z+4), glass); //South East
            world.setBlockState(new BlockPos(x-4, y+9, z-(4+i)), glass); //North West
            world.setBlockState(new BlockPos(x-(4+i), y+9, z-4), glass); //North West
            world.setBlockState(new BlockPos(x-4, y+9, z+(4+i)), glass); //South West
            world.setBlockState(new BlockPos(x-(4+i), y+9, z+4), glass); //South West
        }

        for (int i = 0; i <= 3; i++) {
            world.setBlockState(new BlockPos(x+5, y+9, z-(5+i)), glass); //North East
            world.setBlockState(new BlockPos(x+(5+i), y+9, z-5), glass); //North East
            world.setBlockState(new BlockPos(x+5, y+9, z+(5+i)), glass); //South East
            world.setBlockState(new BlockPos(x+(5+i), y+9, z+5), glass); //South East
            world.setBlockState(new BlockPos(x-5, y+9, z-(5+i)), glass); //North West
            world.setBlockState(new BlockPos(x-(5+i), y+9, z-5), glass); //North West
            world.setBlockState(new BlockPos(x-5, y+9, z+(5+i)), glass); //South West
            world.setBlockState(new BlockPos(x-(5+i), y+9, z+5), glass); //South West
        }

        world.setBlockState(new BlockPos(x, y+9, z-10), Blocks.STONEBRICK.getStateFromMeta(1)); //North
        world.setBlockState(new BlockPos(x+1, y+9, z-10), Blocks.STONEBRICK.getStateFromMeta(2)); //Nort
        world.setBlockState(new BlockPos(x+2, y+9, z-10), Blocks.STONEBRICK.getStateFromMeta(2)); //Nort
        world.setBlockState(new BlockPos(x-1, y+9, z-10), Blocks.STONEBRICK.getStateFromMeta(2)); //Nort
        world.setBlockState(new BlockPos(x-2, y+9, z-10), Blocks.STONEBRICK.getStateFromMeta(2)); //Nort
        world.setBlockState(new BlockPos(x+3, y+9, z-9), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x+4, y+9, z-9), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x+5, y+9, z-8), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x+6, y+9, z-7), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x+7, y+9, z-6), Blocks.STONEBRICK.getStateFromMeta(1)); //North
        world.setBlockState(new BlockPos(x-3, y+9, z-9), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x-4, y+9, z-9), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x-5, y+9, z-8), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x-6, y+9, z-7), Blocks.STONEBRICK.getStateFromMeta(2)); //North
        world.setBlockState(new BlockPos(x-7, y+9, z-6), Blocks.STONEBRICK.getStateFromMeta(1)); //North
        world.setBlockState(new BlockPos(x+10, y+9, z), Blocks.STONEBRICK.getStateFromMeta(1)); //East
        world.setBlockState(new BlockPos(x+10, y+9, z+1), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+10, y+9, z+2), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+10, y+9, z-1), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+10, y+9, z-2), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+9, y+9, z+3), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+9, y+9, z+4), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+8, y+9, z+5), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+7, y+9, z+6), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x+6, y+9, z+7), Blocks.STONEBRICK.getStateFromMeta(1)); //East
        world.setBlockState(new BlockPos(x-9, y+9, z+3), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x-9, y+9, z+4), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x-8, y+9, z+5), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x-7, y+9, z+6), Blocks.STONEBRICK.getStateFromMeta(2)); //East
        world.setBlockState(new BlockPos(x, y+9, z+10), Blocks.STONEBRICK.getStateFromMeta(1)); //South
        world.setBlockState(new BlockPos(x+1, y+9, z+10), Blocks.STONEBRICK.getStateFromMeta(2)); //Sout
        world.setBlockState(new BlockPos(x+2, y+9, z+10), Blocks.STONEBRICK.getStateFromMeta(2)); //Sout
        world.setBlockState(new BlockPos(x-1, y+9, z+10), Blocks.STONEBRICK.getStateFromMeta(2)); //Sout
        world.setBlockState(new BlockPos(x-2, y+9, z+10), Blocks.STONEBRICK.getStateFromMeta(2)); //Sout
        world.setBlockState(new BlockPos(x+3, y+9, z+9), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x+4, y+9, z+9), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x+5, y+9, z+8), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x+6, y+9, z+7), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x+7, y+9, z+6), Blocks.STONEBRICK.getStateFromMeta(1)); //South
        world.setBlockState(new BlockPos(x-3, y+9, z+9), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x-4, y+9, z+9), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x-5, y+9, z+8), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x-6, y+9, z+7), Blocks.STONEBRICK.getStateFromMeta(2)); //South
        world.setBlockState(new BlockPos(x-7, y+9, z+6), Blocks.STONEBRICK.getStateFromMeta(1)); //South
        world.setBlockState(new BlockPos(x-10, y+9, z), Blocks.STONEBRICK.getStateFromMeta(1)); //West
        world.setBlockState(new BlockPos(x-10, y+9, z+1), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x-10, y+9, z+2), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x-10, y+9, z-1), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x-10, y+9, z-2), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x+9, y+9, z-3), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x+9, y+9, z-4), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x+8, y+9, z-5), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x+7, y+9, z-6), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x+6, y+9, z-7), Blocks.STONEBRICK.getStateFromMeta(1)); //West
        world.setBlockState(new BlockPos(x-9, y+9, z-3), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x-9, y+9, z-4), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x-8, y+9, z-5), Blocks.STONEBRICK.getStateFromMeta(2)); //West
        world.setBlockState(new BlockPos(x-7, y+9, z-6), Blocks.STONEBRICK.getStateFromMeta(2)); //West

//        try {
//            System.out.println(ManaUtils.getManaFromPos(world, pos).getLocalizedName());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return EnumActionResult.PASS;
    }



}
