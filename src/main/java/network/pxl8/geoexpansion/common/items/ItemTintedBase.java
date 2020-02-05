package network.pxl8.geoexpansion.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import network.pxl8.geoexpansion.common.event.Register;
import network.pxl8.geoexpansion.lib.LibMeta;

public class ItemTintedBase extends Item {
    private String oredict;
    private ItemStack smeltingOutput;

    ItemTintedBase(String registryName, String oredictName, ItemStack smeltingOutput) {
        this.setCreativeTab(Register.geoexpansionTab);

        this.setRegistryName(registryName);
        this.setUnlocalizedName(LibMeta.MOD_ID + "." + registryName);

        this.oredict = oredictName;
        this.smeltingOutput = smeltingOutput;
    }

    public String getOredict() {
        return this.oredict;
    }
    public ItemStack getSmeltingOutput() { return this.smeltingOutput; }
}