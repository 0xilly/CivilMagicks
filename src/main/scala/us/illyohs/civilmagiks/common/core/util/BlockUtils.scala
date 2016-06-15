/**
 * Copyright (c) 2016, Anthony Anderson<Illyohs>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
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

package us.illyohs.civilmagiks.common.core.util

import scala.tools.nsc.util.HashSet

import net.minecraft.block.Block
import net.minecraft.world.World

import us.illyohs.civilmagiks.common.core.util.math.WorldPos

object BlockUtils {



  def getAttachedCardinalBlocks(world: World, pos: WorldPos): Array[Block] = {
    val ORIGIN  = world.getBlockState(pos).getBlock
    val NORTH   = world.getBlockState(pos.north).getBlock
    val SOUTH   = world.getBlockState(pos.south).getBlock
    val EAST    = world.getBlockState(pos.east).getBlock
    val WEST    = world.getBlockState(pos.south).getBlock
    val UP      = world.getBlockState(pos.up).getBlock
    val DOWN    = world.getBlockState(pos.down)getBlock

    Array(ORIGIN, NORTH, SOUTH, EAST, WEST, UP, DOWN)
  }

}
