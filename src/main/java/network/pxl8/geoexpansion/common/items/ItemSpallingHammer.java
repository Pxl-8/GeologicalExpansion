package network.pxl8.geoexpansion.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import network.pxl8.geoexpansion.common.event.Register;
import network.pxl8.geoexpansion.lib.LibMeta;

public class ItemSpallingHammer extends Item {
    private String refName;

    ItemSpallingHammer(String registryName, int durability) {
        this.setCreativeTab(Register.geoexpansionTabGeneral);

        this.setRegistryName(registryName);
        this.setUnlocalizedName(LibMeta.MOD_ID + "." + registryName);

        this.setMaxStackSize(1);
        this.setMaxDamage(durability);
        this.refName = registryName;
    }

    public String getRef() { return refName; }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        ItemStack item = stack.copy();
        item.setItemDamage(item.getItemDamage() + 1);
        return item;
    }
}
