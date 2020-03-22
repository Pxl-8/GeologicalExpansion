package network.pxl8.geoexpansion.common.blocks.dynamic;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemRef implements IRegistryItemRef {
	private Item item;
	private int meta;
	private int amount;

	public ItemRef(Item item, int meta, int amount) {
		this.item = item;
		this.meta = meta;
		this.amount = amount;
	}

	public ItemStack createStack() {
		return new ItemStack(item, amount, meta);
	}

	public Item getItem() {
		return item;
	}
}
