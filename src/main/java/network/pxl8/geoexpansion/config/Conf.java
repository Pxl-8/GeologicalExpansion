package network.pxl8.geoexpansion.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import network.pxl8.geoexpansion.lib.LibMeta;

@Config(modid = LibMeta.MOD_ID, name = LibMeta.MOD_ID)
public class Conf {
    public static BaseConf base_config = new BaseConf();
    public static StoneConf stone_config = new StoneConf();
    public static OreConf ore_config = new OreConf();
    public static CompatConf compat_config = new CompatConf();

    public static class BaseConf {
        @Config.Comment("Hardness multiplier for soft blocks")
        public Float HARDNESS_MULT_SOFT = 1.0F;
        @Config.Comment("Hardness multiplier for hard blocks")
        public Float HARDNESS_MULT_HARD = 2.0F;
        @Config.Comment("Hardness multiplier for dense blocks")
        public Float HARDNESS_MULT_DENSE = 4.0F;

        @Config.Comment({"Color tint for soft blocks expressed in an RGB hex", "Default (0xFFFFFF)"})
        public String TINT_COLOR_SOFT = "0xFFFFFF";
        @Config.Comment({"Color tint for hard blocks expressed in an RGB hex", "Default (0x9A9898)"})
        public String TINT_COLOR_HARD = "0x9A9898";
        @Config.Comment({"Color tint for dense blocks expressed in an RGB hex", "Default (0x535050)"})
        public String TINT_COLOR_DENSE = "0x535050";

        @Config.Comment({"Defines the upper range that dense blocks will generate at", "Dense blocks will generate from 0 to this value", "Blocks will blend 1 block above and below this value"})
        @Config.RangeInt(min = 1, max = 255)
        public int BLOCK_UPPER_RANGE_DENSE = 20;
        @Config.Comment({"Defines the upper range that hard blocks will generate at", "Hard blocks will generate from dense blocks upper range to this value", "Soft blocks will generate above this value to 255"})
        @Config.RangeInt(min = 1, max = 255)
        public int BLOCK_UPPER_RANGE_HARD = 40;
    }

    public static class StoneConf {

    }

    public static class OreConf {
        @Config.Comment({"Base amount of ore clusters that drop from soft ores", "Takes a float that gets rounded to the closest int after fortune is applied"})
        public float DROP_BASE_SOFT = 1.0F;
        @Config.Comment({"Base amount of ore clusters that drop from hard ores", "Takes a float that gets rounded to the closest int after fortune is applied"})
        public float DROP_BASE_HARD = 1.25F;
        @Config.Comment({"Base amount of ore clusters that drop from dense ores", "Takes a float that gets rounded to the closest int after fortune is applied"})
        public float DROP_BASE_DENSE = 1.5F;
    }

    public static class CompatConf {

    }

    @Mod.EventBusSubscriber
    public static class ConfigSync {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event){
            if (event.getModID().equals(LibMeta.MOD_ID)) { ConfigManager.sync(LibMeta.MOD_ID, Config.Type.INSTANCE); }
        }
    }
}
