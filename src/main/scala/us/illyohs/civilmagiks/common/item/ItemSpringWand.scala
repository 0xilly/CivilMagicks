package us.illyohs.civilmagiks.common.item

import net.minecraft.block.state.IBlockState
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.init.Blocks
import net.minecraft.item.ItemStack
import net.minecraft.util.EnumActionResult
import net.minecraft.util.EnumFacing
import net.minecraft.util.EnumHand
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import us.illyohs.civilmagiks.common.block.ModBlocks
import us.illyohs.civilmagiks.common.core.util.CivilItem

class ItemSpringWand(name: String, hasSubtypes: Boolean, tabs: CreativeTabs)
  extends CivilItem(name, hasSubtypes, tabs) {

  override def onItemUse(stack: ItemStack, player: EntityPlayer, world: World, pos: BlockPos, hand: EnumHand, facing: EnumFacing, hitX: Float, hitY: Float, hitZ: Float): EnumActionResult = {

    val x: Int = pos.getX
    val y: Int = pos.getY
    val z: Int = pos.getZ

    val stone: IBlockState = Blocks.STONEBRICK.getDefaultState
    val lamp: IBlockState = Blocks.SEA_LANTERN.getDefaultState
    val glass: IBlockState = Blocks.GLASS.getDefaultState

    world.setBlockState(new BlockPos(x, y + 1, z), ModBlocks.manaSpring.getDefaultState)
    world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState)
    world.setBlockState(new BlockPos(x, y - 1, z), lamp)
    world.setBlockState(new BlockPos(x, y, z - 1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 1, y, z), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x, y, z + 1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(3))
    world.setBlockState(new BlockPos(x - 1, y, z), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(0))
    world.setBlockState(new BlockPos(x - 1, y, z + 1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(0))
    world.setBlockState(new BlockPos(x - 1, y, z - 1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(0))
    world.setBlockState(new BlockPos(x + 1, y, z + 1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x + 1, y, z - 1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x, y, z - 2), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(3))
    world.setBlockState(new BlockPos(x + 1, y, z - 2), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(3))
    world.setBlockState(new BlockPos(x - 1, y, z - 2), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(3))
    world.setBlockState(new BlockPos(x + 2, y, z), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(0))
    world.setBlockState(new BlockPos(x + 2, y, z - 1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(0))
    world.setBlockState(new BlockPos(x + 2, y, z + 1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(0))
    world.setBlockState(new BlockPos(x, y, z + 2), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 1, y, z + 2), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 1, y, z + 2), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 2, y, z), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 2, y, z - 1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 2, y, z + 1), Blocks.STONE_BRICK_STAIRS.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 2, y, z + 2), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 2, y, z - 2), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 2, y, z + 2), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 2, y, z - 2), Blocks.STONEBRICK.getStateFromMeta(2))

    val i =1
    for (i <- 1 to 7) {
      world.setBlockState(new BlockPos(x + 1, y, z - (3 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - 1, y, z - (3 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x, y, z - (3 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - 2, y, z - (3 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + 2, y, z - (3 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + (3 + i), y, z), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + (3 + i), y, z - 1), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + (3 + i), y, z + 1), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + (3 + i), y, z - 2), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + (3 + i), y, z + 2), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + 1, y, z + (3 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - 1, y, z + (3 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x, y, z + (3 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - 2, y, z + (3 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + 2, y, z + (3 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - (3 + i), y, z), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - (3 + i), y, z - 1), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - (3 + i), y, z + 1), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - (3 + i), y, z - 2), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - (3 + i), y, z + 2), Blocks.STONEBRICK.getStateFromMeta(2))
      }

    for (i <- 1 to 6) {
      world.setBlockState(new BlockPos(x + 3, y, z - (3 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + (3 + i), y, z - 3), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + 3, y, z + (3 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + (3 + i), y, z + 3), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - 3, y, z - (3 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - (3 + i), y, z - 3), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - 3, y, z + (3 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - (3 + i), y, z + 3), Blocks.STONEBRICK.getStateFromMeta(2))

    }

    for (i <- 1 to 5) {
      world.setBlockState(new BlockPos(x + 4, y, z - (4 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + (4 + i), y, z - 4), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + 4, y, z + (4 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + (4 + i), y, z + 4), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - 4, y, z - (4 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - (4 + i), y, z - 4), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - 4, y, z + (4 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - (4 + i), y, z + 4), Blocks.STONEBRICK.getStateFromMeta(2))

    }

    for (i <- 1 to 3) {
      world.setBlockState(new BlockPos(x + 5, y, z - (5 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + (5 + i), y, z - 5), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + 5, y, z + (5 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x + (5 + i), y, z + 5), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - 5, y, z - (5 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - (5 + i), y, z - 5), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - 5, y, z + (5 + i)), Blocks.STONEBRICK.getStateFromMeta(2))
      world.setBlockState(new BlockPos(x - (5 + i), y, z + 5), Blocks.STONEBRICK.getStateFromMeta(2))

    }

    world.setBlockState(new BlockPos(x + 6, y, z - 6), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 6, y, z - 7), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 7, y, z - 6), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 6, y, z + 6), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 6, y, z + 7), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 7, y, z + 6), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 6, y, z - 6), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 6, y, z - 7), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 7, y, z - 6), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 6, y, z + 6), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 6, y, z + 7), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 7, y, z + 6), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x, y + 1, z - 10), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x + 1, y + 1, z - 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 2, y + 1, z - 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 1, y + 1, z - 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 2, y + 1, z - 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 3, y + 1, z - 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 4, y + 1, z - 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 5, y + 1, z - 8), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 6, y + 1, z - 7), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 7, y + 1, z - 6), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 3, y + 1, z - 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 4, y + 1, z - 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 5, y + 1, z - 8), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 6, y + 1, z - 7), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 7, y + 1, z - 6), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x + 10, y + 1, z), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x + 10, y + 1, z + 1), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 10, y + 1, z + 2), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 10, y + 1, z - 1), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 10, y + 1, z - 2), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 9, y + 1, z + 3), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 9, y + 1, z + 4), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 8, y + 1, z + 5), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 7, y + 1, z + 6), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 6, y + 1, z + 7), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 9, y + 1, z + 3), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 9, y + 1, z + 4), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 8, y + 1, z + 5), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 7, y + 1, z + 6), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x, y + 1, z + 10), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x + 1, y + 1, z + 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 2, y + 1, z + 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 1, y + 1, z + 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 2, y + 1, z + 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 3, y + 1, z + 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 4, y + 1, z + 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 5, y + 1, z + 8), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 6, y + 1, z + 7), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 7, y + 1, z + 6), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 3, y + 1, z + 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 4, y + 1, z + 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 5, y + 1, z + 8), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 6, y + 1, z + 7), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 7, y + 1, z + 6), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 10, y + 1, z), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 10, y + 1, z + 1), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 10, y + 1, z + 2), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 10, y + 1, z - 1), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 10, y + 1, z - 2), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 9, y + 1, z - 3), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 9, y + 1, z - 4), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 8, y + 1, z - 5), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 7, y + 1, z - 6), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 6, y + 1, z - 7), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 9, y + 1, z - 3), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 9, y + 1, z - 4), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 8, y + 1, z - 5), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 7, y + 1, z - 6), Blocks.STONEBRICK.getStateFromMeta(2))

    for (i <- 1 to 6) {
      world.setBlockState(new BlockPos(x - 2, y + (2 + i), z - 10), Blocks.COBBLESTONE_WALL.getStateFromMeta(0))
      world.setBlockState(new BlockPos(x + 2, y + (2 + i), z - 10), Blocks.COBBLESTONE_WALL.getStateFromMeta(0))
      world.setBlockState(new BlockPos(x + 10, y + (2 + i), z - 2), Blocks.COBBLESTONE_WALL.getStateFromMeta(0))
      world.setBlockState(new BlockPos(x + 10, y + (2 + i), z + 2), Blocks.COBBLESTONE_WALL.getStateFromMeta(0))
      world.setBlockState(new BlockPos(x - 2, y + (2 + i), z + 10), Blocks.COBBLESTONE_WALL.getStateFromMeta(0))
      world.setBlockState(new BlockPos(x + 2, y + (2 + i), z + 10), Blocks.COBBLESTONE_WALL.getStateFromMeta(0))
      world.setBlockState(new BlockPos(x - 10, y + (2 + i), z - 2), Blocks.COBBLESTONE_WALL.getStateFromMeta(0))
      world.setBlockState(new BlockPos(x - 10, y + (2 + i), z + 2), Blocks.COBBLESTONE_WALL.getStateFromMeta(0))
    }

    world.setBlockState(new BlockPos(x - 7, y + 2, z - 6), Blocks.COBBLESTONE_WALL.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x + 7, y + 2, z - 6), Blocks.COBBLESTONE_WALL.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 7, y + 2, z + 6), Blocks.COBBLESTONE_WALL.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x + 7, y + 2, z + 6), Blocks.COBBLESTONE_WALL.getStateFromMeta(1))

    for (i <- 1 to 6) {
      world.setBlockState(new BlockPos(x + 1, y + 9, z - (3 + i)), glass)
      world.setBlockState(new BlockPos(x - 1, y + 9, z - (3 + i)), glass)
      world.setBlockState(new BlockPos(x, y + 9, z - (3 + i)), glass)
      world.setBlockState(new BlockPos(x - 2, y + 9, z - (3 + i)), glass)
      world.setBlockState(new BlockPos(x + 2, y + 9, z - (3 + i)), glass)
      world.setBlockState(new BlockPos(x + (3 + i), y + 9, z), glass)
      world.setBlockState(new BlockPos(x + (3 + i), y + 9, z - 1), glass)
      world.setBlockState(new BlockPos(x + (3 + i), y + 9, z + 1), glass)
      world.setBlockState(new BlockPos(x + (3 + i), y + 9, z - 2), glass)
      world.setBlockState(new BlockPos(x + (3 + i), y + 9, z + 2), glass)
      world.setBlockState(new BlockPos(x + 1, y + 9, z + (3 + i)), glass)
      world.setBlockState(new BlockPos(x - 1, y + 9, z + (3 + i)), glass)
      world.setBlockState(new BlockPos(x, y + 9, z + (3 + i)), glass)
      world.setBlockState(new BlockPos(x - 2, y + 9, z + (3 + i)), glass)
      world.setBlockState(new BlockPos(x + 2, y + 9, z + (3 + i)), glass)
      world.setBlockState(new BlockPos(x - (3 + i), y + 9, z), glass)
      world.setBlockState(new BlockPos(x - (3 + i), y + 9, z - 1), glass)
      world.setBlockState(new BlockPos(x - (3 + i), y + 9, z + 1), glass)
      world.setBlockState(new BlockPos(x - (3 + i), y + 9, z - 2), glass)
      world.setBlockState(new BlockPos(x - (3 + i), y + 9, z + 2), glass)
    }

    for (i <- 1 to 5) {
      world.setBlockState(new BlockPos(x + 3, y + 9, z - (3 + i)), glass)
      world.setBlockState(new BlockPos(x + (3 + i), y + 9, z - 3), glass)
      world.setBlockState(new BlockPos(x + 3, y + 9, z + (3 + i)), glass)
      world.setBlockState(new BlockPos(x + (3 + i), y + 9, z + 3), glass)
      world.setBlockState(new BlockPos(x - 3, y + 9, z - (3 + i)), glass)
      world.setBlockState(new BlockPos(x - (3 + i), y + 9, z - 3), glass)
      world.setBlockState(new BlockPos(x - 3, y + 9, z + (3 + i)), glass)
      world.setBlockState(new BlockPos(x - (3 + i), y + 9, z + 3), glass)

    }

    for (i <- 1 to 4) {
      world.setBlockState(new BlockPos(x + 4, y + 9, z - (4 + i)), glass)
      world.setBlockState(new BlockPos(x + (4 + i), y + 9, z - 4), glass)
      world.setBlockState(new BlockPos(x + 4, y + 9, z + (4 + i)), glass)
      world.setBlockState(new BlockPos(x + (4 + i), y + 9, z + 4), glass)
      world.setBlockState(new BlockPos(x - 4, y + 9, z - (4 + i)), glass)
      world.setBlockState(new BlockPos(x - (4 + i), y + 9, z - 4), glass)
      world.setBlockState(new BlockPos(x - 4, y + 9, z + (4 + i)), glass)
      world.setBlockState(new BlockPos(x - (4 + i), y + 9, z + 4), glass)
    }

    for (i <- 1 to 3) {
      world.setBlockState(new BlockPos(x + 5, y + 9, z - (5 + i)), glass)
      world.setBlockState(new BlockPos(x + (5 + i), y + 9, z - 5), glass)
      world.setBlockState(new BlockPos(x + 5, y + 9, z + (5 + i)), glass)
      world.setBlockState(new BlockPos(x + (5 + i), y + 9, z + 5), glass)
      world.setBlockState(new BlockPos(x - 5, y + 9, z - (5 + i)), glass)
      world.setBlockState(new BlockPos(x - (5 + i), y + 9, z - 5), glass)
      world.setBlockState(new BlockPos(x - 5, y + 9, z + (5 + i)), glass)
      world.setBlockState(new BlockPos(x - (5 + i), y + 9, z + 5), glass)
    }

    world.setBlockState(new BlockPos(x, y + 9, z - 10), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x + 1, y + 9, z - 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 2, y + 9, z - 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 1, y + 9, z - 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 2, y + 9, z - 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 3, y + 9, z - 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 4, y + 9, z - 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 5, y + 9, z - 8), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 6, y + 9, z - 7), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 7, y + 9, z - 6), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 3, y + 9, z - 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 4, y + 9, z - 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 5, y + 9, z - 8), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 6, y + 9, z - 7), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 7, y + 9, z - 6), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x + 10, y + 9, z), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x + 10, y + 9, z + 1), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 10, y + 9, z + 2), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 10, y + 9, z - 1), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 10, y + 9, z - 2), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 9, y + 9, z + 3), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 9, y + 9, z + 4), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 8, y + 9, z + 5), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 7, y + 9, z + 6), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 6, y + 9, z + 7), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 9, y + 9, z + 3), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 9, y + 9, z + 4), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 8, y + 9, z + 5), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 7, y + 9, z + 6), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x, y + 9, z + 10), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x + 1, y + 9, z + 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 2, y + 9, z + 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 1, y + 9, z + 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 2, y + 9, z + 10), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 3, y + 9, z + 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 4, y + 9, z + 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 5, y + 9, z + 8), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 6, y + 9, z + 7), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 7, y + 9, z + 6), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 3, y + 9, z + 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 4, y + 9, z + 9), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 5, y + 9, z + 8), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 6, y + 9, z + 7), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 7, y + 9, z + 6), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 10, y + 9, z), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 10, y + 9, z + 1), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 10, y + 9, z + 2), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 10, y + 9, z - 1), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 10, y + 9, z - 2), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 9, y + 9, z - 3), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 9, y + 9, z - 4), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 8, y + 9, z - 5), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 7, y + 9, z - 6), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x + 6, y + 9, z - 7), Blocks.STONEBRICK.getStateFromMeta(1))
    world.setBlockState(new BlockPos(x - 9, y + 9, z - 3), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 9, y + 9, z - 4), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 8, y + 9, z - 5), Blocks.STONEBRICK.getStateFromMeta(2))
    world.setBlockState(new BlockPos(x - 7, y + 9, z - 6), Blocks.STONEBRICK.getStateFromMeta(2))
    return EnumActionResult.PASS
  }
}