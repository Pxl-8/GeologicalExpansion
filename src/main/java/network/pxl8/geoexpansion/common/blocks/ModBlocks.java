package network.pxl8.geoexpansion.common.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import network.pxl8.geoexpansion.common.blocks.dynamic.DynamicBlockLoader;
import network.pxl8.geoexpansion.common.blocks.dynamic.DynamicTintedBlock;
import network.pxl8.geoexpansion.common.blocks.traits.TillableSoilTrait;
import network.pxl8.geoexpansion.compat.CompatHandler;
import network.pxl8.geoexpansion.config.Conf;
import network.pxl8.geoexpansion.lib.LibMeta;

import java.util.ArrayList;
import java.util.List;

import static network.pxl8.geoexpansion.compat.CompatHandler.modListLoaded;

@GameRegistry.ObjectHolder(LibMeta.MOD_ID)
public class ModBlocks {
    @GameRegistry.ObjectHolder("mc.stone")                  public static DynamicTintedBlock blockStone;
    @GameRegistry.ObjectHolder("mc.andesite")               public static DynamicTintedBlock blockAndesite;
    @GameRegistry.ObjectHolder("mc.diorite")                public static DynamicTintedBlock blockDiorite;
    @GameRegistry.ObjectHolder("mc.granite")                public static DynamicTintedBlock blockGranite;

    @GameRegistry.ObjectHolder("mc.cobblestone")            public static DynamicTintedBlock blockCobblestone;
    @GameRegistry.ObjectHolder("mc.cobblestone_mossy")      public static DynamicTintedBlock blockCobblestoneMossy;

    @GameRegistry.ObjectHolder("mc.stone_brick")            public static DynamicTintedBlock blockStonebrick;
    @GameRegistry.ObjectHolder("mc.stone_brick_mossy")      public static DynamicTintedBlock blockStonebrickMossy;
    @GameRegistry.ObjectHolder("mc.stone_brick_cracked")    public static DynamicTintedBlock blockStonebrickCracked;
    @GameRegistry.ObjectHolder("mc.stone_brick_chiseled")   public static DynamicTintedBlock blockStonebrickChiseled;

    @GameRegistry.ObjectHolder("mc.infested_stone")                 public static DynamicTintedBlock blockInfestedStone;
    @GameRegistry.ObjectHolder("mc.infested_cobblestone")           public static DynamicTintedBlock blockInfestedCobblestone;
    @GameRegistry.ObjectHolder("mc.infested_stone_brick")           public static DynamicTintedBlock blockInfestedStonebrick;
    @GameRegistry.ObjectHolder("mc.infested_stone_brick_mossy")     public static DynamicTintedBlock blockInfestedStonebrickMossy;
    @GameRegistry.ObjectHolder("mc.infested_stone_brick_cracked")   public static DynamicTintedBlock blockInfestedStonebrickCracked;
    @GameRegistry.ObjectHolder("mc.infested_stone_brick_chiseled")  public static DynamicTintedBlock blockInfestedStonebrickChiseled;

    @GameRegistry.ObjectHolder("mc.dirt")                   public static DynamicTintedBlock blockDirt;
    @GameRegistry.ObjectHolder("mc.clay")                   public static DynamicTintedBlock blockClay;

//    @GameRegistry.ObjectHolder("mc.bedrock")                public static BlockBedrock blockBedrock;

    @GameRegistry.ObjectHolder("mc.ore_coal")               public static DynamicTintedBlock oreCoal;
    @GameRegistry.ObjectHolder("mc.ore_iron")               public static DynamicTintedBlock oreIron;
    @GameRegistry.ObjectHolder("mc.ore_gold")               public static DynamicTintedBlock oreGold;
    @GameRegistry.ObjectHolder("mc.ore_diamond")            public static DynamicTintedBlock oreDiamond;
    @GameRegistry.ObjectHolder("mc.ore_emerald")            public static DynamicTintedBlock oreEmerald;
    @GameRegistry.ObjectHolder("mc.ore_redstone")           public static DynamicTintedBlock oreRedstone;
    @GameRegistry.ObjectHolder("mc.ore_lapis")              public static DynamicTintedBlock oreLapis;

    public static List<DynamicTintedBlock> allModBlocks = new ArrayList<>();

    public static void registerModBlocks(IForgeRegistry<Block> blockReg) {
        DynamicBlockLoader loader = new DynamicBlockLoader();

        allModBlocks.add(loader.load("mc.stone").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.andesite").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.diorite").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.granite").createBlock(blockReg::getValue));

        allModBlocks.add(loader.load("mc.cobblestone").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.cobblestone_mossy").createBlock(blockReg::getValue));

        allModBlocks.add(loader.load("mc.stone_brick").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.stone_brick_mossy").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.stone_brick_cracked").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.stone_brick_chiseled").createBlock(blockReg::getValue));

        allModBlocks.add(loader.load("mc.bedrock").createBlock(blockReg::getValue));

        allModBlocks.add(loader.load("mc.dirt").createBlock(blockReg::getValue).setCustomBehavior(new TillableSoilTrait()));
        allModBlocks.add(loader.load("mc.clay").createBlock(blockReg::getValue));

        allModBlocks.add(loader.load("mc.infested_stone").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.infested_cobblestone").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.infested_stone_brick").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.infested_stone_brick_mossy").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.infested_stone_brick_cracked").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.infested_stone_brick_chiseled").createBlock(blockReg::getValue));

        allModBlocks.add(loader.load("mc.ore_coal").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.ore_iron").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.ore_gold").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.ore_diamond").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.ore_emerald").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.ore_redstone").createBlock(blockReg::getValue));
        allModBlocks.add(loader.load("mc.ore_lapis").createBlock(blockReg::getValue));

        registerCompat(loader, blockReg);

        allModBlocks.forEach(blockReg::register);
    }

    @GameRegistry.ObjectHolder("bm.ore_antimony")               public static DynamicTintedBlock oreBaseMetalsAntimony;
    @GameRegistry.ObjectHolder("bm.ore_bismuth")                public static DynamicTintedBlock oreBaseMetalsBismuth;
    @GameRegistry.ObjectHolder("bm.ore_copper")                 public static DynamicTintedBlock oreBaseMetalsCopper;
    @GameRegistry.ObjectHolder("bm.ore_lead")                   public static DynamicTintedBlock oreBaseMetalsLead;
    @GameRegistry.ObjectHolder("bm.ore_mercury")                public static DynamicTintedBlock oreBaseMetalsMercury;
    @GameRegistry.ObjectHolder("bm.ore_nickel")                 public static DynamicTintedBlock oreBaseMetalsNickel;
    @GameRegistry.ObjectHolder("bm.ore_platinum")               public static DynamicTintedBlock oreBaseMetalsPlatinum;
    @GameRegistry.ObjectHolder("bm.ore_silver")                 public static DynamicTintedBlock oreBaseMetalsSilver;
    @GameRegistry.ObjectHolder("bm.ore_tin")                    public static DynamicTintedBlock oreBaseMetalsTin;
    @GameRegistry.ObjectHolder("bm.ore_zinc")                   public static DynamicTintedBlock oreBaseMetalsZinc;

    @GameRegistry.ObjectHolder("mm.ore_aluminum")               public static DynamicTintedBlock oreModernMetalsAluminum;
    @GameRegistry.ObjectHolder("mm.ore_beryllium")              public static DynamicTintedBlock oreModernMetalsBeryllium;
    @GameRegistry.ObjectHolder("mm.ore_boron")                  public static DynamicTintedBlock oreModernMetalsBoron;
    @GameRegistry.ObjectHolder("mm.ore_cadmium")                public static DynamicTintedBlock oreModernMetalsCadmium;
    @GameRegistry.ObjectHolder("mm.ore_chromium")               public static DynamicTintedBlock oreModernMetalsChromium;
    @GameRegistry.ObjectHolder("mm.ore_iridium")                public static DynamicTintedBlock oreModernMetalsIridium;
    @GameRegistry.ObjectHolder("mm.ore_magnesium")              public static DynamicTintedBlock oreModernMetalsMagnesium;
    @GameRegistry.ObjectHolder("mm.ore_manganese")              public static DynamicTintedBlock oreModernMetalsManganese;
    @GameRegistry.ObjectHolder("mm.ore_osmium")                 public static DynamicTintedBlock oreModernMetalsOsmium;
    @GameRegistry.ObjectHolder("mm.ore_plutonium")              public static DynamicTintedBlock oreModernMetalsPlutonium;
    @GameRegistry.ObjectHolder("mm.ore_rutile")                 public static DynamicTintedBlock oreModernMetalsRutile;
    @GameRegistry.ObjectHolder("mm.ore_tantalum")               public static DynamicTintedBlock oreModernMetalsTantalum;
    @GameRegistry.ObjectHolder("mm.ore_thorium")                public static DynamicTintedBlock oreModernMetalsThorium;
    @GameRegistry.ObjectHolder("mm.ore_titanium")               public static DynamicTintedBlock oreModernMetalsTitanium;
    @GameRegistry.ObjectHolder("mm.ore_tungsten")               public static DynamicTintedBlock oreModernMetalsTungsten;
    @GameRegistry.ObjectHolder("mm.ore_uranium")                public static DynamicTintedBlock oreModernMetalsUranium;
    @GameRegistry.ObjectHolder("mm.ore_zirconium")              public static DynamicTintedBlock oreModernMetalsZirconium;

    @GameRegistry.ObjectHolder("tf.ore_copper")                 public static DynamicTintedBlock oreThermalFoundationCopper;
    @GameRegistry.ObjectHolder("tf.ore_tin")                    public static DynamicTintedBlock oreThermalFoundationTin;
    @GameRegistry.ObjectHolder("tf.ore_silver")                 public static DynamicTintedBlock oreThermalFoundationSilver;
    @GameRegistry.ObjectHolder("tf.ore_lead")                   public static DynamicTintedBlock oreThermalFoundationLead;
    @GameRegistry.ObjectHolder("tf.ore_aluminum")               public static DynamicTintedBlock oreThermalFoundationAluminum;
    @GameRegistry.ObjectHolder("tf.ore_nickel")                 public static DynamicTintedBlock oreThermalFoundationNickel;
    @GameRegistry.ObjectHolder("tf.ore_platinum")               public static DynamicTintedBlock oreThermalFoundationPlatinum;
    @GameRegistry.ObjectHolder("tf.ore_iridium")                public static DynamicTintedBlock oreThermalFoundationIridium;
    @GameRegistry.ObjectHolder("tf.ore_mithril")                public static DynamicTintedBlock oreThermalFoundationMithril;
    @GameRegistry.ObjectHolder("tf.ore_fluid_redstone")         public static DynamicTintedBlock oreThermalFoundationClathrateRedstone;

    @GameRegistry.ObjectHolder("ie.ore_copper")                 public static DynamicTintedBlock oreImmersiveEngineeringCopper;
    @GameRegistry.ObjectHolder("ie.ore_aluminum")               public static DynamicTintedBlock oreImmersiveEngineeringAluminum;
    @GameRegistry.ObjectHolder("ie.ore_lead")                   public static DynamicTintedBlock oreImmersiveEngineeringLead;
    @GameRegistry.ObjectHolder("ie.ore_silver")                 public static DynamicTintedBlock oreImmersiveEngineeringSilver;
    @GameRegistry.ObjectHolder("ie.ore_nickel")                 public static DynamicTintedBlock oreImmersiveEngineeringNickel;
    @GameRegistry.ObjectHolder("ie.ore_uranium")                public static DynamicTintedBlock oreImmersiveEngineeringUranium;

    @GameRegistry.ObjectHolder("tr.ore_galena")                 public static DynamicTintedBlock oreTechRebornGalena;
    @GameRegistry.ObjectHolder("tr.ore_iridium")                public static DynamicTintedBlock oreTechRebornIridium;
    @GameRegistry.ObjectHolder("tr.ore_ruby")                   public static DynamicTintedBlock oreTechRebornRuby;
    @GameRegistry.ObjectHolder("tr.ore_sapphire")               public static DynamicTintedBlock oreTechRebornSapphire;
    @GameRegistry.ObjectHolder("tr.ore_bauxite")                public static DynamicTintedBlock oreTechRebornBauxite;
    @GameRegistry.ObjectHolder("tr.ore_lead")                   public static DynamicTintedBlock oreTechRebornLead;
    @GameRegistry.ObjectHolder("tr.ore_silver")                 public static DynamicTintedBlock oreTechRebornSilver;
    @GameRegistry.ObjectHolder("tr.ore_copper")                 public static DynamicTintedBlock oreTechRebornCopper;
    @GameRegistry.ObjectHolder("tr.ore_tin")                    public static DynamicTintedBlock oreTechRebornTin;

    @GameRegistry.ObjectHolder("tr.ore_tungsten")               public static DynamicTintedBlock oreTechRebornTungsten;
    @GameRegistry.ObjectHolder("tr.ore_sheldonite")             public static DynamicTintedBlock oreTechRebornSheldonite;
    @GameRegistry.ObjectHolder("tr.ore_peridot")                public static DynamicTintedBlock oreTechRebornPeridot;
    @GameRegistry.ObjectHolder("tr.ore_sodalite")               public static DynamicTintedBlock oreTechRebornSodalite;

    @GameRegistry.ObjectHolder("fr.ore_apatite")                public static DynamicTintedBlock oreForestryApatite;
    @GameRegistry.ObjectHolder("fr.ore_copper")                 public static DynamicTintedBlock oreForestryCopper;
    @GameRegistry.ObjectHolder("fr.ore_tin")                    public static DynamicTintedBlock oreForestryTin;

    @GameRegistry.ObjectHolder("bp.ore_teslatite")              public static DynamicTintedBlock oreBluePowerTeslatite;
    @GameRegistry.ObjectHolder("bp.ore_ruby")                   public static DynamicTintedBlock oreBluePowerRuby;
    @GameRegistry.ObjectHolder("bp.ore_sapphire")               public static DynamicTintedBlock oreBluePowerSapphire;
    @GameRegistry.ObjectHolder("bp.ore_amethyst")               public static DynamicTintedBlock oreBluePowerAmethyst;
    @GameRegistry.ObjectHolder("bp.ore_copper")                 public static DynamicTintedBlock oreBluePowerCopper;
    @GameRegistry.ObjectHolder("bp.ore_silver")                 public static DynamicTintedBlock oreBluePowerSilver;
    @GameRegistry.ObjectHolder("bp.ore_zinc")                   public static DynamicTintedBlock oreBluePowerZinc;
    @GameRegistry.ObjectHolder("bp.ore_tungsten")               public static DynamicTintedBlock oreBluePowerTungsten;

    @GameRegistry.ObjectHolder("ae.ore_quartz")                 public static DynamicTintedBlock oreAppliedEnergisticsCertusQuartz;
    @GameRegistry.ObjectHolder("ae.ore_charged_quartz")         public static DynamicTintedBlock oreAppliedEnergisticsChargedCertusQuartz;

    @GameRegistry.ObjectHolder("er.ore_yellorite")              public static DynamicTintedBlock oreExtremeReactorsYellorite;

    @GameRegistry.ObjectHolder("ad.ore_sticky")                 public static DynamicTintedBlock oreAromaDimensionSticky;
    @GameRegistry.ObjectHolder("ad.ore_clay")                   public static DynamicTintedBlock oreAromaDimensionClay;

    @GameRegistry.ObjectHolder("em.ore_copper")                 public static DynamicTintedBlock oreEmbersCopper;
    @GameRegistry.ObjectHolder("em.ore_lead")                   public static DynamicTintedBlock oreEmbersLead;
    @GameRegistry.ObjectHolder("em.ore_silver")                 public static DynamicTintedBlock oreEmbersSilver;
    @GameRegistry.ObjectHolder("em.ore_aluminum")               public static DynamicTintedBlock oreEmbersAluminum;
    @GameRegistry.ObjectHolder("em.ore_nickel")                 public static DynamicTintedBlock oreEmbersNickel;
    @GameRegistry.ObjectHolder("em.ore_tin")                    public static DynamicTintedBlock oreEmbersTin;
    @GameRegistry.ObjectHolder("em.ore_quartz")                 public static DynamicTintedBlock oreEmbersQuartz;

    @GameRegistry.ObjectHolder("mk.ore_osmium")                 public static DynamicTintedBlock oreMekanismOsmium;
    @GameRegistry.ObjectHolder("mk.ore_copper")                 public static DynamicTintedBlock oreMekanismCopper;
    @GameRegistry.ObjectHolder("mk.ore_tin")                    public static DynamicTintedBlock oreMekanismTin;

    @GameRegistry.ObjectHolder("nc.ore_copper")                 public static DynamicTintedBlock oreNuclearCraftCopper;
    @GameRegistry.ObjectHolder("nc.ore_tin")                    public static DynamicTintedBlock oreNuclearCraftTin;
    @GameRegistry.ObjectHolder("nc.ore_lead")                   public static DynamicTintedBlock oreNuclearCraftLead;
    @GameRegistry.ObjectHolder("nc.ore_thorium")                public static DynamicTintedBlock oreNuclearCraftThorium;
    @GameRegistry.ObjectHolder("nc.ore_uranium")                public static DynamicTintedBlock oreNuclearCraftUranium;
    @GameRegistry.ObjectHolder("nc.ore_boron")                  public static DynamicTintedBlock oreNuclearCraftBoron;
    @GameRegistry.ObjectHolder("nc.ore_lithium")                public static DynamicTintedBlock oreNuclearCraftLithium;
    @GameRegistry.ObjectHolder("nc.ore_magnesium")              public static DynamicTintedBlock oreNuclearCraftMagnesium;

    @GameRegistry.ObjectHolder("de.ore_draconium")              public static DynamicTintedBlock oreDraconicEvolutionDraconium;

    @GameRegistry.ObjectHolder("qk.basalt")                     public static DynamicTintedBlock stoneQuarkBasalt;
    @GameRegistry.ObjectHolder("qk.marble")                     public static DynamicTintedBlock stoneQuarkMarble;
    @GameRegistry.ObjectHolder("qk.limestone")                  public static DynamicTintedBlock stoneQuarkLimestone;
    @GameRegistry.ObjectHolder("qk.jasper")                     public static DynamicTintedBlock stoneQuarkJasper;
    @GameRegistry.ObjectHolder("qk.slate")                      public static DynamicTintedBlock stoneQuarkSlate;
    @GameRegistry.ObjectHolder("qk.brimstone")                  public static DynamicTintedBlock stoneQuarkBrimstone;
    @GameRegistry.ObjectHolder("qk.permafrost")                 public static DynamicTintedBlock stoneQuarkPermafrost;
    @GameRegistry.ObjectHolder("qk.cobbedstone")                public static DynamicTintedBlock stoneQuarkCobbedstone;

    public static void registerCompat(DynamicBlockLoader loader, IForgeRegistry<Block> blockReg) {
        IRegisterCallback cb = (oreDict, blockRef) -> {
            if (!CompatHandler.isRegistered(oreDict) || !Conf.compat_config.ONLY_REGISTER_UNIQUE_OREDIC) {
                CompatHandler.setRegistered(oreDict);

                allModBlocks.add(loader.load(blockRef).createBlock(blockReg::getValue));
            }
        };

        for (String mod : modListLoaded) {
            switch (mod) {
                case "quark":
                    cb.register("stoneBasalt", "qk.basalt");
                    cb.register("stoneMarble", "qk.marble");
                    cb.register("stoneLimestone", "qk.limestone");
                    cb.register("stoneJasper", "qk.jasper");
                    cb.register("stoneSlate", "qk.slate");
                    cb.register("stoneBrimstone", "qk.brimstone");
                    cb.register("stonePermafrost", "qk.permafrost");
                    cb.register("stoneCobbedstone", "qk.cobbedstone");
                    break;
                case "basemetals":
                    cb.register("oreAntimony", "bm.ore_antimony");
                    cb.register("oreBismuth", "bm.ore_bismuth");
                    cb.register("oreCopper", "bm.ore_copper");
                    cb.register("oreLead", "bm.ore_lead");
                    cb.register("oreMercury", "bm.ore_mercury");
                    cb.register("oreNickel", "bm.ore_nickel");
                    cb.register("orePlatinum", "bm.ore_platinum");
                    cb.register("oreSilver", "bm.ore_silver");
                    cb.register("oreTin", "bm.ore_tin");
                    cb.register("oreZinc", "bm.ore_zinc");
                    break;
                case "modernmetals":
                    cb.register("oreAluminum", "mm.ore_aluminum");
                    cb.register("oreBeryllium", "mm.ore_beryllium");
                    cb.register("oreBoron", "mm.ore_boron");
                    cb.register("oreCadmium", "mm.ore_cadmium");
                    cb.register("oreChromium", "mm.ore_chromium");
                    cb.register("oreIridium", "mm.ore_iridium");
                    cb.register("oreMagnesium", "mm.ore_magnesium");
                    cb.register("oreManganese", "mm.ore_manganese");
                    cb.register("oreOsmium", "mm.ore_osmium");
                    cb.register("orePlutonium", "mm.ore_plutonium");
                    cb.register("oreRutile", "mm.ore_rutile");
                    cb.register("oreTantalum", "mm.ore_tantalum");
                    cb.register("oreThorium", "mm.ore_thorium");
                    cb.register("oreTitanium", "mm.ore_titanium");
                    cb.register("oreTungsten", "mm.ore_tungsten");
                    cb.register("oreUranium", "mm.ore_uranium");
                    cb.register("oreZirconium", "mm.ore_zirconium");
                    break;
                case "thermalfoundation":
                    cb.register("oreCopper", "tf.ore_copper");
                    cb.register("oreTin", "tf.ore_tin");
                    cb.register("oreSilver", "tf.ore_silver");
                    cb.register("oreLead", "tf.ore_lead");
                    cb.register("oreAluminum", "tf.ore_aluminum");
                    cb.register("oreNickel", "tf.ore_nickel");
                    cb.register("orePlatinum", "tf.ore_platinum");
                    cb.register("oreIridium", "tf.ore_iridium");
                    cb.register("oreMithril", "tf.ore_mithril");
                    cb.register("oreClathrateRedstone", "tf.ore_fluid_redstone");
                    break;
                case "immersiveengineering":
                    cb.register("oreCopper", "ie.ore_copper");
                    cb.register("oreAluminum", "ie.ore_aluminum");
                    cb.register("oreLead", "ie.ore_lead");
                    cb.register("oreSilver", "ie.ore_silver");
                    cb.register("oreNickel", "ie.ore_nickel");
                    cb.register("oreUranium", "ie.ore_uranium");
                    break;
                case "techreborn":
                    cb.register("oreGalena", "tr.ore_galena");
                    cb.register("oreIridium", "tr.ore_iridium");
                    cb.register("oreRuby", "tr.ore_ruby");
                    cb.register("oreSapphire", "tr.ore_sapphire");
                    cb.register("oreBauxite", "tr.ore_bauxite");
                    cb.register("oreLead", "tr.ore_lead");
                    cb.register("oreSilver", "tr.ore_silver");
                    cb.register("oreCopper", "tr.ore_copper");
                    cb.register("oreTin", "tr.ore_tin");
                    cb.register("oreTungsten", "tr.ore_tungsten");
                    cb.register("oreSheldonite", "tr.ore_sheldonite");
                    cb.register("orePeridot", "tr.ore_peridot");
                    cb.register("oreSodalite", "tr.ore_sodalite");
                    break;
                case "forestry":
                    cb.register("oreApatite", "fr.ore_apatite");
                    cb.register("oreCopper", "fr.ore_copper");
                    cb.register("oreTin", "fr.ore_tin");
                    break;
                case "bluepower":
                    cb.register("oreTeslatite", "bp.ore_teslatite");
                    cb.register("oreRuby", "bp.ore_ruby");
                    cb.register("oreSapphire", "bp.ore_sapphire");
                    cb.register("oreAmethyst", "bp.ore_amethyst");
                    cb.register("oreCopper", "bp.ore_copper");
                    cb.register("oreSilver", "bp.ore_silver");
                    cb.register("oreZinc", "bp.ore_zinc");
                    cb.register("oreTungsten", "bp.ore_tungsten");
                    break;
                case "appliedenergistics2":
                    cb.register("oreCertusQuartz", "ae.ore_quartz");
                    cb.register("oreChargedCertusQuartz", "ae.ore_charged_quartz");
                    break;
                case "bigreactors":
                    cb.register("oreYellorite", "er.ore_yellorite");
                    break;
                case "aroma1997sdimension":
                    cb.register("oreSticky", "ad.ore_sticky");
                    cb.register("oreClay", "ad.ore_clay");
                    break;
                case "embers":
                    cb.register("oreCopper", "em.ore_copper");
                    cb.register("oreLead", "em.ore_lead");
                    cb.register("oreSilver", "em.ore_silver");
                    cb.register("oreAluminum", "em.ore_aluminum");
                    cb.register("oreNickel", "em.ore_nickel");
                    cb.register("oreTin", "em.ore_tin");
                    cb.register("oreQuartz", "em.ore_quartz");
                    break;
                case "mekanism":
                    cb.register("oreOsmium", "mk.ore_osmium");
                    cb.register("oreCopper", "mk.ore_copper");
                    cb.register("oreTin", "mk.ore_tin");
                    break;
                case "nuclearcraft":
                    cb.register("oreCopper", "nc.ore_copper");
                    cb.register("oreTin", "nc.ore_tin");
                    cb.register("oreLead", "nc.ore_lead");
                    cb.register("oreThorium", "nc.ore_thorium");
                    cb.register("oreUranium", "nc.ore_uranium");
                    cb.register("oreBoron", "nc.ore_boron");
                    cb.register("oreLithium", "nc.ore_lithium");
                    cb.register("oreMagnesium", "nc.ore_magnesium");
                    break;
                case "draconicevolution":
                    cb.register("oreDraconium", "de.ore_draconium");
                    break;
            }
        }
    }

    private interface IRegisterCallback {
        void register(String oreDict, String blockRef);
    }
}