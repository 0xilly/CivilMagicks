/**
 * Copyright (c) 2014, Anthony Anderson(Illyohs)
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
package us.illyohs.mod.civilmagiks.common.block;

import us.illyohs.mod.civilmagiks.client.core.creativetab.CivilTab;
import us.illyohs.mod.civilmagiks.common.block.nodes.BlockElementalBasin;
import us.illyohs.mod.civilmagiks.common.block.nodes.stars.BlockBasicStar;
import us.illyohs.mod.civilmagiks.common.block.nodes.stars.StarBlock;
import us.illyohs.mod.civilmagiks.common.block.tile.TileElementalBasin;
import us.illyohs.mod.civilmagiks.common.block.tile.star.TileBasicStar;
import us.illyohs.mod.civilmagiks.common.block.world.BlockClearFarmland;
import us.illyohs.mod.civilmagiks.common.block.world.BlockManaStone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block     blockBasin;

    public static StarBlock starBasic;

    public static BaseBlock blockManaStone;
    public static BaseBlock clearFarmland;

    public static void init() {

        blockBasin = new BlockElementalBasin();

        starBasic = new BlockBasicStar();

        blockManaStone = new BlockManaStone(Material.rock, "manastone", 3, 1, 0.5f, false, CivilTab.BLOCKS);
        clearFarmland = new BlockClearFarmland(Material.grass, "clearsoil", 3, 2, 0, true, CivilTab.BLOCKS);

        gameRegBlock();
        gameRegTile();
    }

    private static void gameRegBlock() {
        GameRegistry.registerBlock(blockManaStone, "manastone");
        GameRegistry.registerBlock(starBasic, "starbasic");
        GameRegistry.registerBlock(blockBasin, "elementalbasin");
        GameRegistry.registerBlock(clearFarmland, "clearsoil");
    }

    private static void gameRegTile() {
        GameRegistry.registerTileEntity(TileBasicStar.class, "tilebasicstar");
        GameRegistry.registerTileEntity(TileElementalBasin.class, "tileelementalstar");
    }

}
