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
 * Class created on Aug 18, 2014 at 2:34:43 AM
 * 
 */
package us.illyohs.civilmagicks.common.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidTea extends Fluid {

    public FluidTea() {
        super("tea");
//        setDensity(density)
        setTemperature(373);
        FluidRegistry.registerFluid(this);
    }

}
