package network.pxl8.geoexpansion.common.event;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import network.pxl8.geoexpansion.common.blocks.BlockStone;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;
import network.pxl8.geoexpansion.lib.LibStone;

@Mod.EventBusSubscriber
public class Register {
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> blocks = event.getRegistry();

        blocks.register(new BlockStone("stone", "pickaxe", LibStone.STONE, new ItemStack(Blocks.COBBLESTONE), new ItemStack(Blocks.STONE, 1, 0)));
        blocks.register(new BlockStone("andesite", "pickaxe", LibStone.ANDESITE, new ItemStack(Blocks.STONE, 1, 5)));
        blocks.register(new BlockStone("diorite", "pickaxe", LibStone.DIORITE, new ItemStack(Blocks.STONE, 1, 3)));
        blocks.register(new BlockStone("granite", "pickaxe", LibStone.GRANITE, new ItemStack(Blocks.STONE, 1, 1)));

        blocks.register(new BlockStone("dirt", "shovel", Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT), new ItemStack(Blocks.DIRT)));
        blocks.register(new BlockStone("gravel", "shovel", Blocks.GRAVEL.getDefaultState(), new ItemStack(Blocks.GRAVEL)));
        blocks.register(new BlockStone("clay", "shovel", Blocks.CLAY.getDefaultState(), new ItemStack(Blocks.CLAY)));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> items = event.getRegistry();

        ModBlocks.blockStoneList.add(ModBlocks.blockStone);
        ModBlocks.blockStoneList.add(ModBlocks.blockAndesite);
        ModBlocks.blockStoneList.add(ModBlocks.blockDiorite);
        ModBlocks.blockStoneList.add(ModBlocks.blockGranite);

        ModBlocks.blockStoneList.add(ModBlocks.blockDirt);
        ModBlocks.blockStoneList.add(ModBlocks.blockGravel);
        ModBlocks.blockStoneList.add(ModBlocks.blockClay);

        for (BlockStone block : ModBlocks.blockStoneList) {
            items.register(createItemBlock(block));
        }
    }

    public static CreativeTabs geoexpansionTab = new CreativeTabs("tab_geoexpansion") {
        @Override
        public ItemStack getTabIconItem() { return new ItemStack(Blocks.STONE); }
    };

    private static Item createItemBlock(Block block) { return new ItemBlock(block).setRegistryName(block.getRegistryName()); }

}
