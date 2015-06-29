package us.illyohs.civilmagicks.common.entity.mob;

import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.world.World;

public class EntityButler extends EntityServant {

    public EntityButler(World worldIn) {
        super(worldIn);
        setHealth(40f);
        ((PathNavigateGround)this.getNavigator()).setEnterDoors(true);;
        ((PathNavigateGround)this.getNavigator()).setAvoidsWater(true);
//        this.tasks.addTask(p_75776_1_, p_75776_2_);
    }

}
