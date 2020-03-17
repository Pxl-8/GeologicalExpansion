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

        resourceMap.put("mc.cobblestone",               "minecraft:blocks/cobblestone");
        resourceMap.put("mc.cobblestone_mossy",         "minecraft:blocks/cobblestone_mossy");

        resourceMap.put("mc.stone_brick",               "minecraft:blocks/stonebrick");
        resourceMap.put("mc.stone_brick_mossy",         "minecraft:blocks/stonebrick_mossy");
        resourceMap.put("mc.stone_brick_cracked",       "minecraft:blocks/stonebrick_cracked");
        resourceMap.put("mc.stone_brick_chiseled",      "minecraft:blocks/stonebrick_carved");

        resourceMap.put("mc.infested_stone",                "minecraft:blocks/stone");
        resourceMap.put("mc.infested_cobblestone",          "minecraft:blocks/cobblestone");
        resourceMap.put("mc.infested_stone_brick",          "minecraft:blocks/stonebrick");
        resourceMap.put("mc.infested_stone_brick_mossy",    "minecraft:blocks/stonebrick_mossy");
        resourceMap.put("mc.infested_stone_brick_cracked",  "minecraft:blocks/stonebrick_cracked");
        resourceMap.put("mc.infested_stone_brick_chiseled", "minecraft:blocks/stonebrick_carved");

        resourceMap.put("mc.dirt",                      "minecraft:blocks/dirt");
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

        resourceMap.put("tr.ore_tungsten",              "techreborn:blocks/ore/tungsten_ore_stone");
        resourceMap.put("tr.ore_sheldonite",            "techreborn:blocks/ore/sheldonite_ore_stone");
        resourceMap.put("tr.ore_peridot",               "techreborn:blocks/ore/peridot_ore_stone");
        resourceMap.put("tr.ore_sodalite",              "techreborn:blocks/ore/sodalite_ore_stone");

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

        resourceMap.put("nc.ore_copper",                "geoexpansion:blocks/nuclearcraft_override/ore_copper");
        resourceMap.put("nc.ore_tin",                   "geoexpansion:blocks/nuclearcraft_override/ore_tin");
        resourceMap.put("nc.ore_lead",                  "geoexpansion:blocks/nuclearcraft_override/ore_lead");
        resourceMap.put("nc.ore_thorium",               "geoexpansion:blocks/nuclearcraft_override/ore_thorium");
        resourceMap.put("nc.ore_uranium",               "geoexpansion:blocks/nuclearcraft_override/ore_uranium");
        resourceMap.put("nc.ore_boron",                 "geoexpansion:blocks/nuclearcraft_override/ore_boron");
        resourceMap.put("nc.ore_lithium",               "geoexpansion:blocks/nuclearcraft_override/ore_lithium");
        resourceMap.put("nc.ore_magnesium",             "geoexpansion:blocks/nuclearcraft_override/ore_magnesium");

        resourceMap.put("de.ore_draconium",             "draconicevolution:blocks/animated/draconium_ore");

        resourceMap.put("qk.basalt",                    "quark:blocks/stone_basalt");
        resourceMap.put("qk.marble",                    "quark:blocks/stone_marble");
        resourceMap.put("qk.limestone",                 "quark:blocks/stone_limestone");
        resourceMap.put("qk.jasper",                    "quark:blocks/stone_jasper");
        resourceMap.put("qk.slate",                     "quark:blocks/stone_slate");
        resourceMap.put("qk.brimstone",                 "quark:blocks/fire_stone");
        resourceMap.put("qk.permafrost",                "quark:blocks/icy_stone");
        resourceMap.put("qk.cobbedstone",               "quark:blocks/cobbed_stone");
        //resourceMap.put("", "");
    }

    static Map<String, String> hammerMap = new HashMap<>();
    static {
        hammerMap.put("ge.spalling_hammer_iron",                "ingotIron");
        hammerMap.put("ge.spalling_hammer_diamond",             "gemDiamond");
        hammerMap.put("ge.spalling_hammer_silver",              "ingotSilver");
        hammerMap.put("ge.spalling_hammer_lead",                "ingotLead");
        hammerMap.put("ge.spalling_hammer_tin",                 "ingotTin");
        hammerMap.put("ge.spalling_hammer_copper",              "ingotCopper");
        hammerMap.put("ge.spalling_hammer_aluminum",            "ingotAluminum");
        hammerMap.put("ge.spalling_hammer_nickel",              "ingotNickel");
        hammerMap.put("ge.spalling_hammer_platinum",            "ingotPlatinum");
    }

    static Map<String, String> spallingMap = new HashMap<>();
    static {
        spallingMap.put("mc.ore_cluster_coal",                  "minecraft:coal/0/2");
        spallingMap.put("mc.crystal_cluster_diamond",           "minecraft:diamond/0/2");
        spallingMap.put("mc.crystal_cluster_emerald",           "minecraft:emerald/0/2");
        spallingMap.put("mc.dust_cluster_redstone",             "minecraft:redstone/0/4");
        spallingMap.put("mc.dust_cluster_lapis",                "minecraft:dye/4/4");
        spallingMap.put("bm.ore_cluster_antimony",              "basemetals:antimony_powder/0/2");
        spallingMap.put("bm.ore_cluster_bismuth",               "basemetals:bismuth_powder/0/2");
        spallingMap.put("bm.ore_cluster_copper",                "basemetals:copper_powder/0/2");
        spallingMap.put("bm.ore_cluster_lead",                  "basemetals:lead_powder/0/2");
        spallingMap.put("bm.ore_cluster_mercury",               "basemetals:mercury_powder/0/2");
        spallingMap.put("bm.ore_cluster_nickel",                "basemetals:nickel_powder/0/2");
        spallingMap.put("bm.ore_cluster_platinum",              "basemetals:platinum_powder/0/2");
        spallingMap.put("bm.ore_cluster_silver",                "basemetals:silver_powder/0/2");
        spallingMap.put("bm.ore_cluster_tin",                   "basemetals:tin_powder/0/2");
        spallingMap.put("bm.ore_cluster_zinc",                  "basemetals:zinc_powder/0/2");
        spallingMap.put("mm.ore_cluster_aluminum",              "modernmetals:aluminum_powder/0/2");
        spallingMap.put("mm.ore_cluster_beryllium",             "modernmetals:beryllium_powder/0/2");
        spallingMap.put("mm.ore_cluster_boron",                 "modernmetals:boron_powder/0/2");
        spallingMap.put("mm.ore_cluster_cadmium",               "modernmetals:cadmium_powder/0/2");
        spallingMap.put("mm.ore_cluster_chromium",              "modernmetals:chromium_powder/0/2");
        spallingMap.put("mm.ore_cluster_iridium",               "modernmetals:iridium_powder/0/2");
        spallingMap.put("mm.ore_cluster_magnesium",             "modernmetals:magnesium_powder/0/2");
        spallingMap.put("mm.ore_cluster_manganese",             "modernmetals:manganese_powder/0/2");
        spallingMap.put("mm.ore_cluster_osmium",                "modernmetals:osmium_powder/0/2");
        spallingMap.put("mm.ore_cluster_plutonium",             "modernmetals:plutonium_powder/0/2");
        spallingMap.put("mm.ore_cluster_rutile",                "modernmetals:rutile_powder/0/2");
        spallingMap.put("mm.ore_cluster_tantalum",              "modernmetals:tantalum_powder/0/2");
        spallingMap.put("mm.ore_cluster_thorium",               "modernmetals:thorium_powder/0/2");
        spallingMap.put("mm.ore_cluster_titanium",              "modernmetals:titanium_powder/0/2");
        spallingMap.put("mm.ore_cluster_tungsten",              "modernmetals:tungsten_powder/0/2");
        spallingMap.put("mm.ore_cluster_uranium",               "modernmetals:uranium_powder/0/2");
        spallingMap.put("mm.ore_cluster_zirconium",             "modernmetals:zirconium_powder/0/2");
        spallingMap.put("tf.ore_cluster_copper",                "thermalfoundation:material/64/2");
        spallingMap.put("tf.ore_cluster_tin",                   "thermalfoundation:material/65/2");
        spallingMap.put("tf.ore_cluster_silver",                "thermalfoundation:material/66/2");
        spallingMap.put("tf.ore_cluster_lead",                  "thermalfoundation:material/67/2");
        spallingMap.put("tf.ore_cluster_aluminum",              "thermalfoundation:material/68/2");
        spallingMap.put("tf.ore_cluster_nickel",                "thermalfoundation:material/69/2");
        spallingMap.put("tf.ore_cluster_platinum",              "thermalfoundation:material/70/2");
        spallingMap.put("tf.ore_cluster_iridium",               "thermalfoundation:material/71/2");
        spallingMap.put("tf.ore_cluster_mithril",               "thermalfoundation:material/72/2");
        spallingMap.put("ie.ore_cluster_copper",                "immersiveengineering:metal/9/2");
        spallingMap.put("ie.ore_cluster_aluminum",              "immersiveengineering:metal/10/2");
        spallingMap.put("ie.ore_cluster_lead",                  "immersiveengineering:metal/11/2");
        spallingMap.put("ie.ore_cluster_silver",                "immersiveengineering:metal/12/2");
        spallingMap.put("ie.ore_cluster_nickel",                "immersiveengineering:metal/13/2");
        spallingMap.put("ie.ore_cluster_uranium",               "immersiveengineering:metal/14/2");
        spallingMap.put("tr.ore_cluster_galena",                "techreborn:dust/23/2");
        spallingMap.put("tr.ore_cluster_iridium",               "techreborn:dust/64/2");
        spallingMap.put("tr.ore_cluster_bauxite",               "techreborn:dust/5/2");
        spallingMap.put("tr.ore_cluster_lead",                  "techreborn:dust/29/2");
        spallingMap.put("tr.ore_cluster_silver",                "techreborn:dust/47/2");
        spallingMap.put("tr.ore_cluster_copper",                "techreborn:dust/14/2");
        spallingMap.put("tr.ore_cluster_tin",                   "techreborn:dust/53/2");
        spallingMap.put("tr.ore_cluster_tungsten",              "techreborn:dust/55/2");
        spallingMap.put("tr.ore_cluster_sheldonite",            "techreborn:dust/38/2");
        spallingMap.put("er.ore_cluster_yellorite",             "bigreactors:dustyellorium/0/2");
        spallingMap.put("mk.ore_cluster_osmium",                "mekanism:dust/2/2");
        spallingMap.put("mk.ore_cluster_copper",                "mekanism:dust/3/2");
        spallingMap.put("mk.ore_cluster_tin",                   "mekanism:dust/4/2");
        spallingMap.put("nc.ore_cluster_copper",                "nuclearcraft:dust/0/2");
        spallingMap.put("nc.ore_cluster_tin",                   "nuclearcraft:dust/1/2");
        spallingMap.put("nc.ore_cluster_lead",                  "nuclearcraft:dust/2/2");
        spallingMap.put("nc.ore_cluster_thorium",               "nuclearcraft:dust/3/2");
        spallingMap.put("nc.ore_cluster_uranium",               "nuclearcraft:dust/4/2");
        spallingMap.put("nc.ore_cluster_boron",                 "nuclearcraft:dust/5/2");
        spallingMap.put("nc.ore_cluster_lithium",               "nuclearcraft:dust/6/2");
        spallingMap.put("nc.ore_cluster_magnesium",             "nuclearcraft:dust/7/2");
        spallingMap.put("tr.crystal_cluster_ruby",              "techreborn:gem/0/2");
        spallingMap.put("tr.crystal_cluster_sapphire",          "techreborn:gem/1/2");
        spallingMap.put("tr.crystal_cluster_peridot",           "techreborn:gem/2/2");
        spallingMap.put("fr.crystal_cluster_apatite",           "forestry:apatite/0/2");
        spallingMap.put("bp.crystal_cluster_ruby",              "bluepower:ruby_gem/0/2");
        spallingMap.put("bp.crystal_cluster_sapphire",          "bluepower:sapphire_gem/0/2");
        spallingMap.put("bp.crystal_cluster_amethyst",          "bluepower:amethyst_gem/0/2");
        spallingMap.put("ae.crystal_cluster_quartz",            "appliedenergistics2:material/0/2");
        spallingMap.put("ae.crystal_cluster_charged_quartz",    "appliedenergistics2:material/1/2");
        spallingMap.put("em.crystal_cluster_quartz",            "minecraft:quartz/0/2");
        spallingMap.put("tf.fluid_cluster_redstone",            "thermalfoundation:material/893/2");
        spallingMap.put("tr.dust_cluster_sodalite",             "techreborn:dust/48/8");
        spallingMap.put("bp.dust_cluster_teslatite",            "bluepower:teslatite_dust/0/2");
        spallingMap.put("ad.dust_cluster_sticky",               "minecraft:slime_ball/0/4");
        spallingMap.put("ad.dust_cluster_clay",                 "minecraft:clay_ball/0/4");
        spallingMap.put("de.dust_cluster_draconium",            "draconicevolution:draconium_dust/0/2");
    }

    static void genResources() {
        File dirBlockstate = new File("output/assets/geoexpansion/blockstates/"); dirBlockstate.mkdirs();
        File dirItemmodel = new File("output/assets/geoexpansion/models/item/"); dirItemmodel.mkdirs();

        for (String file : resourceMap.keySet()) {
            BufferedWriter blockstate = null;
            BufferedWriter itemmodel = null;
            try {
                File fileBlockstate = new File(dirBlockstate, file + ".json");
                File fileItemmodel = new File(dirItemmodel, file + ".json");

                blockstate = new BufferedWriter(new FileWriter(fileBlockstate));
                itemmodel = new BufferedWriter(new FileWriter(fileItemmodel));

                System.out.println("Creating: " + file + ".json for blockstate and item model");

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

    static void genRecipesHammers() {
        File dirRecipe = new File("output/assets/geoexpansion/recipes/"); dirRecipe.mkdirs();

        for (String file : hammerMap.keySet()) {
            BufferedWriter recipe = null;
            try {
                File fileRecipe = new File(dirRecipe, file + ".json");

                recipe = new BufferedWriter(new FileWriter(fileRecipe));

                System.out.println("Creating: " + file + ".json for hammer recipes");

                recipe.write("{\n");
                recipe.write("  \"type\": \"minecraft:crafting_shaped\",\n");
                recipe.write("  \"conditions\": [\n");
                recipe.write("    {\n");
                recipe.write("      \"type\": \"minecraft:item_exists\",\n");
                recipe.write("      \"item\": \"geoexpansion:" + file + "\"\n");
                recipe.write("    }\n");
                recipe.write("  ],\n");
                recipe.write("  \"pattern\":\n");
                recipe.write("  [\n");
                recipe.write("    \"XX \",\n");
                recipe.write("    \"XXX\",\n");
                recipe.write("    \" H \"\n");
                recipe.write("  ],\n");
                recipe.write("  \"key\":\n");
                recipe.write("  {\n");
                recipe.write("    \"X\":\n");
                recipe.write("    {\n");
                recipe.write("        \"type\": \"forge:ore_dict\",\n");
                recipe.write("        \"ore\": \"" + hammerMap.get(file) + "\"\n");
                recipe.write("    },\n");
                recipe.write("    \"H\":\n");
                recipe.write("    {\n");
                recipe.write("      \"type\": \"forge:ore_dict\",\n");
                recipe.write("      \"ore\": \"stickWood\"\n");
                recipe.write("    }\n");
                recipe.write("  },\n");
                recipe.write("  \"result\":\n");
                recipe.write("  {\n");
                recipe.write("    \"item\": \"geoexpansion:" + file + "\",\n");
                recipe.write("    \"count\": 1,\n");
                recipe.write("    \"data\": 0\n");
                recipe.write("  }\n");
                recipe.write("}\n");
                recipe.close();

            } catch (IOException e) { 
                System.err.println("Caught IOException: " + e.getMessage());
            }
        }
    }

    static void genRecipesSpalling() {
        File dirRecipe = new File("output/assets/geoexpansion/recipes/"); dirRecipe.mkdirs();

        for (String file : spallingMap.keySet()) {
            BufferedWriter recipe = null;
            String[] splitString = spallingMap.get(file).split("/");
            String itemId = splitString[0];
            String itemData = splitString[1];
            String itemCount = splitString[2];
            try {
                File fileRecipe = new File(dirRecipe, "spalling." + file + ".json");

                recipe = new BufferedWriter(new FileWriter(fileRecipe));

                System.out.println("Creating: " + file + ".json for spalling recipes");

                recipe.write("{\n");
                recipe.write("  \"type\": \"minecraft:crafting_shapeless\",\n");
                recipe.write("  \"conditions\": [\n");
                recipe.write("    {\n");
                recipe.write("      \"type\": \"minecraft:item_exists\",\n");
                recipe.write("      \"item\": \"geoexpansion:" + file + "\"\n");
                recipe.write("    }\n");
                recipe.write("  ],\n");
                recipe.write("  \"ingredients\":\n");
                recipe.write("  [\n");
                recipe.write("    {\n");
                recipe.write("      \"type\": \"forge:ore_dict\",\n");
                recipe.write("      \"ore\": \"toolSpallingHammer\"\n");
                recipe.write("    },\n");
                recipe.write("    {\n");
                recipe.write("      \"item\": \"geoexpansion:" + file + "\"\n");
                recipe.write("    }\n");
                recipe.write("  ],\n");
                recipe.write("  \"result\":\n");
                recipe.write("  {\n");
                recipe.write("    \"item\": \"" + itemId + "\",\n");
                recipe.write("    \"count\": " + itemCount + ",\n");
                recipe.write("    \"data\": " + itemData + "\n");
                recipe.write("  }\n");
                recipe.write("}\n");
                recipe.close();

            } catch (IOException e) { 
                System.err.println("Caught IOException: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Running Resource Generator");
        genResources();
        genRecipesHammers();
        genRecipesSpalling();
    }
}