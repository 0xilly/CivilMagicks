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

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import us.illyohs.libilly.item.ItemBase;

public class ItemWellSpawner extends ItemBase {

    public ItemWellSpawner(String name, boolean hasSubtypes, CreativeTabs tabs) {
        super(name, hasSubtypes, tabs);
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {

        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        IBlockState stairs = Blocks.stone_stairs.getDefaultState();
        IBlockState stone  = Blocks.stonebrick.getDefaultState();
        IBlockState lamp   = Blocks.sea_lantern.getDefaultState();
        IBlockState wall   = Blocks.cobblestone_wall.getDefaultState();

        world.setBlockState(new BlockPos(x, y, z), lamp);

        world.setBlockState(new BlockPos(x, y+1, z), stairs);
        world.setBlockState(new BlockPos(x, y+1, z), stairs);
        world.setBlockState(new BlockPos(x, y+1, z), stairs);
        world.setBlockState(new BlockPos(x, y+1, z), stairs);
        world.setBlockState(new BlockPos(x, y+1, z), stairs);
        world.setBlockState(new BlockPos(x, y+1, z), stairs);
        return true;
    }
}
