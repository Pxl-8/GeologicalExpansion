package network.pxl8.geoexpansion.common.blocks.dynamic;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public interface IItemLookup {
	Item lookup(ResourceLocation resource);
}
