/**
 * Copyright (c) 2014, Anthony Anderson(Lord Illyohs)
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
package us.illyohs.civilmagicks.common.block;

import net.minecraft.block.Block;
import us.illyohs.civilmagicks.common.block.star.BlockCivilStar;
import us.illyohs.civilmagicks.common.block.tea.BlockBrewChamber;
import us.illyohs.civilmagicks.common.block.tea.BlockTeaTank;
import us.illyohs.civilmagicks.common.lib.LibAddons;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlock {

    public static Block homeCore;
    public static Block cage;

    public static Block civilStar;

    public static Block summoningChamber;

    public static Block brewChamber;
    public static Block teaTank;

    public static void initCivil() {

        homeCore = new BlockHomeCore();
        cage = new BlockCage();

        civilStar = new BlockCivilStar();

        summoningChamber = new BlockSummoningChamber();

        brewChamber = new BlockBrewChamber();
        teaTank = new BlockTeaTank();

        gameRegCivil();

    }

    public static void initThaumcraft() {
        if (Loader.isModLoaded(LibAddons.Thaumcraft)) {

        }
    }

    private static void gameRegCivil() {
        GameRegistry.registerBlock(homeCore, "HomeCore");
        GameRegistry.registerBlock(civilStar, "civilStar");
        GameRegistry.registerBlock(summoningChamber, "summoningChamber");
        GameRegistry.registerBlock(brewChamber, "BrewChamber");
        GameRegistry.registerBlock(teaTank, "teaTank");

    }

}
