package network.pxl8.geoexpansion.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;
import network.pxl8.geoexpansion.common.blocks.BlockOre;
import network.pxl8.geoexpansion.common.blocks.BlockStone;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;
import network.pxl8.geoexpansion.common.event.OreGenOverride;
import network.pxl8.geoexpansion.common.world.StoneWorldGen;
import network.pxl8.geoexpansion.compat.CompatHandler;

public class CommonProxy implements Proxy {
    @Override
    public void preInit() {
        MinecraftForge.ORE_GEN_BUS.register(new OreGenOverride());
        CompatHandler.registerModCompat();
    }

    @Override
    public void init() {
        GameRegistry.registerWorldGenerator(new StoneWorldGen(), Integer.MAX_VALUE);

        for (BlockStone block : ModBlocks.blockStoneList) { block.setDrops(); }
        for (BlockStone block : ModBlocks.compatStoneList) { block.setDrops(); }
        for (BlockOre block : ModBlocks.blockOreList) { block.setDrops(); }
        for (BlockOre block : ModBlocks.compatOreList) { block.setDrops(); }
    }

    @Override
    public void postInit() {
    }
}
