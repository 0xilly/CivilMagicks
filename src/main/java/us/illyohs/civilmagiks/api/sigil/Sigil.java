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

public abstract class Sigil extends IForgeRegistryEntry.Impl<Sigil> {

    String              modid, unLocalizedName;
    int                 radius;
    ResourceLocation    texture;

    abstract public void onUpdate();

    abstract public void writeToNBT(NBTTagCompound tag);

    abstract public void readFromNBT(NBTTagCompound tag);

    abstract public EnumActionResult onPlayerHit(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ);

    abstract public EnumActionResult onEntityCollied(Entity entity, World world, BlockPos pos, EnumFacing facing, float x, float y, float z);

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


}
