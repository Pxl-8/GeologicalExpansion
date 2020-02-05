package network.pxl8.geoexpansion.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;
import network.pxl8.geoexpansion.common.event.OreGenOverride;
import network.pxl8.geoexpansion.common.event.Register;
import network.pxl8.geoexpansion.common.world.StoneWorldGen;
import network.pxl8.geoexpansion.compat.top.CompatHandler;

public class CommonProxy implements Proxy {
    @Override
    public void preInit() {
        MinecraftForge.ORE_GEN_BUS.register(new OreGenOverride());
        CompatHandler.registerTOP();
    }

    @Override
    public void init() {
        GameRegistry.registerWorldGenerator(new StoneWorldGen(), Integer.MAX_VALUE);
        Register.registerOreDictionary();
        Register.registerFurnaceRecipes();
    }

    @Override
    public void postInit() {
    }
}
