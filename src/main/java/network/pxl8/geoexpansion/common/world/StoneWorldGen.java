package network.pxl8.geoexpansion.common.world;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import network.pxl8.geoexpansion.DensityHelper;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;
import network.pxl8.geoexpansion.common.blocks.dynamic.IReplacingBlock;
import network.pxl8.geoexpansion.config.Conf;
import network.pxl8.geoexpansion.lib.LibMeta;

import java.util.HashMap;
import java.util.Random;

public class StoneWorldGen implements IWorldGenerator {

    private HashMap<IBlockState, Block> blockMap = new HashMap<>();

    {
        for (IReplacingBlock block : ModBlocks.allModBlocks) {
            if (!block.getTarget().equals(Blocks.AIR.getDefaultState())) {
                blockMap.put(block.getTarget(), block.getReplacement());
            }
        }
    }

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        if (!(world instanceof WorldServer)) { return; }
        if (world.provider.getDimensionType().equals(DimensionType.NETHER) || world.provider.getDimensionType().equals(DimensionType.THE_END)) { return; }

        int posX = (chunkX * 16);
        int posZ = (chunkZ * 16);

        try {
            replaceBlocksIn(world, posX, posZ, blockMap);
        } catch (NullPointerException e) {
            LibMeta.LOG.info(e.getMessage());
        }
    }

    private static void replaceBlocksIn(World world, int chunkX, int chunkZ, HashMap<IBlockState, Block> blockReplaceMap) {
        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                BlockPos bottom = new BlockPos(chunkX + x, 0, chunkZ + z);
                int maxY = world.getTopSolidOrLiquidBlock(bottom).getY();

                for (int y = 0; y < maxY; y++) {
                    BlockPos pos = new BlockPos(chunkX + x, y, chunkZ + z);
                    IBlockState oldBlock = world.getBlockState(pos);

                    if (blockReplaceMap.containsKey(oldBlock)) {
                        Block replacement = blockReplaceMap.get(oldBlock);

                        world.setBlockState(pos,
                                replacement.getDefaultState().withProperty(
                                        LibMeta.PROPERTY_DENSITY,
                                        DensityHelper.getDensityFromDepth(y)
                                ), 20);
                    } else if (oldBlock.getBlock() == Blocks.BEDROCK
                            && Conf.stone_config.FLAT_BEDROCK
                            && y > 0) {
                        world.setBlockState(pos, ModBlocks.blockStone.getDefaultState()
                                        .withProperty(LibMeta.PROPERTY_DENSITY, DensityHelper.getDensityFromDepth(y)),
                                20);
                    }
                }
            }
        }
    }
}
