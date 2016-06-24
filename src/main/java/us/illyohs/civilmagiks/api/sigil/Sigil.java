package us.illyohs.civilmagiks.api.sigil;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

public abstract class Sigil extends IForgeRegistryEntry.Impl<Sigil> implements INBTSerializable<NBTTagCompound> {

    String              modid, unLocalizedName;
    int                 radius, uses;
    ResourceLocation    texture;
    BlockPos            pos;

    public Sigil(int uses) {
        this.uses = uses;
    }

    abstract public void onPlayerClick(World world, BlockPos pos, EntityPlayer player);

    abstract public void onEntityCollied(World world, BlockPos pos, Entity entity);

    abstract public void onEntityLivingCollied(World world, BlockPos pos, EntityLivingBase entity);

    abstract public void onUpdate();

    public NBTTagCompound writeToNBT(NBTTagCompound tag) {
        return tag;
    }

    public void readFromNBT(NBTTagCompound tag) {
        tag.getInteger("Uses");
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

    public BlockPos getPos() {
        return pos;
    }

    //INTERNAL DO NOT USE
    @Deprecated
    public void setPos(BlockPos pos) {
        this.pos = pos;
    }

    public int getUses() {
        return uses;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound tag = new NBTTagCompound();

        return this.writeToNBT(tag);
    }

    @Override
    public void deserializeNBT(NBTTagCompound tag) {
        this.readFromNBT(tag);
    }
}
