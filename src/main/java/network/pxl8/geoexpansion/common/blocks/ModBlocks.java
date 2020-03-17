package network.pxl8.geoexpansion.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import network.pxl8.geoexpansion.compat.CompatHandler;
import network.pxl8.geoexpansion.config.Conf;
import network.pxl8.geoexpansion.lib.LibMeta;

import java.util.ArrayList;
import java.util.List;

import static network.pxl8.geoexpansion.compat.CompatHandler.modListLoaded;

@GameRegistry.ObjectHolder(LibMeta.MOD_ID)
public class ModBlocks {
    @GameRegistry.ObjectHolder("mc.stone")                  public static BlockStone blockStone;
    @GameRegistry.ObjectHolder("mc.andesite")               public static BlockStone blockAndesite;
    @GameRegistry.ObjectHolder("mc.diorite")                public static BlockStone blockDiorite;
    @GameRegistry.ObjectHolder("mc.granite")                public static BlockStone blockGranite;

    @GameRegistry.ObjectHolder("mc.cobblestone")            public static BlockStone blockCobblestone;
    @GameRegistry.ObjectHolder("mc.cobblestone_mossy")      public static BlockStone blockCobblestoneMossy;

    @GameRegistry.ObjectHolder("mc.stone_brick")            public static BlockStone blockStonebrick;
    @GameRegistry.ObjectHolder("mc.stone_brick_mossy")      public static BlockStone blockStonebrickMossy;
    @GameRegistry.ObjectHolder("mc.stone_brick_cracked")    public static BlockStone blockStonebrickCracked;
    @GameRegistry.ObjectHolder("mc.stone_brick_chiseled")   public static BlockStone blockStonebrickChiseled;

    @GameRegistry.ObjectHolder("mc.infested_stone")                 public static BlockStoneInfested blockInfestedStone;
    @GameRegistry.ObjectHolder("mc.infested_cobblestone")           public static BlockStoneInfested blockInfestedCobblestone;
    @GameRegistry.ObjectHolder("mc.infested_stone_brick")           public static BlockStoneInfested blockInfestedStonebrick;
    @GameRegistry.ObjectHolder("mc.infested_stone_brick_mossy")     public static BlockStoneInfested blockInfestedStonebrickMossy;
    @GameRegistry.ObjectHolder("mc.infested_stone_brick_cracked")   public static BlockStoneInfested blockInfestedStonebrickCracked;
    @GameRegistry.ObjectHolder("mc.infested_stone_brick_chiseled")  public static BlockStoneInfested blockInfestedStonebrickChiseled;

    @GameRegistry.ObjectHolder("mc.dirt")                   public static BlockStone blockDirt;
    @GameRegistry.ObjectHolder("mc.clay")                   public static BlockStone blockClay;

    @GameRegistry.ObjectHolder("mc.bedrock")                public static BlockBedrock blockBedrock;

    @GameRegistry.ObjectHolder("mc.ore_coal")               public static BlockOre oreCoal;
    @GameRegistry.ObjectHolder("mc.ore_iron")               public static BlockOre oreIron;
    @GameRegistry.ObjectHolder("mc.ore_gold")               public static BlockOre oreGold;
    @GameRegistry.ObjectHolder("mc.ore_diamond")            public static BlockOre oreDiamond;
    @GameRegistry.ObjectHolder("mc.ore_emerald")            public static BlockOre oreEmerald;
    @GameRegistry.ObjectHolder("mc.ore_redstone")           public static BlockOre oreRedstone;
    @GameRegistry.ObjectHolder("mc.ore_lapis")              public static BlockOre oreLapis;

    public static List<BlockStone> blockStoneList = new ArrayList<>();
    public static List<BlockOre> blockOreList = new ArrayList<>();

    private static void addStoneBlocks() {
        blockStoneList.add(blockStone);
        blockStoneList.add(blockAndesite);
        blockStoneList.add(blockDiorite);
        blockStoneList.add(blockGranite);

        blockStoneList.add(blockCobblestone);
        blockStoneList.add(blockCobblestoneMossy);

        blockStoneList.add(blockStonebrick);
        blockStoneList.add(blockStonebrickMossy);
        blockStoneList.add(blockStonebrickCracked);
        blockStoneList.add(blockStonebrickChiseled);

        blockStoneList.add(blockInfestedStone);
        blockStoneList.add(blockInfestedCobblestone);
        blockStoneList.add(blockInfestedStonebrick);
        blockStoneList.add(blockInfestedStonebrickMossy);
        blockStoneList.add(blockInfestedStonebrickCracked);
        blockStoneList.add(blockInfestedStonebrickChiseled);

        blockStoneList.add(blockDirt);
        blockStoneList.add(blockClay);

        blockStoneList.add(blockBedrock);
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
        blockReg.register(new BlockStone("mc.stone",       "pickaxe", 1.5F, "minecraft:stone/0",    "minecraft:cobblestone", "minecraft:stone/0"));
        blockReg.register(new BlockStone("mc.andesite",    "pickaxe", 1.5F, "minecraft:stone/5",    "minecraft:stone/5"));
        blockReg.register(new BlockStone("mc.diorite",     "pickaxe", 1.5F, "minecraft:stone/3",    "minecraft:stone/3"));
        blockReg.register(new BlockStone("mc.granite",     "pickaxe", 1.5F, "minecraft:stone/1",    "minecraft:stone/1"));

        blockReg.register(new BlockStone("mc.cobblestone",          "pickaxe", 1.5F, "minecraft:cobblestone", "minecraft:cobblestone"));
        blockReg.register(new BlockStone("mc.cobblestone_mossy",    "pickaxe", 1.5F, "minecraft:mossy_cobblestone", "minecraft:mossy_cobblestone"));

        blockReg.register(new BlockStone("mc.stone_brick",          "pickaxe", 1.5F, "minecraft:stonebrick/0", "minecraft:stonebrick/0"));
        blockReg.register(new BlockStone("mc.stone_brick_mossy",    "pickaxe", 1.5F, "minecraft:stonebrick/1", "minecraft:stonebrick/1"));
        blockReg.register(new BlockStone("mc.stone_brick_cracked",  "pickaxe", 1.5F, "minecraft:stonebrick/2", "minecraft:stonebrick/2"));
        blockReg.register(new BlockStone("mc.stone_brick_chiseled", "pickaxe", 1.5F, "minecraft:stonebrick/3", "minecraft:stonebrick/3"));

        blockReg.register(new BlockStoneInfested("mc.infested_stone",               "pickaxe", 1.5F, "minecraft:monster_egg/0", "minecraft:stone/0"));
        blockReg.register(new BlockStoneInfested("mc.infested_cobblestone",         "pickaxe", 1.5F, "minecraft:monster_egg/1", "minecraft:cobblestone"));
        blockReg.register(new BlockStoneInfested("mc.infested_stone_brick",         "pickaxe", 1.5F, "minecraft:monster_egg/2", "minecraft:stonebrick/0"));
        blockReg.register(new BlockStoneInfested("mc.infested_stone_brick_mossy",   "pickaxe", 1.5F, "minecraft:monster_egg/3", "minecraft:stonebrick/1"));
        blockReg.register(new BlockStoneInfested("mc.infested_stone_brick_cracked", "pickaxe", 1.5F, "minecraft:monster_egg/4", "minecraft:stonebrick/2"));
        blockReg.register(new BlockStoneInfested("mc.infested_stone_brick_chiseled","pickaxe", 1.5F, "minecraft:monster_egg/5", "minecraft:stonebrick/3"));

        blockReg.register(new BlockStone("mc.dirt",        "shovel", 0.5F, "minecraft:dirt",    "minecraft:dirt", Material.GROUND).setSound(SoundType.GROUND));
        blockReg.register(new BlockStone("mc.clay",        "shovel", 0.6F, "minecraft:clay",    "minecraft:clay_ball/0/4", Material.CLAY).setSound(SoundType.GROUND));

        blockReg.register(new BlockBedrock().setLightOpacity(14));

        blockReg.register(new BlockOre("mc.ore_coal",      2.0F, "minecraft:coal_ore",      "geoexpansion:mc.ore_cluster_coal"));
        blockReg.register(new BlockOre("mc.ore_iron",      2.0F, "minecraft:iron_ore",      "geoexpansion:mc.ore_cluster_iron"));
        blockReg.register(new BlockOre("mc.ore_gold",      2.0F, "minecraft:gold_ore",      "geoexpansion:mc.ore_cluster_gold"));
        blockReg.register(new BlockOre("mc.ore_diamond",   2.0F, "minecraft:diamond_ore",   "geoexpansion:mc.crystal_cluster_diamond"));
        blockReg.register(new BlockOre("mc.ore_emerald",   2.0F, "minecraft:emerald_ore",   "geoexpansion:mc.crystal_cluster_emerald"));
        blockReg.register(new BlockOre("mc.ore_redstone",  2.0F, "minecraft:redstone_ore",  "geoexpansion:mc.dust_cluster_redstone"));
        blockReg.register(new BlockOre("mc.ore_lapis",     2.0F, "minecraft:lapis_ore",     "geoexpansion:mc.dust_cluster_lapis"));
    }

    @GameRegistry.ObjectHolder("bm.ore_antimony")               public static BlockOre oreBaseMetalsAntimony;
    @GameRegistry.ObjectHolder("bm.ore_bismuth")                public static BlockOre oreBaseMetalsBismuth;
    @GameRegistry.ObjectHolder("bm.ore_copper")                 public static BlockOre oreBaseMetalsCopper;
    @GameRegistry.ObjectHolder("bm.ore_lead")                   public static BlockOre oreBaseMetalsLead;
    @GameRegistry.ObjectHolder("bm.ore_mercury")                public static BlockOre oreBaseMetalsMercury;
    @GameRegistry.ObjectHolder("bm.ore_nickel")                 public static BlockOre oreBaseMetalsNickel;
    @GameRegistry.ObjectHolder("bm.ore_platinum")               public static BlockOre oreBaseMetalsPlatinum;
    @GameRegistry.ObjectHolder("bm.ore_silver")                 public static BlockOre oreBaseMetalsSilver;
    @GameRegistry.ObjectHolder("bm.ore_tin")                    public static BlockOre oreBaseMetalsTin;
    @GameRegistry.ObjectHolder("bm.ore_zinc")                   public static BlockOre oreBaseMetalsZinc;

    @GameRegistry.ObjectHolder("mm.ore_aluminum")               public static BlockOre oreModernMetalsAluminum;
    @GameRegistry.ObjectHolder("mm.ore_beryllium")              public static BlockOre oreModernMetalsBeryllium;
    @GameRegistry.ObjectHolder("mm.ore_boron")                  public static BlockOre oreModernMetalsBoron;
    @GameRegistry.ObjectHolder("mm.ore_cadmium")                public static BlockOre oreModernMetalsCadmium;
    @GameRegistry.ObjectHolder("mm.ore_chromium")               public static BlockOre oreModernMetalsChromium;
    @GameRegistry.ObjectHolder("mm.ore_iridium")                public static BlockOre oreModernMetalsIridium;
    @GameRegistry.ObjectHolder("mm.ore_magnesium")              public static BlockOre oreModernMetalsMagnesium;
    @GameRegistry.ObjectHolder("mm.ore_manganese")              public static BlockOre oreModernMetalsManganese;
    @GameRegistry.ObjectHolder("mm.ore_osmium")                 public static BlockOre oreModernMetalsOsmium;
    @GameRegistry.ObjectHolder("mm.ore_plutonium")              public static BlockOre oreModernMetalsPlutonium;
    @GameRegistry.ObjectHolder("mm.ore_rutile")                 public static BlockOre oreModernMetalsRutile;
    @GameRegistry.ObjectHolder("mm.ore_tantalum")               public static BlockOre oreModernMetalsTantalum;
    @GameRegistry.ObjectHolder("mm.ore_thorium")                public static BlockOre oreModernMetalsThorium;
    @GameRegistry.ObjectHolder("mm.ore_titanium")               public static BlockOre oreModernMetalsTitanium;
    @GameRegistry.ObjectHolder("mm.ore_tungsten")               public static BlockOre oreModernMetalsTungsten;
    @GameRegistry.ObjectHolder("mm.ore_uranium")                public static BlockOre oreModernMetalsUranium;
    @GameRegistry.ObjectHolder("mm.ore_zirconium")              public static BlockOre oreModernMetalsZirconium;

    @GameRegistry.ObjectHolder("tf.ore_copper")                 public static BlockOre oreThermalFoundationCopper;
    @GameRegistry.ObjectHolder("tf.ore_tin")                    public static BlockOre oreThermalFoundationTin;
    @GameRegistry.ObjectHolder("tf.ore_silver")                 public static BlockOre oreThermalFoundationSilver;
    @GameRegistry.ObjectHolder("tf.ore_lead")                   public static BlockOre oreThermalFoundationLead;
    @GameRegistry.ObjectHolder("tf.ore_aluminum")               public static BlockOre oreThermalFoundationAluminum;
    @GameRegistry.ObjectHolder("tf.ore_nickel")                 public static BlockOre oreThermalFoundationNickel;
    @GameRegistry.ObjectHolder("tf.ore_platinum")               public static BlockOre oreThermalFoundationPlatinum;
    @GameRegistry.ObjectHolder("tf.ore_iridium")                public static BlockOre oreThermalFoundationIridium;
    @GameRegistry.ObjectHolder("tf.ore_mithril")                public static BlockOre oreThermalFoundationMithril;
    @GameRegistry.ObjectHolder("tf.ore_fluid_redstone")         public static BlockOre oreThermalFoundationClathrateRedstone;

    @GameRegistry.ObjectHolder("ie.ore_copper")                 public static BlockOre oreImmersiveEngineeringCopper;
    @GameRegistry.ObjectHolder("ie.ore_aluminum")               public static BlockOre oreImmersiveEngineeringAluminum;
    @GameRegistry.ObjectHolder("ie.ore_lead")                   public static BlockOre oreImmersiveEngineeringLead;
    @GameRegistry.ObjectHolder("ie.ore_silver")                 public static BlockOre oreImmersiveEngineeringSilver;
    @GameRegistry.ObjectHolder("ie.ore_nickel")                 public static BlockOre oreImmersiveEngineeringNickel;
    @GameRegistry.ObjectHolder("ie.ore_uranium")                public static BlockOre oreImmersiveEngineeringUranium;

    @GameRegistry.ObjectHolder("tr.ore_galena")                 public static BlockOre oreTechRebornGalena;
    @GameRegistry.ObjectHolder("tr.ore_iridium")                public static BlockOre oreTechRebornIridium;
    @GameRegistry.ObjectHolder("tr.ore_ruby")                   public static BlockOre oreTechRebornRuby;
    @GameRegistry.ObjectHolder("tr.ore_sapphire")               public static BlockOre oreTechRebornSapphire;
    @GameRegistry.ObjectHolder("tr.ore_bauxite")                public static BlockOre oreTechRebornBauxite;
    @GameRegistry.ObjectHolder("tr.ore_lead")                   public static BlockOre oreTechRebornLead;
    @GameRegistry.ObjectHolder("tr.ore_silver")                 public static BlockOre oreTechRebornSilver;
    @GameRegistry.ObjectHolder("tr.ore_copper")                 public static BlockOre oreTechRebornCopper;
    @GameRegistry.ObjectHolder("tr.ore_tin")                    public static BlockOre oreTechRebornTin;

    @GameRegistry.ObjectHolder("tr.ore_tungsten")               public static BlockOre oreTechRebornTungsten;
    @GameRegistry.ObjectHolder("tr.ore_sheldonite")             public static BlockOre oreTechRebornSheldonite;
    @GameRegistry.ObjectHolder("tr.ore_peridot")                public static BlockOre oreTechRebornPeridot;
    @GameRegistry.ObjectHolder("tr.ore_sodalite")               public static BlockOre oreTechRebornSodalite;

    @GameRegistry.ObjectHolder("fr.ore_apatite")                public static BlockOre oreForestryApatite;
    @GameRegistry.ObjectHolder("fr.ore_copper")                 public static BlockOre oreForestryCopper;
    @GameRegistry.ObjectHolder("fr.ore_tin")                    public static BlockOre oreForestryTin;

    @GameRegistry.ObjectHolder("bp.ore_teslatite")              public static BlockOre oreBluePowerTeslatite;
    @GameRegistry.ObjectHolder("bp.ore_ruby")                   public static BlockOre oreBluePowerRuby;
    @GameRegistry.ObjectHolder("bp.ore_sapphire")               public static BlockOre oreBluePowerSapphire;
    @GameRegistry.ObjectHolder("bp.ore_amethyst")               public static BlockOre oreBluePowerAmethyst;
    @GameRegistry.ObjectHolder("bp.ore_copper")                 public static BlockOre oreBluePowerCopper;
    @GameRegistry.ObjectHolder("bp.ore_silver")                 public static BlockOre oreBluePowerSilver;
    @GameRegistry.ObjectHolder("bp.ore_zinc")                   public static BlockOre oreBluePowerZinc;
    @GameRegistry.ObjectHolder("bp.ore_tungsten")               public static BlockOre oreBluePowerTungsten;

    @GameRegistry.ObjectHolder("ae.ore_quartz")                 public static BlockOre oreAppliedEnergisticsCertusQuartz;
    @GameRegistry.ObjectHolder("ae.ore_charged_quartz")         public static BlockOre oreAppliedEnergisticsChargedCertusQuartz;

    @GameRegistry.ObjectHolder("er.ore_yellorite")              public static BlockOre oreExtremeReactorsYellorite;

    @GameRegistry.ObjectHolder("ad.ore_sticky")                 public static BlockOre oreAromaDimensionSticky;
    @GameRegistry.ObjectHolder("ad.ore_clay")                   public static BlockOre oreAromaDimensionClay;

    @GameRegistry.ObjectHolder("em.ore_copper")                 public static BlockOre oreEmbersCopper;
    @GameRegistry.ObjectHolder("em.ore_lead")                   public static BlockOre oreEmbersLead;
    @GameRegistry.ObjectHolder("em.ore_silver")                 public static BlockOre oreEmbersSilver;
    @GameRegistry.ObjectHolder("em.ore_aluminum")               public static BlockOre oreEmbersAluminum;
    @GameRegistry.ObjectHolder("em.ore_nickel")                 public static BlockOre oreEmbersNickel;
    @GameRegistry.ObjectHolder("em.ore_tin")                    public static BlockOre oreEmbersTin;
    @GameRegistry.ObjectHolder("em.ore_quartz")                 public static BlockOre oreEmbersQuartz;

    @GameRegistry.ObjectHolder("mk.ore_osmium")                 public static BlockOre oreMekanismOsmium;
    @GameRegistry.ObjectHolder("mk.ore_copper")                 public static BlockOre oreMekanismCopper;
    @GameRegistry.ObjectHolder("mk.ore_tin")                    public static BlockOre oreMekanismTin;

    @GameRegistry.ObjectHolder("nc.ore_copper")                 public static BlockOre oreNuclearCraftCopper;
    @GameRegistry.ObjectHolder("nc.ore_tin")                    public static BlockOre oreNuclearCraftTin;
    @GameRegistry.ObjectHolder("nc.ore_lead")                   public static BlockOre oreNuclearCraftLead;
    @GameRegistry.ObjectHolder("nc.ore_thorium")                public static BlockOre oreNuclearCraftThorium;
    @GameRegistry.ObjectHolder("nc.ore_uranium")                public static BlockOre oreNuclearCraftUranium;
    @GameRegistry.ObjectHolder("nc.ore_boron")                  public static BlockOre oreNuclearCraftBoron;
    @GameRegistry.ObjectHolder("nc.ore_lithium")                public static BlockOre oreNuclearCraftLithium;
    @GameRegistry.ObjectHolder("nc.ore_magnesium")              public static BlockOre oreNuclearCraftMagnesium;

    @GameRegistry.ObjectHolder("de.ore_draconium")              public static BlockOre oreDraconicEvolutionDraconium;

    @GameRegistry.ObjectHolder("qk.basalt")                     public static BlockStone stoneQuarkBasalt;
    @GameRegistry.ObjectHolder("qk.marble")                     public static BlockStone stoneQuarkMarble;
    @GameRegistry.ObjectHolder("qk.limestone")                  public static BlockStone stoneQuarkLimestone;
    @GameRegistry.ObjectHolder("qk.jasper")                     public static BlockStone stoneQuarkJasper;
    @GameRegistry.ObjectHolder("qk.slate")                      public static BlockStone stoneQuarkSlate;
    @GameRegistry.ObjectHolder("qk.brimstone")                  public static BlockStone stoneQuarkBrimstone;
    @GameRegistry.ObjectHolder("qk.permafrost")                 public static BlockStone stoneQuarkPermafrost;
    @GameRegistry.ObjectHolder("qk.cobbedstone")                public static BlockStone stoneQuarkCobbedstone;

    public static List<BlockStone> compatStoneList = new ArrayList<>();
    public static List<BlockOre> compatOreList = new ArrayList<>();

    private static void addCompatStones() {
        if (stoneQuarkBasalt != null) {                                 compatStoneList.add(stoneQuarkBasalt); }
        if (stoneQuarkMarble != null) {                                 compatStoneList.add(stoneQuarkMarble); }
        if (stoneQuarkLimestone != null) {                              compatStoneList.add(stoneQuarkLimestone); }
        if (stoneQuarkJasper != null) {                                 compatStoneList.add(stoneQuarkJasper); }
        if (stoneQuarkSlate != null) {                                  compatStoneList.add(stoneQuarkSlate); }
        if (stoneQuarkBrimstone != null) {                              compatStoneList.add(stoneQuarkBrimstone); }
        if (stoneQuarkPermafrost != null) {                             compatStoneList.add(stoneQuarkPermafrost); }
        if (stoneQuarkCobbedstone != null) {                            compatStoneList.add(stoneQuarkCobbedstone); }
    }

    private static void addCompatOres() {
        if (oreBaseMetalsAntimony != null) {                            compatOreList.add(oreBaseMetalsAntimony);}
        if (oreBaseMetalsBismuth != null) {                             compatOreList.add(oreBaseMetalsBismuth);}
        if (oreBaseMetalsCopper != null) {                              compatOreList.add(oreBaseMetalsCopper);}
        if (oreBaseMetalsLead != null) {                                compatOreList.add(oreBaseMetalsLead);}
        if (oreBaseMetalsMercury != null) {                             compatOreList.add(oreBaseMetalsMercury);}
        if (oreBaseMetalsNickel != null) {                              compatOreList.add(oreBaseMetalsNickel);}
        if (oreBaseMetalsPlatinum != null) {                            compatOreList.add(oreBaseMetalsPlatinum);}
        if (oreBaseMetalsSilver != null) {                              compatOreList.add(oreBaseMetalsSilver);}
        if (oreBaseMetalsTin != null) {                                 compatOreList.add(oreBaseMetalsTin);}
        if (oreBaseMetalsZinc != null) {                                compatOreList.add(oreBaseMetalsZinc);}

        if (oreModernMetalsAluminum != null) {                          compatOreList.add(oreModernMetalsAluminum);}
        if (oreModernMetalsBeryllium != null) {                         compatOreList.add(oreModernMetalsBeryllium);}
        if (oreModernMetalsBoron != null) {                             compatOreList.add(oreModernMetalsBoron);}
        if (oreModernMetalsCadmium != null) {                           compatOreList.add(oreModernMetalsCadmium);}
        if (oreModernMetalsChromium != null) {                          compatOreList.add(oreModernMetalsChromium);}
        if (oreModernMetalsIridium != null) {                           compatOreList.add(oreModernMetalsIridium);}
        if (oreModernMetalsMagnesium != null) {                         compatOreList.add(oreModernMetalsMagnesium);}
        if (oreModernMetalsManganese != null) {                         compatOreList.add(oreModernMetalsManganese);}
        if (oreModernMetalsOsmium != null) {                            compatOreList.add(oreModernMetalsOsmium);}
        if (oreModernMetalsPlutonium != null) {                         compatOreList.add(oreModernMetalsPlutonium);}
        if (oreModernMetalsRutile != null) {                            compatOreList.add(oreModernMetalsRutile);}
        if (oreModernMetalsTantalum != null) {                          compatOreList.add(oreModernMetalsTantalum);}
        if (oreModernMetalsThorium != null) {                           compatOreList.add(oreModernMetalsThorium);}
        if (oreModernMetalsTitanium != null) {                          compatOreList.add(oreModernMetalsTitanium);}
        if (oreModernMetalsTungsten != null) {                          compatOreList.add(oreModernMetalsTungsten);}
        if (oreModernMetalsUranium != null) {                           compatOreList.add(oreModernMetalsUranium);}
        if (oreModernMetalsZirconium != null) {                         compatOreList.add(oreModernMetalsZirconium);}

        if (oreThermalFoundationCopper != null) {                       compatOreList.add(oreThermalFoundationCopper);}
        if (oreThermalFoundationTin != null) {                          compatOreList.add(oreThermalFoundationTin);}
        if (oreThermalFoundationSilver != null) {                       compatOreList.add(oreThermalFoundationSilver);}
        if (oreThermalFoundationLead != null) {                         compatOreList.add(oreThermalFoundationLead);}
        if (oreThermalFoundationAluminum != null) {                     compatOreList.add(oreThermalFoundationAluminum);}
        if (oreThermalFoundationNickel != null) {                       compatOreList.add(oreThermalFoundationNickel);}
        if (oreThermalFoundationPlatinum != null) {                     compatOreList.add(oreThermalFoundationPlatinum);}
        if (oreThermalFoundationIridium != null) {                      compatOreList.add(oreThermalFoundationIridium);}
        if (oreThermalFoundationMithril != null) {                      compatOreList.add(oreThermalFoundationMithril);}
        if (oreThermalFoundationClathrateRedstone != null) {            compatOreList.add(oreThermalFoundationClathrateRedstone);}

        if (oreImmersiveEngineeringCopper != null) {                    compatOreList.add(oreImmersiveEngineeringCopper);}
        if (oreImmersiveEngineeringAluminum != null) {                  compatOreList.add(oreImmersiveEngineeringAluminum);}
        if (oreImmersiveEngineeringLead != null) {                      compatOreList.add(oreImmersiveEngineeringLead);}
        if (oreImmersiveEngineeringSilver != null) {                    compatOreList.add(oreImmersiveEngineeringSilver);}
        if (oreImmersiveEngineeringNickel != null) {                    compatOreList.add(oreImmersiveEngineeringNickel);}
        if (oreImmersiveEngineeringUranium != null) {                   compatOreList.add(oreImmersiveEngineeringUranium);}

        if (oreTechRebornGalena != null) {                              compatOreList.add(oreTechRebornGalena);}
        if (oreTechRebornIridium != null) {                             compatOreList.add(oreTechRebornIridium);}
        if (oreTechRebornRuby != null) {                                compatOreList.add(oreTechRebornRuby);}
        if (oreTechRebornSapphire != null) {                            compatOreList.add(oreTechRebornSapphire);}
        if (oreTechRebornBauxite != null) {                             compatOreList.add(oreTechRebornBauxite);}
        if (oreTechRebornLead != null) {                                compatOreList.add(oreTechRebornLead);}
        if (oreTechRebornSilver != null) {                              compatOreList.add(oreTechRebornSilver);}
        if (oreTechRebornCopper != null) {                              compatOreList.add(oreTechRebornCopper);}
        if (oreTechRebornTin != null) {                                 compatOreList.add(oreTechRebornTin);}
        if (oreTechRebornTungsten != null) {                            compatOreList.add(oreTechRebornTungsten);}
        if (oreTechRebornSheldonite != null) {                          compatOreList.add(oreTechRebornSheldonite);}
        if (oreTechRebornPeridot != null) {                             compatOreList.add(oreTechRebornPeridot);}
        if (oreTechRebornSodalite != null) {                            compatOreList.add(oreTechRebornSodalite);}

        if (oreForestryApatite != null) {                               compatOreList.add(oreForestryApatite);}
        if (oreForestryCopper != null) {                                compatOreList.add(oreForestryCopper);}
        if (oreForestryTin != null) {                                   compatOreList.add(oreForestryTin);}

        if (oreBluePowerTeslatite != null) {                            compatOreList.add(oreBluePowerTeslatite);}
        if (oreBluePowerRuby != null) {                                 compatOreList.add(oreBluePowerRuby);}
        if (oreBluePowerSapphire != null) {                             compatOreList.add(oreBluePowerSapphire);}
        if (oreBluePowerAmethyst != null) {                             compatOreList.add(oreBluePowerAmethyst);}
        if (oreBluePowerCopper != null) {                               compatOreList.add(oreBluePowerCopper);}
        if (oreBluePowerSilver != null) {                               compatOreList.add(oreBluePowerSilver);}
        if (oreBluePowerZinc != null) {                                 compatOreList.add(oreBluePowerZinc);}
        if (oreBluePowerTungsten != null) {                             compatOreList.add(oreBluePowerTungsten);}

        if (oreAppliedEnergisticsCertusQuartz != null) {                compatOreList.add(oreAppliedEnergisticsCertusQuartz);}
        if (oreAppliedEnergisticsChargedCertusQuartz != null) {         compatOreList.add(oreAppliedEnergisticsChargedCertusQuartz);}

        if (oreExtremeReactorsYellorite != null) {                      compatOreList.add(oreExtremeReactorsYellorite);}

        if (oreAromaDimensionSticky != null) {                          compatOreList.add(oreAromaDimensionSticky);}
        if (oreAromaDimensionClay != null) {                            compatOreList.add(oreAromaDimensionClay);}

        if (oreEmbersCopper != null) {                                  compatOreList.add(oreEmbersCopper);}
        if (oreEmbersLead != null) {                                    compatOreList.add(oreEmbersLead);}
        if (oreEmbersSilver != null) {                                  compatOreList.add(oreEmbersSilver);}
        if (oreEmbersAluminum != null) {                                compatOreList.add(oreEmbersAluminum);}
        if (oreEmbersNickel != null) {                                  compatOreList.add(oreEmbersNickel);}
        if (oreEmbersTin != null) {                                     compatOreList.add(oreEmbersTin);}
        if (oreEmbersQuartz != null) {                                  compatOreList.add(oreEmbersQuartz);}

        if (oreMekanismOsmium != null) {                                compatOreList.add(oreMekanismOsmium);}
        if (oreMekanismCopper != null) {                                compatOreList.add(oreMekanismCopper);}
        if (oreMekanismTin != null) {                                   compatOreList.add(oreMekanismTin);}

        if (oreNuclearCraftCopper != null) {                            compatOreList.add(oreNuclearCraftCopper);}
        if (oreNuclearCraftTin != null) {                               compatOreList.add(oreNuclearCraftTin);}
        if (oreNuclearCraftLead != null) {                              compatOreList.add(oreNuclearCraftLead);}
        if (oreNuclearCraftThorium != null) {                           compatOreList.add(oreNuclearCraftThorium);}
        if (oreNuclearCraftUranium != null) {                           compatOreList.add(oreNuclearCraftUranium);}
        if (oreNuclearCraftBoron != null) {                             compatOreList.add(oreNuclearCraftBoron);}
        if (oreNuclearCraftLithium != null) {                           compatOreList.add(oreNuclearCraftLithium);}
        if (oreNuclearCraftMagnesium != null) {                         compatOreList.add(oreNuclearCraftMagnesium);}

        if (oreDraconicEvolutionDraconium != null) {                    compatOreList.add(oreDraconicEvolutionDraconium);}
    }

    public static void addAllCompat() {
        addCompatStones();
        addCompatOres();
    }

    public static void registerCompat(IForgeRegistry<Block> blockReg) {
        for (String mod : modListLoaded) {
            switch (mod) {
                case "quark":
                    register(blockReg, "stoneBasalt", new BlockStone("qk.basalt", "pickaxe", 1.5F, "quark:basalt", "quark:basalt"));
                    register(blockReg, "stoneMarble", new BlockStone("qk.marble", "pickaxe", 1.5F, "quark:marble", "quark:marble"));
                    register(blockReg, "stoneLimestone", new BlockStone("qk.limestone", "pickaxe", 1.5F, "quark:limestone", "quark:limestone"));
                    register(blockReg, "stoneJasper", new BlockStone("qk.jasper", "pickaxe", 1.5F, "quark:jasper", "quark:jasper"));
                    register(blockReg, "stoneSlate", new BlockStone("qk.slate", "pickaxe", 1.5F, "quark:slate", "quark:slate"));
                    register(blockReg, "stoneBrimstone", new BlockStone("qk.brimstone", "pickaxe", 1.5F, "quark:biome_cobblestone/0", "quark:biome_cobblestone/0"));
                    register(blockReg, "stonePermafrost", new BlockStone("qk.permafrost", "pickaxe", 1.5F, "quark:biome_cobblestone/1", "quark:biome_cobblestone/1"));
                    register(blockReg, "stoneCobbedstone", new BlockStone("qk.cobbedstone", "pickaxe", 1.5F, "quark:biome_cobblestone/2", "quark:biome_cobblestone/2"));
                    break;
                case "basemetals":
                    register(blockReg, "oreAntimony", new BlockOre("bm.ore_antimony", 2.0F, "basemetals:antimony_ore", "geoexpansion:bm.ore_cluster_antimony"));
                    register(blockReg, "oreBismuth", new BlockOre("bm.ore_bismuth", 2.0F, "basemetals:bismuth_ore", "geoexpansion:bm.ore_cluster_bismuth"));
                    register(blockReg, "oreCopper", new BlockOre("bm.ore_copper", 2.0F, "basemetals:copper_ore", "geoexpansion:bm.ore_cluster_copper"));
                    register(blockReg, "oreLead", new BlockOre("bm.ore_lead", 2.0F, "basemetals:lead_ore", "geoexpansion:bm.ore_cluster_lead"));
                    register(blockReg, "oreMercury", new BlockOre("bm.ore_mercury", 2.0F, "basemetals:mercury_ore", "geoexpansion:bm.ore_cluster_mercury"));
                    register(blockReg, "oreNickel", new BlockOre("bm.ore_nickel", 2.0F, "basemetals:nickel_ore", "geoexpansion:bm.ore_cluster_nickel"));
                    register(blockReg, "orePlatinum", new BlockOre("bm.ore_platinum", 2.0F, "basemetals:platinum_ore", "geoexpansion:bm.ore_cluster_platinum"));
                    register(blockReg, "oreSilver", new BlockOre("bm.ore_silver", 2.0F, "basemetals:silver_ore", "geoexpansion:bm.ore_cluster_silver"));
                    register(blockReg, "oreTin", new BlockOre("bm.ore_tin", 2.0F, "basemetals:tin_ore", "geoexpansion:bm.ore_cluster_tin"));
                    register(blockReg, "oreZinc", new BlockOre("bm.ore_zinc", 2.0F, "basemetals:zinc_ore", "geoexpansion:bm.ore_cluster_zinc"));
                    break;
                case "modernmetals":
                    register(blockReg, "oreAluminum", new BlockOre("mm.ore_aluminum", 2.0F, "modernmetals:aluminum_ore", "geoexpansion:mm.ore_cluster_aluminum"));
                    register(blockReg, "oreBeryllium", new BlockOre("mm.ore_beryllium", 2.0F, "modernmetals:beryllium_ore", "geoexpansion:mm.ore_cluster_beryllium"));
                    register(blockReg, "oreBoron", new BlockOre("mm.ore_boron", 2.0F, "modernmetals:boron_ore", "geoexpansion:mm.ore_cluster_boron"));
                    register(blockReg, "oreCadmium", new BlockOre("mm.ore_cadmium", 2.0F, "modernmetals:cadmium_ore", "geoexpansion:mm.ore_cluster_cadmium"));
                    register(blockReg, "oreChromium", new BlockOre("mm.ore_chromium", 2.0F, "modernmetals:chromium_ore", "geoexpansion:mm.ore_cluster_chromium"));
                    register(blockReg, "oreIridium", new BlockOre("mm.ore_iridium", 2.0F, "modernmetals:iridium_ore", "geoexpansion:mm.ore_cluster_iridium"));
                    register(blockReg, "oreMagnesium", new BlockOre("mm.ore_magnesium", 2.0F, "modernmetals:magnesium_ore", "geoexpansion:mm.ore_cluster_magnesium"));
                    register(blockReg, "oreManganese", new BlockOre("mm.ore_manganese", 2.0F, "modernmetals:manganese_ore", "geoexpansion:mm.ore_cluster_manganese"));
                    register(blockReg, "oreOsmium", new BlockOre("mm.ore_osmium", 2.0F, "modernmetals:osmium_ore", "geoexpansion:mm.ore_cluster_osmium"));
                    register(blockReg, "orePlutonium", new BlockOre("mm.ore_plutonium", 2.0F, "modernmetals:plutonium_ore", "geoexpansion:mm.ore_cluster_plutonium"));
                    register(blockReg, "oreRutile", new BlockOre("mm.ore_rutile", 2.0F, "modernmetals:rutile_ore", "geoexpansion:mm.ore_cluster_rutile"));
                    register(blockReg, "oreTantalum", new BlockOre("mm.ore_tantalum", 2.0F, "modernmetals:tantalum_ore", "geoexpansion:mm.ore_cluster_tantalum"));
                    register(blockReg, "oreThorium", new BlockOre("mm.ore_thorium", 2.0F, "modernmetals:thorium_ore", "geoexpansion:mm.ore_cluster_thorium"));
                    register(blockReg, "oreTitanium", new BlockOre("mm.ore_titanium", 2.0F, "modernmetals:titanium_ore", "geoexpansion:mm.ore_cluster_titanium"));
                    register(blockReg, "oreTungsten", new BlockOre("mm.ore_tungsten", 2.0F, "modernmetals:tungsten_ore", "geoexpansion:mm.ore_cluster_tungsten"));
                    register(blockReg, "oreUranium", new BlockOre("mm.ore_uranium", 2.0F, "modernmetals:uranium_ore", "geoexpansion:mm.ore_cluster_uranium"));
                    register(blockReg, "oreZirconium", new BlockOre("mm.ore_zirconium", 2.0F, "modernmetals:zirconium_ore", "geoexpansion:mm.ore_cluster_zirconium"));
                    break;
                case "thermalfoundation":
                    register(blockReg, "oreCopper", new BlockOre("tf.ore_copper", 2.0F, "thermalfoundation:ore/0", "geoexpansion:tf.ore_cluster_copper"));
                    register(blockReg, "oreTin", new BlockOre("tf.ore_tin", 2.0F, "thermalfoundation:ore/1", "geoexpansion:tf.ore_cluster_tin"));
                    register(blockReg, "oreSilver", new BlockOre("tf.ore_silver", 2.0F, "thermalfoundation:ore/2", "geoexpansion:tf.ore_cluster_silver"));
                    register(blockReg, "oreLead", new BlockOre("tf.ore_lead", 2.0F, "thermalfoundation:ore/3", "geoexpansion:tf.ore_cluster_lead"));
                    register(blockReg, "oreAluminum", new BlockOre("tf.ore_aluminum", 2.0F, "thermalfoundation:ore/4", "geoexpansion:tf.ore_cluster_aluminum"));
                    register(blockReg, "oreNickel", new BlockOre("tf.ore_nickel", 2.0F, "thermalfoundation:ore/5", "geoexpansion:tf.ore_cluster_nickel"));
                    register(blockReg, "orePlatinum", new BlockOre("tf.ore_platinum", 2.0F, "thermalfoundation:ore/6", "geoexpansion:tf.ore_cluster_platinum"));
                    register(blockReg, "oreIridium", new BlockOre("tf.ore_iridium", 2.0F, "thermalfoundation:ore/7", "geoexpansion:tf.ore_cluster_iridium"));
                    register(blockReg, "oreMithril", new BlockOre("tf.ore_mithril", 2.0F, "thermalfoundation:ore/8", "geoexpansion:tf.ore_cluster_mithril"));
                    register(blockReg, "oreClathrateRedstone", new BlockOre("tf.ore_fluid_redstone", 2.0F, "thermalfoundation:ore_fluid/2", "geoexpansion:tf.fluid_cluster_redstone"));
                    break;
                case "immersiveengineering":
                    register(blockReg, "oreCopper", new BlockOre("ie.ore_copper", 2.0F, "immersiveengineering:ore/0", "geoexpansion:ie.ore_cluster_copper"));
                    register(blockReg, "oreAluminum", new BlockOre("ie.ore_aluminum", 2.0F, "immersiveengineering:ore/1", "geoexpansion:ie.ore_cluster_aluminum"));
                    register(blockReg, "oreLead", new BlockOre("ie.ore_lead", 2.0F, "immersiveengineering:ore/2", "geoexpansion:ie.ore_cluster_lead"));
                    register(blockReg, "oreSilver", new BlockOre("ie.ore_silver", 2.0F, "immersiveengineering:ore/3", "geoexpansion:ie.ore_cluster_silver"));
                    register(blockReg, "oreNickel", new BlockOre("ie.ore_nickel", 2.0F, "immersiveengineering:ore/4", "geoexpansion:ie.ore_cluster_nickel"));
                    register(blockReg, "oreUranium", new BlockOre("ie.ore_uranium", 2.0F, "immersiveengineering:ore/5", "geoexpansion:ie.ore_cluster_uranium"));
                    break;
                case "techreborn":
                    register(blockReg, "oreGalena", new BlockOre("tr.ore_galena", 2.0F, "techreborn:ore/0", "geoexpansion:tr.ore_cluster_galena"));
                    register(blockReg, "oreIridium", new BlockOre("tr.ore_iridium", 2.0F, "techreborn:ore/1", "geoexpansion:tr.ore_cluster_iridium"));
                    register(blockReg, "oreRuby", new BlockOre("tr.ore_ruby", 2.0F, "techreborn:ore/2", "geoexpansion:tr.crystal_cluster_ruby"));
                    register(blockReg, "oreSapphire", new BlockOre("tr.ore_sapphire", 2.0F, "techreborn:ore/3", "geoexpansion:tr.crystal_cluster_sapphire"));
                    register(blockReg, "oreBauxite", new BlockOre("tr.ore_bauxite", 2.0F, "techreborn:ore/4", "geoexpansion:tr.ore_cluster_bauxite"));
                    register(blockReg, "oreLead", new BlockOre("tr.ore_lead", 2.0F, "techreborn:ore/12", "geoexpansion:tr.ore_cluster_lead"));
                    register(blockReg, "oreSilver", new BlockOre("tr.ore_silver", 2.0F, "techreborn:ore/13", "geoexpansion:tr.ore_cluster_silver"));
                    register(blockReg, "oreCopper", new BlockOre("tr.ore_copper", 2.0F, "techreborn:ore2/0", "geoexpansion:tr.ore_cluster_copper"));
                    register(blockReg, "oreTin", new BlockOre("tr.ore_tin", 2.0F, "techreborn:ore2/1", "geoexpansion:tr.ore_cluster_tin"));
                    register(blockReg, "oreTungsten", new BlockOre("tr.ore_tungsten", 2.0F, "techreborn:ore/8", "geoexpansion:tr.ore_cluster_tungsten"));
                    register(blockReg, "oreSheldonite", new BlockOre("tr.ore_sheldonite", 2.0F, "techreborn:ore/9", "geoexpansion:tr.ore_cluster_sheldonite"));
                    register(blockReg, "orePeridot", new BlockOre("tr.ore_peridot", 2.0F, "techreborn:ore/10", "geoexpansion:tr.crystal_cluster_peridot"));
                    register(blockReg, "oreSodalite", new BlockOre("tr.ore_sodalite", 2.0F, "techreborn:ore/11", "geoexpansion:tr.dust_cluster_sodalite"));
                    break;
                case "forestry":
                    register(blockReg, "oreApatite", new BlockOre("fr.ore_apatite", 2.0F, "forestry:resources/0", "geoexpansion:fr.crystal_cluster_apatite"));
                    register(blockReg, "oreCopper", new BlockOre("fr.ore_copper", 2.0F, "forestry:resources/1", "geoexpansion:fr.ore_cluster_copper"));
                    register(blockReg, "oreTin", new BlockOre("fr.ore_tin", 2.0F, "forestry:resources/2", "geoexpansion:fr.ore_cluster_tin"));
                    break;
                case "bluepower":
                    register(blockReg, "oreTeslatite", new BlockOre("bp.ore_teslatite", 2.0F, "bluepower:teslatite_ore", "geoexpansion:bp.dust_cluster_teslatite"));
                    register(blockReg, "oreRuby", new BlockOre("bp.ore_ruby", 2.0F, "bluepower:ruby_ore", "geoexpansion:bp.crystal_cluster_ruby"));
                    register(blockReg, "oreSapphire", new BlockOre("bp.ore_sapphire", 2.0F, "bluepower:sapphire_ore", "geoexpansion:bp.crystal_cluster_sapphire"));
                    register(blockReg, "oreAmethyst", new BlockOre("bp.ore_amethyst", 2.0F, "bluepower:amethyst_ore", "geoexpansion:bp.crystal_cluster_amethyst"));
                    register(blockReg, "oreCopper", new BlockOre("bp.ore_copper", 2.0F, "bluepower:copper_ore", "geoexpansion:bp.ore_cluster_copper"));
                    register(blockReg, "oreSilver", new BlockOre("bp.ore_silver", 2.0F, "bluepower:silver_ore", "geoexpansion:bp.ore_cluster_silver"));
                    register(blockReg, "oreZinc", new BlockOre("bp.ore_zinc", 2.0F, "bluepower:zinc_ore", "geoexpansion:bp.ore_cluster_zinc"));
                    register(blockReg, "oreTungsten", new BlockOre("bp.ore_tungsten", 2.0F, "bluepower:tungsten_ore", "geoexpansion:bp.ore_cluster_tungsten"));
                    break;
                case "appliedenergistics2":
                    register(blockReg, "oreCertusQuartz", new BlockOre("ae.ore_quartz", 2.0F, "appliedenergistics2:quartz_ore", "geoexpansion:ae.crystal_cluster_quartz"));
                    register(blockReg, "oreChargedCertusQuartz", new BlockOre("ae.ore_charged_quartz", 2.0F, "appliedenergistics2:charged_quartz_ore", "geoexpansion:ae.crystal_cluster_charged_quartz"));
                    break;
                case "bigreactors":
                    register(blockReg, "oreYellorite", new BlockOre("er.ore_yellorite", 2.0F, "bigreactors:oreyellorite", "geoexpansion:er.ore_cluster_yellorite"));
                    break;
                case "aroma1997sdimension":
                    register(blockReg, "oreSticky", new BlockOre("ad.ore_sticky", 2.0F, "aroma1997sdimension:miningore/0", "geoexpansion:ad.dust_cluster_sticky"));
                    register(blockReg, "oreClay", new BlockOre("ad.ore_clay", 2.0F, "aroma1997sdimension:miningore/1", "geoexpansion:ad.dust_cluster_clay"));
                    break;
                case "embers":
                    register(blockReg, "oreCopper", new BlockOre("em.ore_copper", 2.0F, "embers:ore_copper", "geoexpansion:em.ore_cluster_copper"));
                    register(blockReg, "oreLead", new BlockOre("em.ore_lead", 2.0F, "embers:ore_lead", "geoexpansion:em.ore_cluster_lead"));
                    register(blockReg, "oreSilver", new BlockOre("em.ore_silver", 2.0F, "embers:ore_silver", "geoexpansion:em.ore_cluster_silver"));
                    register(blockReg, "oreAluminum", new BlockOre("em.ore_aluminum", 2.0F, "embers:ore_aluminum", "geoexpansion:em.ore_cluster_aluminum"));
                    register(blockReg, "oreNickel", new BlockOre("em.ore_nickel", 2.0F, "embers:ore_nickel", "geoexpansion:em.ore_cluster_nickel"));
                    register(blockReg, "oreTin", new BlockOre("em.ore_tin", 2.0F, "embers:ore_tin", "geoexpansion:em.ore_cluster_tin"));
                    register(blockReg, "oreQuartz", new BlockOre("em.ore_quartz", 2.0F, "embers:ore_quartz", "geoexpansion:em.crystal_cluster_quartz"));
                    break;
                case "mekanism":
                    register(blockReg, "oreOsmium", new BlockOre("mk.ore_osmium", 2.0F, "mekanism:oreblock/0", "geoexpansion:mk.ore_cluster_osmium"));
                    register(blockReg, "oreCopper", new BlockOre("mk.ore_copper", 2.0F, "mekanism:oreblock/1", "geoexpansion:mk.ore_cluster_copper"));
                    register(blockReg, "oreTin", new BlockOre("mk.ore_tin", 2.0F, "mekanism:oreblock/2", "geoexpansion:mk.ore_cluster_tin"));
                    break;
                case "nuclearcraft":
                    register(blockReg, "oreCopper", new BlockOre("nc.ore_copper", 2.0F, "nuclearcraft:ore/0", "geoexpansion:nc.ore_cluster_copper"));
                    register(blockReg, "oreTin", new BlockOre("nc.ore_tin", 2.0F, "nuclearcraft:ore/1", "geoexpansion:nc.ore_cluster_tin"));
                    register(blockReg, "oreLead", new BlockOre("nc.ore_lead", 2.0F, "nuclearcraft:ore/2", "geoexpansion:nc.ore_cluster_lead"));
                    register(blockReg, "oreThorium", new BlockOre("nc.ore_thorium", 2.0F, "nuclearcraft:ore/3", "geoexpansion:nc.ore_cluster_thorium"));
                    register(blockReg, "oreUranium", new BlockOre("nc.ore_uranium", 2.0F, "nuclearcraft:ore/4", "geoexpansion:nc.ore_cluster_uranium"));
                    register(blockReg, "oreBoron", new BlockOre("nc.ore_boron", 2.0F, "nuclearcraft:ore/5", "geoexpansion:nc.ore_cluster_boron"));
                    register(blockReg, "oreLithium", new BlockOre("nc.ore_lithium", 2.0F, "nuclearcraft:ore/6", "geoexpansion:nc.ore_cluster_lithium"));
                    register(blockReg, "oreMagnesium", new BlockOre("nc.ore_magnesium", 2.0F, "nuclearcraft:ore/7", "geoexpansion:nc.ore_cluster_magnesium"));
                    break;
                case "draconicevolution":
                    register(blockReg, "oreDraconium", new BlockOre("de.ore_draconium", 2.0F, "draconicevolution:draconium_ore/0", "geoexpansion:de.dust_cluster_draconium"));
                    break;
            }
        }
    }

    private static void register(IForgeRegistry<Block> blockReg, String oreDict, Block block) {
        if (Conf.compat_config.ONLY_REGISTER_UNIQUE_OREDIC) {
            if (!CompatHandler.isRegistered(oreDict)) {
                CompatHandler.setRegistered(oreDict);
                blockReg.register(block);
            }
        } else {
            CompatHandler.setRegistered(oreDict);
            blockReg.register(block);
        }
    }
}