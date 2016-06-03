package us.illyohs.civilmagiks.client.render.particle;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;

public class ParticleBase extends EntityFX {

    protected ParticleBase(World world, double posX, double posY, double posZ) {
        super(world, posX, posY, posZ);
    }
}
