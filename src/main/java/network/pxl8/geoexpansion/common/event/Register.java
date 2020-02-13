package network.pxl8.geoexpansion.common.event;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.OreIngredient;
import net.minecraftforge.registries.IForgeRegistry;
import network.pxl8.geoexpansion.common.blocks.BlockOre;
import network.pxl8.geoexpansion.common.blocks.BlockStone;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;
import network.pxl8.geoexpansion.common.items.*;
import network.pxl8.geoexpansion.lib.LibMeta;


import static net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE;

@Mod.EventBusSubscriber
public class Register {
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> blockReg = event.getRegistry();

        ModBlocks.registerModBlocks(blockReg);
        ModBlocks.registerCompat(blockReg);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> itemReg = event.getRegistry();

        ModBlocks.addAll();
        ModBlocks.addAllCompat();

        for (BlockStone block : ModBlocks.blockStoneList) { itemReg.register(createItemBlock(block)); }
        for (BlockOre ore : ModBlocks.blockOreList) { itemReg.register(createItemBlock(ore)); }
        for (BlockStone block : ModBlocks.compatStoneList) { itemReg.register(createItemBlock(block)); }
        for (BlockOre ore : ModBlocks.compatOreList) { itemReg.register(createItemBlock(ore)); }

        ModItems.registerModItems(itemReg);
        ModItems.registerCompat(itemReg);
    }

    private static Item createItemBlock(Block block) { return new ItemBlock(block).setRegistryName(block.getRegistryName()); }

    //Recipe register methods
    public static void registerOreDictionary(){
        for (ItemOreCluster cluster : ModItems.oreClusterList) {
            if (cluster.getOredict() != null) {
                OreDictionary.registerOre(cluster.getOredict(), cluster);
            }
        }

        for (ItemCrystalCluster cluster : ModItems.crystalClusterList) {
            if (cluster.getOredict() != null) {
                OreDictionary.registerOre(cluster.getOredict(), cluster);
            }
        }
        for (ItemDustCluster cluster : ModItems.dustClusterList) {
            if (cluster.getOredict() != null) {
                OreDictionary.registerOre(cluster.getOredict(), cluster);
            }
        }

        //for (ItemSpallingHammer hammer : ModItems.spallingHammerList) { OreDictionary.registerOre("toolSpallingHammer", new ItemStack(hammer, 1, WILDCARD_VALUE)); }

        for (ItemOreCluster cluster : ModItems.oreClusterListCompat) {
            if (cluster.getOredict() != null) {
                OreDictionary.registerOre(cluster.getOredict(), cluster);
            }
        }
        for (ItemCrystalCluster cluster : ModItems.crystalClusterListCompat) {
            if (cluster.getOredict() != null) {
                OreDictionary.registerOre(cluster.getOredict(), cluster);
            }
        }
        for (ItemDustCluster cluster : ModItems.dustClusterListCompat) {
            if (cluster.getOredict() != null) {
                OreDictionary.registerOre(cluster.getOredict(), cluster);
            }
        }
    }

    public static void registerFurnaceRecipes() {
        for (ItemOreCluster cluster : ModItems.oreClusterList) { if (cluster.getSmeltingOutput() != null) GameRegistry.addSmelting(cluster, cluster.getSmeltingOutput(), 1.0F); }
        for (ItemCrystalCluster cluster : ModItems.crystalClusterList) { if (cluster.getSmeltingOutput() != null) GameRegistry.addSmelting(cluster, cluster.getSmeltingOutput(), 1.0F); }
        for (ItemDustCluster cluster : ModItems.dustClusterList) { if (cluster.getSmeltingOutput() != null) GameRegistry.addSmelting(cluster, cluster.getSmeltingOutput(), 1.0F); }

        for (ItemOreCluster cluster : ModItems.oreClusterListCompat) { if (cluster.getSmeltingOutput() != null) GameRegistry.addSmelting(cluster, cluster.getSmeltingOutput(), 1.0F); }
        for (ItemCrystalCluster cluster : ModItems.crystalClusterListCompat) { if (cluster.getSmeltingOutput() != null) GameRegistry.addSmelting(cluster, cluster.getSmeltingOutput(), 1.0F); }
        for (ItemDustCluster cluster : ModItems.dustClusterListCompat) { if (cluster.getSmeltingOutput() != null) GameRegistry.addSmelting(cluster, cluster.getSmeltingOutput(), 1.0F); }
    }

    //TODO: This is complete trash, need to replace with custom recipe factories and recipe.jsons
    public static void registerCraftingRecipes() {
        ResourceLocation hammer_group = new ResourceLocation(LibMeta.MOD_ID + ":" + "spalling_hammer_recipes");
        ResourceLocation cluster_group = new ResourceLocation(LibMeta.MOD_ID + ":" + "cluster_spalling_recipes");
        for (ItemSpallingHammer hammer : ModItems.spallingHammerList) {
            for (ItemOreCluster cluster : ModItems.oreClusterList) { ResourceLocation recipe = new ResourceLocation("geoexpansion:" + hammer.getRef() + "_" + cluster.getRef());
                if (cluster.getSpallingOutput() != null) GameRegistry.addShapelessRecipe(recipe, cluster_group, cluster.getSpallingOutput(), Ingredient.fromStacks(new ItemStack(hammer, 1, WILDCARD_VALUE)), Ingredient.fromItem(cluster));
            }
            for (ItemCrystalCluster cluster : ModItems.crystalClusterList) { ResourceLocation recipe = new ResourceLocation("geoexpansion:" + hammer.getRef() + "_" + cluster.getRef());
                if (cluster.getSpallingOutput() != null) GameRegistry.addShapelessRecipe(recipe, cluster_group, cluster.getSpallingOutput(), Ingredient.fromStacks(new ItemStack(hammer, 1, WILDCARD_VALUE)), Ingredient.fromItem(cluster));
            }
            for (ItemDustCluster cluster : ModItems.dustClusterList) { ResourceLocation recipe = new ResourceLocation("geoexpansion:" + hammer.getRef() + "_" + cluster.getRef());
                if (cluster.getSpallingOutput() != null) GameRegistry.addShapelessRecipe(recipe, cluster_group, cluster.getSpallingOutput(), Ingredient.fromStacks(new ItemStack(hammer, 1, WILDCARD_VALUE)), Ingredient.fromItem(cluster));
            }

            for (ItemOreCluster cluster : ModItems.oreClusterListCompat) { ResourceLocation recipe = new ResourceLocation("geoexpansion:" + hammer.getRef() + "_" + cluster.getRef());
                if (cluster.getSpallingOutput() != null) GameRegistry.addShapelessRecipe(recipe, cluster_group, cluster.getSpallingOutput(), Ingredient.fromStacks(new ItemStack(hammer, 1, WILDCARD_VALUE)), Ingredient.fromItem(cluster));
            }
            for (ItemCrystalCluster cluster : ModItems.crystalClusterListCompat) { ResourceLocation recipe = new ResourceLocation("geoexpansion:" + hammer.getRef() + "_" + cluster.getRef());
                if (cluster.getSpallingOutput() != null) GameRegistry.addShapelessRecipe(recipe, cluster_group, cluster.getSpallingOutput(), Ingredient.fromStacks(new ItemStack(hammer, 1, WILDCARD_VALUE)), Ingredient.fromItem(cluster));
            }
            for (ItemDustCluster cluster : ModItems.dustClusterListCompat) { ResourceLocation recipe = new ResourceLocation("geoexpansion:" + hammer.getRef() + "_" + cluster.getRef());
                if (cluster.getSpallingOutput() != null) GameRegistry.addShapelessRecipe(recipe, cluster_group, cluster.getSpallingOutput(), Ingredient.fromStacks(new ItemStack(hammer, 1, WILDCARD_VALUE)), Ingredient.fromItem(cluster));
            }

            if (hammer.getMaterial() != null) {
                GameRegistry.addShapedRecipe(new ResourceLocation("geoexpansion:" + hammer.getRef()), hammer_group, new ItemStack(hammer),
                        "XX ", "XXX", " H ", 'X', new OreIngredient(hammer.getMaterial()), 'H', new OreIngredient("stickWood")
                );
            }
        }
    }

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