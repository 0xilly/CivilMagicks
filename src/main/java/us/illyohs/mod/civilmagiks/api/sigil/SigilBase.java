package us.illyohs.mod.civilmagiks.api.sigil;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;

public abstract class SigilBase {

    String  name;
    String  description;
    String  lore;
    String  texturePath;
    int     sigilColor;
    int     sigilAlphal;
    int     sizeMultiplier;
    boolean isPersistent;
    boolean usesMana;
    boolean needsSpace;

    abstract void execute(EntityPlayer writer, BlockPos pos);

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

    public void setTexturePath(String texturePath) {
        this.texturePath = texturePath;
    }

    public String getTexturePath() {
        return texturePath;
    }

    public void setSigilColor(int sigilColor) {
        this.sigilColor = sigilColor;
    }

    public int getSigilColor() {
        return sigilColor;
    }

    public void setSigilAlphal(int sigilAlphal) {
        this.sigilAlphal = sigilAlphal;
    }

    public int getSigilAlphal() {
        return sigilAlphal;
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
