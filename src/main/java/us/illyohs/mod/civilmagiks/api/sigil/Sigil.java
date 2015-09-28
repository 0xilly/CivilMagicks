package us.illyohs.mod.civilmagiks.api.sigil;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public abstract class Sigil {

    String           name;
    String           description;
    String           lore;
    ResourceLocation texture;
    int              radius;
    int              lightLevel;
    boolean          isPersistent;
    boolean          usesMana;
    boolean          needsSpace;
    BlockPos         pos;

    public abstract void execute(EntityPlayer writer);

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public String getLore() {
        return lore;
    }

    public void setTexture(ResourceLocation texture) {
        this.texture = texture;
    }

    public ResourceLocation getTexture() {
        return texture;
    }

    public void setLightLevel(int lightLevel) {
        this.lightLevel = lightLevel;
    }

    public int getLightLevel() {
        return lightLevel;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setIsPersistent(boolean isPersistent) {
        this.isPersistent = isPersistent;
    }

    public boolean isPersistent() {
        return isPersistent;
    }

    public void setUsesMana(boolean usesMana) {
        this.usesMana = usesMana;
    }

    public boolean usesMana() {
        return usesMana;
    }

    public void setNeedsSpace(boolean needsSpace) {
        this.needsSpace = needsSpace;
    }

    public boolean isNeedsSpace() {
        return needsSpace;
    }

    public void setPos(BlockPos pos) {
        this.pos = pos;
    }

    public BlockPos getPos() {
        return pos;
    }
}
