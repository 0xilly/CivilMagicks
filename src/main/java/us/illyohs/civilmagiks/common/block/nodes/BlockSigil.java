package us.illyohs.civilmagiks.common.block.nodes;

import us.illyohs.libilly.block.BaseBlock;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSigil extends BaseBlock {

    public BlockSigil(Material material, String name, float hardness, float resistance, float light, boolean tick,
            CreativeTabs tab) {
        super(material, name, hardness, resistance, light, tick, tab);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
    }

}
