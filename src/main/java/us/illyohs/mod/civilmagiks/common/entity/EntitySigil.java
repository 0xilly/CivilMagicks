package us.illyohs.mod.civilmagiks.common.entity;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import net.minecraftforge.fml.relauncher.ReflectionHelper;

public class EntitySigil extends Entity {

    AxisAlignedBB bbox = ReflectionHelper.getPrivateValue(Entity.class, null, new String[] { "boundingBox", "field_70121_D", "f" });
    String        name;
    float         radius;

    public EntitySigil(World world, float radius, String name) {
        super(world);
        setRadius(radius);
        setSize(getRadius(), 0.1f);
        setName(name);
    }

    @Override
    public AxisAlignedBB getBoundingBox() {
        return bbox;

    }
    
    @Override
    public AxisAlignedBB getCollisionBox(Entity entity) {
        return entity.getBoundingBox();
    }

    @Override
    protected void entityInit() {

    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tag) {
        super.readFromNBT(tag);
        name = tag.getString("name");
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound tag) {
        super.writeToNBT(tag);
        tag.setString("name", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
