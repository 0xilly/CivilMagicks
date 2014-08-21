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
 * Class created on Aug 12, 2014 at 3:55:02 AM
 * 
 */
package us.illyohs.civilmagicks.common.core.handlers;

import us.illyohs.civilmagicks.common.lib.LibInfo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class SoundHandler {
    
    public static void whisle(World world, EntityPlayer player, float volume ,float pitch){
        world.playSoundAtEntity(player,(LibInfo.MOD_ID + ":spriteknowledge1"), volume, pitch);
}
}
