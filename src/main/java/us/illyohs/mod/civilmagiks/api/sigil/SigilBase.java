package us.illyohs.mod.civilmagiks.api.sigil;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ResourceLocation;

public abstract class SigilBase {

    String           name;
    String           description;
    String           lore;
    ResourceLocation texture;
    int              sizeMultiplier;
    int              lightLevel;
    boolean          isPersistent;
    boolean          usesMana;
    boolean          needsSpace;

    public abstract void execute(EntityPlayer writer, BlockPos pos);

    public abstract void readFromCustomNBT(NBTTagCompound cNBT);
    public abstract void writeToCustomNBT(NBTTagCompound cNBT);

    public void readFromNBT(NBTTagCompound nbt) {
        this.readFromCustomNBT(nbt);
    }

    public void writeToNBT(NBTTagCompound nbt) {
        nbt.setString("sigilname", name);
        nbt.setString("sigildescription", description);
        nbt.setString("sgillore", lore);
        nbt.setString("sigiltexture", texture.getResourcePath());
        nbt.setInteger("sigillightlevel", lightLevel);
        nbt.setInteger("sigilesizemultipler", sizeMultiplier);
        this.writeToCustomNBT(nbt);
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

    public void setSizeMultiplier(int sizeMultiplier) {
        this.sizeMultiplier = sizeMultiplier;
    }

    public int getSizeMultiplier() {
        return sizeMultiplier;
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
}
