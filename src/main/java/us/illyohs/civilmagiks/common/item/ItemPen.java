package us.illyohs.civilmagiks.common.item;

import net.minecraft.creativetab.CreativeTabs;
import us.illyohs.civilmagiks.api.item.ITransfrom;
import us.illyohs.libilly.item.ItemBase;

public class ItemPen extends ItemBase implements ITransfrom{

    public ItemPen(String name, boolean hasSubtypes, CreativeTabs tabs) {
        super(name, hasSubtypes, tabs);
    }
}
