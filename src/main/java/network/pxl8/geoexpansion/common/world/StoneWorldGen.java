package network.pxl8.geoexpansion.common.world;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import network.pxl8.geoexpansion.common.blocks.BlockOre;
import network.pxl8.geoexpansion.common.blocks.BlockTintedBase;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;
import network.pxl8.geoexpansion.common.blocks.BlockStone;
import network.pxl8.geoexpansion.config.Conf;
import network.pxl8.geoexpansion.lib.LibMeta;

import java.util.HashMap;
import java.util.Random;

public class StoneWorldGen implements IWorldGenerator {

    private static HashMap<IBlockState, Block> blockMap = new HashMap<>();

    static {
        for (BlockStone block : ModBlocks.blockStoneList) {
            if (block != ModBlocks.blockStone) {
                if (!block.getBlockToReplace().equals(Blocks.AIR.getDefaultState())) {
                    blockMap.put(block.getBlockToReplace(), block);
                }
            }

        }

        for (BlockOre ore : ModBlocks.blockOreList) {
            if (!ore.getBlockToReplace().equals(Blocks.AIR.getDefaultState())) {
                blockMap.put(ore.getBlockToReplace(), ore);
            }
        }

        for (BlockStone block : ModBlocks.compatStoneList) {
            if (!block.getBlockToReplace().equals(Blocks.AIR.getDefaultState())) {
                blockMap.put(block.getBlockToReplace(), block);
            }
        }

        for (BlockOre ore : ModBlocks.compatOreList) {
            if (!ore.getBlockToReplace().equals(Blocks.AIR.getDefaultState())) {
                blockMap.put(ore.getBlockToReplace(), ore);
            }
        }

    }

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (!(world instanceof WorldServer)) {
            return;
        }
        int posX = (chunkX * 16) + 1;
        int posZ = (chunkZ * 16) + 1;

        try {
            replaceBlocks(posX, posZ, world, blockMap);
        } catch (NullPointerException e) {
            LibMeta.LOG.info(e.getMessage());
        }
    }

    private static void replaceBlocks(int posX, int posZ, World world, HashMap<IBlockState, Block> blockReplaceMap) {
        for (int x = posX; x < posX + 30; x++) {
            for (int z = posZ; z < posZ + 30; z++) {
                int maxY = world.getTopSolidOrLiquidBlock(new BlockPos(x, 0 , z)).getY();
                for (int y = 0; y < maxY; y++) {
                    IBlockState oldBlock = world.getBlockState(new BlockPos(x, y, z));
                    if (oldBlock == Blocks.STONE.getDefaultState() && x > (posX+6) && x < (posX+23)  && z > (posZ+6) && z < (posZ+23)) {
                        world.setBlockState(new BlockPos(x, y, z), ModBlocks.blockStone.getDefaultState().withProperty(LibMeta.PROPERTY_DENSITY, BlockTintedBase.getDensityFromDepth(y)), 20);
                    } else {
                        for (IBlockState block : blockReplaceMap.keySet()) {
                            if (oldBlock == block) {
                                world.setBlockState(new BlockPos(x, y, z), blockReplaceMap.get(block).getDefaultState().withProperty(LibMeta.PROPERTY_DENSITY, BlockTintedBase.getDensityFromDepth(y)), 20);
                            }
                        }
                    }
                }
            }
        }
    }
}
