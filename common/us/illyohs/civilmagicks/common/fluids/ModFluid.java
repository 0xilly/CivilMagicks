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
 * Class created on Aug 18, 2014 at 2:32:31 AM
 * 
 */
package us.illyohs.civilmagicks.common.fluids;

import us.illyohs.civilmagicks.common.lib.LibInfo;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

public class ModFluid {
    
    public static Fluid Tea;
    public static Block teaBlock;
    
    public static void init() {
        
        Tea = new FluidTea();
        teaBlock = new BlockTea(Tea, Material.water);
     
        gameReg();
        
    }

    private static void gameReg() {
        
        GameRegistry.registerBlock(teaBlock, LibInfo.MOD_ID + "teablock");
        
    }

}
