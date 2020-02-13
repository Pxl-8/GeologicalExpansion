package network.pxl8.geoexpansion.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;
import network.pxl8.geoexpansion.common.event.OreGenOverride;
import network.pxl8.geoexpansion.common.event.Register;
import network.pxl8.geoexpansion.common.world.StoneWorldGen;
import network.pxl8.geoexpansion.compat.CompatHandler;
import network.pxl8.geoexpansion.lib.LibMeta;

public class CommonProxy implements Proxy {
    @Override
    public void preInit() {
        MinecraftForge.ORE_GEN_BUS.register(new OreGenOverride());
        CompatHandler.registerModCompat();
    }

    @Override
    public void init() {
        GameRegistry.registerWorldGenerator(new StoneWorldGen(), Integer.MAX_VALUE);
        Register.registerOreDictionary();
        Register.registerFurnaceRecipes();
        Register.registerCraftingRecipes();

        CompatHandler.checkRegistration();
    }

    @Override
    public void postInit() {
    }
}
