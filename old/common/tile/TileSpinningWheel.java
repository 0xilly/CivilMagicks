package us.illyohs.civilmagiks.common.tile;

import net.minecraft.util.ITickable;
import us.illyohs.civilmagiks.common.core.util.tile.BaseTileInventory;

public class TileSpinningWheel extends BaseTileInventory implements ITickable{

    @Override
    public int getSizeInventory() {
        return 64;
    }

    @Override
    public void update() {

    }
}
