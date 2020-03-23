package network.pxl8.geoexpansion.common.blocks.traits;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import network.pxl8.geoexpansion.common.blocks.dynamic.BehaviorMixin;

public class TillableSoilTrait extends BehaviorMixin {
	@Override
	public boolean onTillBlock(World world, BlockPos pos, IBlockState state, ItemStack usedItem) {
		if (!world.isRemote) {
			world.setBlockState(pos, Blocks.FARMLAND.getDefaultState(), 11);
		}

		world.playSound(null, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

		return true;
	}
}
