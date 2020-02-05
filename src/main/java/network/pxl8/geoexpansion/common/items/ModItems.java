package network.pxl8.geoexpansion.common.items;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import network.pxl8.geoexpansion.lib.LibMeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@GameRegistry.ObjectHolder(LibMeta.MOD_ID)
public class ModItems {
    @GameRegistry.ObjectHolder("ore_cluster")               public static ItemOreCluster oreClusterBase;
    @GameRegistry.ObjectHolder("crystal_cluster")           public static ItemCrystalCluster crystalClusterBase;
    @GameRegistry.ObjectHolder("dust_cluster")              public static ItemDustCluster dustClusterBase;

    @GameRegistry.ObjectHolder("ore_cluster_coal")          public static ItemOreCluster oreClusterCoal;
    @GameRegistry.ObjectHolder("ore_cluster_iron")          public static ItemOreCluster oreClusterIron;
    @GameRegistry.ObjectHolder("ore_cluster_gold")          public static ItemOreCluster oreClusterGold;

    @GameRegistry.ObjectHolder("crystal_cluster_diamond")   public static ItemCrystalCluster crystalClusterDiamond;
    @GameRegistry.ObjectHolder("crystal_cluster_emerald")   public static ItemCrystalCluster crystalClusterEmerald;

    @GameRegistry.ObjectHolder("dust_cluster_redstone")     public static ItemDustCluster dustClusterRedstone;
    @GameRegistry.ObjectHolder("dust_cluster_lapis")        public static ItemDustCluster dustClusterLapis;

    public static List<ItemOreCluster> oreClusterList = new ArrayList<>();
    public static List<ItemCrystalCluster> crystalClusterList = new ArrayList<>();
    public static List<ItemDustCluster> dustClusterList = new ArrayList<>();

    private static void addOreClusters() {
        oreClusterList.add(oreClusterBase);
        oreClusterList.add(oreClusterCoal);
        oreClusterList.add(oreClusterIron);
        oreClusterList.add(oreClusterGold);
    }
    private static void addCrystalClusters() {
        crystalClusterList.add(crystalClusterBase);
        crystalClusterList.add(crystalClusterDiamond);
        crystalClusterList.add(crystalClusterEmerald);
    }
    private static void addDustClusters() {
        dustClusterList.add(dustClusterBase);
        dustClusterList.add(dustClusterRedstone);
        dustClusterList.add(dustClusterLapis);
    }

    public static void addAll() {
        addOreClusters();
        addCrystalClusters();
        addDustClusters();
    }

    public static Map<String, String> clusterColourMap = new HashMap<>();
    static {
        //clusterColourMap.put("geoexpansion:", "0x");
        clusterColourMap.put("geoexpansion:ore_cluster", "0xCAF2FD");
        clusterColourMap.put("geoexpansion:crystal_cluster", "0xCAF2FD");
        clusterColourMap.put("geoexpansion:dust_cluster", "0xCAF2FD");

        clusterColourMap.put("geoexpansion:ore_cluster_coal", "0x343434");
        clusterColourMap.put("geoexpansion:ore_cluster_iron", "0xBC9980");
        clusterColourMap.put("geoexpansion:ore_cluster_gold", "0xFCEE4B");

        clusterColourMap.put("geoexpansion:crystal_cluster_diamond", "0x77CEFB");
        clusterColourMap.put("geoexpansion:crystal_cluster_emerald", "0x17DD62");

        clusterColourMap.put("geoexpansion:dust_cluster_redstone", "0x970303");
        clusterColourMap.put("geoexpansion:dust_cluster_lapis", "0x1546C2");
    }

    public static void registerModItems(IForgeRegistry<Item> itemreg) {
        itemreg.register(new ItemOreCluster(    "ore_cluster",      null, new ItemStack(Blocks.AIR)));
        itemreg.register(new ItemCrystalCluster("crystal_cluster",  null, new ItemStack(Blocks.AIR)));
        itemreg.register(new ItemDustCluster(   "dust_cluster",     null, new ItemStack(Blocks.AIR)));

        itemreg.register(new ItemOreCluster("ore_cluster_coal",             "oreCoal",      new ItemStack(Items.COAL)));
        itemreg.register(new ItemOreCluster("ore_cluster_iron",             "oreIron",      new ItemStack(Items.IRON_INGOT)));
        itemreg.register(new ItemOreCluster("ore_cluster_gold",             "oreGold",      new ItemStack(Items.GOLD_INGOT)));

        itemreg.register(new ItemCrystalCluster("crystal_cluster_diamond",  "oreDiamond",   new ItemStack(Items.DIAMOND)));
        itemreg.register(new ItemCrystalCluster("crystal_cluster_emerald",  "oreEmerald",   new ItemStack(Items.EMERALD)));

        itemreg.register(new ItemDustCluster("dust_cluster_redstone",       "oreRedstone",  new ItemStack(Items.REDSTONE, 2)));
        itemreg.register(new ItemDustCluster("dust_cluster_lapis",          "oreLapis",     new ItemStack(Items.DYE, 2, 4)));
    }
}
