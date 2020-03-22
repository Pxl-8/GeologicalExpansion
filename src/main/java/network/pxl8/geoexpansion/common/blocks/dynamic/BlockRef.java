package network.pxl8.geoexpansion.common.blocks.dynamic;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

public class BlockRef implements IRegistryItemRef {
	private Block block;
	private int meta;
	private int amount;

	public BlockRef(Block block, int meta, int amount) {
		this.block = block;
		this.meta = meta;
		this.amount = amount;
	}

	public ItemStack createStack() {
		return new ItemStack(block, amount, meta);
	}

	public Block getBlock() {
		return block;
	}

	public IBlockState getState() {
		return block.getStateFromMeta(meta);
	}
}
