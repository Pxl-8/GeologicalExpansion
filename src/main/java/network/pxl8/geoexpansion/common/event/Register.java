package network.pxl8.geoexpansion.common.event;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;
import network.pxl8.geoexpansion.common.blocks.BlockOre;
import network.pxl8.geoexpansion.common.blocks.BlockStone;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;
import network.pxl8.geoexpansion.common.items.ItemCrystalCluster;
import network.pxl8.geoexpansion.common.items.ItemDustCluster;
import network.pxl8.geoexpansion.common.items.ItemOreCluster;
import network.pxl8.geoexpansion.common.items.ModItems;

@Mod.EventBusSubscriber
public class Register {
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> blockReg = event.getRegistry();

        ModBlocks.registerModBlocks(blockReg);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> itemReg = event.getRegistry();

        ModBlocks.addAll();

        for (BlockStone block : ModBlocks.blockStoneList) { itemReg.register(createItemBlock(block)); }
        for (BlockOre ore : ModBlocks.blockOreList) { itemReg.register(createItemBlock(ore)); }

        ModItems.registerModItems(itemReg);
    }

    public static void registerOreDictionary(){
        for (ItemOreCluster cluster : ModItems.oreClusterList) { if (cluster.getOredict() != null) OreDictionary.registerOre(cluster.getOredict(), cluster); }
        for (ItemCrystalCluster cluster : ModItems.crystalClusterList) { if (cluster.getOredict() != null) OreDictionary.registerOre(cluster.getOredict(), cluster); }
        for (ItemDustCluster cluster : ModItems.dustClusterList) { if (cluster.getOredict() != null) OreDictionary.registerOre(cluster.getOredict(), cluster); }
    }

    public static void registerFurnaceRecipes() {
        for (ItemOreCluster cluster : ModItems.oreClusterList) { GameRegistry.addSmelting(cluster, cluster.getSmeltingOutput(), 1.0F); }
        for (ItemCrystalCluster cluster : ModItems.crystalClusterList) { GameRegistry.addSmelting(cluster, cluster.getSmeltingOutput(), 1.0F); }
        for (ItemDustCluster cluster : ModItems.dustClusterList) { GameRegistry.addSmelting(cluster, cluster.getSmeltingOutput(), 1.0F); }
    }

    private static Item createItemBlock(Block block) { return new ItemBlock(block).setRegistryName(block.getRegistryName()); }

    public static CreativeTabs geoexpansionTab = new CreativeTabs("tab_geoexpansion") {
        @Override
        public ItemStack getTabIconItem() { return new ItemStack(ModItems.oreClusterCoal); }
    };
}
