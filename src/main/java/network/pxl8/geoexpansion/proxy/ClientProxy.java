package network.pxl8.geoexpansion.proxy;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import network.pxl8.geoexpansion.common.blocks.BlockOre;
import network.pxl8.geoexpansion.common.blocks.BlockStone;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;
import network.pxl8.geoexpansion.common.items.*;
import network.pxl8.geoexpansion.lib.LibTools;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit() {
        super.preInit();
    }

    @Override
    public void init() {
        ModItems.addAll();
        stoneColorHandler();
        itemColorHandler();
        initModels();
        super.init();
    }

    @Override
    public void postInit() { super.postInit(); }

    private void stoneColorHandler() {
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(
                (state, world, pos, tintIndex) -> world != null && pos != null ? BlockStone.getColor(state) : 0xFFFFFF
                , ModBlocks.blockStoneList.toArray(new Block[ModBlocks.blockStoneList.size()]));
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(
                (state, world, pos, tintIndex) -> world != null && pos != null ? BlockStone.getColor(state) : 0xFFFFFF
                , ModBlocks.blockOreList.toArray(new Block[ModBlocks.blockOreList.size()]));
    }

    private void itemColorHandler() {
        Minecraft.getMinecraft().getItemColors().registerItemColorHandler(
                (stack, tintIndex) -> tintIndex == 0 ? 0xFFFFFF : LibTools.getClusterColour(stack)
                , ModItems.oreClusterList.toArray(new Item[ModItems.oreClusterList.size()]));
        Minecraft.getMinecraft().getItemColors().registerItemColorHandler(
                (stack, tintIndex) -> tintIndex == 0 ? 0xFFFFFF : LibTools.getClusterColour(stack)
                , ModItems.crystalClusterList.toArray(new Item[ModItems.crystalClusterList.size()]));
        Minecraft.getMinecraft().getItemColors().registerItemColorHandler(
                (stack, tintIndex) -> tintIndex == 0 ? 0xFFFFFF : LibTools.getClusterColour(stack)
                , ModItems.dustClusterList.toArray(new Item[ModItems.dustClusterList.size()]));
    }

    private void initModels() {
        for (BlockStone block : ModBlocks.blockStoneList) { registerBlockModel(block); }
        for (BlockOre ore : ModBlocks.blockOreList) { registerBlockModel(ore); }

        for (ItemOreCluster cluster : ModItems.oreClusterList) { registerItemModel(cluster, "geoexpansion:ore_cluster"); }
        for (ItemCrystalCluster cluster : ModItems.crystalClusterList) { registerItemModel(cluster, "geoexpansion:crystal_cluster"); }
        for (ItemDustCluster cluster : ModItems.dustClusterList) { registerItemModel(cluster, "geoexpansion:dust_cluster"); }
    }

    private static void registerBlockModel(Block block) {
        registerItemModel(Item.getItemFromBlock(block));
    }
    private static void registerItemModel(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        //ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
    private static void registerItemModel(Item item, String resource_location) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(resource_location, "inventory"));
    }
}
