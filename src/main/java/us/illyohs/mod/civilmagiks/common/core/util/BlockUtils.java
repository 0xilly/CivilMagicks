/**
 * Copyright (c) 2015, Anthony Anderson(Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
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
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package us.illyohs.mod.civilmagiks.common.core.util;

import us.illyohs.mod.civilmagiks.common.core.lib.LibInfo;

import net.minecraft.block.Block;
import net.minecraft.block.state.BlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockUtils {
   
    /**
     * 
     * @param world
     * @param pos
     * @param target
     * @param replacement
     */
    public static void replaceBlock(World world, BlockPos pos, Block target, Block replacement) {
        Block origin = world.getBlockState(pos).getBlock();
        if (origin == target) {
            world.setBlockState(pos, replacement.getDefaultState());
        } 
    }
   
    /**
     * 
     * @param player
     * @param world
     * @param pos
     * @param sound
     * @param volume
     * @param pitch
     * @param target
     * @param replacement
     */
    public static void replaceBlockWithSound(EntityPlayer player,  World world, BlockPos pos, String sound, int volume, int pitch, Block target, Block replacement) {
        Block origin = world.getBlockState(pos).getBlock();
        if (origin == target) {
            player.worldObj.playSoundAtEntity(player, (LibInfo.MOD_ID + ":" + sound), volume, pitch);
            world.setBlockState(pos, replacement.getDefaultState());            
        }      
    }
    
    /**
     * 
     * @param world
     * @param pos
     * @return
     */
    public static Block getBlockBelow(World world, BlockPos pos) {
        Block below = world.getBlockState(pos.down()).getBlock();
        return below;   
    }
    
    /**
     * 
     * @param world
     * @param pos
     * @param facing
     * @param distance
     * @return
     */
    public static Block getBlockFromDistance(World world, BlockPos pos, EnumFacing facing, int distance) {
        Block blockDist = world.getBlockState(pos.offset(facing, distance)).getBlock();
        return blockDist;
    }
   
    /**
     * 
     * @param world
     * @param pos
     * @param dis
     * @return
     */
    public static Block getBlockFromUpDistance(World world, BlockPos pos, int dis) {
    	Block blockDis = world.getBlockState(pos.offset(EnumFacing.UP, dis)).getBlock();
    	return blockDis;
    }
    
    /**
     * 
     * @param world
     * @param pos
     * @param dis
     * @return
     */
    public static Block getBlockFromDownDistance(World world, BlockPos pos, int dis) {
    	Block blockDis = world.getBlockState(pos.offset(EnumFacing.DOWN, dis)).getBlock();
    	return blockDis;
    }
    
    /**
     * 
     * @param world
     * @param pos
     * @param dis
     * @return
     */
    public static Block getBlockFromNorthDistance(World world, BlockPos pos, int dis) {
    	Block blockDis = world.getBlockState(pos.offset(EnumFacing.NORTH, dis)).getBlock();
    	return blockDis;
    }
    
    /**
     * 
     * @param world
     * @param pos
     * @param dis
     * @return
     */
    public static Block getBlockFromSouthDistance(World world, BlockPos pos, int dis) {
    	Block blockDis = world.getBlockState(pos.offset(EnumFacing.SOUTH, dis)).getBlock();
    	return blockDis;
    }
   
    /**
     * 
     * @param world
     * @param pos
     * @param dis
     * @return
     */
    public static Block getBlockFromEastDistance(World world, BlockPos pos, int dis) {
    	Block blockDis = world.getBlockState(pos.offset(EnumFacing.EAST, dis)).getBlock();
    	return blockDis;
    }
    
    /**
     * 
     * @param world
     * @param pos
     * @param dis
     * @return
     */
    public static Block getBlockFromWestDistance(World world, BlockPos pos, int dis) {
    	Block blockDis = world.getBlockState(pos.offset(EnumFacing.WEST, dis)).getBlock();
    	return blockDis;
    }
    
    /**
     * 
     * @param world
     * @param pos
     * @param facing
     * @param distance
     * @return
     */
    public static Block getBlockBelowFromDistance(World world, BlockPos pos, EnumFacing facing, int distance) {
        Block blockDist = world.getBlockState(pos.offset(facing, distance).down()).getBlock();
        return blockDist;
    }
    
    

}
