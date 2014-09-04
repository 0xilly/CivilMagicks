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
 * Class created on Sep 3, 2014 at 2:46:39 PM
 * 
 */
package us.illyohs.civilmagicks.api.mana;

public interface IManaBlock {
    
    public int currentMana(int current);
    
    public int maxMana(int max);
    
    public int minMana(int min);
    
    public ManaType canCollet();
}
