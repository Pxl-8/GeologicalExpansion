package network.pxl8.geoexpansion.common.blocks.dynamic;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class BehaviorMixin {
	/**
	 * Fired when this block is tilled.
	 * @return Success; true if the tilling was successful, false otherwise.
	 */
	public boolean onTillBlock(World world, BlockPos pos, IBlockState state, ItemStack usedItem) {
		return false;
	}
}
