package network.pxl8.geoexpansion.common.blocks;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockStone extends BlockTintedBase {
    private ItemStack blockDrop;
    private ItemStack silkBlockDrop;
    private IBlockState replacedBlock;

    BlockStone(String name, String harvestTool, Float hardness, IBlockState replacedBlock, ItemStack drop) {
        this(name, harvestTool, hardness, replacedBlock, drop, drop);
    }

    BlockStone(String name, String harvestTool, Float hardness, IBlockState replacedBlock, ItemStack drop, ItemStack silkDrop) {
        super(name, hardness, harvestTool);
        this.blockDrop = drop;
        this.silkBlockDrop = silkDrop;
        this.replacedBlock = replacedBlock;
    }

    public IBlockState getBlockToReplace() {
        return this.replacedBlock;
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
