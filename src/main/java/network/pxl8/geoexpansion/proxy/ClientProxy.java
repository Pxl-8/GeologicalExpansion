package network.pxl8.geoexpansion.proxy;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import network.pxl8.geoexpansion.common.blocks.BlockStone;
import network.pxl8.geoexpansion.common.blocks.ModBlocks;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit() {
        super.preInit();
    }

    @Override
    public void init() {
        stoneColorHandler();
        initModels();
        super.init();
    }

    @Override
    public void postInit() { super.postInit(); }

    private void stoneColorHandler() {
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(
                (state, world, pos, tintIndex) -> world != null && pos != null ? BlockStone.getTintIndex(state) : 0xFFFFFF
                , ModBlocks.blockStoneList.toArray(new Block[ModBlocks.blockStoneList.size()]));
    }

    private void initModels() {
        for (BlockStone block : ModBlocks.blockStoneList) {
            registerBlockModel(block);
        }
    }

    private static void registerBlockModel(Block block) {
        registerItemModel(Item.getItemFromBlock(block));
    }
    private static void registerItemModel(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        //ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
