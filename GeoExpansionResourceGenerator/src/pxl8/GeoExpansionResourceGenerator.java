package pxl8;

import java.util.Map;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class GeoExpansionResourceGenerator {
    static Map<String, String> resourceMap = new HashMap<>(); 
    static {
        resourceMap.put("mc.stone",                     "minecraft:blocks/stone");
        resourceMap.put("mc.andesite",                  "minecraft:blocks/stone_andesite");
        resourceMap.put("mc.diorite",                   "minecraft:blocks/stone_diorite");
        resourceMap.put("mc.granite",                   "minecraft:blocks/stone_granite");
        resourceMap.put("mc.dirt",                      "minecraft:blocks/dirt");
        resourceMap.put("mc.gravel",                    "minecraft:blocks/gravel");
        resourceMap.put("mc.clay",                      "minecraft:blocks/clay");

        resourceMap.put("mc.ore_coal",                  "minecraft:blocks/coal_ore");
        resourceMap.put("mc.ore_iron",                  "minecraft:blocks/iron_ore");
        resourceMap.put("mc.ore_gold",                  "minecraft:blocks/gold_ore");
        resourceMap.put("mc.ore_diamond",               "minecraft:blocks/diamond_ore");
        resourceMap.put("mc.ore_emerald",               "minecraft:blocks/emerald_ore");
        resourceMap.put("mc.ore_redstone",              "minecraft:blocks/redstone_ore");
        resourceMap.put("mc.ore_lapis",                 "minecraft:blocks/lapis_ore");

        resourceMap.put("bm.ore_antimony",              "basemetals:blocks/antimony_ore");
        resourceMap.put("bm.ore_bismuth",               "basemetals:blocks/bismuth_ore");
        resourceMap.put("bm.ore_copper",                "basemetals:blocks/copper_ore");
        resourceMap.put("bm.ore_lead",                  "basemetals:blocks/lead_ore");
        resourceMap.put("bm.ore_mercury",               "basemetals:blocks/mercury_ore");
        resourceMap.put("bm.ore_nickel",                "basemetals:blocks/nickel_ore");
        resourceMap.put("bm.ore_platinum",              "basemetals:blocks/platinum_ore");
        resourceMap.put("bm.ore_silver",                "basemetals:blocks/silver_ore");
        resourceMap.put("bm.ore_tin",                   "basemetals:blocks/tin_ore");
        resourceMap.put("bm.ore_zinc",                  "basemetals:blocks/zinc_ore");

        resourceMap.put("mm.ore_aluminum",              "modernmetals:blocks/aluminum_ore");
        resourceMap.put("mm.ore_bauxite",               "modernmetals:blocks/bauxite_ore");
        resourceMap.put("mm.ore_beryllium",             "modernmetals:blocks/beryllium_ore");
        resourceMap.put("mm.ore_boron",                 "modernmetals:blocks/boron_ore");
        resourceMap.put("mm.ore_cadmium",               "modernmetals:blocks/cadmium_ore");
        resourceMap.put("mm.ore_chromium",              "modernmetals:blocks/chromium_ore");
        resourceMap.put("mm.ore_iridium",               "modernmetals:blocks/iridium_ore");
        resourceMap.put("mm.ore_magnesium",             "modernmetals:blocks/magnesium_ore");
        resourceMap.put("mm.ore_manganese",             "modernmetals:blocks/manganese_ore");
        resourceMap.put("mm.ore_osmium",                "modernmetals:blocks/osmium_ore");
        resourceMap.put("mm.ore_plutonium",             "modernmetals:blocks/plutonium_ore");
        resourceMap.put("mm.ore_rutile",                "modernmetals:blocks/rutile_ore");
        resourceMap.put("mm.ore_tantalum",              "modernmetals:blocks/tantalum_ore");
        resourceMap.put("mm.ore_thorium",               "modernmetals:blocks/thorium_ore");
        resourceMap.put("mm.ore_titanium",              "modernmetals:blocks/titanium_ore");
        resourceMap.put("mm.ore_tungsten",              "modernmetals:blocks/tungsten_ore");
        resourceMap.put("mm.ore_uranium",               "modernmetals:blocks/uranium_ore");
        resourceMap.put("mm.ore_zirconium",             "modernmetals:blocks/zirconium_ore");

        resourceMap.put("tf.ore_copper",                "thermalfoundation:blocks/ore/ore_copper");
        resourceMap.put("tf.ore_tin",                   "thermalfoundation:blocks/ore/ore_tin");
        resourceMap.put("tf.ore_silver",                "thermalfoundation:blocks/ore/ore_silver");
        resourceMap.put("tf.ore_lead",                  "thermalfoundation:blocks/ore/ore_lead");
        resourceMap.put("tf.ore_aluminum",              "thermalfoundation:blocks/ore/ore_aluminum");
        resourceMap.put("tf.ore_nickel",                "thermalfoundation:blocks/ore/ore_nickel");
        resourceMap.put("tf.ore_platinum",              "thermalfoundation:blocks/ore/ore_platinum");
        resourceMap.put("tf.ore_iridium",               "thermalfoundation:blocks/ore/ore_iridium");
        resourceMap.put("tf.ore_mithril",               "thermalfoundation:blocks/ore/ore_mithril");
        resourceMap.put("tf.ore_fluid_redstone",        "thermalfoundation:blocks/ore/ore_fluid_redstone");

        resourceMap.put("ie.ore_copper",                "immersiveengineering:blocks/ore_copper");
        resourceMap.put("ie.ore_aluminum",              "immersiveengineering:blocks/ore_aluminum");
        resourceMap.put("ie.ore_lead",                  "immersiveengineering:blocks/ore_lead");
        resourceMap.put("ie.ore_silver",                "immersiveengineering:blocks/ore_silver");
        resourceMap.put("ie.ore_nickel",                "immersiveengineering:blocks/ore_nickel");
        resourceMap.put("ie.ore_uranium",               "immersiveengineering:blocks/ore_uranium");

        resourceMap.put("tr.ore_galena",                "techreborn:blocks/ore/galena_ore");
        resourceMap.put("tr.ore_iridium",               "techreborn:blocks/ore/iridium_ore");
        resourceMap.put("tr.ore_ruby",                  "techreborn:blocks/ore/ruby_ore");
        resourceMap.put("tr.ore_sapphire",              "techreborn:blocks/ore/sapphire_ore");
        resourceMap.put("tr.ore_bauxite",               "techreborn:blocks/ore/bauxite_ore");
        resourceMap.put("tr.ore_lead",                  "techreborn:blocks/ore/lead_ore");
        resourceMap.put("tr.ore_silver",                "techreborn:blocks/ore/silver_ore");
        resourceMap.put("tr.ore_copper",                "techreborn:blocks/ore/copper_ore");
        resourceMap.put("tr.ore_tin",                   "techreborn:blocks/ore/tin_ore");

        resourceMap.put("fr.ore_apatite",               "forestry:blocks/ores/apatite");
        resourceMap.put("fr.ore_copper",                "forestry:blocks/ores/copper");
        resourceMap.put("fr.ore_tin",                   "forestry:blocks/ores/tin");

        resourceMap.put("bp.ore_teslatite",             "bluepower:blocks/teslatite_ore");
        resourceMap.put("bp.ore_ruby",                  "bluepower:blocks/ruby_ore");
        resourceMap.put("bp.ore_sapphire",              "bluepower:blocks/sapphire_ore");
        resourceMap.put("bp.ore_amethyst",              "bluepower:blocks/amethyst_ore");
        resourceMap.put("bp.ore_copper",                "bluepower:blocks/copper_ore");
        resourceMap.put("bp.ore_silver",                "bluepower:blocks/silver_ore");
        resourceMap.put("bp.ore_zinc",                  "bluepower:blocks/zinc_ore");
        resourceMap.put("bp.ore_tungsten",              "bluepower:blocks/tungsten_ore");

        resourceMap.put("ae.ore_quartz",                "appliedenergistics2:blocks/quartz_ore");
        resourceMap.put("ae.ore_charged_quartz",        "appliedenergistics2:blocks/charged_quartz_ore");

        resourceMap.put("er.ore_yellorite",             "bigreactors:blocks/oreYellorite");

        resourceMap.put("em.ore_copper",                "embers:blocks/ore_copper_vanilla");
        resourceMap.put("em.ore_lead",                  "embers:blocks/ore_lead_vanilla");
        resourceMap.put("em.ore_silver",                "embers:blocks/ore_silver_vanilla");
        resourceMap.put("em.ore_aluminum",              "embers:blocks/ore_aluminum_vanilla");
        resourceMap.put("em.ore_nickel",                "embers:blocks/ore_nickel_vanilla");
        resourceMap.put("em.ore_tin",                   "embers:blocks/ore_tin_vanilla");
        resourceMap.put("em.ore_quartz",                "embers:blocks/ore_quartz");

        resourceMap.put("mk.ore_osmium",                "mekanism:blocks/osmiumore");
        resourceMap.put("mk.ore_copper",                "mekanism:blocks/copperore");
        resourceMap.put("mk.ore_tin",                   "mekanism:blocks/tinore");

        resourceMap.put("ad.ore_sticky",                "aroma1997sdimension:blocks/stickyore");
        resourceMap.put("ad.ore_clay",                  "aroma1997sdimension:blocks/clayore");

        resourceMap.put("qk.basalt",                    "quark:blocks/stone_basalt");
        resourceMap.put("qk.marble",                    "quark:blocks/stone_marble");
        resourceMap.put("qk.limestone",                 "quark:blocks/stone_limestone");
        resourceMap.put("qk.jasper",                    "quark:blocks/stone_jasper");
        resourceMap.put("qk.slate",                     "quark:blocks/stone_slate");

        //resourceMap.put("", "");
    }

    static void genResources() {
        File dirBlockstate = new File("output/assets/geoexpansion/blockstates/"); dirBlockstate.mkdirs();
        File dirItemmodel = new File("output/assets/geoexpansion/models/item/"); dirItemmodel.mkdirs();

        for (String file : resourceMap.keySet()) {
            BufferedWriter blockstate = null;
            BufferedWriter itemmodel = null;
            System.out.println("Creating: " + file + ".json");

            try {
                File fileBlockstate = new File(dirBlockstate, file + ".json");
                File fileItemmodel = new File(dirItemmodel, file + ".json");

                blockstate = new BufferedWriter(new FileWriter(fileBlockstate));
                itemmodel = new BufferedWriter(new FileWriter(fileItemmodel));

                blockstate.write("{\n");
                blockstate.write("  \"forge_marker\": 1,\n");
                blockstate.write("  \"defaults\": {\n");
                blockstate.write("    \"model\": \"geoexpansion:tinted_block\",\n");
                blockstate.write("    \"textures\": {\n");
                blockstate.write("      \"particle\": \"" + resourceMap.get(file) + "\",\n");
                blockstate.write("      \"all\": \"" + resourceMap.get(file) + "\"\n");
                blockstate.write("    },\n");
                blockstate.write("    \"uvlock\": true\n");
                blockstate.write("  },\n");
                blockstate.write("  \"variants\": {\n");
                blockstate.write("    \"density\": {\n");
                blockstate.write("      \"soft\": {},\n");
                blockstate.write("      \"firm\": {},\n");
                blockstate.write("      \"solid\": {},\n");
                blockstate.write("      \"hard\": {}\n");
                blockstate.write("    }\n");
                blockstate.write("  }\n");
                blockstate.write("}\n");
                blockstate.close();

                itemmodel.write("{\n");
                itemmodel.write("  \"parent\": \"block/cube_all\",\n");
                itemmodel.write("  \"textures\": {\n");
                itemmodel.write("    \"all\": \"" + resourceMap.get(file) + "\"\n");
                itemmodel.write("  }\n");
                itemmodel.write("}\n");
                itemmodel.close();

            } catch (IOException e) { 
                System.err.println("Caught IOException: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Running Resource Generator");
        genResources();
    }
}