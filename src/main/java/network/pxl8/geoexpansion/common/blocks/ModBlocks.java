package network.pxl8.geoexpansion.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import network.pxl8.geoexpansion.lib.LibMeta;
import network.pxl8.geoexpansion.lib.LibStone;

import java.util.ArrayList;
import java.util.List;

@GameRegistry.ObjectHolder(LibMeta.MOD_ID)
public class ModBlocks {
    @GameRegistry.ObjectHolder("stone")                 public static BlockStone blockStone;
    @GameRegistry.ObjectHolder("andesite")              public static BlockStone blockAndesite;
    @GameRegistry.ObjectHolder("diorite")               public static BlockStone blockDiorite;
    @GameRegistry.ObjectHolder("granite")               public static BlockStone blockGranite;

    @GameRegistry.ObjectHolder("dirt")                  public static BlockStone blockDirt;
    @GameRegistry.ObjectHolder("gravel")                public static BlockStone blockGravel;
    @GameRegistry.ObjectHolder("clay")                  public static BlockStone blockClay;

    @GameRegistry.ObjectHolder("ore_coal")              public static BlockOre oreCoal;
    @GameRegistry.ObjectHolder("ore_iron")              public static BlockOre oreIron;
    @GameRegistry.ObjectHolder("ore_gold")              public static BlockOre oreGold;
    @GameRegistry.ObjectHolder("ore_diamond")           public static BlockOre oreDiamond;
    @GameRegistry.ObjectHolder("ore_emerald")           public static BlockOre oreEmerald;
    @GameRegistry.ObjectHolder("ore_redstone")          public static BlockOre oreRedstone;
    @GameRegistry.ObjectHolder("ore_lapis")             public static BlockOre oreLapis;

    public static List<BlockStone> blockStoneList = new ArrayList<>();
    public static List<BlockOre> blockOreList = new ArrayList<>();

    private static void addStoneBlocks() {
        blockStoneList.add(blockStone);
        blockStoneList.add(blockAndesite);
        blockStoneList.add(blockDiorite);
        blockStoneList.add(blockGranite);

        blockStoneList.add(blockDirt);
        blockStoneList.add(blockGravel);
        blockStoneList.add(blockClay);
    }

    private static void addOreBlocks() {
        blockOreList.add(oreCoal);
        blockOreList.add(oreIron);
        blockOreList.add(oreGold);
        blockOreList.add(oreDiamond);
        blockOreList.add(oreEmerald);
        blockOreList.add(oreRedstone);
        blockOreList.add(oreLapis);
    }

    public static void addAll() {
        addStoneBlocks();
        addOreBlocks();
    }

    public static void registerModBlocks(IForgeRegistry<Block> blockReg) {
        blockReg.register(new BlockStone("stone",       "pickaxe", 1.5F, LibStone.STONE, new ItemStack(Blocks.COBBLESTONE), new ItemStack(Blocks.STONE, 1, 0)));
        blockReg.register(new BlockStone("andesite",    "pickaxe", 1.5F, LibStone.ANDESITE, new ItemStack(Blocks.STONE, 1, 5)));
        blockReg.register(new BlockStone("diorite",     "pickaxe", 1.5F, LibStone.DIORITE, new ItemStack(Blocks.STONE, 1, 3)));
        blockReg.register(new BlockStone("granite",     "pickaxe", 1.5F, LibStone.GRANITE, new ItemStack(Blocks.STONE, 1, 1)));

        blockReg.register(new BlockStone("dirt",        "shovel", 0.5F, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT), new ItemStack(Blocks.DIRT)));
        blockReg.register(new BlockStone("gravel",      "shovel", 0.6F, Blocks.GRAVEL.getDefaultState(), new ItemStack(Blocks.GRAVEL)));
        blockReg.register(new BlockStone("clay",        "shovel", 0.6F, Blocks.CLAY.getDefaultState(), new ItemStack(Blocks.CLAY)));

        blockReg.register(new BlockOre("ore_coal",      2.0F, "geoexpansion:ore_cluster_coal"));
        blockReg.register(new BlockOre("ore_iron",      2.0F, "geoexpansion:ore_cluster_iron"));
        blockReg.register(new BlockOre("ore_gold",      2.0F, "geoexpansion:ore_cluster_gold"));
        blockReg.register(new BlockOre("ore_diamond",   2.0F, "geoexpansion:crystal_cluster_diamond"));
        blockReg.register(new BlockOre("ore_emerald",   2.0F, "geoexpansion:crystal_cluster_emerald"));
        blockReg.register(new BlockOre("ore_redstone",  2.0F, "geoexpansion:ore_cluster_redstone"));
        blockReg.register(new BlockOre("ore_lapis",     2.0F, "geoexpansion:ore_cluster_lapis"));
    }
}