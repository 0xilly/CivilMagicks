/**
 * Copyright (c) 2016, Anthony Anderson(Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright notice, this
 *        list of conditions and the following disclaimer.
 *
 *     * Redistributions in binary form must reproduce the above copyright notice,
 *        this list of conditions and the following disclaimer in the documentation
 *        and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 */

package us.illyohs.civilmagiks.common.item;


import net.minecraft.creativetab.CreativeTabs;
import us.illyohs.civilmagiks.common.core.util.item.ItemBase;

public class ItemWellSpawner extends ItemBase {

    public ItemWellSpawner(String name, boolean hasSubtypes, CreativeTabs tabs) {
        super(name, hasSubtypes, tabs);
    }

//    @Override
//    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
//
//        int x = pos.getX();
//        int y = pos.getY();
//        int z = pos.getZ();
//
//        IBlockState stone  = Blocks.stonebrick.getDefaultState();
//        IBlockState lamp   = Blocks.sea_lantern.getDefaultState();
//        IBlockState glass   = Blocks.glass.getDefaultState();
//
//        //core
//        world.setBlockState(new BlockPos(x, y, z), Blocks.air.getDefaultState());
//        world.setBlockState(new BlockPos(x, y-1, z), lamp);
//
//        //wellkeep
//        world.setBlockState(new BlockPos(x, y, z-1), Blocks.stone_brick_stairs.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x+1, y, z), Blocks.stone_brick_stairs.getStateFromMeta(1)); //East
//        world.setBlockState(new BlockPos(x, y, z+1), Blocks.stone_brick_stairs.getStateFromMeta(3)); //South
//        world.setBlockState(new BlockPos(x-1, y, z), Blocks.stone_brick_stairs.getStateFromMeta(0)); //West
//        world.setBlockState(new BlockPos(x-1, y, z+1), Blocks.stone_brick_stairs.getStateFromMeta(0)); //corner
//        world.setBlockState(new BlockPos(x-1, y, z-1), Blocks.stone_brick_stairs.getStateFromMeta(0)); //corner
//        world.setBlockState(new BlockPos(x+1, y, z+1), Blocks.stone_brick_stairs.getStateFromMeta(1)); //corner
//        world.setBlockState(new BlockPos(x+1, y, z-1), Blocks.stone_brick_stairs.getStateFromMeta(1)); //corner
//
//        //keepstep
//        world.setBlockState(new BlockPos(x, y, z-2), Blocks.stone_brick_stairs.getStateFromMeta(3)); //North
//        world.setBlockState(new BlockPos(x+1, y, z-2), Blocks.stone_brick_stairs.getStateFromMeta(3)); //North
//        world.setBlockState(new BlockPos(x-1, y, z-2), Blocks.stone_brick_stairs.getStateFromMeta(3)); //North
//        world.setBlockState(new BlockPos(x+2, y, z), Blocks.stone_brick_stairs.getStateFromMeta(0)); //East
//        world.setBlockState(new BlockPos(x+2, y, z-1), Blocks.stone_brick_stairs.getStateFromMeta(0)); //East
//        world.setBlockState(new BlockPos(x+2, y, z+1), Blocks.stone_brick_stairs.getStateFromMeta(0)); //East
//        world.setBlockState(new BlockPos(x, y, z+2), Blocks.stone_brick_stairs.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x+1, y, z+2), Blocks.stone_brick_stairs.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x-1, y, z+2), Blocks.stone_brick_stairs.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x-2, y, z), Blocks.stone_brick_stairs.getStateFromMeta(1)); //East
//        world.setBlockState(new BlockPos(x-2, y, z-1), Blocks.stone_brick_stairs.getStateFromMeta(1)); //East
//        world.setBlockState(new BlockPos(x-2, y, z+1), Blocks.stone_brick_stairs.getStateFromMeta(1)); //East
//        world.setBlockState(new BlockPos(x-2, y, z+2), Blocks.stonebrick.getStateFromMeta(2)); //corner
//        world.setBlockState(new BlockPos(x-2, y, z-2), Blocks.stonebrick.getStateFromMeta(2)); //corner
//        world.setBlockState(new BlockPos(x+2, y, z+2), Blocks.stonebrick.getStateFromMeta(2)); //corner
//        world.setBlockState(new BlockPos(x+2, y, z-2), Blocks.stonebrick.getStateFromMeta(2)); //corner
//
//        //Floor
//        for (int i = 0; i <= 7; i++) {
//            world.setBlockState(new BlockPos(x+1, y, z-(3+i)), Blocks.stonebrick.getStateFromMeta(2)); //North
//            world.setBlockState(new BlockPos(x-1, y, z-(3+i)), Blocks.stonebrick.getStateFromMeta(2)); //North
//            world.setBlockState(new BlockPos(x, y, z-(3+i)), Blocks.stonebrick.getStateFromMeta(2)); //North
//            world.setBlockState(new BlockPos(x-2, y, z-(3+i)), Blocks.stonebrick.getStateFromMeta(2)); //North
//            world.setBlockState(new BlockPos(x+2, y, z-(3+i)), Blocks.stonebrick.getStateFromMeta(2)); //North
//            world.setBlockState(new BlockPos(x+(3+i), y, z), Blocks.stonebrick.getStateFromMeta(2)); //East
//            world.setBlockState(new BlockPos(x+(3+i), y, z-1), Blocks.stonebrick.getStateFromMeta(2)); //East
//            world.setBlockState(new BlockPos(x+(3+i), y, z+1), Blocks.stonebrick.getStateFromMeta(2)); //East
//            world.setBlockState(new BlockPos(x+(3+i), y, z-2), Blocks.stonebrick.getStateFromMeta(2)); //East
//            world.setBlockState(new BlockPos(x+(3+i), y, z+2), Blocks.stonebrick.getStateFromMeta(2)); //East
//            world.setBlockState(new BlockPos(x+1, y, z+(3+i)), Blocks.stonebrick.getStateFromMeta(2)); //South
//            world.setBlockState(new BlockPos(x-1, y, z+(3+i)), Blocks.stonebrick.getStateFromMeta(2)); //South
//            world.setBlockState(new BlockPos(x, y, z+(3+i)), Blocks.stonebrick.getStateFromMeta(2)); //South
//            world.setBlockState(new BlockPos(x-2, y, z+(3+i)), Blocks.stonebrick.getStateFromMeta(2)); //South
//            world.setBlockState(new BlockPos(x+2, y, z+(3+i)), Blocks.stonebrick.getStateFromMeta(2)); //South
//            world.setBlockState(new BlockPos(x-(3+i), y, z), Blocks.stonebrick.getStateFromMeta(2)); //West
//            world.setBlockState(new BlockPos(x-(3+i), y, z-1), Blocks.stonebrick.getStateFromMeta(2)); //West
//            world.setBlockState(new BlockPos(x-(3+i), y, z+1), Blocks.stonebrick.getStateFromMeta(2)); //West
//            world.setBlockState(new BlockPos(x-(3+i), y, z-2), Blocks.stonebrick.getStateFromMeta(2)); //West
//            world.setBlockState(new BlockPos(x-(3+i), y, z+2), Blocks.stonebrick.getStateFromMeta(2)); //West
//        }
//
//        for (int i = 0; i <= 6; i++) {
//            world.setBlockState(new BlockPos(x+3, y, z-(3+i)), Blocks.stonebrick.getStateFromMeta(2)); //North East
//            world.setBlockState(new BlockPos(x+(3+i), y, z-3), Blocks.stonebrick.getStateFromMeta(2)); //North East
//            world.setBlockState(new BlockPos(x+3, y, z+(3+i)), Blocks.stonebrick.getStateFromMeta(2)); //South East
//            world.setBlockState(new BlockPos(x+(3+i), y, z+3), Blocks.stonebrick.getStateFromMeta(2)); //South East
//            world.setBlockState(new BlockPos(x-3, y, z-(3+i)), Blocks.stonebrick.getStateFromMeta(2)); //North West
//            world.setBlockState(new BlockPos(x-(3+i), y, z-3), Blocks.stonebrick.getStateFromMeta(2)); //North West
//            world.setBlockState(new BlockPos(x-3, y, z+(3+i)), Blocks.stonebrick.getStateFromMeta(2)); //South West
//            world.setBlockState(new BlockPos(x-(3+i), y, z+3), Blocks.stonebrick.getStateFromMeta(2)); //South West
//        }
//
//        for (int i = 0; i <= 5; i++) {
//            world.setBlockState(new BlockPos(x+4, y, z-(4+i)), Blocks.stonebrick.getStateFromMeta(2)); //North East
//            world.setBlockState(new BlockPos(x+(4+i), y, z-4), Blocks.stonebrick.getStateFromMeta(2)); //North East
//            world.setBlockState(new BlockPos(x+4, y, z+(4+i)), Blocks.stonebrick.getStateFromMeta(2)); //South East
//            world.setBlockState(new BlockPos(x+(4+i), y, z+4), Blocks.stonebrick.getStateFromMeta(2)); //South East
//            world.setBlockState(new BlockPos(x-4, y, z-(4+i)), Blocks.stonebrick.getStateFromMeta(2)); //North West
//            world.setBlockState(new BlockPos(x-(4+i), y, z-4), Blocks.stonebrick.getStateFromMeta(2)); //North West
//            world.setBlockState(new BlockPos(x-4, y, z+(4+i)), Blocks.stonebrick.getStateFromMeta(2)); //South West
//            world.setBlockState(new BlockPos(x-(4+i), y, z+4), Blocks.stonebrick.getStateFromMeta(2)); //South West
//        }
//
//        for (int i = 0; i <= 3; i++) {
//            world.setBlockState(new BlockPos(x+5, y, z-(5+i)), Blocks.stonebrick.getStateFromMeta(2)); //North East
//            world.setBlockState(new BlockPos(x+(5+i), y, z-5), Blocks.stonebrick.getStateFromMeta(2)); //North East
//            world.setBlockState(new BlockPos(x+5, y, z+(5+i)), Blocks.stonebrick.getStateFromMeta(2)); //South East
//            world.setBlockState(new BlockPos(x+(5+i), y, z+5), Blocks.stonebrick.getStateFromMeta(2)); //South East
//            world.setBlockState(new BlockPos(x-5, y, z-(5+i)), Blocks.stonebrick.getStateFromMeta(2)); //North West
//            world.setBlockState(new BlockPos(x-(5+i), y, z-5), Blocks.stonebrick.getStateFromMeta(2)); //North West
//            world.setBlockState(new BlockPos(x-5, y, z+(5+i)), Blocks.stonebrick.getStateFromMeta(2)); //South West
//            world.setBlockState(new BlockPos(x-(5+i), y, z+5), Blocks.stonebrick.getStateFromMeta(2)); //South West
//        }
//
//        world.setBlockState(new BlockPos(x+6, y, z-6), Blocks.stonebrick.getStateFromMeta(2)); //North East
//        world.setBlockState(new BlockPos(x+6, y, z-7), Blocks.stonebrick.getStateFromMeta(2)); //North East
//        world.setBlockState(new BlockPos(x+7, y, z-6), Blocks.stonebrick.getStateFromMeta(2)); //North East
//        world.setBlockState(new BlockPos(x+6, y, z+6), Blocks.stonebrick.getStateFromMeta(2)); //South East
//        world.setBlockState(new BlockPos(x+6, y, z+7), Blocks.stonebrick.getStateFromMeta(2)); //South East
//        world.setBlockState(new BlockPos(x+7, y, z+6), Blocks.stonebrick.getStateFromMeta(2)); //South East
//        world.setBlockState(new BlockPos(x-6, y, z-6), Blocks.stonebrick.getStateFromMeta(2)); //North West
//        world.setBlockState(new BlockPos(x-6, y, z-7), Blocks.stonebrick.getStateFromMeta(2)); //North West
//        world.setBlockState(new BlockPos(x-7, y, z-6), Blocks.stonebrick.getStateFromMeta(2)); //North West
//        world.setBlockState(new BlockPos(x-6, y, z+6), Blocks.stonebrick.getStateFromMeta(2)); //South West
//        world.setBlockState(new BlockPos(x-6, y, z+7), Blocks.stonebrick.getStateFromMeta(2)); //South West
//        world.setBlockState(new BlockPos(x-7, y, z+6), Blocks.stonebrick.getStateFromMeta(2)); //South West
//        //Wall
//        world.setBlockState(new BlockPos(x, y+1, z-10), Blocks.stonebrick.getStateFromMeta(1)); //North
//        world.setBlockState(new BlockPos(x+1, y+1, z-10), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x+2, y+1, z-10), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x-1, y+1, z-10), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x-2, y+1, z-10), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x+3, y+1, z-9), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x+4, y+1, z-9), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x+5, y+1, z-8), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x+6, y+1, z-7), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x+7, y+1, z-6), Blocks.stonebrick.getStateFromMeta(1)); //North
//        world.setBlockState(new BlockPos(x-3, y+1, z-9), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x-4, y+1, z-9), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x-5, y+1, z-8), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x-6, y+1, z-7), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x-7, y+1, z-6), Blocks.stonebrick.getStateFromMeta(1)); //North
//        world.setBlockState(new BlockPos(x+10, y+1, z), Blocks.stonebrick.getStateFromMeta(1)); //East
//        world.setBlockState(new BlockPos(x+10, y+1, z+1), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+10, y+1, z+2), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+10, y+1, z-1), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+10, y+1, z-2), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+9, y+1, z+3), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+9, y+1, z+4), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+8, y+1, z+5), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+7, y+1, z+6), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+6, y+1, z+7), Blocks.stonebrick.getStateFromMeta(1)); //East
//        world.setBlockState(new BlockPos(x-9, y+1, z+3), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x-9, y+1, z+4), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x-8, y+1, z+5), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x-7, y+1, z+6), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x, y+1, z+10), Blocks.stonebrick.getStateFromMeta(1)); //South
//        world.setBlockState(new BlockPos(x+1, y+1, z+10), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x+2, y+1, z+10), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x-1, y+1, z+10), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x-2, y+1, z+10), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x+3, y+1, z+9), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x+4, y+1, z+9), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x+5, y+1, z+8), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x+6, y+1, z+7), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x+7, y+1, z+6), Blocks.stonebrick.getStateFromMeta(1)); //South
//        world.setBlockState(new BlockPos(x-3, y+1, z+9), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x-4, y+1, z+9), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x-5, y+1, z+8), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x-6, y+1, z+7), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x-7, y+1, z+6), Blocks.stonebrick.getStateFromMeta(1)); //South
//        world.setBlockState(new BlockPos(x-10, y+1, z), Blocks.stonebrick.getStateFromMeta(1)); //West
//        world.setBlockState(new BlockPos(x-10, y+1, z+1), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x-10, y+1, z+2), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x-10, y+1, z-1), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x-10, y+1, z-2), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x+9, y+1, z-3), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x+9, y+1, z-4), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x+8, y+1, z-5), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x+7, y+1, z-6), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x+6, y+1, z-7), Blocks.stonebrick.getStateFromMeta(1)); //West
//        world.setBlockState(new BlockPos(x-9, y+1, z-3), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x-9, y+1, z-4), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x-8, y+1, z-5), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x-7, y+1, z-6), Blocks.stonebrick.getStateFromMeta(2)); //West
//
//        //Pillars
//        for (int i = 0; i <= 6; i++) {
//            world.setBlockState(new BlockPos(x-2, y+(2+i), z-10), Blocks.cobblestone_wall.getStateFromMeta(0)); //North
//            world.setBlockState(new BlockPos(x+2, y+(2+i), z-10), Blocks.cobblestone_wall.getStateFromMeta(0)); //North
//            world.setBlockState(new BlockPos(x+10, y+(2+i), z-2), Blocks.cobblestone_wall.getStateFromMeta(0)); //East
//            world.setBlockState(new BlockPos(x+10, y+(2+i), z+2), Blocks.cobblestone_wall.getStateFromMeta(0)); //East
//            world.setBlockState(new BlockPos(x-2, y+(2+i), z+10), Blocks.cobblestone_wall.getStateFromMeta(0)); //South
//            world.setBlockState(new BlockPos(x+2, y+(2+i), z+10), Blocks.cobblestone_wall.getStateFromMeta(0)); //South
//            world.setBlockState(new BlockPos(x-10, y+(2+i), z-2), Blocks.cobblestone_wall.getStateFromMeta(0)); //West
//            world.setBlockState(new BlockPos(x-10, y+(2+i), z+2), Blocks.cobblestone_wall.getStateFromMeta(0)); //West
//        }
//
//        world.setBlockState(new BlockPos(x-7, y+2, z-6), Blocks.cobblestone_wall.getStateFromMeta(1));
//        world.setBlockState(new BlockPos(x+7, y+2, z-6), Blocks.cobblestone_wall.getStateFromMeta(1));
//        world.setBlockState(new BlockPos(x-7, y+2, z+6), Blocks.cobblestone_wall.getStateFromMeta(1));
//        world.setBlockState(new BlockPos(x+7, y+2, z+6), Blocks.cobblestone_wall.getStateFromMeta(1));
//
//
//        //Roof
//        for (int i = 0; i <= 6; i++) {
//            world.setBlockState(new BlockPos(x+1, y+9, z-(3+i)), glass); //North
//            world.setBlockState(new BlockPos(x-1, y+9, z-(3+i)), glass); //North
//            world.setBlockState(new BlockPos(x, y+9, z-(3+i)), glass); //North
//            world.setBlockState(new BlockPos(x-2, y+9, z-(3+i)), glass); //North
//            world.setBlockState(new BlockPos(x+2, y+9, z-(3+i)), glass); //North
//            world.setBlockState(new BlockPos(x+(3+i), y+9, z), glass); //East
//            world.setBlockState(new BlockPos(x+(3+i), y+9, z-1), glass); //East
//            world.setBlockState(new BlockPos(x+(3+i), y+9, z+1), glass); //East
//            world.setBlockState(new BlockPos(x+(3+i), y+9, z-2), glass); //East
//            world.setBlockState(new BlockPos(x+(3+i), y+9, z+2), glass); //East
//            world.setBlockState(new BlockPos(x+1, y+9, z+(3+i)), glass); //South
//            world.setBlockState(new BlockPos(x-1, y+9, z+(3+i)), glass); //South
//            world.setBlockState(new BlockPos(x, y+9, z+(3+i)), glass); //South
//            world.setBlockState(new BlockPos(x-2, y+9, z+(3+i)), glass); //South
//            world.setBlockState(new BlockPos(x+2, y+9, z+(3+i)), glass); //South
//            world.setBlockState(new BlockPos(x-(3+i), y+9, z), glass); //West
//            world.setBlockState(new BlockPos(x-(3+i), y+9, z-1), glass); //West
//            world.setBlockState(new BlockPos(x-(3+i), y+9, z+1), glass); //West
//            world.setBlockState(new BlockPos(x-(3+i), y+9, z-2), glass); //West
//            world.setBlockState(new BlockPos(x-(3+i), y+9, z+2), glass); //West
//        }
//
//        for (int i = 0; i <= 5; i++) {
//            world.setBlockState(new BlockPos(x+3, y+9, z-(3+i)), glass); //North East
//            world.setBlockState(new BlockPos(x+(3+i), y+9, z-3), glass); //North East
//            world.setBlockState(new BlockPos(x+3, y+9, z+(3+i)), glass); //South East
//            world.setBlockState(new BlockPos(x+(3+i), y+9, z+3), glass); //South East
//            world.setBlockState(new BlockPos(x-3, y+9, z-(3+i)), glass); //North West
//            world.setBlockState(new BlockPos(x-(3+i), y+9, z-3), glass); //North West
//            world.setBlockState(new BlockPos(x-3, y+9, z+(3+i)), glass); //South West
//            world.setBlockState(new BlockPos(x-(3+i), y+9, z+3), glass); //South West
//        }
//
//        for (int i = 0; i <= 4; i++) {
//            world.setBlockState(new BlockPos(x+4, y+9, z-(4+i)), glass); //North East
//            world.setBlockState(new BlockPos(x+(4+i), y+9, z-4), glass); //North East
//            world.setBlockState(new BlockPos(x+4, y+9, z+(4+i)), glass); //South East
//            world.setBlockState(new BlockPos(x+(4+i), y+9, z+4), glass); //South East
//            world.setBlockState(new BlockPos(x-4, y+9, z-(4+i)), glass); //North West
//            world.setBlockState(new BlockPos(x-(4+i), y+9, z-4), glass); //North West
//            world.setBlockState(new BlockPos(x-4, y+9, z+(4+i)), glass); //South West
//            world.setBlockState(new BlockPos(x-(4+i), y+9, z+4), glass); //South West
//        }
//
//        for (int i = 0; i <= 3; i++) {
//            world.setBlockState(new BlockPos(x+5, y+9, z-(5+i)), glass); //North East
//            world.setBlockState(new BlockPos(x+(5+i), y+9, z-5), glass); //North East
//            world.setBlockState(new BlockPos(x+5, y+9, z+(5+i)), glass); //South East
//            world.setBlockState(new BlockPos(x+(5+i), y+9, z+5), glass); //South East
//            world.setBlockState(new BlockPos(x-5, y+9, z-(5+i)), glass); //North West
//            world.setBlockState(new BlockPos(x-(5+i), y+9, z-5), glass); //North West
//            world.setBlockState(new BlockPos(x-5, y+9, z+(5+i)), glass); //South West
//            world.setBlockState(new BlockPos(x-(5+i), y+9, z+5), glass); //South West
//        }
//
//        world.setBlockState(new BlockPos(x, y+9, z-10), Blocks.stonebrick.getStateFromMeta(1)); //North
//        world.setBlockState(new BlockPos(x+1, y+9, z-10), Blocks.stonebrick.getStateFromMeta(2)); //Nort
//        world.setBlockState(new BlockPos(x+2, y+9, z-10), Blocks.stonebrick.getStateFromMeta(2)); //Nort
//        world.setBlockState(new BlockPos(x-1, y+9, z-10), Blocks.stonebrick.getStateFromMeta(2)); //Nort
//        world.setBlockState(new BlockPos(x-2, y+9, z-10), Blocks.stonebrick.getStateFromMeta(2)); //Nort
//        world.setBlockState(new BlockPos(x+3, y+9, z-9), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x+4, y+9, z-9), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x+5, y+9, z-8), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x+6, y+9, z-7), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x+7, y+9, z-6), Blocks.stonebrick.getStateFromMeta(1)); //North
//        world.setBlockState(new BlockPos(x-3, y+9, z-9), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x-4, y+9, z-9), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x-5, y+9, z-8), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x-6, y+9, z-7), Blocks.stonebrick.getStateFromMeta(2)); //North
//        world.setBlockState(new BlockPos(x-7, y+9, z-6), Blocks.stonebrick.getStateFromMeta(1)); //North
//        world.setBlockState(new BlockPos(x+10, y+9, z), Blocks.stonebrick.getStateFromMeta(1)); //East
//        world.setBlockState(new BlockPos(x+10, y+9, z+1), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+10, y+9, z+2), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+10, y+9, z-1), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+10, y+9, z-2), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+9, y+9, z+3), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+9, y+9, z+4), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+8, y+9, z+5), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+7, y+9, z+6), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x+6, y+9, z+7), Blocks.stonebrick.getStateFromMeta(1)); //East
//        world.setBlockState(new BlockPos(x-9, y+9, z+3), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x-9, y+9, z+4), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x-8, y+9, z+5), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x-7, y+9, z+6), Blocks.stonebrick.getStateFromMeta(2)); //East
//        world.setBlockState(new BlockPos(x, y+9, z+10), Blocks.stonebrick.getStateFromMeta(1)); //South
//        world.setBlockState(new BlockPos(x+1, y+9, z+10), Blocks.stonebrick.getStateFromMeta(2)); //Sout
//        world.setBlockState(new BlockPos(x+2, y+9, z+10), Blocks.stonebrick.getStateFromMeta(2)); //Sout
//        world.setBlockState(new BlockPos(x-1, y+9, z+10), Blocks.stonebrick.getStateFromMeta(2)); //Sout
//        world.setBlockState(new BlockPos(x-2, y+9, z+10), Blocks.stonebrick.getStateFromMeta(2)); //Sout
//        world.setBlockState(new BlockPos(x+3, y+9, z+9), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x+4, y+9, z+9), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x+5, y+9, z+8), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x+6, y+9, z+7), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x+7, y+9, z+6), Blocks.stonebrick.getStateFromMeta(1)); //South
//        world.setBlockState(new BlockPos(x-3, y+9, z+9), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x-4, y+9, z+9), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x-5, y+9, z+8), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x-6, y+9, z+7), Blocks.stonebrick.getStateFromMeta(2)); //South
//        world.setBlockState(new BlockPos(x-7, y+9, z+6), Blocks.stonebrick.getStateFromMeta(1)); //South
//        world.setBlockState(new BlockPos(x-10, y+9, z), Blocks.stonebrick.getStateFromMeta(1)); //West
//        world.setBlockState(new BlockPos(x-10, y+9, z+1), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x-10, y+9, z+2), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x-10, y+9, z-1), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x-10, y+9, z-2), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x+9, y+9, z-3), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x+9, y+9, z-4), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x+8, y+9, z-5), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x+7, y+9, z-6), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x+6, y+9, z-7), Blocks.stonebrick.getStateFromMeta(1)); //West
//        world.setBlockState(new BlockPos(x-9, y+9, z-3), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x-9, y+9, z-4), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x-8, y+9, z-5), Blocks.stonebrick.getStateFromMeta(2)); //West
//        world.setBlockState(new BlockPos(x-7, y+9, z-6), Blocks.stonebrick.getStateFromMeta(2)); //West
//
//        return true;
//    }
}
