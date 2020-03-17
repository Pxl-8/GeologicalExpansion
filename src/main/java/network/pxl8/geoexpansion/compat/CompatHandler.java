package network.pxl8.geoexpansion.compat;

import net.minecraftforge.fml.common.Loader;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;
import network.pxl8.geoexpansion.common.items.ModItems;
import network.pxl8.geoexpansion.config.Conf;
import network.pxl8.geoexpansion.lib.LibMeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CompatHandler {
    public static List<String> modListLoaded = new ArrayList<>();

    public static void registerModCompat() {
        List<String> modListUnloaded = Conf.compat_config.MOD_COMPAT_ORDER.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        for (String mod : modListUnloaded) {
            if (Loader.isModLoaded(mod)) {
                modListLoaded.add(mod);
                LibMeta.LOG.info("Adding compatibility for: " + mod);
            }
        }
    }

    private static Map<String, Boolean> oresRegistered = new HashMap<>();
    static {
        oresRegistered.put("oreAluminum",               false);
        oresRegistered.put("oreAmethyst",               false);
        oresRegistered.put("oreAntimony",               false);
        oresRegistered.put("oreApatite",                false);
        oresRegistered.put("oreBauxite",                false);
        oresRegistered.put("oreBeryllium",              false);
        oresRegistered.put("oreBismuth",                false);
        oresRegistered.put("oreBoron",                  false);
        oresRegistered.put("oreCadmium",                false);
        oresRegistered.put("oreCertusQuartz",           false);
        oresRegistered.put("oreChargedCertusQuartz",    false);
        oresRegistered.put("oreChromium",               false);
        oresRegistered.put("oreClathrateRedstone",      false);
        oresRegistered.put("oreClay",                   false);
        oresRegistered.put("oreCopper",                 false);
        oresRegistered.put("oreDraconium",              false);
        oresRegistered.put("oreGalena",                 false);
        oresRegistered.put("oreIridium",                false);
        oresRegistered.put("oreLithium",                false);
        oresRegistered.put("oreLead",                   false);
        oresRegistered.put("oreMagnesium",              false);
        oresRegistered.put("oreManganese",              false);
        oresRegistered.put("oreMercury",                false);
        oresRegistered.put("oreMithril",                false);
        oresRegistered.put("oreNickel",                 false);
        oresRegistered.put("oreOsmium",                 false);
        oresRegistered.put("orePeridot",                false);
        oresRegistered.put("orePlatinum",               false);
        oresRegistered.put("orePlutonium",              false);
        oresRegistered.put("oreQuartz",                 false);
        oresRegistered.put("oreRuby",                   false);
        oresRegistered.put("oreRutile",                 false);
        oresRegistered.put("oreSapphire",               false);
        oresRegistered.put("oreSheldonite",             false);
        oresRegistered.put("oreSilver",                 false);
        oresRegistered.put("oreSodalite",               false);
        oresRegistered.put("oreSticky",                 false);
        oresRegistered.put("oreTantalum",               false);
        oresRegistered.put("oreTeslatite",              false);
        oresRegistered.put("oreThorium",                false);
        oresRegistered.put("oreTin",                    false);
        oresRegistered.put("oreTitanium",               false);
        oresRegistered.put("oreTungsten",               false);
        oresRegistered.put("oreUranium",                false);
        oresRegistered.put("oreYellorite",              false);
        oresRegistered.put("oreZinc",                   false);
        oresRegistered.put("oreZirconium",              false);

        oresRegistered.put("stoneBasalt",               false);
        oresRegistered.put("stoneMarble",               false);
        oresRegistered.put("stoneLimestone",            false);
        oresRegistered.put("stoneJasper",               false);
        oresRegistered.put("stoneSlate",                false);
        oresRegistered.put("stoneBrimstone",            false);
        oresRegistered.put("stonePermafrost",           false);
        oresRegistered.put("stoneCobbedstone",          false);
        //oresRegistered.put("",        false);
    }

    public static Boolean isRegistered(String ore) {
        return oresRegistered.get(ore);
    }
    public static void setRegistered(String ore) { oresRegistered.replace(ore, true); }

    public static void checkRegistration() {
        for (String oreDic : oresRegistered.keySet()) {
            //LibMeta.LOG.info("Registered: " + oreDic + " > " + oresRegistered.get(oreDic));
        }
    }
}
