package network.pxl8.geoexpansion.lib;

import net.minecraft.item.ItemStack;
import network.pxl8.geoexpansion.common.items.ModItems;

import java.util.Random;

public class LibTools {
    private static Random rand = new Random();
    public static Boolean randBoolRatio(int a, int b) {
        return (Integer.min(a, b) < rand.nextInt(a + b));
    }

    public static int getClusterColour(ItemStack stack) {
        return Integer.decode(ModItems.clusterColourMap.get(stack.getItem().getRegistryName().toString()));
    }
}
