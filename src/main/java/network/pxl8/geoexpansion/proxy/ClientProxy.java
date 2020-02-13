package network.pxl8.geoexpansion.proxy;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import network.pxl8.geoexpansion.common.blocks.BlockOre;
import network.pxl8.geoexpansion.common.blocks.BlockStone;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;
import network.pxl8.geoexpansion.common.items.*;
import network.pxl8.geoexpansion.lib.LibMeta;
import network.pxl8.geoexpansion.lib.LibTools;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit() {
        super.preInit();
    }

    @Override
    public void init() {
        ModItems.addAll();
        ModItems.addAllCompat();
        stoneColorHandler();
        itemColorHandler();
        initModels();
        super.init();
    }

    @Override
    public void postInit() {
        super.postInit();
    }

    private void stoneColorHandler() {
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(
                (state, world, pos, tintIndex) -> world != null && pos != null ? BlockStone.getColor(state) : 0xFFFFFF
                , ModBlocks.blockStoneList.toArray(new Block[ModBlocks.blockStoneList.size()]));
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(
                (state, world, pos, tintIndex) -> world != null && pos != null ? BlockStone.getColor(state) : 0xFFFFFF
                , ModBlocks.blockOreList.toArray(new Block[ModBlocks.blockOreList.size()]));
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(
                (state, world, pos, tintIndex) -> world != null && pos != null ? BlockStone.getColor(state) : 0xFFFFFF
                , ModBlocks.compatStoneList.toArray(new Block[ModBlocks.compatStoneList.size()]));
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(
                (state, world, pos, tintIndex) -> world != null && pos != null ? BlockStone.getColor(state) : 0xFFFFFF
                , ModBlocks.compatOreList.toArray(new Block[ModBlocks.compatOreList.size()]));
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

        Minecraft.getMinecraft().getItemColors().registerItemColorHandler(
                (stack, tintIndex) -> tintIndex == 0 ? 0xFFFFFF : LibTools.getHammerColour(stack)
                , ModItems.spallingHammerList.toArray(new Item[ModItems.spallingHammerList.size()]));

        try {
            Minecraft.getMinecraft().getItemColors().registerItemColorHandler(
                    (stack, tintIndex) -> tintIndex == 0 ? 0xFFFFFF : LibTools.getClusterColour(stack)
                    , ModItems.oreClusterListCompat.toArray(new Item[ModItems.oreClusterList.size()]));

            Minecraft.getMinecraft().getItemColors().registerItemColorHandler(
                    (stack, tintIndex) -> tintIndex == 0 ? 0xFFFFFF : LibTools.getClusterColour(stack)
                    , ModItems.crystalClusterListCompat.toArray(new Item[ModItems.crystalClusterList.size()]));

            Minecraft.getMinecraft().getItemColors().registerItemColorHandler(
                    (stack, tintIndex) -> tintIndex == 0 ? 0xFFFFFF : LibTools.getClusterColour(stack)
                    , ModItems.dustClusterListCompat.toArray(new Item[ModItems.dustClusterList.size()]));

        } catch (IllegalArgumentException e) { LibMeta.LOG.info(e.getMessage()); }

    }

    private void initModels() {
        for (BlockStone block : ModBlocks.blockStoneList) { registerBlockModel(block); }
        for (BlockOre ore : ModBlocks.blockOreList) { registerBlockModel(ore); }
        for (BlockStone block : ModBlocks.compatStoneList) { registerBlockModel(block); }
        for (BlockOre ore : ModBlocks.compatOreList) { registerBlockModel(ore); }


        for (ItemOreCluster cluster : ModItems.oreClusterList) { registerItemModel(cluster, "geoexpansion:ge.ore_cluster"); }
        for (ItemCrystalCluster cluster : ModItems.crystalClusterList) { registerItemModel(cluster, "geoexpansion:ge.crystal_cluster"); }
        for (ItemDustCluster cluster : ModItems.dustClusterList) { registerItemModel(cluster, "geoexpansion:ge.dust_cluster"); }

        for (ItemSpallingHammer hammer : ModItems.spallingHammerList) { registerItemModel(hammer, "geoexpansion:ge.spalling_hammer"); }

        for (ItemOreCluster cluster : ModItems.oreClusterListCompat) { registerItemModel(cluster, "geoexpansion:ge.ore_cluster"); }
        for (ItemCrystalCluster cluster : ModItems.crystalClusterListCompat) { registerItemModel(cluster, "geoexpansion:ge.crystal_cluster"); }
        for (ItemDustCluster cluster : ModItems.dustClusterListCompat) { registerItemModel(cluster, "geoexpansion:ge.dust_cluster"); }
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
