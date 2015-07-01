package us.illyohs.civilmagicks.common.entity.mob.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.util.BlockPos;

public class EntityAICleanUp extends EntityAIBase {

    EntityCreature entC;
    EntityItem     entI;

    @Override
    public boolean shouldExecute() {

        BlockPos blockpos   = new BlockPos(this.entC);
        BlockPos eneitypos  = new BlockPos(this.entI);
        
        if (finddroppedItems()) {
            
        }

        return false;
    }

    private boolean finddroppedItems() {
        return false;
    }

}
