package network.pxl8.geoexpansion.lib;

import net.minecraft.block.properties.PropertyEnum;
import network.pxl8.geoexpansion.common.blocks.EnumDensity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LibMeta {
    public static final String MOD_ID = "geoexpansion";
    public static final String VERSION = "1.2.0-beta";

    public static final String SERVER_PROXY = "network.pxl8.geoexpansion.proxy.CommonProxy";
    public static final String CLIENT_PROXY = "network.pxl8.geoexpansion.proxy.ClientProxy";

    public static final Logger LOG = LogManager.getLogger(MOD_ID);

    public static final PropertyEnum PROPERTY_DENSITY = PropertyEnum.create("density", EnumDensity.class);
}
