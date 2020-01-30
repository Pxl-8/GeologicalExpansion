package network.pxl8.geoexpansion.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import network.pxl8.geoexpansion.common.event.Register;
import network.pxl8.geoexpansion.lib.LibMeta;

import java.util.Random;

public class BlockTintedBase extends Block {
    public static final PropertyEnum PROPERTY_DENSITY = PropertyEnum.create("density", EnumDensity.class);

    private static Random rand = new Random();


    public BlockTintedBase(String registry_name) {
        super(Material.ROCK);
        this.setCreativeTab(Register.geoexpansionTab);

        this.setRegistryName(registry_name);
        this.setUnlocalizedName(LibMeta.MOD_ID + "." + registry_name);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) { return this.getDefaultState().withProperty(PROPERTY_DENSITY, EnumDensity.byMetadata(meta)); }
    @Override
    public int getMetaFromState(IBlockState state){ return ((EnumDensity) state.getValue(PROPERTY_DENSITY)).getMetadata(); }

    @Override
    protected BlockStateContainer createBlockState() { return new BlockStateContainer(this, PROPERTY_DENSITY); }

    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float x, float y, float z, int meta, EntityLivingBase placer) {
        return this.getDefaultState().withProperty(PROPERTY_DENSITY, getDensityFromDepth(pos.getY()));
    }

    public static EnumDensity getDensityFromDepth(int depth) {
        if (0 <= depth && depth <= 18) {
            return EnumDensity.DENSE; }
        else if (19 <= depth && depth <= 21) {
            return rand.nextBoolean() ? EnumDensity.DENSE : EnumDensity.HARD;
        } else if (22 <= depth && depth <= 38) {
            return EnumDensity.HARD;
        } else if (39 <= depth && depth <= 41) {
            return rand.nextBoolean() ? EnumDensity.HARD : EnumDensity.SOFT;
        } else {
            return EnumDensity.SOFT;
        }
    }

    public static int getTintIndex(IBlockState state) {
        if          (state.getValue(PROPERTY_DENSITY) == EnumDensity.SOFT) {    return 0xFFFFFF; }
        else if     (state.getValue(PROPERTY_DENSITY) == EnumDensity.HARD) {    return 0x9A9898; }
        else  if    (state.getValue(PROPERTY_DENSITY) == EnumDensity.DENSE) {   return 0x535050; }
        return 0xFFFFFF;
    }

    @Override
    public float getBlockHardness(IBlockState state, World world, BlockPos pos) {
        if          (state.getValue(PROPERTY_DENSITY) == EnumDensity.SOFT) {    return 1.5F; }
        else if     (state.getValue(PROPERTY_DENSITY) == EnumDensity.HARD) {    return 3F; }
        else  if    (state.getValue(PROPERTY_DENSITY) == EnumDensity.DENSE) {   return 6F; }
        return 1.5F;
    }

    @Override
    public String getHarvestTool(IBlockState state) { return "pickaxe"; }

    @Override
    public int getHarvestLevel(IBlockState state) {
        if          (state.getValue(PROPERTY_DENSITY) == EnumDensity.SOFT) {    return 0; }
        else if     (state.getValue(PROPERTY_DENSITY) == EnumDensity.HARD) {    return 1; }
        else  if    (state.getValue(PROPERTY_DENSITY) == EnumDensity.DENSE) {   return 2; }
        return 0;
    }
}
