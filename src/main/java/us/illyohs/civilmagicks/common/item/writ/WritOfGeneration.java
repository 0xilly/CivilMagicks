package us.illyohs.civilmagicks.common.item.writ;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;


public class WritOfGeneration extends WritAOE {

    public WritOfGeneration() {
        super();
        this.setName("heal");//Come up with a better name
        this.setLore("applies the regeneration effect for x amount of time");
        this.setRadius(5);
        this.setDuration(10);
        
    }
    
    public void castSpell(EntityPlayer caster) {
        World world;
        if (world.getEntitiesWithinAABB(classEntity, bb)) {
            
        }
    }

}
