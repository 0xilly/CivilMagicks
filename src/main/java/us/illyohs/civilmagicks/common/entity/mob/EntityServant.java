package us.illyohs.civilmagicks.common.entity.mob;

import net.minecraft.entity.EntityCreature;
import net.minecraft.world.World;

public class EntityServant extends EntityCreature {

    public EntityServant(World worldIn) {
        super(worldIn);
    }
    
    @Override
    protected boolean canDespawn() {
        return false;
        
    }
}
