package network.pxl8.geoexpansion.common.blocks;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import network.pxl8.geoexpansion.lib.LibTools;

public class BlockStone extends BlockTintedBase {
    private ItemStack blockDrop;
    private String dropId;
    private ItemStack silkBlockDrop;
    private String silkDropId;

    BlockStone(String name, String harvestTool, Float hardness, String replacedBlock, String drop) {
        this(name, harvestTool, hardness, replacedBlock, drop, drop);
    }

    BlockStone(String name, String harvestTool, Float hardness, String replacedBlock, String drop, String silkDrop) {
        super(name, hardness, harvestTool, replacedBlock);

        this.dropId = drop;
        this.silkDropId = silkDrop;
    }

    public void setDrops() {
        //this.blockDrop = ForgeRegistries.ITEMS.getValue(new ResourceLocation(this.dropId));
        //this.silkBlockDrop = ForgeRegistries.ITEMS.getValue(new ResourceLocation(this.silkDropId));

        this.blockDrop = LibTools.getStackFromString(dropId);
        this.silkBlockDrop = LibTools.getStackFromString(silkDropId);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> items, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        items.clear();
        items.add(blockDrop);
    }

    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state) {
        return silkBlockDrop;
    }

    @Override
    public boolean isReplaceableOreGen(IBlockState state, IBlockAccess world, BlockPos pos, Predicate<IBlockState> target) {
        return true;
    }
}
