package us.illyohs.mod.civilmagiks.api.sigil;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ResourceLocation;

public class Sigil {

    String           name;
    String           description;
    String           lore;
    ResourceLocation texture;
    int              radius;
    int              lightLevel;
    boolean          isPersistent;
    boolean          usesMana;
    boolean          canOverlap;
    BlockPos         pos;

    public Sigil(String name, String description, String lore, ResourceLocation texture, int radius, int lightLevel,
            boolean isPersistent, boolean usesMana, boolean canOverlap) {
        this.name = name;
        this.description = description;
        this.lore = lore;
        this.texture = texture;
        this.radius = radius;
        this.lightLevel = lightLevel;
        this.isPersistent = isPersistent;
        this.usesMana = usesMana;
        this.canOverlap = canOverlap;
    }

    public void onEntityCollied(Entity entity) {

    }

    public void onPlayerInteract(EntityPlayer player) {

    }

    public void readFromNBT(NBTTagCompound nbt) {
        nbt.getString("SigilName");
        nbt.getString("SigilDescription");
        nbt.getString("SigilLore");
        nbt.getInteger("SigilRadius");
        nbt.getInteger("SigilLightLevel");
        nbt.getBoolean("isPersistant");
        nbt.getBoolean("usesMana");
        nbt.getBoolean("canOverlap");
    }

    public void writeToNBT(NBTTagCompound nbt) {
        nbt.setString("StringName", name);
        nbt.setString("SigilDescription", description);
        nbt.setString("SigilLore", lore);
        nbt.setInteger("SigilRadius", radius);
        nbt.setInteger("SigilLightLevel", lightLevel);
        nbt.setBoolean("isPersistant", isPersistent);
        nbt.setBoolean("usesMana", usesMana);
        nbt.setBoolean("canOverlap", canOverlap);
    }

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

    public void setCanOverlap(boolean canOverlap) {
        this.canOverlap = canOverlap;
    }

    public boolean isCanOverlap() {
        return canOverlap;
    }
    
    public void setPos(BlockPos pos) {
        this.pos = pos;
    }
    
    public BlockPos getPos() {
        return pos;
    }

}
