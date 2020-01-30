package network.pxl8.geoexpansion.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;
import network.pxl8.geoexpansion.common.event.OreGenOverride;
import network.pxl8.geoexpansion.common.world.StoneWorldGen;

public class CommonProxy implements Proxy {
    @Override
    public void preInit() {
        MinecraftForge.ORE_GEN_BUS.register(new OreGenOverride());
    }

    @Override
    public void init() {
        GameRegistry.registerWorldGenerator(new StoneWorldGen(), Integer.MAX_VALUE);
    }

    @Override
    public void postInit() {
    }
}
