package network.pxl8.geoexpansion.common.event;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import network.pxl8.geoexpansion.common.blocks.BlockTintedBase;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;
import network.pxl8.geoexpansion.common.blocks.BlockStone;

import java.util.HashMap;

//@Mod.EventBusSubscriber
public class StoneOverride {

    private static HashMap<IBlockState, Block> blockMap = new HashMap<>();

    static {
        for (BlockStone block : ModBlocks.blockStoneList) {
            blockMap.put(block.getBlockToReplace(), block);
        }
    }

    @SubscribeEvent(priority = EventPriority.LOWEST, receiveCanceled = true)
    public static void onChunkGen(ChunkEvent.Load event) {
        replaceBlocks(event.getChunk(), blockMap);

        event.getChunk().markDirty();
    }

    public static void replaceBlocks(Chunk chunk, HashMap<IBlockState, Block> blockReplaceMap) {
        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                for (int y = 0; y < chunk.getHeightValue(x, z) + 1; y++) {
                    for (IBlockState block : blockReplaceMap.keySet()) {
                        if (chunk.getBlockState(x ,y, z) == block) {
                            chunk.setBlockState(new BlockPos(x, y, z), blockReplaceMap.get(block).getDefaultState().withProperty(BlockTintedBase.PROPERTY_DENSITY, BlockTintedBase.getDensityFromDepth(y)));
                        }
                    }
                }
            }
        }
    }
}
