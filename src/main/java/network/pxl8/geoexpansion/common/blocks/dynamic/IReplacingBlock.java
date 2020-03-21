package network.pxl8.geoexpansion.common.blocks.dynamic;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public interface IReplacingBlock {
	IBlockState getTarget();
	Block getReplacement();
}
