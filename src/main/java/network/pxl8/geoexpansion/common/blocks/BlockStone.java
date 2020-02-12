package network.pxl8.geoexpansion.common.blocks;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import network.pxl8.geoexpansion.lib.LibTools;

public class BlockStone extends BlockTintedBase {
    private String blockDrop;
    private String silkBlockDrop;

    BlockStone(String name, String harvestTool, Float hardness, String replacedBlock, String drop) {
        this(name, harvestTool, hardness, replacedBlock, drop, drop);
    }

    BlockStone(String name, String harvestTool, Float hardness, String replacedBlock, String drop, String silkDrop) {
        super(name, hardness, harvestTool, replacedBlock);

        this.blockDrop = drop;
        this.silkBlockDrop = silkDrop;
    }

    @Override
    public void getDrops(NonNullList<ItemStack> items, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        items.clear();
        items.add(LibTools.getStackFromString(blockDrop));
    }

    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state) {
        return LibTools.getStackFromString(blockDrop);
    }

    @Override
    public boolean isReplaceableOreGen(IBlockState state, IBlockAccess world, BlockPos pos, Predicate<IBlockState> target) {
        return true;
    }
}
