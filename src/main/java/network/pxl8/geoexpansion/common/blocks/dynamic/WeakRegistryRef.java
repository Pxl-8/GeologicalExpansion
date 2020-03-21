package network.pxl8.geoexpansion.common.blocks.dynamic;

import net.minecraft.util.ResourceLocation;

public class WeakRegistryRef {
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

	public BlockRef toBlockRef(IBlockLookup lookup) {
		return new BlockRef(lookup.lookup(resource), meta, amount);
	}

	public ItemRef toItemRef(IItemLookup lookup) {
		return new ItemRef(lookup.lookup(resource), meta, amount);
	}
}
