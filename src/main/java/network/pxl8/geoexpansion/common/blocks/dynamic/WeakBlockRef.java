package network.pxl8.geoexpansion.common.blocks.dynamic;

import net.minecraft.util.ResourceLocation;

public class WeakBlockRef {
	private ResourceLocation resource;
	private int meta = 0;
	private int amount = 1;

	public ResourceLocation getResource() {
		return resource;
	}

	public int getMeta() {
		return meta;
	}

	public int getAmount() {
		return amount;
	}

	public BlockRef strengthen(IBlockLookup lookup) {
		return new BlockRef(lookup.lookup(resource), meta, amount);
	}
}
