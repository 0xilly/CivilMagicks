/**
 * Copyright (c) 2014, Anthony Anderson(Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package us.illyohs.civilmagiks.common.core.handler;

import java.util.ArrayList;
import java.util.List;

import us.illyohs.civilmagiks.api.item.ITransfrom;
import us.illyohs.civilmagiks.api.mana.ManaNetworkEvent;
import us.illyohs.civilmagiks.client.core.lib.LibAssets;
import us.illyohs.civilmagiks.common.block.ModBlocks;
import us.illyohs.civilmagiks.common.core.lib.CivilPlayer;
import us.illyohs.civilmagiks.common.core.util.LogUtils;

import us.illyohs.civilmagiks.common.core.util.PlayerUtils;
import us.illyohs.libilly.util.BlockUtils;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CivilEventHandler {

    List<Block> acceptableInnerBlocks = new ArrayList<Block>();

    public CivilEventHandler() {
        acceptableInnerBlocks.add(Blocks.stone_slab);
        acceptableInnerBlocks.add(Blocks.stone_slab2);
        acceptableInnerBlocks.add(Blocks.wooden_slab);
        // acceptableInnerBlocks.add(Blocks.brick)

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onEntityConstruct(EntityConstructing event) {
        if (event.entity instanceof EntityPlayer) {
            if (CivilPlayer.forPlayer((EntityPlayer) event.entity) == null) {
                event.entity.registerExtendedProperties(CivilPlayer.IDENT,
                        new CivilPlayer((EntityPlayer) event.entity));
            }
        }
    }

    @SubscribeEvent
    public void ManaNetworkEvent(ManaNetworkEvent event) {
        LogUtils.info("ManaEvent from " + event.tile.getPos() + ". Manatype is " + event.manaType);
    }

    @SubscribeEvent
    public void onPlayerInteractEvent(PlayerInteractEvent event) {
//        if (!event.entityPlayer.worldObj.isRemote && PlayerUtils.getHeldItem(event.entityPlayer) == Items.written_book
//                && event.action == Action.RIGHT_CLICK_BLOCK && event.action != Action.RIGHT_CLICK_AIR) {
//
//            BlockUtils.replaceBlockWithSoundPlayer(event.entityPlayer, event.world, event.pos, LibAssets.soundBlast, 3,
//                    4, Blocks.cauldron, ModBlocks.manaStone);
//
//        } else {
//
//        }
        if (!event.entityPlayer.worldObj.isRemote && event.action == Action.RIGHT_CLICK_BLOCK &&
                event.action != Action.RIGHT_CLICK_AIR && PlayerUtils.getHeldItem(event.entityPlayer) instanceof ITransfrom) {
            BlockUtils.replaceBlockWithSoundPlayer(event.entityPlayer, event.world, event.pos, LibAssets.soundBlast, 3, 4, Blocks.cauldron, ModBlocks.manaStone);
        } else {

        }
    }

}
