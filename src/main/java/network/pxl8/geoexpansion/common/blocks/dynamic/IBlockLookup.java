package network.pxl8.geoexpansion.common.blocks.dynamic;

import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;

public interface IBlockLookup {
	Block lookup(ResourceLocation resource);
}
