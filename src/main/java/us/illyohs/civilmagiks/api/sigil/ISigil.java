package us.illyohs.civilmagiks.api.sigil;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface ISigil {

    String              getModid();

    int                 getRadius();

    String              getUnLocalizedName();

    ResourceLocation    getTexture();

    void                onUpdate();

    void                writeToNBT(NBTTagCompound tag);

    void                readFromNBT(NBTTagCompound tag);

    EnumActionResult    onPlayerHit(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing,
                                    float hitX, float hitY, float hitZ);

    EnumActionResult    onEntityCollied(Entity entity, World world, BlockPos pos, EnumFacing facing, float x, float y,
                                        float z);
}
