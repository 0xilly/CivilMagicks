package us.illyohs.civilmagiks.api.sigil;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

public abstract class Sigil extends IForgeRegistryEntry.Impl<Sigil> {

    String modid, unLocalizedName;
    int              radius;
    ResourceLocation texture;
    BlockPos         pos;
    boolean          isSingleUse = false;

    abstract public void onPlayerRightClick(World world, BlockPos pos, EntityPlayer player);

    abstract public void onEntityCollied(World world, BlockPos pos, Entity entity);

    abstract public void onEntityLivingCollied(World world, BlockPos pos, EntityLivingBase entity);

    abstract public void onUpdate();

    public NBTTagCompound writeToNBT(NBTTagCompound tag) {
        return tag;
    }

    public void readFromNBT(NBTTagCompound tag) {
    }

    public void setModid(String modid) {
        this.modid = modid;
    }

    public String getModid() {
        return modid;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setUnLocalizedName(String unLocalizedName) {
        this.unLocalizedName = unLocalizedName;
    }

    public String getUnLocalizedName() {
        return unLocalizedName;
    }

    public void setTexture(ResourceLocation texture) {
        this.texture = texture;
    }

    public ResourceLocation getTexture() {
        return texture;
    }

    public boolean isSingleUse()
    {
        return isSingleUse;
    }

    public void setSingleUse(boolean singleUse)
    {
        isSingleUse = singleUse;
    }

    public BlockPos getPos() {
        return pos;
    }

    //INTERNAL DO NOT USE
    @Deprecated
    public void setPos(BlockPos pos) {
        this.pos = pos;
    }

}

