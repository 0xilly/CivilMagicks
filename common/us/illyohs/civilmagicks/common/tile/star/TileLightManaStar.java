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
 * Class created on Sep 3, 2014 at 3:05:46 PM
 * 
 */
package us.illyohs.civilmagicks.common.tile.star;

import us.illyohs.civilmagicks.api.mana.ManaType;

public class TileLightManaStar extends TileStar {
    
    

    @Override
    public ManaType canCollet() {
        return ManaType.LIGHT;
    }
}
