package network.pxl8.geoexpansion.common.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import network.pxl8.geoexpansion.common.event.Register;
import network.pxl8.geoexpansion.lib.LibMeta;
import network.pxl8.geoexpansion.lib.LibTools;

public class ItemClusterBase extends Item {
    private String refName;
    private String oredict;
    private String smeltingOutput;
    private String spallingOutput;

    ItemClusterBase(String registryName, String oredictName, String smeltingOutput, String spallingOutput) {
        this.setCreativeTab(Register.geoexpansionTabClusters);

        this.setRegistryName(registryName);
        this.setUnlocalizedName(LibMeta.MOD_ID + "." + registryName);

        this.refName = registryName;
        this.oredict = oredictName;
        this.smeltingOutput = smeltingOutput;
        this.spallingOutput = spallingOutput;
    }

    public String getRef() { return refName; }
    public String getOredict() {
        return this.oredict;
    }

    public ItemStack getSmeltingOutput() {
        if (smeltingOutput == null) { return null; }
        return LibTools.getStackFromString(smeltingOutput);
    }
    public ItemStack getSpallingOutput() {
        if (spallingOutput == null) { return null; }
        return LibTools.getStackFromString(spallingOutput);
    }
}