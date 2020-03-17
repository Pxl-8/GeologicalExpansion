package network.pxl8.geoexpansion.common.blocks;

import com.google.common.base.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import network.pxl8.geoexpansion.lib.LibTools;

public class BlockStoneInfested extends BlockStone {
    private ItemStack blockDrop;
    private String dropId;
    private ItemStack silkBlockDrop;
    private String silkDropId;

    BlockStoneInfested(String name, String harvestTool, Float hardness, String replacedBlock, String drop) {
        this(name, harvestTool, hardness, replacedBlock, drop, drop);
    }

    BlockStoneInfested(String name, String harvestTool, Float hardness, String replacedBlock, String drop, String silkDrop) {
        super(name, harvestTool, hardness, replacedBlock, drop, silkDrop);

        this.dropId = drop;
        this.silkDropId = silkDrop;
    }

    public void setDrops() {
        this.blockDrop = LibTools.getStackFromString(dropId);
        this.silkBlockDrop = LibTools.getStackFromString(silkDropId);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> items, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        items.clear();
    }

    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state) {
        return silkBlockDrop;
    }

    @Override
    public boolean isReplaceableOreGen(IBlockState state, IBlockAccess world, BlockPos pos, Predicate<IBlockState> target) {
        return true;
    }

    public Block setSound(SoundType soundType) {
        this.blockSoundType = soundType;
        return this;
    }

    @Override
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
    {
        if (!worldIn.isRemote && worldIn.getGameRules().getBoolean("doTileDrops"))
        {
            EntitySilverfish entitysilverfish = new EntitySilverfish(worldIn);
            entitysilverfish.setLocationAndAngles((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, 0.0F, 0.0F);
            worldIn.spawnEntity(entitysilverfish);
            entitysilverfish.spawnExplosionParticle();
        }
    }
}
