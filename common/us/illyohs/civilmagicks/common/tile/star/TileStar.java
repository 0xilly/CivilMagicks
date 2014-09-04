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
 * Class created on Sep 3, 2014 at 2:58:23 PM
 * 
 */
package us.illyohs.civilmagicks.common.tile.star;

import us.illyohs.civilmagicks.api.mana.IManaBlock;
import us.illyohs.civilmagicks.api.mana.IManaCollector;
import us.illyohs.civilmagicks.api.mana.ManaType;
import net.minecraft.tileentity.TileEntity;

public class TileStar extends TileEntity implements IManaBlock, IManaCollector {
    

    public TileStar() {

    }

    @Override
    public int currentMana(int current) {
        return 0;
    }

    @Override
    public int maxMana(int max) {
        return 100;
    }

    @Override
    public int minMana(int min) {

        return 0;
    }

    @Override
    public ManaType canCollet() {
        return null;
    }

}
