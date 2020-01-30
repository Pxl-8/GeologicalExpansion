package network.pxl8.geoexpansion.common.world;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import network.pxl8.geoexpansion.common.blocks.BlockTintedBase;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;
import network.pxl8.geoexpansion.common.blocks.BlockStone;

import java.util.HashMap;
import java.util.Random;

public class StoneWorldGen implements IWorldGenerator {

    private static HashMap<IBlockState, Block> blockMap = new HashMap<>();

    static {
        for (BlockStone block : ModBlocks.blockStoneList) {
            blockMap.put(block.getBlockToReplace(), block);
        }
    }

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if(!(world instanceof WorldServer)) { return; }
            int posX = (chunkX * 16) + 3;
            int posZ = (chunkZ * 16) + 3;

            replaceBlocks(posX, posZ, world, blockMap);
    }

    private static void replaceBlocks(int chunkX, int chunkZ, World world, HashMap<IBlockState, Block> blockReplaceMap) {
        for (int x = chunkX; x < chunkX + 16; x++) {
            for (int z = chunkZ; z < chunkZ + 16; z++) {
                int maxY = world.getTopSolidOrLiquidBlock(new BlockPos(x, 0 , z)).getY();
                for (int y = 0; y < maxY; y++) {
                    IBlockState oldblock = world.getBlockState(new BlockPos(x, y, z));
                    for (IBlockState block : blockReplaceMap.keySet()) {
                        if (oldblock == block) {
                            world.setBlockState(new BlockPos(x, y, z), blockReplaceMap.get(block).getDefaultState().withProperty(BlockTintedBase.PROPERTY_DENSITY, BlockTintedBase.getDensityFromDepth(y)), 2);
                        }
                    }
                }
            }
        }
    }
}
