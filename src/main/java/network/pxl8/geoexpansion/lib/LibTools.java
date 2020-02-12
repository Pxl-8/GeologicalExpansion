package network.pxl8.geoexpansion.lib;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
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

    public static int getHammerColour(ItemStack stack) {
        return Integer.decode(ModItems.hammerColourMap.get(stack.getItem().getRegistryName().toString()));
    }

    public static IBlockState getStateFromString(String block) {
        String[] blockSplit = block.split("/");

        IBlockState blockState = null;

        if (blockSplit.length == 2) {
            blockState = Block.getBlockFromName(blockSplit[0]).getStateFromMeta(Integer.parseInt(blockSplit[1]));
        } else if (blockSplit.length == 1) {
            blockState = Block.getBlockFromName(blockSplit[0]).getDefaultState();
        }

        return blockState;
    }

    public static ItemStack getStackFromString(String item) {
        String[] itemSplit = item.split("/");

        ItemStack itemStack = null;

        if (itemSplit.length == 3) {
            itemStack = new ItemStack(Item.getByNameOrId(itemSplit[0]), Integer.parseInt(itemSplit[2]), Integer.parseInt(itemSplit[1]));
        } else if (itemSplit.length == 2) {
            itemStack = new ItemStack(Item.getByNameOrId(itemSplit[0]), 1, Integer.parseInt(itemSplit[1]));
        } else if (itemSplit.length == 1) {
            itemStack = new ItemStack(Item.getByNameOrId(itemSplit[0]));
        }

        return itemStack;
    }
}
