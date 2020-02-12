package network.pxl8.geoexpansion.common.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;
import network.pxl8.geoexpansion.compat.CompatHandler;
import network.pxl8.geoexpansion.lib.LibMeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@GameRegistry.ObjectHolder(LibMeta.MOD_ID)
public class ModItems {
    @GameRegistry.ObjectHolder("ge.ore_cluster")                public static ItemOreCluster oreClusterBase;
    @GameRegistry.ObjectHolder("ge.crystal_cluster")            public static ItemCrystalCluster crystalClusterBase;
    @GameRegistry.ObjectHolder("ge.dust_cluster")               public static ItemDustCluster dustClusterBase;

    @GameRegistry.ObjectHolder("mc.ore_cluster_coal")           public static ItemOreCluster oreClusterCoal;
    @GameRegistry.ObjectHolder("mc.ore_cluster_iron")           public static ItemOreCluster oreClusterIron;
    @GameRegistry.ObjectHolder("mc.ore_cluster_gold")           public static ItemOreCluster oreClusterGold;
    @GameRegistry.ObjectHolder("mc.crystal_cluster_diamond")    public static ItemCrystalCluster crystalClusterDiamond;
    @GameRegistry.ObjectHolder("mc.crystal_cluster_emerald")    public static ItemCrystalCluster crystalClusterEmerald;
    @GameRegistry.ObjectHolder("mc.dust_cluster_redstone")      public static ItemDustCluster dustClusterRedstone;
    @GameRegistry.ObjectHolder("mc.dust_cluster_lapis")         public static ItemDustCluster dustClusterLapis;

    @GameRegistry.ObjectHolder("ge.spalling_hammer")            public static ItemSpallingHammer spallingHammerBase;
    @GameRegistry.ObjectHolder("ge.spalling_hammer_iron")       public static ItemSpallingHammer spallingHammerIron;
    @GameRegistry.ObjectHolder("ge.spalling_hammer_diamond")    public static ItemSpallingHammer spallingHammerDiamond;

    @GameRegistry.ObjectHolder("ge.spalling_hammer_silver")     public static ItemSpallingHammer spallingHammerSilver;
    @GameRegistry.ObjectHolder("ge.spalling_hammer_lead")       public static ItemSpallingHammer spallingHammerLead;
    @GameRegistry.ObjectHolder("ge.spalling_hammer_tin")        public static ItemSpallingHammer spallingHammerTin;
    @GameRegistry.ObjectHolder("ge.spalling_hammer_copper")     public static ItemSpallingHammer spallingHammerCopper;
    @GameRegistry.ObjectHolder("ge.spalling_hammer_aluminum")   public static ItemSpallingHammer spallingHammerAluminum;
    @GameRegistry.ObjectHolder("ge.spalling_hammer_nickel")     public static ItemSpallingHammer spallingHammerNickel;
    @GameRegistry.ObjectHolder("ge.spalling_hammer_platinum")   public static ItemSpallingHammer spallingHammerPlatinum;

    public static List<ItemOreCluster> oreClusterList = new ArrayList<>();
    public static List<ItemCrystalCluster> crystalClusterList = new ArrayList<>();
    public static List<ItemDustCluster> dustClusterList = new ArrayList<>();
    public static List<ItemSpallingHammer> spallingHammerList = new ArrayList<>();

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
    private static void addSpallingHammers() {
        spallingHammerList.add(spallingHammerBase);
        spallingHammerList.add(spallingHammerIron);
        spallingHammerList.add(spallingHammerDiamond);
        if (spallingHammerSilver != null) spallingHammerList.add(spallingHammerSilver);
        if (spallingHammerLead != null) spallingHammerList.add(spallingHammerLead);
        if (spallingHammerTin != null) spallingHammerList.add(spallingHammerTin);
        if (spallingHammerCopper != null) spallingHammerList.add(spallingHammerCopper);
        if (spallingHammerAluminum != null) spallingHammerList.add(spallingHammerAluminum);
        if (spallingHammerNickel != null) spallingHammerList.add(spallingHammerNickel);
        if (spallingHammerPlatinum != null) spallingHammerList.add(spallingHammerPlatinum);
    }

    public static void addAll() {
        addOreClusters();
        addCrystalClusters();
        addDustClusters();
        addSpallingHammers();
    }

    public static Map<String, String> clusterColourMap = new HashMap<>();
    public static Map<String, String> hammerColourMap = new HashMap<>();
    static {
        //clusterColourMap.put("geoexpansion:", "0x");
        clusterColourMap.put("geoexpansion:ge.ore_cluster",                 "0xCAF2FD");
        clusterColourMap.put("geoexpansion:ge.crystal_cluster",             "0xCAF2FD");
        clusterColourMap.put("geoexpansion:ge.dust_cluster",                "0xCAF2FD");

        clusterColourMap.put("geoexpansion:mc.ore_cluster_coal",            "0x343434");
        clusterColourMap.put("geoexpansion:mc.ore_cluster_iron",            "0xBC9980");
        clusterColourMap.put("geoexpansion:mc.ore_cluster_gold",            "0xFCEE4B");
        clusterColourMap.put("geoexpansion:mc.crystal_cluster_diamond",     "0x77CEFB");
        clusterColourMap.put("geoexpansion:mc.crystal_cluster_emerald",     "0x17DD62");
        clusterColourMap.put("geoexpansion:mc.dust_cluster_redstone",       "0x970303");
        clusterColourMap.put("geoexpansion:mc.dust_cluster_lapis",          "0x1546C2");

        hammerColourMap.put("geoexpansion:ge.spalling_hammer",              "0xCAF2FD");
        hammerColourMap.put("geoexpansion:ge.spalling_hammer_iron",         "0xFFFFFF");
        hammerColourMap.put("geoexpansion:ge.spalling_hammer_diamond",      "0x5CCDD4");

        hammerColourMap.put("geoexpansion:ge.spalling_hammer_silver",       "0x9FACB3");
        hammerColourMap.put("geoexpansion:ge.spalling_hammer_lead",         "0x3E4246");
        hammerColourMap.put("geoexpansion:ge.spalling_hammer_tin",          "0xC2C2C2");
        hammerColourMap.put("geoexpansion:ge.spalling_hammer_copper",       "0xB47C60");
        hammerColourMap.put("geoexpansion:ge.spalling_hammer_aluminum",     "0xCED1DB");
        hammerColourMap.put("geoexpansion:ge.spalling_hammer_nickel",       "0xB5B68C");
        hammerColourMap.put("geoexpansion:ge.spalling_hammer_platinum",     "0x91A2B1");

        clusterColourMap.put("geoexpansion:bm.ore_cluster_antimony",                "0x838785");
        clusterColourMap.put("geoexpansion:bm.ore_cluster_bismuth",                 "0x83817D");
        clusterColourMap.put("geoexpansion:bm.ore_cluster_copper",                  "0xAD6E55");
        clusterColourMap.put("geoexpansion:bm.ore_cluster_lead",                    "0x414E62");
        clusterColourMap.put("geoexpansion:bm.ore_cluster_mercury",                 "0x53373C");
        clusterColourMap.put("geoexpansion:bm.ore_cluster_nickel",                  "0x334F42");
        clusterColourMap.put("geoexpansion:bm.ore_cluster_platinum",                "0xA4ABA9");
        clusterColourMap.put("geoexpansion:bm.ore_cluster_silver",                  "0xA4A4A4");
        clusterColourMap.put("geoexpansion:bm.ore_cluster_tin",                     "0x282320");
        clusterColourMap.put("geoexpansion:bm.ore_cluster_zinc",                    "0x816E49");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_aluminum",                "0x7D7D7B");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_beryllium",               "0x7D7D7D");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_boron",                   "0x1F1F1F");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_cadmium",                 "0x7D8082");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_chromium",                "0x7D7D7E");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_iridium",                 "0x8C887D");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_magnesium",               "0x666663");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_manganese",               "0x8B7E81");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_osmium",                  "0x646A6E");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_plutonium",               "0x744B87");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_rutile",                  "0x7B6C69");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_tantalum",                "0x7B797B");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_thorium",                 "0x3A3C3C");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_titanium",                "0x616264");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_tungsten",                "0x6C6C6C");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_uranium",                 "0x727651");
        clusterColourMap.put("geoexpansion:mm.ore_cluster_zirconium",               "0x6A6C6A");
        clusterColourMap.put("geoexpansion:tf.ore_cluster_copper",                  "0x6B4640");
        clusterColourMap.put("geoexpansion:tf.ore_cluster_tin",                     "0x939393");
        clusterColourMap.put("geoexpansion:tf.ore_cluster_silver",                  "0x8C9FA9");
        clusterColourMap.put("geoexpansion:tf.ore_cluster_lead",                    "0x2F2F3A");
        clusterColourMap.put("geoexpansion:tf.ore_cluster_aluminum",                "0x929294");
        clusterColourMap.put("geoexpansion:tf.ore_cluster_nickel",                  "0x8B8B6E");
        clusterColourMap.put("geoexpansion:tf.ore_cluster_platinum",                "0x748686");
        clusterColourMap.put("geoexpansion:tf.ore_cluster_iridium",                 "0x79798A");
        clusterColourMap.put("geoexpansion:tf.ore_cluster_mithril",                 "0x416AAC");
        clusterColourMap.put("geoexpansion:tf.fluid_cluster_redstone",              "0x3F0606");
        clusterColourMap.put("geoexpansion:ie.ore_cluster_copper",                  "0x2C4036");
        clusterColourMap.put("geoexpansion:ie.ore_cluster_aluminum",                "0x423129");
        clusterColourMap.put("geoexpansion:ie.ore_cluster_lead",                    "0x1F1C23");
        clusterColourMap.put("geoexpansion:ie.ore_cluster_silver",                  "0x7E8589");
        clusterColourMap.put("geoexpansion:ie.ore_cluster_nickel",                  "0x666A65");
        clusterColourMap.put("geoexpansion:ie.ore_cluster_uranium",                 "0x3B4F33");
        clusterColourMap.put("geoexpansion:tr.ore_cluster_galena",                  "0x403A43");
        clusterColourMap.put("geoexpansion:tr.ore_cluster_iridium",                 "0x2A302F");
        clusterColourMap.put("geoexpansion:tr.crystal_cluster_ruby",                "0xC26981");
        clusterColourMap.put("geoexpansion:tr.crystal_cluster_sapphire",            "0x7DACC9");
        clusterColourMap.put("geoexpansion:tr.ore_cluster_bauxite",                 "0x793C2D");
        clusterColourMap.put("geoexpansion:tr.ore_cluster_lead",                    "0x222027");
        clusterColourMap.put("geoexpansion:tr.ore_cluster_silver",                  "0x6B7179");
        clusterColourMap.put("geoexpansion:tr.ore_cluster_copper",                  "0x4C6259");
        clusterColourMap.put("geoexpansion:tr.ore_cluster_tin",                     "0x7B8188");
        clusterColourMap.put("geoexpansion:fr.crystal_cluster_apatite",             "0x88D1F5");
        clusterColourMap.put("geoexpansion:fr.ore_cluster_copper",                  "0x7B461F");
        clusterColourMap.put("geoexpansion:fr.ore_cluster_tin",                     "0x9C9A94");
        clusterColourMap.put("geoexpansion:bp.dust_cluster_teslatite",              "0x1C4885");
        clusterColourMap.put("geoexpansion:bp.crystal_cluster_ruby",                "0xBD3D36");
        clusterColourMap.put("geoexpansion:bp.crystal_cluster_sapphire",            "0x7684F0");
        clusterColourMap.put("geoexpansion:bp.crystal_cluster_amethyst",            "0xBF71F9");
        clusterColourMap.put("geoexpansion:bp.ore_cluster_copper",                  "0xA96412");
        clusterColourMap.put("geoexpansion:bp.ore_cluster_silver",                  "0x6A8484");
        clusterColourMap.put("geoexpansion:bp.ore_cluster_zinc",                    "0x8F867B");
        clusterColourMap.put("geoexpansion:bp.ore_cluster_tungsten",                "0x1B1B1B");
        clusterColourMap.put("geoexpansion:ae.crystal_cluster_quartz",              "0xD9DDF1");
        clusterColourMap.put("geoexpansion:ae.crystal_cluster_charged_quartz",      "0xC1DDF3");
        clusterColourMap.put("geoexpansion:er.ore_cluster_yellorite",               "0x808000");
        clusterColourMap.put("geoexpansion:ad.dust_cluster_sticky",                 "0x446E3F");
        clusterColourMap.put("geoexpansion:ad.dust_cluster_clay",                   "0x6D6E70");
        clusterColourMap.put("geoexpansion:em.ore_cluster_copper",                  "0x9F5E33");
        clusterColourMap.put("geoexpansion:em.ore_cluster_lead",                    "0x524A5B");
        clusterColourMap.put("geoexpansion:em.ore_cluster_silver",                  "0x8C9CA1");
        clusterColourMap.put("geoexpansion:em.ore_cluster_aluminum",                "0x9E665A");
        clusterColourMap.put("geoexpansion:em.ore_cluster_nickel",                  "0x8A927A");
        clusterColourMap.put("geoexpansion:em.ore_cluster_tin",                     "0x8F9391");
        clusterColourMap.put("geoexpansion:em.crystal_cluster_quartz",              "0xE5DFD6");
        clusterColourMap.put("geoexpansion:mk.ore_cluster_osmium",                  "0x757A87");
        clusterColourMap.put("geoexpansion:mk.ore_cluster_copper",                  "0x7D5644");
        clusterColourMap.put("geoexpansion:mk.ore_cluster_tin",                     "0x8E8E8E");
    }

    public static void registerModItems(IForgeRegistry<Item> itemReg) {
        itemReg.register(new ItemOreCluster("ge.ore_cluster",           null, null, null));
        itemReg.register(new ItemCrystalCluster("ge.crystal_cluster",   null, null, null));
        itemReg.register(new ItemDustCluster("ge.dust_cluster",         null, null, null));

        itemReg.register(new ItemOreCluster("mc.ore_cluster_coal",             "oreCoal",      null,                        "minecraft:coal/0/4"));
        itemReg.register(new ItemOreCluster("mc.ore_cluster_iron",             "oreIron",      "minecraft:iron_ingot",      null));
        itemReg.register(new ItemOreCluster("mc.ore_cluster_gold",             "oreGold",      "minecraft:gold_ingot",      null));
        itemReg.register(new ItemCrystalCluster("mc.crystal_cluster_diamond",  "oreDiamond",   null,                        "minecraft:diamond/0/2"));
        itemReg.register(new ItemCrystalCluster("mc.crystal_cluster_emerald",  "oreEmerald",   null,                        "minecraft:emerald/0/2"));
        itemReg.register(new ItemDustCluster("mc.dust_cluster_redstone",       "oreRedstone",  null,                        "minecraft:redstone/0/4"));
        itemReg.register(new ItemDustCluster("mc.dust_cluster_lapis",          "oreLapis",     null,                        "minecraft:dye/4/4"));

        itemReg.register(new ItemSpallingHammer("ge.spalling_hammer",   null, 9999));
        itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_iron",      "ingotIron",     255));
        itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_diamond",   "gemDiamond",    1279));
        if(CompatHandler.isRegistered("oreSilver")) {   itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_silver",        "ingotSilver",      63)); }
        if(CompatHandler.isRegistered("oreLead")) {     itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_lead",          "ingotLead",        95)); }
        if(CompatHandler.isRegistered("oreTin")) {      itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_tin",           "ingotTin",         127)); }
        if(CompatHandler.isRegistered("oreCopper")) {   itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_copper",        "ingotCopper",      159)); }
        if(CompatHandler.isRegistered("oreAluminum")) { itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_aluminum",      "ingotAluminum",    191)); }
        if(CompatHandler.isRegistered("oreNickel")) {   itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_nickel",        "ingotNickel",      255)); }
        if(CompatHandler.isRegistered("orePlatinum")) { itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_platinum",      "ingotPlatinum",    1023)); }
    }

    @GameRegistry.ObjectHolder("bm.ore_cluster_antimony")               public static ItemOreCluster clusterBaseMetalsAntimony;
    @GameRegistry.ObjectHolder("bm.ore_cluster_bismuth")                public static ItemOreCluster clusterBaseMetalsBismuth;
    @GameRegistry.ObjectHolder("bm.ore_cluster_copper")                 public static ItemOreCluster clusterBaseMetalsCopper;
    @GameRegistry.ObjectHolder("bm.ore_cluster_lead")                   public static ItemOreCluster clusterBaseMetalsLead;
    @GameRegistry.ObjectHolder("bm.ore_cluster_mercury")                public static ItemOreCluster clusterBaseMetalsMercury;
    @GameRegistry.ObjectHolder("bm.ore_cluster_nickel")                 public static ItemOreCluster clusterBaseMetalsNickel;
    @GameRegistry.ObjectHolder("bm.ore_cluster_platinum")               public static ItemOreCluster clusterBaseMetalsPlatinum;
    @GameRegistry.ObjectHolder("bm.ore_cluster_silver")                 public static ItemOreCluster clusterBaseMetalsSilver;
    @GameRegistry.ObjectHolder("bm.ore_cluster_tin")                    public static ItemOreCluster clusterBaseMetalsTin;
    @GameRegistry.ObjectHolder("bm.ore_cluster_zinc")                   public static ItemOreCluster clusterBaseMetalsZinc;

    @GameRegistry.ObjectHolder("mm.ore_cluster_aluminum")               public static ItemOreCluster clusterModernMetalsAluminum;
    @GameRegistry.ObjectHolder("mm.ore_cluster_beryllium")              public static ItemOreCluster clusterModernMetalsBeryllium;
    @GameRegistry.ObjectHolder("mm.ore_cluster_boron")                  public static ItemOreCluster clusterModernMetalsBoron;
    @GameRegistry.ObjectHolder("mm.ore_cluster_cadmium")                public static ItemOreCluster clusterModernMetalsCadmium;
    @GameRegistry.ObjectHolder("mm.ore_cluster_chromium")               public static ItemOreCluster clusterModernMetalsChromium;
    @GameRegistry.ObjectHolder("mm.ore_cluster_iridium")                public static ItemOreCluster clusterModernMetalsIridium;
    @GameRegistry.ObjectHolder("mm.ore_cluster_magnesium")              public static ItemOreCluster clusterModernMetalsMagnesium;
    @GameRegistry.ObjectHolder("mm.ore_cluster_manganese")              public static ItemOreCluster clusterModernMetalsManganese;
    @GameRegistry.ObjectHolder("mm.ore_cluster_osmium")                 public static ItemOreCluster clusterModernMetalsOsmium;
    @GameRegistry.ObjectHolder("mm.ore_cluster_plutonium")              public static ItemOreCluster clusterModernMetalsPlutonium;
    @GameRegistry.ObjectHolder("mm.ore_cluster_rutile")                 public static ItemOreCluster clusterModernMetalsRutile;
    @GameRegistry.ObjectHolder("mm.ore_cluster_tantalum")               public static ItemOreCluster clusterModernMetalsTantalum;
    @GameRegistry.ObjectHolder("mm.ore_cluster_thorium")                public static ItemOreCluster clusterModernMetalsThorium;
    @GameRegistry.ObjectHolder("mm.ore_cluster_titanium")               public static ItemOreCluster clusterModernMetalsTitanium;
    @GameRegistry.ObjectHolder("mm.ore_cluster_tungsten")               public static ItemOreCluster clusterModernMetalsTungsten;
    @GameRegistry.ObjectHolder("mm.ore_cluster_uranium")                public static ItemOreCluster clusterModernMetalsUranium;
    @GameRegistry.ObjectHolder("mm.ore_cluster_zirconium")              public static ItemOreCluster clusterModernMetalsZirconium;

    @GameRegistry.ObjectHolder("tf.ore_cluster_copper")                 public static ItemOreCluster clusterThermalFoundationCopper;
    @GameRegistry.ObjectHolder("tf.ore_cluster_tin")                    public static ItemOreCluster clusterThermalFoundationTin;
    @GameRegistry.ObjectHolder("tf.ore_cluster_silver")                 public static ItemOreCluster clusterThermalFoundationSilver;
    @GameRegistry.ObjectHolder("tf.ore_cluster_lead")                   public static ItemOreCluster clusterThermalFoundationLead;
    @GameRegistry.ObjectHolder("tf.ore_cluster_aluminum")               public static ItemOreCluster clusterThermalFoundationAluminum;
    @GameRegistry.ObjectHolder("tf.ore_cluster_nickel")                 public static ItemOreCluster clusterThermalFoundationNickel;
    @GameRegistry.ObjectHolder("tf.ore_cluster_platinum")               public static ItemOreCluster clusterThermalFoundationPlatinum;
    @GameRegistry.ObjectHolder("tf.ore_cluster_iridium")                public static ItemOreCluster clusterThermalFoundationIridium;
    @GameRegistry.ObjectHolder("tf.ore_cluster_mithril")                public static ItemOreCluster clusterThermalFoundationMithril;
    @GameRegistry.ObjectHolder("tf.fluid_cluster_redstone")             public static ItemDustCluster clusterThermalFoundationClathrateRedstone;

    @GameRegistry.ObjectHolder("ie.ore_cluster_copper")                 public static ItemOreCluster clusterImmersiveEngineeringCopper;
    @GameRegistry.ObjectHolder("ie.ore_cluster_aluminum")               public static ItemOreCluster clusterImmersiveEngineeringAluminum;
    @GameRegistry.ObjectHolder("ie.ore_cluster_lead")                   public static ItemOreCluster clusterImmersiveEngineeringLead;
    @GameRegistry.ObjectHolder("ie.ore_cluster_silver")                 public static ItemOreCluster clusterImmersiveEngineeringSilver;
    @GameRegistry.ObjectHolder("ie.ore_cluster_nickel")                 public static ItemOreCluster clusterImmersiveEngineeringNickel;
    @GameRegistry.ObjectHolder("ie.ore_cluster_uranium")                public static ItemOreCluster clusterImmersiveEngineeringUranium;

    @GameRegistry.ObjectHolder("tr.ore_cluster_galena")                 public static ItemOreCluster clusterTechRebornGalena;
    @GameRegistry.ObjectHolder("tr.ore_cluster_iridium")                public static ItemOreCluster clusterTechRebornIridium;
    @GameRegistry.ObjectHolder("tr.crystal_cluster_ruby")               public static ItemCrystalCluster clusterTechRebornRuby;
    @GameRegistry.ObjectHolder("tr.crystal_cluster_sapphire")           public static ItemCrystalCluster clusterTechRebornSapphire;
    @GameRegistry.ObjectHolder("tr.ore_cluster_bauxite")                public static ItemOreCluster clusterTechRebornBauxite;
    @GameRegistry.ObjectHolder("tr.ore_cluster_lead")                   public static ItemOreCluster clusterTechRebornLead;
    @GameRegistry.ObjectHolder("tr.ore_cluster_silver")                 public static ItemOreCluster clusterTechRebornSilver;
    @GameRegistry.ObjectHolder("tr.ore_cluster_copper")                 public static ItemOreCluster clusterTechRebornCopper;
    @GameRegistry.ObjectHolder("tr.ore_cluster_tin")                    public static ItemOreCluster clusterTechRebornTin;

    @GameRegistry.ObjectHolder("fr.crystal_cluster_apatite")            public static ItemCrystalCluster clusterForestryApatite;
    @GameRegistry.ObjectHolder("fr.ore_cluster_copper")                 public static ItemOreCluster clusterForestryCopper;
    @GameRegistry.ObjectHolder("fr.ore_cluster_tin")                    public static ItemOreCluster clusterForestryTin;

    @GameRegistry.ObjectHolder("bp.dust_cluster_teslatite")             public static ItemDustCluster clusterBluePowerTeslatite;
    @GameRegistry.ObjectHolder("bp.crystal_cluster_ruby")               public static ItemCrystalCluster clusterBluePowerRuby;
    @GameRegistry.ObjectHolder("bp.crystal_cluster_sapphire")           public static ItemCrystalCluster clusterBluePowerSapphire;
    @GameRegistry.ObjectHolder("bp.crystal_cluster_amethyst")           public static ItemCrystalCluster clusterBluePowerAmethyst;
    @GameRegistry.ObjectHolder("bp.ore_cluster_copper")                 public static ItemOreCluster clusterBluePowerCopper;
    @GameRegistry.ObjectHolder("bp.ore_cluster_silver")                 public static ItemOreCluster clusterBluePowerSilver;
    @GameRegistry.ObjectHolder("bp.ore_cluster_zinc")                   public static ItemOreCluster clusterBluePowerZinc;
    @GameRegistry.ObjectHolder("bp.ore_cluster_tungsten")               public static ItemOreCluster clusterBluePowerTungsten;

    @GameRegistry.ObjectHolder("ae.crystal_cluster_quartz")             public static ItemCrystalCluster clusterAppliedEnergisticsCertusQuartz;
    @GameRegistry.ObjectHolder("ae.crystal_cluster_charged_quartz")     public static ItemCrystalCluster clusterAppliedEnergisticsChargedCertusQuartz;

    @GameRegistry.ObjectHolder("er.ore_cluster_yellorite")              public static ItemOreCluster clusterExtremeReactorsYellorite;

    @GameRegistry.ObjectHolder("ad.dust_cluster_sticky")                public static ItemDustCluster clusterAromaDimensionSticky;
    @GameRegistry.ObjectHolder("ad.dust_cluster_clay")                  public static ItemDustCluster clusterAromaDimensionClay;

    @GameRegistry.ObjectHolder("em.ore_cluster_copper")                 public static ItemOreCluster clusterEmbersCopper;
    @GameRegistry.ObjectHolder("em.ore_cluster_lead")                   public static ItemOreCluster clusterEmbersLead;
    @GameRegistry.ObjectHolder("em.ore_cluster_silver")                 public static ItemOreCluster clusterEmbersSilver;
    @GameRegistry.ObjectHolder("em.ore_cluster_aluminum")               public static ItemOreCluster clusterEmbersAluminum;
    @GameRegistry.ObjectHolder("em.ore_cluster_nickel")                 public static ItemOreCluster clusterEmbersNickel;
    @GameRegistry.ObjectHolder("em.ore_cluster_tin")                    public static ItemOreCluster clusterEmbersTin;
    @GameRegistry.ObjectHolder("em.crystal_cluster_quartz")             public static ItemCrystalCluster clusterEmbersQuartz;

    @GameRegistry.ObjectHolder("mk.ore_cluster_osmium")                 public static ItemOreCluster clusterMekanismOsmium;
    @GameRegistry.ObjectHolder("mk.ore_cluster_copper")                 public static ItemOreCluster clusterMekanismCopper;
    @GameRegistry.ObjectHolder("mk.ore_cluster_tin")                    public static ItemOreCluster clusterMekanismTin;

    public static List<ItemOreCluster> oreClusterListCompat = new ArrayList<>();
    public static List<ItemCrystalCluster> crystalClusterListCompat = new ArrayList<>();
    public static List<ItemDustCluster> dustClusterListCompat = new ArrayList<>();

    private static void addOreClustersCompat() {
        if (ModBlocks.oreBaseMetalsAntimony != null) {                              oreClusterListCompat.add(clusterBaseMetalsAntimony);}
        if (ModBlocks.oreBaseMetalsBismuth != null) {                               oreClusterListCompat.add(clusterBaseMetalsBismuth);}
        if (ModBlocks.oreBaseMetalsCopper != null) {                                oreClusterListCompat.add(clusterBaseMetalsCopper);}
        if (ModBlocks.oreBaseMetalsLead != null) {                                  oreClusterListCompat.add(clusterBaseMetalsLead);}
        if (ModBlocks.oreBaseMetalsMercury != null) {                               oreClusterListCompat.add(clusterBaseMetalsMercury);}
        if (ModBlocks.oreBaseMetalsNickel != null) {                                oreClusterListCompat.add(clusterBaseMetalsNickel);}
        if (ModBlocks.oreBaseMetalsPlatinum != null) {                              oreClusterListCompat.add(clusterBaseMetalsPlatinum);}
        if (ModBlocks.oreBaseMetalsSilver != null) {                                oreClusterListCompat.add(clusterBaseMetalsSilver);}
        if (ModBlocks.oreBaseMetalsTin != null) {                                   oreClusterListCompat.add(clusterBaseMetalsTin);}
        if (ModBlocks.oreBaseMetalsZinc != null) {                                  oreClusterListCompat.add(clusterBaseMetalsZinc);}
        if (ModBlocks.oreModernMetalsAluminum != null) {                            oreClusterListCompat.add(clusterModernMetalsAluminum);}
        if (ModBlocks.oreModernMetalsBeryllium != null) {                           oreClusterListCompat.add(clusterModernMetalsBeryllium);}
        if (ModBlocks.oreModernMetalsBoron != null) {                               oreClusterListCompat.add(clusterModernMetalsBoron);}
        if (ModBlocks.oreModernMetalsCadmium != null) {                             oreClusterListCompat.add(clusterModernMetalsCadmium);}
        if (ModBlocks.oreModernMetalsChromium != null) {                            oreClusterListCompat.add(clusterModernMetalsChromium);}
        if (ModBlocks.oreModernMetalsIridium != null) {                             oreClusterListCompat.add(clusterModernMetalsIridium);}
        if (ModBlocks.oreModernMetalsMagnesium != null) {                           oreClusterListCompat.add(clusterModernMetalsMagnesium);}
        if (ModBlocks.oreModernMetalsManganese != null) {                           oreClusterListCompat.add(clusterModernMetalsManganese);}
        if (ModBlocks.oreModernMetalsOsmium != null) {                              oreClusterListCompat.add(clusterModernMetalsOsmium);}
        if (ModBlocks.oreModernMetalsPlutonium != null) {                           oreClusterListCompat.add(clusterModernMetalsPlutonium);}
        if (ModBlocks.oreModernMetalsRutile != null) {                              oreClusterListCompat.add(clusterModernMetalsRutile);}
        if (ModBlocks.oreModernMetalsTantalum != null) {                            oreClusterListCompat.add(clusterModernMetalsTantalum);}
        if (ModBlocks.oreModernMetalsThorium != null) {                             oreClusterListCompat.add(clusterModernMetalsThorium);}
        if (ModBlocks.oreModernMetalsTitanium != null) {                            oreClusterListCompat.add(clusterModernMetalsTitanium);}
        if (ModBlocks.oreModernMetalsTungsten != null) {                            oreClusterListCompat.add(clusterModernMetalsTungsten);}
        if (ModBlocks.oreModernMetalsUranium != null) {                             oreClusterListCompat.add(clusterModernMetalsUranium);}
        if (ModBlocks.oreModernMetalsZirconium != null) {                           oreClusterListCompat.add(clusterModernMetalsZirconium);}
        if (ModBlocks.oreThermalFoundationCopper != null) {                         oreClusterListCompat.add(clusterThermalFoundationCopper);}
        if (ModBlocks.oreThermalFoundationTin != null) {                            oreClusterListCompat.add(clusterThermalFoundationTin);}
        if (ModBlocks.oreThermalFoundationSilver != null) {                         oreClusterListCompat.add(clusterThermalFoundationSilver);}
        if (ModBlocks.oreThermalFoundationLead != null) {                           oreClusterListCompat.add(clusterThermalFoundationLead);}
        if (ModBlocks.oreThermalFoundationAluminum != null) {                       oreClusterListCompat.add(clusterThermalFoundationAluminum);}
        if (ModBlocks.oreThermalFoundationNickel != null) {                         oreClusterListCompat.add(clusterThermalFoundationNickel);}
        if (ModBlocks.oreThermalFoundationPlatinum != null) {                       oreClusterListCompat.add(clusterThermalFoundationPlatinum);}
        if (ModBlocks.oreThermalFoundationIridium != null) {                        oreClusterListCompat.add(clusterThermalFoundationIridium);}
        if (ModBlocks.oreThermalFoundationMithril != null) {                        oreClusterListCompat.add(clusterThermalFoundationMithril);}
        if (ModBlocks.oreImmersiveEngineeringCopper != null) {                      oreClusterListCompat.add(clusterImmersiveEngineeringCopper);}
        if (ModBlocks.oreImmersiveEngineeringAluminum != null) {                    oreClusterListCompat.add(clusterImmersiveEngineeringAluminum);}
        if (ModBlocks.oreImmersiveEngineeringLead != null) {                        oreClusterListCompat.add(clusterImmersiveEngineeringLead);}
        if (ModBlocks.oreImmersiveEngineeringSilver != null) {                      oreClusterListCompat.add(clusterImmersiveEngineeringSilver);}
        if (ModBlocks.oreImmersiveEngineeringNickel != null) {                      oreClusterListCompat.add(clusterImmersiveEngineeringNickel);}
        if (ModBlocks.oreImmersiveEngineeringUranium != null) {                     oreClusterListCompat.add(clusterImmersiveEngineeringUranium);}
        if (ModBlocks.oreTechRebornGalena != null) {                                oreClusterListCompat.add(clusterTechRebornGalena);}
        if (ModBlocks.oreTechRebornIridium != null) {                               oreClusterListCompat.add(clusterTechRebornIridium);}
        if (ModBlocks.oreTechRebornBauxite != null) {                               oreClusterListCompat.add(clusterTechRebornBauxite);}
        if (ModBlocks.oreTechRebornLead != null) {                                  oreClusterListCompat.add(clusterTechRebornLead);}
        if (ModBlocks.oreTechRebornSilver != null) {                                oreClusterListCompat.add(clusterTechRebornSilver);}
        if (ModBlocks.oreTechRebornCopper != null) {                                oreClusterListCompat.add(clusterTechRebornCopper);}
        if (ModBlocks.oreTechRebornTin != null) {                                   oreClusterListCompat.add(clusterTechRebornTin);}
        if (ModBlocks.oreForestryCopper != null) {                                  oreClusterListCompat.add(clusterForestryCopper);}
        if (ModBlocks.oreForestryTin != null) {                                     oreClusterListCompat.add(clusterForestryTin);}
        if (ModBlocks.oreBluePowerCopper != null) {                                 oreClusterListCompat.add(clusterBluePowerCopper);}
        if (ModBlocks.oreBluePowerSilver != null) {                                 oreClusterListCompat.add(clusterBluePowerSilver);}
        if (ModBlocks.oreBluePowerZinc != null) {                                   oreClusterListCompat.add(clusterBluePowerZinc);}
        if (ModBlocks.oreBluePowerTungsten != null) {                               oreClusterListCompat.add(clusterBluePowerTungsten);}
        if (ModBlocks.oreExtremeReactorsYellorite != null) {                        oreClusterListCompat.add(clusterExtremeReactorsYellorite);}
        if (ModBlocks.oreEmbersCopper != null) {                                    oreClusterListCompat.add(clusterEmbersCopper);}
        if (ModBlocks.oreEmbersLead != null) {                                      oreClusterListCompat.add(clusterEmbersLead);}
        if (ModBlocks.oreEmbersSilver != null) {                                    oreClusterListCompat.add(clusterEmbersSilver);}
        if (ModBlocks.oreEmbersAluminum != null) {                                  oreClusterListCompat.add(clusterEmbersAluminum);}
        if (ModBlocks.oreEmbersNickel != null) {                                    oreClusterListCompat.add(clusterEmbersNickel);}
        if (ModBlocks.oreEmbersTin != null) {                                       oreClusterListCompat.add(clusterEmbersTin);}
        if (ModBlocks.oreMekanismOsmium != null) {                                  oreClusterListCompat.add(clusterMekanismOsmium);}
        if (ModBlocks.oreMekanismCopper != null) {                                  oreClusterListCompat.add(clusterMekanismCopper);}
        if (ModBlocks.oreMekanismTin != null) {                                     oreClusterListCompat.add(clusterMekanismTin);}
    }
    private static void addCrystalClustersCompat() {
        if (ModBlocks.oreTechRebornRuby != null) {                                  crystalClusterListCompat.add(clusterTechRebornRuby);}
        if (ModBlocks.oreTechRebornSapphire != null) {                              crystalClusterListCompat.add(clusterTechRebornSapphire);}
        if (ModBlocks.oreForestryApatite != null) {                                 crystalClusterListCompat.add(clusterForestryApatite);}
        if (ModBlocks.oreBluePowerRuby != null) {                                   crystalClusterListCompat.add(clusterBluePowerRuby);}
        if (ModBlocks.oreBluePowerSapphire != null) {                               crystalClusterListCompat.add(clusterBluePowerSapphire);}
        if (ModBlocks.oreBluePowerAmethyst != null) {                               crystalClusterListCompat.add(clusterBluePowerAmethyst);}
        if (ModBlocks.oreAppliedEnergisticsCertusQuartz != null) {                  crystalClusterListCompat.add(clusterAppliedEnergisticsCertusQuartz);}
        if (ModBlocks.oreAppliedEnergisticsChargedCertusQuartz != null) {           crystalClusterListCompat.add(clusterAppliedEnergisticsChargedCertusQuartz);}
        if (ModBlocks.oreEmbersQuartz != null) {                                    crystalClusterListCompat.add(clusterEmbersQuartz);}
    }
    private static void addDustClustersCompat() {
        if (ModBlocks.oreThermalFoundationClathrateRedstone != null) {              dustClusterListCompat.add(clusterThermalFoundationClathrateRedstone);}
        if (ModBlocks.oreBluePowerTeslatite != null) {                              dustClusterListCompat.add(clusterBluePowerTeslatite);}
        if (ModBlocks.oreAromaDimensionSticky != null) {                            dustClusterListCompat.add(clusterAromaDimensionSticky);}
        if (ModBlocks.oreAromaDimensionClay != null) {                              dustClusterListCompat.add(clusterAromaDimensionClay);}
    }

    public static void addAllCompat() {
        addOreClustersCompat();
        addCrystalClustersCompat();
        addDustClustersCompat();
    }

    public static void registerCompat(IForgeRegistry<Item> itemReg) {
        if (ModBlocks.oreBaseMetalsAntimony != null) {
            itemReg.register(new ItemOreCluster("bm.ore_cluster_antimony",      "oreAntimony",      "basemetals:antimony_ingot",        "basemetals:antimony_powder/0/2"));}
        if (ModBlocks.oreBaseMetalsBismuth != null) {
            itemReg.register(new ItemOreCluster("bm.ore_cluster_bismuth",       "oreBismuth",       "basemetals:bismuth_ingot",         "basemetals:bismuth_powder/0/2"));}
        if (ModBlocks.oreBaseMetalsCopper != null) {
            itemReg.register(new ItemOreCluster("bm.ore_cluster_copper",        "oreCopper",        "basemetals:copper_ingot",          "basemetals:copper_powder/0/2"));}
        if (ModBlocks.oreBaseMetalsLead != null) {
            itemReg.register(new ItemOreCluster("bm.ore_cluster_lead",          "oreLead",          "basemetals:lead_ingot",            "basemetals:lead_powder/0/2"));}
        if (ModBlocks.oreBaseMetalsMercury != null) {
            itemReg.register(new ItemOreCluster("bm.ore_cluster_mercury",       "oreMercury",       "basemetals:mercury_ingot",         "basemetals:mercury_powder/0/2"));}
        if (ModBlocks.oreBaseMetalsNickel != null) {
            itemReg.register(new ItemOreCluster("bm.ore_cluster_nickel",        "oreNickel",        "basemetals:nickel_ingot",          "basemetals:nickel_powder/0/2"));}
        if (ModBlocks.oreBaseMetalsPlatinum != null) {
            itemReg.register(new ItemOreCluster("bm.ore_cluster_platinum",      "orePlatinum",      "basemetals:platinum_ingot",        "basemetals:platinum_powder/0/2"));}
        if (ModBlocks.oreBaseMetalsSilver != null) {
            itemReg.register(new ItemOreCluster("bm.ore_cluster_silver",        "oreSilver",        "basemetals:silver_ingot",          "basemetals:silver_powder/0/2"));}
        if (ModBlocks.oreBaseMetalsTin != null) {
            itemReg.register(new ItemOreCluster("bm.ore_cluster_tin",           "oreTin",           "basemetals:tin_ingot",             "basemetals:tin_powder/0/2"));}
        if (ModBlocks.oreBaseMetalsZinc != null) {
            itemReg.register(new ItemOreCluster("bm.ore_cluster_zinc",          "oreZinc",          "basemetals:zinc_ingot",            "basemetals:zinc_powder/0/2"));}
        if (ModBlocks.oreModernMetalsAluminum != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_aluminum",      "oreAluminum",      "modernmetals:aluminum_ingot",      "modernmetals:aluminum_powder/0/2"));}
        if (ModBlocks.oreModernMetalsBeryllium != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_beryllium",     "oreBeryllium",     "modernmetals:beryllium_ingot",     "modernmetals:beryllium_powder/0/2"));}
        if (ModBlocks.oreModernMetalsBoron != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_boron",         "oreBoron",         "modernmetals:boron_ingot",         "modernmetals:boron_powder/0/2"));}
        if (ModBlocks.oreModernMetalsCadmium != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_cadmium",       "oreCadmium",       "modernmetals:cadmium_ingot",       "modernmetals:cadmium_powder/0/2"));}
        if (ModBlocks.oreModernMetalsChromium != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_chromium",      "oreChromium",      "modernmetals:chromium_ingot",      "modernmetals:chromium_powder/0/2"));}
        if (ModBlocks.oreModernMetalsIridium != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_iridium",       "oreIridium",       "modernmetals:iridium_ingot",       "modernmetals:iridium_powder/0/2"));}
        if (ModBlocks.oreModernMetalsMagnesium != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_magnesium",     "oreMagnesium",     "modernmetals:magnesium_ingot",     "modernmetals:magnesium_powder/0/2"));}
        if (ModBlocks.oreModernMetalsManganese != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_manganese",     "oreManganese",     "modernmetals:manganese_ingot",     "modernmetals:manganese_powder/0/2"));}
        if (ModBlocks.oreModernMetalsOsmium != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_osmium",        "oreOsmium",        "modernmetals:osmium_ingot",        "modernmetals:osmium_powder/0/2"));}
        if (ModBlocks.oreModernMetalsPlutonium != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_plutonium",     "orePlutonium",     "modernmetals:plutonium_ingot",     "modernmetals:plutonium_powder/0/2"));}
        if (ModBlocks.oreModernMetalsRutile != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_rutile",        "oreRutile",        "modernmetals:rutile_ingot",        "modernmetals:rutile_powder/0/2"));}
        if (ModBlocks.oreModernMetalsTantalum != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_tantalum",      "oreTantalum",      "modernmetals:tantalum_ingot",      "modernmetals:tantalum_powder/0/2"));}
        if (ModBlocks.oreModernMetalsThorium != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_thorium",       "oreThorium",       "modernmetals:thorium_ingot",       "modernmetals:thorium_powder/0/2"));}
        if (ModBlocks.oreModernMetalsTitanium != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_titanium",      "oreTitanium",      "modernmetals:titanium_ingot",      "modernmetals:titanium_powder/0/2"));}
        if (ModBlocks.oreModernMetalsTungsten != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_tungsten",      "oreTungsten",      "modernmetals:tungsten_ingot",      "modernmetals:tungsten_powder/0/2"));}
        if (ModBlocks.oreModernMetalsUranium != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_uranium",       "oreUranium",       "modernmetals:uranium_ingot",       "modernmetals:uranium_powder/0/2"));}
        if (ModBlocks.oreModernMetalsZirconium != null) {
            itemReg.register(new ItemOreCluster("mm.ore_cluster_zirconium",     "oreZirconium",     "modernmetals:zirconium_ingot",     "modernmetals:zirconium_powder/0/2"));}
        if (ModBlocks.oreThermalFoundationCopper != null) {
            itemReg.register(new ItemOreCluster("tf.ore_cluster_copper",        "oreCopper",        "thermalfoundation:material/128",   "thermalfoundation:material/64/2"));}
        if (ModBlocks.oreThermalFoundationTin != null) {
            itemReg.register(new ItemOreCluster("tf.ore_cluster_tin",           "oreTin",           "thermalfoundation:material/129",   "thermalfoundation:material/65/2"));}
        if (ModBlocks.oreThermalFoundationSilver != null) {
            itemReg.register(new ItemOreCluster("tf.ore_cluster_silver",        "oreSilver",        "thermalfoundation:material/130",   "thermalfoundation:material/66/2"));}
        if (ModBlocks.oreThermalFoundationLead != null) {
            itemReg.register(new ItemOreCluster("tf.ore_cluster_lead",          "oreLead",          "thermalfoundation:material/131",   "thermalfoundation:material/67/2"));}
        if (ModBlocks.oreThermalFoundationAluminum != null) {
            itemReg.register(new ItemOreCluster("tf.ore_cluster_aluminum",      "oreAluminum",      "thermalfoundation:material/132",   "thermalfoundation:material/68/2"));}
        if (ModBlocks.oreThermalFoundationNickel != null) {
            itemReg.register(new ItemOreCluster("tf.ore_cluster_nickel",        "oreNickel",        "thermalfoundation:material/133",   "thermalfoundation:material/69/2"));}
        if (ModBlocks.oreThermalFoundationPlatinum != null) {
            itemReg.register(new ItemOreCluster("tf.ore_cluster_platinum",      "orePlatinum",      "thermalfoundation:material/134",   "thermalfoundation:material/70/2"));}
        if (ModBlocks.oreThermalFoundationIridium != null) {
            itemReg.register(new ItemOreCluster("tf.ore_cluster_iridium",       "oreIridium",       "thermalfoundation:material/135",   "thermalfoundation:material/71/2"));}
        if (ModBlocks.oreThermalFoundationMithril != null) {
            itemReg.register(new ItemOreCluster("tf.ore_cluster_mithril",       "oreMithril",       "thermalfoundation:material/136",   "thermalfoundation:material/72/2"));}
        if (ModBlocks.oreImmersiveEngineeringCopper != null) {
            itemReg.register(new ItemOreCluster("ie.ore_cluster_copper",        "oreCopper",        "immersiveengineering:metal/0",     "immersiveengineering:metal/9/2"));}
        if (ModBlocks.oreImmersiveEngineeringAluminum != null) {
            itemReg.register(new ItemOreCluster("ie.ore_cluster_aluminum",      "oreAluminum",      "immersiveengineering:metal/1",     "immersiveengineering:metal/10/2"));}
        if (ModBlocks.oreImmersiveEngineeringLead != null) {
            itemReg.register(new ItemOreCluster("ie.ore_cluster_lead",          "oreLead",          "immersiveengineering:metal/2",     "immersiveengineering:metal/11/2"));}
        if (ModBlocks.oreImmersiveEngineeringSilver != null) {
            itemReg.register(new ItemOreCluster("ie.ore_cluster_silver",        "oreSilver",        "immersiveengineering:metal/3",     "immersiveengineering:metal/12/2"));}
        if (ModBlocks.oreImmersiveEngineeringNickel != null) {
            itemReg.register(new ItemOreCluster("ie.ore_cluster_nickel",        "oreNickel",        "immersiveengineering:metal/4",     "immersiveengineering:metal/13/2"));}
        if (ModBlocks.oreImmersiveEngineeringUranium != null) {
            itemReg.register(new ItemOreCluster("ie.ore_cluster_uranium",       "oreUranium",       "immersiveengineering:metal/5",     "immersiveengineering:metal/14/2"));}
        if (ModBlocks.oreTechRebornGalena != null) {
            itemReg.register(new ItemOreCluster("tr.ore_cluster_galena",        "oreGalena",        null,                               "techreborn:dust/23/2"));}
        if (ModBlocks.oreTechRebornIridium != null) {
            itemReg.register(new ItemOreCluster("tr.ore_cluster_iridium",       "oreIridium",       null,                               "techreborn:dust/64/2"));}
        if (ModBlocks.oreTechRebornBauxite != null) {
            itemReg.register(new ItemOreCluster("tr.ore_cluster_bauxite",       "oreBauxite",       null,                               "techreborn:dust/5/2"));}
        if (ModBlocks.oreTechRebornLead != null) {
            itemReg.register(new ItemOreCluster("tr.ore_cluster_lead",          "oreLead",          "techreborn:ingot/8",               "techreborn:dust/29/2"));}
        if (ModBlocks.oreTechRebornSilver != null) {
            itemReg.register(new ItemOreCluster("tr.ore_cluster_silver",        "oreSilver",        "techreborn:ingot/11",              "techreborn:dust/47/2"));}
        if (ModBlocks.oreTechRebornCopper != null) {
            itemReg.register(new ItemOreCluster("tr.ore_cluster_copper",        "oreCopper",        "techreborn:ingot/4",               "techreborn:dust/14/2"));}
        if (ModBlocks.oreTechRebornTin != null) {
            itemReg.register(new ItemOreCluster("tr.ore_cluster_tin",           "oreTin",           "techreborn:ingot/13",              "techreborn:dust/53/2"));}
        if (ModBlocks.oreForestryCopper != null) {
            itemReg.register(new ItemOreCluster("fr.ore_cluster_copper",        "oreCopper",        "forestry:ingot_copper",            null));}
        if (ModBlocks.oreForestryTin != null) {
            itemReg.register(new ItemOreCluster("fr.ore_cluster_tin",           "oreTin",           "forestry:ingot_tin",               null));}
        if (ModBlocks.oreBluePowerCopper != null) {
            itemReg.register(new ItemOreCluster("bp.ore_cluster_copper",        "oreCopper",        "bluepower:copper_ingot",           null));}
        if (ModBlocks.oreBluePowerSilver != null) {
            itemReg.register(new ItemOreCluster("bp.ore_cluster_silver",        "oreSilver",        "bluepower:silver_ingot",           null));}
        if (ModBlocks.oreBluePowerZinc != null) {
            itemReg.register(new ItemOreCluster("bp.ore_cluster_zinc",          "oreZinc",          "bluepower:zinc_ingot",             null));}
        if (ModBlocks.oreBluePowerTungsten != null) {
            itemReg.register(new ItemOreCluster("bp.ore_cluster_tungsten",      "oreTungsten",      "bluepower:tungsten_nugget",        null));}
        if (ModBlocks.oreExtremeReactorsYellorite != null) {
            itemReg.register(new ItemOreCluster("er.ore_cluster_yellorite",     "oreYellorite",     "bigreactors:ingotyellorium",       "bigreactors:dustyellorium/0/2"));}
        if (ModBlocks.oreEmbersCopper != null) {
            itemReg.register(new ItemOreCluster("em.ore_cluster_copper",        "oreCopper",        "embers:ingot_copper",              null));}
        if (ModBlocks.oreEmbersLead != null) {
            itemReg.register(new ItemOreCluster("em.ore_cluster_lead",          "oreLead",          "embers:ingot_lead",                null));}
        if (ModBlocks.oreEmbersSilver != null) {
            itemReg.register(new ItemOreCluster("em.ore_cluster_silver",        "oreSilver",        "embers:ingot_silver",              null));}
        if (ModBlocks.oreEmbersAluminum != null) {
            itemReg.register(new ItemOreCluster("em.ore_cluster_aluminum",      "oreAluminum",      "embers:ingot_aluminum",            null));}
        if (ModBlocks.oreEmbersNickel != null) {
            itemReg.register(new ItemOreCluster("em.ore_cluster_nickel",        "oreNickel",        "embers:ingot_nickel",              null));}
        if (ModBlocks.oreEmbersTin != null) {
            itemReg.register(new ItemOreCluster("em.ore_cluster_tin",           "oreTin",           "embers:ingot_tin",                 null));}
        if (ModBlocks.oreMekanismOsmium != null) {
            itemReg.register(new ItemOreCluster("mk.ore_cluster_osmium",        "oreOsmium",        "mekanism:ingot/1",                 "mekanism:dust/2"));}
        if (ModBlocks.oreMekanismCopper != null) {
            itemReg.register(new ItemOreCluster("mk.ore_cluster_copper",        "oreCopper",        "mekanism:ingot/5",                 "mekanism:dust/3"));}
        if (ModBlocks.oreMekanismTin != null) {
            itemReg.register(new ItemOreCluster("mk.ore_cluster_tin",           "oreTin",           "mekanism:ingot/6",                 "mekanism:dust/4"));}

        if (ModBlocks.oreTechRebornRuby != null) {
            itemReg.register(new ItemCrystalCluster("tr.crystal_cluster_ruby",              "oreRuby",                  null,   "techreborn:gem/0/2"));}
        if (ModBlocks.oreTechRebornSapphire != null) {
            itemReg.register(new ItemCrystalCluster("tr.crystal_cluster_sapphire",          "oreSapphire",              null,   "techreborn:gem/1/2"));}
        if (ModBlocks.oreForestryApatite != null) {
            itemReg.register(new ItemCrystalCluster("fr.crystal_cluster_apatite",           "oreApatite",               null,   "forestry:apatite/0/2"));}
        if (ModBlocks.oreBluePowerRuby != null) {
            itemReg.register(new ItemCrystalCluster("bp.crystal_cluster_ruby",              "oreRuby",                  null,   "bluepower:ruby_gem/0/2"));}
        if (ModBlocks.oreBluePowerSapphire != null) {
            itemReg.register(new ItemCrystalCluster("bp.crystal_cluster_sapphire",          "oreSapphire",              null,   "bluepower:sapphire_gem/0/2"));}
        if (ModBlocks.oreBluePowerAmethyst != null) {
            itemReg.register(new ItemCrystalCluster("bp.crystal_cluster_amethyst",          "oreAmethyst",              null,   "bluepower:amethyst_gem/0/2"));}
        if (ModBlocks.oreAppliedEnergisticsCertusQuartz != null) {
            itemReg.register(new ItemCrystalCluster("ae.crystal_cluster_quartz",            "oreCertusQuartz",          null,   "appliedenergistics2:material/0/2"));}
        if (ModBlocks.oreAppliedEnergisticsChargedCertusQuartz != null) {
            itemReg.register(new ItemCrystalCluster("ae.crystal_cluster_charged_quartz",    "oreChargedCertusQuartz",   null,   "appliedenergistics2:material/1/2"));}
        if (ModBlocks.oreEmbersQuartz != null) {
            itemReg.register(new ItemCrystalCluster("em.crystal_cluster_quartz",            "oreQuartz",                null,   "minecraft:quartz/0/2"));}

        if (ModBlocks.oreThermalFoundationClathrateRedstone != null) {
            itemReg.register(new ItemDustCluster("tf.fluid_cluster_redstone",   "oreClathrateRedstone",     null,   "thermalfoundation:material/893/2"));}
        if (ModBlocks.oreBluePowerTeslatite != null) {
            itemReg.register(new ItemDustCluster("bp.dust_cluster_teslatite",   "oreTeslatite",             null,   "bluepower:teslatite_dust/0/2"));}
        if (ModBlocks.oreAromaDimensionSticky != null) {
            itemReg.register(new ItemDustCluster("ad.dust_cluster_sticky",      "oreSticky",                "minecraft:slime_ball",     "minecraft:slime_ball/0/2"));}
        if (ModBlocks.oreAromaDimensionClay != null) {
            itemReg.register(new ItemDustCluster("ad.dust_cluster_clay",        "oreClay",                  "minecraft:clay_ball",      "minecraft:clay_ball/0/2"));}
    }
}
