package network.pxl8.geoexpansion.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;
import network.pxl8.geoexpansion.common.blocks.dynamic.IHolderRefresh;
import network.pxl8.geoexpansion.common.event.BlockBehaviorListeners;
import network.pxl8.geoexpansion.common.event.OreGenOverride;
import network.pxl8.geoexpansion.common.world.StoneWorldGen;
import network.pxl8.geoexpansion.compat.CompatHandler;
import network.pxl8.geoexpansion.config.Conf;
import network.pxl8.geoexpansion.lib.ReflectionUtil;

public class CommonProxy implements Proxy {
    @Override
    public void preInit() {
        MinecraftForge.EVENT_BUS.register(new BlockBehaviorListeners());
        MinecraftForge.ORE_GEN_BUS.register(new OreGenOverride());

        CompatHandler.registerModCompat();
    }

    @Override
    public void init() {
        for (IHolderRefresh receiver : ModBlocks.allModBlocks) {
            receiver.provideRefs(
                    ForgeRegistries.ITEMS::getValue,
                    ForgeRegistries.BLOCKS::getValue
            );
        }

        GameRegistry.registerWorldGenerator(new StoneWorldGen(), Integer.MAX_VALUE);
    }

    @Override
    public void postInit() {
        if (!Conf.compat_config.PLAY_NICE_WITH_WORLDGEN) {
            ReflectionUtil.modifyWorldGenerators();
        }
    }
}
