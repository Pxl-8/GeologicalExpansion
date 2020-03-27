package network.pxl8.geoexpansion.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import network.pxl8.geoexpansion.lib.LibMeta;

import java.util.HashMap;
import java.util.Map;

@Config(modid = LibMeta.MOD_ID, name = LibMeta.MOD_ID)
public class Conf {
    public static BaseConf base_config = new BaseConf();
    public static StoneConf stone_config = new StoneConf();
    public static OreConf ore_config = new OreConf();
    public static CompatConf compat_config = new CompatConf();
    public static WorldConf world_config = new WorldConf();

    public static class BaseConf {
        @Config.Comment("Hardness multiplier for soft blocks")
        public Float HARDNESS_MULT_1_SOFT = 1.0F;
        @Config.Comment("Hardness multiplier for firm blocks")
        public Float HARDNESS_MULT_2_FIRM = 2.0F;
        @Config.Comment("Hardness multiplier for solid blocks")
        public Float HARDNESS_MULT_3_SOLID = 4.0F;
        @Config.Comment("Hardness multiplier for hard blocks")
        public Float HARDNESS_MULT_4_HARD = 8.0F;

        @Config.Comment({"Color tint for soft blocks expressed in an RGB hex", "Default (0xFFFFFF)"})
        public String TINT_COLOR_1_SOFT = "0xFFFFFF";
        @Config.Comment({"Color tint for firm blocks expressed in an RGB hex", "Default (0xCFCECE)"})
        public String TINT_COLOR_2_FIRM = "0xCFCECE";
        @Config.Comment({"Color tint for solid blocks expressed in an RGB hex", "Default (0x8E8D8C)"})
        public String TINT_COLOR_3_SOLID = "0x8E8D8C";
        @Config.Comment({"Color tint for hard blocks expressed in an RGB hex", "Default (0x4E4C4A)"})
        public String TINT_COLOR_4_HARD = "0x4E4C4A";

        @Config.Comment({"Defines the upper range that hard blocks will generate to",
                "Hard blocks will generate from 0 to this value",
                "Blocks will blend 1 block above and below this value"})
        @Config.RangeInt(min = 1, max = 255)
        public int BLOCK_UPPER_RANGE_4_HARD = 12;
        @Config.Comment({"Defines the upper range that solid blocks will generate to",
                "Solid blocks will generate from hard blocks upper range to this value",
                "Firm blocks will generate above this value",
                "Blocks will blend 1 block above and below this value"})
        @Config.RangeInt(min = 1, max = 255)
        public int BLOCK_UPPER_RANGE_3_SOLID = 28;
        @Config.Comment({"Defines the upper range that firm blocks will generate to",
                "Firm blocks will generate from solid blocks upper range to this value",
                "Soft blocks will generate above this value to 255",
                "Blocks will blend 1 block above and below this value"})
        @Config.RangeInt(min = 1, max = 255)
        public int BLOCK_UPPER_RANGE_2_FIRM = 44;
    }

    public static class StoneConf {
        @Config.Comment("Generate bedrock as a flat layer")
        public boolean FLAT_BEDROCK = false;
    }

    public static class OreConf {
        @Config.Comment({"Base amount of ore clusters that drop from soft ores", "Takes a float that gets rounded to the closest int after fortune is applied"})
        public float DROP_BASE_1_SOFT = 1.0F;
        @Config.Comment({"Base amount of ore clusters that drop from firm ores", "Takes a float that gets rounded to the closest int after fortune is applied"})
        public float DROP_BASE_2_FIRM = 1.25F;
        @Config.Comment({"Base amount of ore clusters that drop from solid ores", "Takes a float that gets rounded to the closest int after fortune is applied"})
        public float DROP_BASE_3_SOLID = 1.5F;
        @Config.Comment({"Base amount of ore clusters that drop from hard ores", "Takes a float that gets rounded to the closest int after fortune is applied"})
        public float DROP_BASE_4_HARD = 2.0F;
    }

    public static class CompatConf {
        @Config.Comment("Order in which compatibility registers blocks/items, if 2 mods are loaded which add copper, the lower number on the list will be registered first")
        public Map<String, Integer> MOD_COMPAT_ORDER = new HashMap<>(); {
            MOD_COMPAT_ORDER.put("quark",                   0);
            MOD_COMPAT_ORDER.put("basemetals",              1);
            MOD_COMPAT_ORDER.put("modernmetals",            2);
            MOD_COMPAT_ORDER.put("thermalfoundation",       3);
            MOD_COMPAT_ORDER.put("immersiveengineering",    4);
            MOD_COMPAT_ORDER.put("techreborn",              5);
            MOD_COMPAT_ORDER.put("forestry",                6);
            MOD_COMPAT_ORDER.put("bluepower",               7);
            MOD_COMPAT_ORDER.put("appliedenergistics2",     8);
            MOD_COMPAT_ORDER.put("bigreactors",             9);
            MOD_COMPAT_ORDER.put("aroma1997sdimension",     10);
            MOD_COMPAT_ORDER.put("embers",                  11);
            MOD_COMPAT_ORDER.put("mekanism",                12);
            MOD_COMPAT_ORDER.put("nuclearcraft",            13);
            MOD_COMPAT_ORDER.put("draconicevolution",       14);
        }

        @Config.Comment({"Only a single ore will be generated per ore dictionary type (eg. oreCopper) based on the compat list order"})
        public boolean ONLY_REGISTER_UNIQUE_OREDIC = true;

        @Config.Comment({"If false, this mod will hijack the world generation registry to ensure it always runs replacement last.",
                "If you're using CoFH World, you may need to set this to false in order for our replacement to run correctly."})
        public boolean PLAY_NICE_WITH_WORLDGEN = true;
    }

    public static class WorldConf {
        @Config.Comment({"! NOT IMPLEMENTED ! This mod by default blocks minecraft's default stone generation and replaces it with a built in equivalent",
                "Toggling this on will stop the mod from generating stone and instead replace blocks generated in world if you're using another mod that changes vanilla stone gen. (Like quark)"})
        public boolean OVERRIDE_STONE_WORLD_GEN = true;

        @Config.Comment({"! NOT IMPLEMENTED ! This mod by default blocks minecraft's default ore generation and replaces it with a built in equivalent",
                "Toggling this on will stop the mod from generating stone and instead replace blocks generated in world if you're using another mod that changes vanilla ore gen. (Like COFH World)"})
        public boolean OVERRIDE_ORE_WORLD_GEN = true;

        @Config.Comment({"! NOT IMPLEMENTED ! This mod by default generates compat ores on its own",
                "Toggling this on will stop the mod from generating ores and instead replace blocks generated in world if you're using another mod that changes ore gen. (Like COFH World)"})
        public boolean OVERRIDE_COMPAT_ORE_WORLD_GEN = true;
    }

    @Mod.EventBusSubscriber
    public static class ConfigSync {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event){
            if (event.getModID().equals(LibMeta.MOD_ID)) { ConfigManager.sync(LibMeta.MOD_ID, Config.Type.INSTANCE); }
        }
    }
}
