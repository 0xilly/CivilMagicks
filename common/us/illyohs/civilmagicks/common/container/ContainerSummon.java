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
 * Class created on Aug 11, 2014 at 12:09:47 AM
 * 
 */
package us.illyohs.civilmagicks.common.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import us.illyohs.civilmagicks.client.render.tile.TileSummoningChamber;

public class ContainerSummon extends Container {
    
    protected TileSummoningChamber tile;

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return false;
    }

}
