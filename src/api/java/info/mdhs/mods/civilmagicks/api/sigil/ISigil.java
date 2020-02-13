package info.mdhs.mods.civilmagicks.api.sigil;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.util.INBTSerializable;


public interface ISigil extends INBTSerializable<CompoundNBT>
{
    ResourceLocation getKey();

    @OnlyIn(Dist.CLIENT)
    ResourceLocation texture();

    void onColliedWithEntity(Entity entity, BlockPos pos);

    void onEntityRightClick(PlayerEntity entity, BlockPos pos);

    void onRandomTick(World world, BlockPos pso);

}
