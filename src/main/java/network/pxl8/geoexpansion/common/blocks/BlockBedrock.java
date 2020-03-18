package network.pxl8.geoexpansion.common.blocks;

import com.google.common.base.Predicate;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class BlockBedrock extends BlockStone {

    BlockBedrock() {
        super("mc.bedrock", "", -1.0F, "minecraft:bedrock", "");
        this.setResistance(6000000.0F);
        this.disableStats();
    }

    @Override
    public String getHarvestTool(IBlockState state) { return null; }

    @Override
    public int getHarvestLevel(IBlockState state) { return -1; }

    @Override
    public int quantityDropped(Random random) { return 0; }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) { return Items.AIR; }

    @Override
    public EnumPushReaction getMobilityFlag(IBlockState state) { return EnumPushReaction.BLOCK; }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isReplaceableOreGen(IBlockState state, IBlockAccess world, BlockPos pos, Predicate<IBlockState> target) { return false; }
}