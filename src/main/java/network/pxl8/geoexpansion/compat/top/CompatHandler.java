package network.pxl8.geoexpansion.compat.top;

import net.minecraftforge.fml.common.Loader;

public class CompatHandler {
    public static void registerTOP() {
        if (Loader.isModLoaded("theoneprobe")) {
            TOPCompat.register();
        }
    }
}
