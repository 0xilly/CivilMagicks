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

package us.illyohs.civilmagiks.common.core.util.math

import Math.PI
import java.util

import net.minecraft.world.World

object MathUtils {

  def radiansToDegrees_F(radians: Float): Float = radians*(180/PI.toFloat)
  def radiansToDegrees_D(radians: Double): Double = radians*(180/PI)
  def degreesToRadians_F(degrees: Float): Float = degrees*(PI.toFloat/180)
  def degreesToRadians_D(degrees: Double): Double = degrees*(PI/180)

  def checkRadius(x:Int, y:Int, z:Int, radius:Int): Boolean=  (x * x) + (y * y) + (z * z) < ((radius + 0.5) * (radius + 0.5))

  //Fucking scala for loops
//  def getBlocksSpere(world: World, wpos: WorldPos, radius: Int): util.HashSet[WorldPos] = {
//    val worldHight = world.getHeight
//
//    val rSqrd   = (radius.toFloat+ .5F) * (radius.toFloat + .5F)
//    val wValuse =  util.HashSet[WorldPos]
//
//    val bottom  = Math.max(-radius - 1, -1 * (wpos.getY - 1))
//    val top     = Math.min(radius + 1, worldHight - wpos.getY)
//
//
//
//    wValuse
//  }

}
