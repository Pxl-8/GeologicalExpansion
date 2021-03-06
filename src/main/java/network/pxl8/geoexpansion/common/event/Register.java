package network.pxl8.geoexpansion.common.event;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;
import network.pxl8.geoexpansion.common.blocks.dynamic.DynamicTintedBlock;
import network.pxl8.geoexpansion.common.items.*;
import network.pxl8.geoexpansion.lib.LibTools;

import static net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE;

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

        for (Block block : ModBlocks.allModBlocks) {
            itemReg.register(createItemBlock(block));
        }

        ModItems.registerModItems(itemReg);
        ModItems.registerCompat(itemReg);
    }

    @SubscribeEvent
    public static void registerOreDict(RegistryEvent.Register<Biome> event) {
        // we use the biome event because it's guaranteed to fire *after* the item event and after object holders
        // have been refreshed.

        ItemLists lists = new ItemLists();
        ModItems.addAllTo(lists);

        Register.registerOreDictionary(lists);
        Register.registerFurnaceRecipes(lists);
    }

    private static Item createItemBlock(Block block) {
        return new ItemBlock(block).setRegistryName(block.getRegistryName());
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        for (Block block : ModBlocks.allModBlocks) { registerBlockModel(block); }

        ItemLists lists = new ItemLists();
        ModItems.addAllTo(lists);

        for (ItemOreCluster cluster : lists.getOreClusterList()) {
            registerItemModel(cluster, "geoexpansion:ge.ore_cluster"); }
        for (ItemCrystalCluster cluster : lists.getCrystalClusterList()) {
            registerItemModel(cluster, "geoexpansion:ge.crystal_cluster"); }
        for (ItemDustCluster cluster : lists.getDustClusterList()) {
            registerItemModel(cluster, "geoexpansion:ge.dust_cluster"); }

        for (ItemSpallingHammer hammer : lists.getSpallingHammerList()) {
            registerItemModel(hammer, "geoexpansion:ge.spalling_hammer"); }
    }

    private static void registerBlockModel(Block block) {
        registerItemModel(Item.getItemFromBlock(block));
    }
    private static void registerItemModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
    private static void registerItemModel(Item item, String resource_location) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(resource_location, "inventory"));
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerBlockColors(ColorHandlerEvent.Block event) {
        for(DynamicTintedBlock block : ModBlocks.allModBlocks) {
            event.getBlockColors().registerBlockColorHandler((state, world, pos, tintIndex) ->
                    world != null && pos != null && tintIndex == 0 ? block.getColor(state) : -1, block);
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event) {
        ItemLists lists = new ItemLists();
        ModItems.addAllTo(lists);

        for(Item cluster : lists.getSpallingHammerList()) {
            event.getItemColors().registerItemColorHandler((stack, tintIndex) ->
                    tintIndex == 0 ? 0xFFFFFF : LibTools.getHammerColour(stack), cluster); }

        for(Item cluster : lists.getOreClusterList()) {
            event.getItemColors().registerItemColorHandler((stack, tintIndex) ->
                    tintIndex == 0 ? 0xFFFFFF : LibTools.getClusterColour(stack), cluster); }
        for(Item cluster : lists.getCrystalClusterList()) {
            event.getItemColors().registerItemColorHandler((stack, tintIndex) ->
                    tintIndex == 0 ? 0xFFFFFF : LibTools.getClusterColour(stack), cluster); }
        for(Item cluster : lists.getDustClusterList()) {
            event.getItemColors().registerItemColorHandler((stack, tintIndex) ->
                    tintIndex == 0 ? 0xFFFFFF : LibTools.getClusterColour(stack), cluster); }
    }

    //  Recipe register methods
    public static void registerOreDictionary(ItemLists lists){
        for (ItemSpallingHammer hammer : lists.getSpallingHammerList()) {
            OreDictionary.registerOre("toolSpallingHammer", new ItemStack(hammer, 1, WILDCARD_VALUE)); }

        for (ItemOreCluster cluster : lists.getOreClusterList()) {
            if (cluster.getOredict() != null) { OreDictionary.registerOre(cluster.getOredict(), cluster); }
        }
        for (ItemCrystalCluster cluster : lists.getCrystalClusterList()) {
            if (cluster.getOredict() != null) { OreDictionary.registerOre(cluster.getOredict(), cluster); }
        }
        for (ItemDustCluster cluster : lists.getDustClusterList()) {
            if (cluster.getOredict() != null) { OreDictionary.registerOre(cluster.getOredict(), cluster); }
        }
    }

    public static void registerFurnaceRecipes(ItemLists lists) {
        for (ItemOreCluster cluster : lists.getOreClusterList()) {
            if (cluster.getSmeltingOutput() != null)
                GameRegistry.addSmelting(cluster, cluster.getSmeltingOutput(), 1.0F); }
        for (ItemCrystalCluster cluster : lists.getCrystalClusterList()) {
            if (cluster.getSmeltingOutput() != null)
                GameRegistry.addSmelting(cluster, cluster.getSmeltingOutput(), 1.0F); }
        for (ItemDustCluster cluster : lists.getDustClusterList()) {
            if (cluster.getSmeltingOutput() != null)
                GameRegistry.addSmelting(cluster, cluster.getSmeltingOutput(), 1.0F); }
    }

    //  Creative Tabs
    public static CreativeTabs geoexpansionTabGeneral = new CreativeTabs("tab_geoexpansion_general") {
        @Override
        public ItemStack getTabIconItem() { return new ItemStack(ModItems.spallingHammerBase); }
    };
    public static CreativeTabs geoexpansionTabBlocks = new CreativeTabs("tab_geoexpansion_blocks") {
        @Override
        public ItemStack getTabIconItem() { return new ItemStack(Item.getItemFromBlock(ModBlocks.oreIron)); }
    };
    public static CreativeTabs geoexpansionTabClusters = new CreativeTabs("tab_geoexpansion_clusters") {
        @Override
        public ItemStack getTabIconItem() { return new ItemStack(ModItems.crystalClusterBase); }
    };
}