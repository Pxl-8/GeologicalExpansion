package network.pxl8.geoexpansion.common.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;
import network.pxl8.geoexpansion.common.event.ItemLists;
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

    private static void addOreClusters(ItemLists target) {
        target.addOreCluster(oreClusterBase);
        target.addOreCluster(oreClusterCoal);
        target.addOreCluster(oreClusterIron);
        target.addOreCluster(oreClusterGold);
    }
    private static void addCrystalClusters(ItemLists target) {
        target.addCrystalCluster(crystalClusterBase);
        target.addCrystalCluster(crystalClusterDiamond);
        target.addCrystalCluster(crystalClusterEmerald);
    }
    private static void addDustClusters(ItemLists target) {
        target.addDustCluster(dustClusterBase);
        target.addDustCluster(dustClusterRedstone);
        target.addDustCluster(dustClusterLapis);
    }
    private static void addSpallingHammers(ItemLists target) {
        target.addHammer(spallingHammerBase);
        target.addHammer(spallingHammerIron);
        target.addHammer(spallingHammerDiamond);
        if (spallingHammerSilver != null) target.addHammer(spallingHammerSilver);
        if (spallingHammerLead != null) target.addHammer(spallingHammerLead);
        if (spallingHammerTin != null) target.addHammer(spallingHammerTin);
        if (spallingHammerCopper != null) target.addHammer(spallingHammerCopper);
        if (spallingHammerAluminum != null) target.addHammer(spallingHammerAluminum);
        if (spallingHammerNickel != null) target.addHammer(spallingHammerNickel);
        if (spallingHammerPlatinum != null) target.addHammer(spallingHammerPlatinum);
    }

    public static Map<String, String> clusterColourMap = new HashMap<>();
    public static Map<String, String> hammerColourMap = new HashMap<>();
    static {
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
        clusterColourMap.put("geoexpansion:tr.ore_cluster_tungsten",                "0x2c241b");
        clusterColourMap.put("geoexpansion:tr.ore_cluster_sheldonite",              "0x426166");
        clusterColourMap.put("geoexpansion:tr.crystal_cluster_peridot",             "0x5f872f");
        clusterColourMap.put("geoexpansion:tr.dust_cluster_sodalite",               "0x5087c3");
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
        clusterColourMap.put("geoexpansion:nc.ore_cluster_copper",                  "0x5a331d");
        clusterColourMap.put("geoexpansion:nc.ore_cluster_tin",                     "0xc5c5ce");
        clusterColourMap.put("geoexpansion:nc.ore_cluster_lead",                    "0x5e6e6e");
        clusterColourMap.put("geoexpansion:nc.ore_cluster_thorium",                 "0x2c2c2c");
        clusterColourMap.put("geoexpansion:nc.ore_cluster_uranium",                 "0x364d35");
        clusterColourMap.put("geoexpansion:nc.ore_cluster_boron",                   "0x575757");
        clusterColourMap.put("geoexpansion:nc.ore_cluster_lithium",                 "0xcdcdcd");
        clusterColourMap.put("geoexpansion:nc.ore_cluster_magnesium",               "0xdbc1da");
        clusterColourMap.put("geoexpansion:de.dust_cluster_draconium",              "0x3e1661");
    }

    public static void registerModItems(IForgeRegistry<Item> itemReg) {
        itemReg.register(new ItemOreCluster("ge.ore_cluster",           null, null));
        itemReg.register(new ItemCrystalCluster("ge.crystal_cluster",   null, null));
        itemReg.register(new ItemDustCluster("ge.dust_cluster",         null, null));

        itemReg.register(new ItemOreCluster("mc.ore_cluster_coal",             "oreCoal",      null));
        itemReg.register(new ItemOreCluster("mc.ore_cluster_iron",             "oreIron",      "minecraft:iron_ingot"));
        itemReg.register(new ItemOreCluster("mc.ore_cluster_gold",             "oreGold",      "minecraft:gold_ingot"));
        itemReg.register(new ItemCrystalCluster("mc.crystal_cluster_diamond",  "oreDiamond",   null));
        itemReg.register(new ItemCrystalCluster("mc.crystal_cluster_emerald",  "oreEmerald",   null));
        itemReg.register(new ItemDustCluster("mc.dust_cluster_redstone",       "oreRedstone",  null));
        itemReg.register(new ItemDustCluster("mc.dust_cluster_lapis",          "oreLapis",     null));

        itemReg.register(new ItemSpallingHammer("ge.spalling_hammer",           9999));
        itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_iron",      255));
        itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_diamond",   1279));
        if(CompatHandler.isRegistered("oreSilver")) {   itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_silver",        63)); }
        if(CompatHandler.isRegistered("oreLead")) {     itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_lead",          95)); }
        if(CompatHandler.isRegistered("oreTin")) {      itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_tin",           127)); }
        if(CompatHandler.isRegistered("oreCopper")) {   itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_copper",        159)); }
        if(CompatHandler.isRegistered("oreAluminum")) { itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_aluminum",      191)); }
        if(CompatHandler.isRegistered("oreNickel")) {   itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_nickel",        255)); }
        if(CompatHandler.isRegistered("orePlatinum")) { itemReg.register(new ItemSpallingHammer("ge.spalling_hammer_platinum",      1023)); }

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
    @GameRegistry.ObjectHolder("tr.ore_cluster_tungsten")               public static ItemOreCluster clusterTechRebornTungsten;
    @GameRegistry.ObjectHolder("tr.ore_cluster_sheldonite")             public static ItemOreCluster clusterTechRebornSheldonite;
    @GameRegistry.ObjectHolder("tr.crystal_cluster_peridot")            public static ItemCrystalCluster clusterTechRebornPeridot;
    @GameRegistry.ObjectHolder("tr.dust_cluster_sodalite")              public static ItemDustCluster clusterTechRebornSodalite;

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

    @GameRegistry.ObjectHolder("nc.ore_cluster_copper")                 public static ItemOreCluster clusterNuclearCraftCopper;
    @GameRegistry.ObjectHolder("nc.ore_cluster_tin")                    public static ItemOreCluster clusterNuclearCraftTin;
    @GameRegistry.ObjectHolder("nc.ore_cluster_lead")                   public static ItemOreCluster clusterNuclearCraftLead;
    @GameRegistry.ObjectHolder("nc.ore_cluster_thorium")                public static ItemOreCluster clusterNuclearCraftThorium;
    @GameRegistry.ObjectHolder("nc.ore_cluster_uranium")                public static ItemOreCluster clusterNuclearCraftUranium;
    @GameRegistry.ObjectHolder("nc.ore_cluster_boron")                  public static ItemOreCluster clusterNuclearCraftBoron;
    @GameRegistry.ObjectHolder("nc.ore_cluster_lithium")                public static ItemOreCluster clusterNuclearCraftLithium;
    @GameRegistry.ObjectHolder("nc.ore_cluster_magnesium")              public static ItemOreCluster clusterNuclearCraftMagnesium;

    @GameRegistry.ObjectHolder("de.dust_cluster_draconium")             public static ItemDustCluster clusterDraconicEvolutionDraconium;

    private static void addOreClustersCompat(ItemLists target) {
        if (ModBlocks.oreBaseMetalsAntimony != null) {                              target.addOreCluster(clusterBaseMetalsAntimony);}
        if (ModBlocks.oreBaseMetalsBismuth != null) {                               target.addOreCluster(clusterBaseMetalsBismuth);}
        if (ModBlocks.oreBaseMetalsCopper != null) {                                target.addOreCluster(clusterBaseMetalsCopper);}
        if (ModBlocks.oreBaseMetalsLead != null) {                                  target.addOreCluster(clusterBaseMetalsLead);}
        if (ModBlocks.oreBaseMetalsMercury != null) {                               target.addOreCluster(clusterBaseMetalsMercury);}
        if (ModBlocks.oreBaseMetalsNickel != null) {                                target.addOreCluster(clusterBaseMetalsNickel);}
        if (ModBlocks.oreBaseMetalsPlatinum != null) {                              target.addOreCluster(clusterBaseMetalsPlatinum);}
        if (ModBlocks.oreBaseMetalsSilver != null) {                                target.addOreCluster(clusterBaseMetalsSilver);}
        if (ModBlocks.oreBaseMetalsTin != null) {                                   target.addOreCluster(clusterBaseMetalsTin);}
        if (ModBlocks.oreBaseMetalsZinc != null) {                                  target.addOreCluster(clusterBaseMetalsZinc);}
        if (ModBlocks.oreModernMetalsAluminum != null) {                            target.addOreCluster(clusterModernMetalsAluminum);}
        if (ModBlocks.oreModernMetalsBeryllium != null) {                           target.addOreCluster(clusterModernMetalsBeryllium);}
        if (ModBlocks.oreModernMetalsBoron != null) {                               target.addOreCluster(clusterModernMetalsBoron);}
        if (ModBlocks.oreModernMetalsCadmium != null) {                             target.addOreCluster(clusterModernMetalsCadmium);}
        if (ModBlocks.oreModernMetalsChromium != null) {                            target.addOreCluster(clusterModernMetalsChromium);}
        if (ModBlocks.oreModernMetalsIridium != null) {                             target.addOreCluster(clusterModernMetalsIridium);}
        if (ModBlocks.oreModernMetalsMagnesium != null) {                           target.addOreCluster(clusterModernMetalsMagnesium);}
        if (ModBlocks.oreModernMetalsManganese != null) {                           target.addOreCluster(clusterModernMetalsManganese);}
        if (ModBlocks.oreModernMetalsOsmium != null) {                              target.addOreCluster(clusterModernMetalsOsmium);}
        if (ModBlocks.oreModernMetalsPlutonium != null) {                           target.addOreCluster(clusterModernMetalsPlutonium);}
        if (ModBlocks.oreModernMetalsRutile != null) {                              target.addOreCluster(clusterModernMetalsRutile);}
        if (ModBlocks.oreModernMetalsTantalum != null) {                            target.addOreCluster(clusterModernMetalsTantalum);}
        if (ModBlocks.oreModernMetalsThorium != null) {                             target.addOreCluster(clusterModernMetalsThorium);}
        if (ModBlocks.oreModernMetalsTitanium != null) {                            target.addOreCluster(clusterModernMetalsTitanium);}
        if (ModBlocks.oreModernMetalsTungsten != null) {                            target.addOreCluster(clusterModernMetalsTungsten);}
        if (ModBlocks.oreModernMetalsUranium != null) {                             target.addOreCluster(clusterModernMetalsUranium);}
        if (ModBlocks.oreModernMetalsZirconium != null) {                           target.addOreCluster(clusterModernMetalsZirconium);}
        if (ModBlocks.oreThermalFoundationCopper != null) {                         target.addOreCluster(clusterThermalFoundationCopper);}
        if (ModBlocks.oreThermalFoundationTin != null) {                            target.addOreCluster(clusterThermalFoundationTin);}
        if (ModBlocks.oreThermalFoundationSilver != null) {                         target.addOreCluster(clusterThermalFoundationSilver);}
        if (ModBlocks.oreThermalFoundationLead != null) {                           target.addOreCluster(clusterThermalFoundationLead);}
        if (ModBlocks.oreThermalFoundationAluminum != null) {                       target.addOreCluster(clusterThermalFoundationAluminum);}
        if (ModBlocks.oreThermalFoundationNickel != null) {                         target.addOreCluster(clusterThermalFoundationNickel);}
        if (ModBlocks.oreThermalFoundationPlatinum != null) {                       target.addOreCluster(clusterThermalFoundationPlatinum);}
        if (ModBlocks.oreThermalFoundationIridium != null) {                        target.addOreCluster(clusterThermalFoundationIridium);}
        if (ModBlocks.oreThermalFoundationMithril != null) {                        target.addOreCluster(clusterThermalFoundationMithril);}
        if (ModBlocks.oreImmersiveEngineeringCopper != null) {                      target.addOreCluster(clusterImmersiveEngineeringCopper);}
        if (ModBlocks.oreImmersiveEngineeringAluminum != null) {                    target.addOreCluster(clusterImmersiveEngineeringAluminum);}
        if (ModBlocks.oreImmersiveEngineeringLead != null) {                        target.addOreCluster(clusterImmersiveEngineeringLead);}
        if (ModBlocks.oreImmersiveEngineeringSilver != null) {                      target.addOreCluster(clusterImmersiveEngineeringSilver);}
        if (ModBlocks.oreImmersiveEngineeringNickel != null) {                      target.addOreCluster(clusterImmersiveEngineeringNickel);}
        if (ModBlocks.oreImmersiveEngineeringUranium != null) {                     target.addOreCluster(clusterImmersiveEngineeringUranium);}
        if (ModBlocks.oreTechRebornGalena != null) {                                target.addOreCluster(clusterTechRebornGalena);}
        if (ModBlocks.oreTechRebornIridium != null) {                               target.addOreCluster(clusterTechRebornIridium);}
        if (ModBlocks.oreTechRebornBauxite != null) {                               target.addOreCluster(clusterTechRebornBauxite);}
        if (ModBlocks.oreTechRebornLead != null) {                                  target.addOreCluster(clusterTechRebornLead);}
        if (ModBlocks.oreTechRebornSilver != null) {                                target.addOreCluster(clusterTechRebornSilver);}
        if (ModBlocks.oreTechRebornCopper != null) {                                target.addOreCluster(clusterTechRebornCopper);}
        if (ModBlocks.oreTechRebornTin != null) {                                   target.addOreCluster(clusterTechRebornTin);}
        if (ModBlocks.oreTechRebornTungsten != null) {                              target.addOreCluster(clusterTechRebornTungsten);}
        if (ModBlocks.oreTechRebornSheldonite != null) {                            target.addOreCluster(clusterTechRebornSheldonite);}
        if (ModBlocks.oreForestryCopper != null) {                                  target.addOreCluster(clusterForestryCopper);}
        if (ModBlocks.oreForestryTin != null) {                                     target.addOreCluster(clusterForestryTin);}
        if (ModBlocks.oreBluePowerCopper != null) {                                 target.addOreCluster(clusterBluePowerCopper);}
        if (ModBlocks.oreBluePowerSilver != null) {                                 target.addOreCluster(clusterBluePowerSilver);}
        if (ModBlocks.oreBluePowerZinc != null) {                                   target.addOreCluster(clusterBluePowerZinc);}
        if (ModBlocks.oreBluePowerTungsten != null) {                               target.addOreCluster(clusterBluePowerTungsten);}
        if (ModBlocks.oreExtremeReactorsYellorite != null) {                        target.addOreCluster(clusterExtremeReactorsYellorite);}
        if (ModBlocks.oreEmbersCopper != null) {                                    target.addOreCluster(clusterEmbersCopper);}
        if (ModBlocks.oreEmbersLead != null) {                                      target.addOreCluster(clusterEmbersLead);}
        if (ModBlocks.oreEmbersSilver != null) {                                    target.addOreCluster(clusterEmbersSilver);}
        if (ModBlocks.oreEmbersAluminum != null) {                                  target.addOreCluster(clusterEmbersAluminum);}
        if (ModBlocks.oreEmbersNickel != null) {                                    target.addOreCluster(clusterEmbersNickel);}
        if (ModBlocks.oreEmbersTin != null) {                                       target.addOreCluster(clusterEmbersTin);}
        if (ModBlocks.oreMekanismOsmium != null) {                                  target.addOreCluster(clusterMekanismOsmium);}
        if (ModBlocks.oreMekanismCopper != null) {                                  target.addOreCluster(clusterMekanismCopper);}
        if (ModBlocks.oreMekanismTin != null) {                                     target.addOreCluster(clusterMekanismTin);}
        if (ModBlocks.oreNuclearCraftCopper != null) {                              target.addOreCluster(clusterNuclearCraftCopper);}
        if (ModBlocks.oreNuclearCraftTin != null) {                                 target.addOreCluster(clusterNuclearCraftTin);}
        if (ModBlocks.oreNuclearCraftLead != null) {                                target.addOreCluster(clusterNuclearCraftLead);}
        if (ModBlocks.oreNuclearCraftThorium != null) {                             target.addOreCluster(clusterNuclearCraftThorium);}
        if (ModBlocks.oreNuclearCraftUranium != null) {                             target.addOreCluster(clusterNuclearCraftUranium);}
        if (ModBlocks.oreNuclearCraftBoron != null) {                               target.addOreCluster(clusterNuclearCraftBoron);}
        if (ModBlocks.oreNuclearCraftLithium != null) {                             target.addOreCluster(clusterNuclearCraftLithium);}
        if (ModBlocks.oreNuclearCraftMagnesium != null) {                           target.addOreCluster(clusterNuclearCraftMagnesium);}
    }
    private static void addCrystalClustersCompat(ItemLists target) {
        if (ModBlocks.oreTechRebornRuby != null) {                                  target.addCrystalCluster(clusterTechRebornRuby);}
        if (ModBlocks.oreTechRebornSapphire != null) {                              target.addCrystalCluster(clusterTechRebornSapphire);}
        if (ModBlocks.oreTechRebornPeridot != null) {                               target.addCrystalCluster(clusterTechRebornPeridot);}
        if (ModBlocks.oreForestryApatite != null) {                                 target.addCrystalCluster(clusterForestryApatite);}
        if (ModBlocks.oreBluePowerRuby != null) {                                   target.addCrystalCluster(clusterBluePowerRuby);}
        if (ModBlocks.oreBluePowerSapphire != null) {                               target.addCrystalCluster(clusterBluePowerSapphire);}
        if (ModBlocks.oreBluePowerAmethyst != null) {                               target.addCrystalCluster(clusterBluePowerAmethyst);}
        if (ModBlocks.oreAppliedEnergisticsCertusQuartz != null) {                  target.addCrystalCluster(clusterAppliedEnergisticsCertusQuartz);}
        if (ModBlocks.oreAppliedEnergisticsChargedCertusQuartz != null) {           target.addCrystalCluster(clusterAppliedEnergisticsChargedCertusQuartz);}
        if (ModBlocks.oreEmbersQuartz != null) {                                    target.addCrystalCluster(clusterEmbersQuartz);}
    }
    private static void addDustClustersCompat(ItemLists target) {

        if (ModBlocks.oreTechRebornSodalite != null) {                              target.addDustCluster(clusterTechRebornSodalite);}
        if (ModBlocks.oreThermalFoundationClathrateRedstone != null) {              target.addDustCluster(clusterThermalFoundationClathrateRedstone);}
        if (ModBlocks.oreBluePowerTeslatite != null) {                              target.addDustCluster(clusterBluePowerTeslatite);}
        if (ModBlocks.oreAromaDimensionSticky != null) {                            target.addDustCluster(clusterAromaDimensionSticky);}
        if (ModBlocks.oreAromaDimensionClay != null) {                              target.addDustCluster(clusterAromaDimensionClay);}
        if (ModBlocks.oreDraconicEvolutionDraconium != null) {                      target.addDustCluster(clusterDraconicEvolutionDraconium);}
    }

    public static void addAllTo(ItemLists target) {
        addOreClusters(target);
        addCrystalClusters(target);
        addDustClusters(target);
        addSpallingHammers(target);

        addOreClustersCompat(target);
        addCrystalClustersCompat(target);
        addDustClustersCompat(target);
    }

    public static void registerCompat(IForgeRegistry<Item> itemReg) {
        register(itemReg, ModBlocks.oreBaseMetalsAntimony,              new ItemOreCluster("bm.ore_cluster_antimony",      "oreAntimony",      "basemetals:antimony_ingot"));
        register(itemReg, ModBlocks.oreBaseMetalsBismuth,               new ItemOreCluster("bm.ore_cluster_bismuth",       "oreBismuth",       "basemetals:bismuth_ingot"));
        register(itemReg, ModBlocks.oreBaseMetalsCopper,                new ItemOreCluster("bm.ore_cluster_copper",        "oreCopper",        "basemetals:copper_ingot"));
        register(itemReg, ModBlocks.oreBaseMetalsLead,                  new ItemOreCluster("bm.ore_cluster_lead",          "oreLead",          "basemetals:lead_ingot"));
        register(itemReg, ModBlocks.oreBaseMetalsMercury,               new ItemOreCluster("bm.ore_cluster_mercury",       "oreMercury",       "basemetals:mercury_ingot"));
        register(itemReg, ModBlocks.oreBaseMetalsNickel,                new ItemOreCluster("bm.ore_cluster_nickel",        "oreNickel",        "basemetals:nickel_ingot"));
        register(itemReg, ModBlocks.oreBaseMetalsPlatinum,              new ItemOreCluster("bm.ore_cluster_platinum",      "orePlatinum",      "basemetals:platinum_ingot"));
        register(itemReg, ModBlocks.oreBaseMetalsSilver,                new ItemOreCluster("bm.ore_cluster_silver",        "oreSilver",        "basemetals:silver_ingot"));
        register(itemReg, ModBlocks.oreBaseMetalsTin,                   new ItemOreCluster("bm.ore_cluster_tin",           "oreTin",           "basemetals:tin_ingot"));
        register(itemReg, ModBlocks.oreBaseMetalsZinc,                  new ItemOreCluster("bm.ore_cluster_zinc",          "oreZinc",          "basemetals:zinc_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsAluminum,            new ItemOreCluster("mm.ore_cluster_aluminum",      "oreAluminum",      "modernmetals:aluminum_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsBeryllium,           new ItemOreCluster("mm.ore_cluster_beryllium",     "oreBeryllium",     "modernmetals:beryllium_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsBoron,               new ItemOreCluster("mm.ore_cluster_boron",         "oreBoron",         "modernmetals:boron_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsCadmium,             new ItemOreCluster("mm.ore_cluster_cadmium",       "oreCadmium",       "modernmetals:cadmium_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsChromium,            new ItemOreCluster("mm.ore_cluster_chromium",      "oreChromium",      "modernmetals:chromium_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsIridium,             new ItemOreCluster("mm.ore_cluster_iridium",       "oreIridium",       "modernmetals:iridium_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsMagnesium,           new ItemOreCluster("mm.ore_cluster_magnesium",     "oreMagnesium",     "modernmetals:magnesium_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsManganese,           new ItemOreCluster("mm.ore_cluster_manganese",     "oreManganese",     "modernmetals:manganese_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsOsmium,              new ItemOreCluster("mm.ore_cluster_osmium",        "oreOsmium",        "modernmetals:osmium_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsPlutonium,           new ItemOreCluster("mm.ore_cluster_plutonium",     "orePlutonium",     "modernmetals:plutonium_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsRutile,              new ItemOreCluster("mm.ore_cluster_rutile",        "oreRutile",        "modernmetals:rutile_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsTantalum,            new ItemOreCluster("mm.ore_cluster_tantalum",      "oreTantalum",      "modernmetals:tantalum_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsThorium,             new ItemOreCluster("mm.ore_cluster_thorium",       "oreThorium",       "modernmetals:thorium_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsTitanium,            new ItemOreCluster("mm.ore_cluster_titanium",      "oreTitanium",      "modernmetals:titanium_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsTungsten,            new ItemOreCluster("mm.ore_cluster_tungsten",      "oreTungsten",      "modernmetals:tungsten_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsUranium,             new ItemOreCluster("mm.ore_cluster_uranium",       "oreUranium",       "modernmetals:uranium_ingot"));
        register(itemReg, ModBlocks.oreModernMetalsZirconium,           new ItemOreCluster("mm.ore_cluster_zirconium",     "oreZirconium",     "modernmetals:zirconium_ingot"));
        register(itemReg, ModBlocks.oreThermalFoundationCopper,         new ItemOreCluster("tf.ore_cluster_copper",        "oreCopper",        "thermalfoundation:material/128"));
        register(itemReg, ModBlocks.oreThermalFoundationTin,            new ItemOreCluster("tf.ore_cluster_tin",           "oreTin",           "thermalfoundation:material/129"));
        register(itemReg, ModBlocks.oreThermalFoundationSilver,         new ItemOreCluster("tf.ore_cluster_silver",        "oreSilver",        "thermalfoundation:material/130"));
        register(itemReg, ModBlocks.oreThermalFoundationLead,           new ItemOreCluster("tf.ore_cluster_lead",          "oreLead",          "thermalfoundation:material/131"));
        register(itemReg, ModBlocks.oreThermalFoundationAluminum,       new ItemOreCluster("tf.ore_cluster_aluminum",      "oreAluminum",      "thermalfoundation:material/132"));
        register(itemReg, ModBlocks.oreThermalFoundationNickel,         new ItemOreCluster("tf.ore_cluster_nickel",        "oreNickel",        "thermalfoundation:material/133"));
        register(itemReg, ModBlocks.oreThermalFoundationPlatinum,       new ItemOreCluster("tf.ore_cluster_platinum",      "orePlatinum",      "thermalfoundation:material/134"));
        register(itemReg, ModBlocks.oreThermalFoundationIridium,        new ItemOreCluster("tf.ore_cluster_iridium",       "oreIridium",       "thermalfoundation:material/135"));
        register(itemReg, ModBlocks.oreThermalFoundationMithril,        new ItemOreCluster("tf.ore_cluster_mithril",       "oreMithril",       "thermalfoundation:material/136"));
        register(itemReg, ModBlocks.oreImmersiveEngineeringCopper,      new ItemOreCluster("ie.ore_cluster_copper",        "oreCopper",        "immersiveengineering:metal/0"));
        register(itemReg, ModBlocks.oreImmersiveEngineeringAluminum,    new ItemOreCluster("ie.ore_cluster_aluminum",      "oreAluminum",      "immersiveengineering:metal/1"));
        register(itemReg, ModBlocks.oreImmersiveEngineeringLead,        new ItemOreCluster("ie.ore_cluster_lead",          "oreLead",          "immersiveengineering:metal/2"));
        register(itemReg, ModBlocks.oreImmersiveEngineeringSilver,      new ItemOreCluster("ie.ore_cluster_silver",        "oreSilver",        "immersiveengineering:metal/3"));
        register(itemReg, ModBlocks.oreImmersiveEngineeringNickel,      new ItemOreCluster("ie.ore_cluster_nickel",        "oreNickel",        "immersiveengineering:metal/4"));
        register(itemReg, ModBlocks.oreImmersiveEngineeringUranium,     new ItemOreCluster("ie.ore_cluster_uranium",       "oreUranium",       "immersiveengineering:metal/5"));
        register(itemReg, ModBlocks.oreTechRebornGalena,                new ItemOreCluster("tr.ore_cluster_galena",        "oreGalena",        null));
        register(itemReg, ModBlocks.oreTechRebornIridium,               new ItemOreCluster("tr.ore_cluster_iridium",       "oreIridium",       null));
        register(itemReg, ModBlocks.oreTechRebornBauxite,               new ItemOreCluster("tr.ore_cluster_bauxite",       "oreBauxite",       null));
        register(itemReg, ModBlocks.oreTechRebornLead,                  new ItemOreCluster("tr.ore_cluster_lead",          "oreLead",          "techreborn:ingot/8"));
        register(itemReg, ModBlocks.oreTechRebornSilver,                new ItemOreCluster("tr.ore_cluster_silver",        "oreSilver",        "techreborn:ingot/11"));
        register(itemReg, ModBlocks.oreTechRebornCopper,                new ItemOreCluster("tr.ore_cluster_copper",        "oreCopper",        "techreborn:ingot/4"));
        register(itemReg, ModBlocks.oreTechRebornTin,                   new ItemOreCluster("tr.ore_cluster_tin",           "oreTin",           "techreborn:ingot/13"));
        register(itemReg, ModBlocks.oreTechRebornTungsten,              new ItemOreCluster("tr.ore_cluster_tungsten",      "oreTungsten",      "techreborn:ingot/15"));
        register(itemReg, ModBlocks.oreTechRebornSheldonite,            new ItemOreCluster("tr.ore_cluster_sheldonite",    "oreSheldonite",    "techreborn:ingot/10"));
        register(itemReg, ModBlocks.oreForestryCopper,                  new ItemOreCluster("fr.ore_cluster_copper",        "oreCopper",        "forestry:ingot_copper"));
        register(itemReg, ModBlocks.oreForestryTin,                     new ItemOreCluster("fr.ore_cluster_tin",           "oreTin",           "forestry:ingot_tin"));
        register(itemReg, ModBlocks.oreBluePowerCopper,                 new ItemOreCluster("bp.ore_cluster_copper",        "oreCopper",        "bluepower:copper_ingot"));
        register(itemReg, ModBlocks.oreBluePowerSilver,                 new ItemOreCluster("bp.ore_cluster_silver",        "oreSilver",        "bluepower:silver_ingot"));
        register(itemReg, ModBlocks.oreBluePowerZinc,                   new ItemOreCluster("bp.ore_cluster_zinc",          "oreZinc",          "bluepower:zinc_ingot"));
        register(itemReg, ModBlocks.oreBluePowerTungsten,               new ItemOreCluster("bp.ore_cluster_tungsten",      "oreTungsten",      "bluepower:tungsten_nugget"));
        register(itemReg, ModBlocks.oreExtremeReactorsYellorite,        new ItemOreCluster("er.ore_cluster_yellorite",     "oreYellorite",     "bigreactors:ingotyellorium"));
        register(itemReg, ModBlocks.oreEmbersCopper,                    new ItemOreCluster("em.ore_cluster_copper",        "oreCopper",        "embers:ingot_copper"));
        register(itemReg, ModBlocks.oreEmbersLead,                      new ItemOreCluster("em.ore_cluster_lead",          "oreLead",          "embers:ingot_lead"));
        register(itemReg, ModBlocks.oreEmbersSilver,                    new ItemOreCluster("em.ore_cluster_silver",        "oreSilver",        "embers:ingot_silver"));
        register(itemReg, ModBlocks.oreEmbersAluminum,                  new ItemOreCluster("em.ore_cluster_aluminum",      "oreAluminum",      "embers:ingot_aluminum"));
        register(itemReg, ModBlocks.oreEmbersNickel,                    new ItemOreCluster("em.ore_cluster_nickel",        "oreNickel",        "embers:ingot_nickel"));
        register(itemReg, ModBlocks.oreEmbersTin,                       new ItemOreCluster("em.ore_cluster_tin",           "oreTin",           "embers:ingot_tin"));
        register(itemReg, ModBlocks.oreMekanismOsmium,                  new ItemOreCluster("mk.ore_cluster_osmium",        "oreOsmium",        "mekanism:ingot/1"));
        register(itemReg, ModBlocks.oreMekanismCopper,                  new ItemOreCluster("mk.ore_cluster_copper",        "oreCopper",        "mekanism:ingot/5"));
        register(itemReg, ModBlocks.oreMekanismTin,                     new ItemOreCluster("mk.ore_cluster_tin",           "oreTin",           "mekanism:ingot/6"));
        register(itemReg, ModBlocks.oreNuclearCraftCopper,              new ItemOreCluster("nc.ore_cluster_copper",        "oreCopper",        "nuclearcraft:ingot/0"));
        register(itemReg, ModBlocks.oreNuclearCraftTin,                 new ItemOreCluster("nc.ore_cluster_tin",           "oreTin",           "nuclearcraft:ingot/1"));
        register(itemReg, ModBlocks.oreNuclearCraftLead,                new ItemOreCluster("nc.ore_cluster_lead",          "oreLead",          "nuclearcraft:ingot/2"));
        register(itemReg, ModBlocks.oreNuclearCraftThorium,             new ItemOreCluster("nc.ore_cluster_thorium",       "oreThorium",       "nuclearcraft:ingot/3"));
        register(itemReg, ModBlocks.oreNuclearCraftUranium,             new ItemOreCluster("nc.ore_cluster_uranium",       "oreUranium",       "nuclearcraft:ingot/4"));
        register(itemReg, ModBlocks.oreNuclearCraftBoron,               new ItemOreCluster("nc.ore_cluster_boron",         "oreBoron",         "nuclearcraft:ingot/5"));
        register(itemReg, ModBlocks.oreNuclearCraftLithium,             new ItemOreCluster("nc.ore_cluster_lithium",       "oreLithium",       "nuclearcraft:ingot/6"));
        register(itemReg, ModBlocks.oreNuclearCraftMagnesium,           new ItemOreCluster("nc.ore_cluster_magnesium",     "oreMagnesium",     "nuclearcraft:ingot/7"));

        register(itemReg, ModBlocks.oreTechRebornRuby,                          new ItemCrystalCluster("tr.crystal_cluster_ruby",              "oreRuby",                  null));
        register(itemReg, ModBlocks.oreTechRebornSapphire,                      new ItemCrystalCluster("tr.crystal_cluster_sapphire",          "oreSapphire",              null));
        register(itemReg, ModBlocks.oreTechRebornPeridot,                       new ItemCrystalCluster("tr.crystal_cluster_peridot",           "orePeridot",               null));
        register(itemReg, ModBlocks.oreForestryApatite,                         new ItemCrystalCluster("fr.crystal_cluster_apatite",           "oreApatite",               null));
        register(itemReg, ModBlocks.oreBluePowerRuby,                           new ItemCrystalCluster("bp.crystal_cluster_ruby",              "oreRuby",                  null));
        register(itemReg, ModBlocks.oreBluePowerSapphire,                       new ItemCrystalCluster("bp.crystal_cluster_sapphire",          "oreSapphire",              null));
        register(itemReg, ModBlocks.oreBluePowerAmethyst,                       new ItemCrystalCluster("bp.crystal_cluster_amethyst",          "oreAmethyst",              null));
        register(itemReg, ModBlocks.oreAppliedEnergisticsCertusQuartz,          new ItemCrystalCluster("ae.crystal_cluster_quartz",            "oreCertusQuartz",          null));
        register(itemReg, ModBlocks.oreAppliedEnergisticsChargedCertusQuartz,   new ItemCrystalCluster("ae.crystal_cluster_charged_quartz",    "oreChargedCertusQuartz",   null));
        register(itemReg, ModBlocks.oreEmbersQuartz,                            new ItemCrystalCluster("em.crystal_cluster_quartz",            "oreQuartz",                null));

        register(itemReg, ModBlocks.oreThermalFoundationClathrateRedstone,  new ItemDustCluster("tf.fluid_cluster_redstone",   "oreClathrateRedstone",     null));
        register(itemReg, ModBlocks.oreBluePowerTeslatite,                  new ItemDustCluster("bp.dust_cluster_teslatite",   "oreTeslatite",             null));
        register(itemReg, ModBlocks.oreAromaDimensionSticky,                new ItemDustCluster("ad.dust_cluster_sticky",      "oreSticky",                "minecraft:slime_ball/0/4"));
        register(itemReg, ModBlocks.oreAromaDimensionClay,                  new ItemDustCluster("ad.dust_cluster_clay",        "oreClay",                  "minecraft:clay"));
        register(itemReg, ModBlocks.oreTechRebornSodalite,                  new ItemDustCluster("tr.dust_cluster_sodalite",    "oreSodalite",              null));
        register(itemReg, ModBlocks.oreDraconicEvolutionDraconium,          new ItemDustCluster("de.dust_cluster_draconium",   "oreDraconium",             "draconicevolution:draconium_ingot"));
    }

    private static void register(IForgeRegistry<Item> itemReg, Block ore, Item item) {
        if(ore != null) {
            itemReg.register(item);
        }
    }
}
