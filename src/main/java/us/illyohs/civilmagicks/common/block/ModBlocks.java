/*
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
import net.minecraftforge.fml.common.registry.GameRegistry;
import us.illyohs.civilmagicks.api.block.BlockStar;
import us.illyohs.civilmagicks.common.block.nodes.BlockGeneralStar;
import us.illyohs.civilmagicks.common.block.nodes.ManaRing;
import us.illyohs.civilmagicks.common.block.nodes.NodeCivilAnalyzer;
import us.illyohs.civilmagicks.common.block.tile.node.TileGeneralStar;
import us.illyohs.civilmagicks.common.block.tile.node.TileNodeManaRing;
import us.illyohs.civilmagicks.common.block.world.BlockManaStone;
import us.illyohs.civilmagicks.common.core.lib.LibInfo;

public class ModBlocks {

    public static Block blockGrindStone;
    public static Block blockManaRing;
    public static Block nodeCivilAnalyzer;

    public static Block blockManaStone;

    public static BlockStar blockGeneralStar;

    //	public static Block

    public static void init() {

        blockManaStone = new BlockManaStone();
        blockManaRing = new ManaRing();
        
        nodeCivilAnalyzer = new NodeCivilAnalyzer();

        blockGeneralStar = new BlockGeneralStar();

        gameRegBlock();
        gameRegTile();
    }

    private static void gameRegBlock() {
        GameRegistry.registerBlock(blockManaStone, "manastone");
        GameRegistry.registerBlock(blockManaRing, LibInfo.MOD_ID + "_manaring");
        GameRegistry.registerBlock(blockGeneralStar, "generalstar");
        GameRegistry.registerBlock(nodeCivilAnalyzer, "civilanalyzer");

    }

    private static void gameRegTile() {
        GameRegistry.registerTileEntity(TileNodeManaRing.class, LibInfo.MOD_ID + "manaring_tile");
        GameRegistry.registerTileEntity(TileGeneralStar.class, LibInfo.MOD_ID +"genralstar");
    }


}
