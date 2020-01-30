package network.pxl8.geoexpansion.common.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;
import network.pxl8.geoexpansion.lib.LibMeta;

import java.util.ArrayList;
import java.util.List;

@GameRegistry.ObjectHolder(LibMeta.MOD_ID)
public class ModBlocks {
    //@GameRegistry.ObjectHolder("")
    //public static BlockStone ;
    @GameRegistry.ObjectHolder("stone")
    public static BlockStone blockStone;
    @GameRegistry.ObjectHolder("andesite")
    public static BlockStone blockAndesite;
    @GameRegistry.ObjectHolder("diorite")
    public static BlockStone blockDiorite;
    @GameRegistry.ObjectHolder("granite")
    public static BlockStone blockGranite;

    @GameRegistry.ObjectHolder("dirt")
    public static BlockStone blockDirt;
    @GameRegistry.ObjectHolder("gravel")
    public static BlockStone blockGravel;
    @GameRegistry.ObjectHolder("clay")
    public static BlockStone blockClay;

    public static List<BlockStone> blockStoneList = new ArrayList<>();
}