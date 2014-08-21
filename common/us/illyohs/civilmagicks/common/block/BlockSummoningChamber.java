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
 * Class created on Aug 10, 2014 at 11:04:27 PM
 * 
 */
package us.illyohs.civilmagicks.common.block;

import us.illyohs.civilmagicks.client.render.tile.TileSummoningChamber;
import us.illyohs.civilmagicks.common.lib.LibInfo;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockSummoningChamber extends BlockContainer {

    public BlockSummoningChamber() {
        super(Material.wood);
        setBlockName(LibInfo.MOD_ID + ":summonchamber");
        
    }

    @Override
    public TileEntity createNewTileEntity(World world, int tick) {
        return new TileSummoningChamber();
    }

}
