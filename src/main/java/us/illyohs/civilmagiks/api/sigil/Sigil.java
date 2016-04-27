package us.illyohs.civilmagiks.api.sigil;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

public class Sigil extends IForgeRegistryEntry.Impl<Sigil> implements ISigil {

    String              modid, unLocalizedName;
    int                 radius;
    ResourceLocation    texture;

    public void setModid(String modid) {
        this.modid = modid;
    }

    @Override
    public String getModid() {
        return modid;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getRadius() {
        return radius;
    }

    public void setUnLocalizedName(String unLocalizedName) {
        this.unLocalizedName = unLocalizedName;
    }

    @Override
    public String getUnLocalizedName() {
        return unLocalizedName;
    }

    public void setTexture(ResourceLocation texture) {
        this.texture = texture;
    }

    @Override
    public ResourceLocation getTexture() {
        return texture;
    }

    @Override
    public void onUpdate() {

    }

    @Override
    public void writeToNBT(NBTTagCompound tag) {

    }

    @Override
    public void readFromNBT(NBTTagCompound tag) {

    }

    @Override
    public EnumActionResult onPlayerHit(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        return null;
    }

    @Override
    public EnumActionResult onEntityCollied(Entity entity, World world, BlockPos pos, EnumFacing facing, float x, float y, float z) {
        return null;
    }
}
