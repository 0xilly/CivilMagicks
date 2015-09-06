package us.illyohs.mod.civilmagiks.common.block.nodes.stars;

import us.illyohs.mod.civilmagiks.client.core.creativetab.CivilTab;
import us.illyohs.mod.civilmagiks.common.core.lib.LibStrings;

public class BlockIlluminatingStar extends BlockStar {

   public BlockIlluminatingStar() {
       setUnlocalizedName(LibStrings.STAR_STARILLUMENATE);
       setCreativeTab(CivilTab.BLOCKS);
       setTickRandomly(true);
   }
}
