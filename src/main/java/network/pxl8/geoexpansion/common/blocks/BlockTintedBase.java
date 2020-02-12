package network.pxl8.geoexpansion.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import network.pxl8.geoexpansion.config.Conf;
import network.pxl8.geoexpansion.common.event.Register;
import network.pxl8.geoexpansion.lib.LibMeta;
import network.pxl8.geoexpansion.lib.LibTools;

public class BlockTintedBase extends Block {


    private String replacedBlock;
    private Float baseHardness;
    private String harvestTool;

    BlockTintedBase(String registryName, Float hardness, String harvestTool, String replacedBlock) {
        super(Material.ROCK);
        this.setCreativeTab(Register.geoexpansionTabBlocks);

        this.setRegistryName(registryName);
        this.setUnlocalizedName(LibMeta.MOD_ID + "." + registryName);

        this.replacedBlock = replacedBlock;
        this.baseHardness = hardness;
        this.harvestTool = harvestTool;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) { return this.getDefaultState().withProperty(LibMeta.PROPERTY_DENSITY, EnumDensity.byMetadata(meta)); }
    @Override
    public int getMetaFromState(IBlockState state){ return ((EnumDensity) state.getValue(LibMeta.PROPERTY_DENSITY)).getMetadata(); }

    @Override
    protected BlockStateContainer createBlockState() { return new BlockStateContainer(this, LibMeta.PROPERTY_DENSITY); }

    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float x, float y, float z, int meta, EntityLivingBase placer) {
        return this.getDefaultState().withProperty(LibMeta.PROPERTY_DENSITY, getDensityFromDepth(pos.getY()));
    }

    public static EnumDensity getDensityFromDepth(int depth) {
        int rangeHard = Conf.base_config.BLOCK_UPPER_RANGE_4_HARD;
        int rangeSolid = Conf.base_config.BLOCK_UPPER_RANGE_3_SOLID;
        int rangeFirm = Conf.base_config.BLOCK_UPPER_RANGE_2_FIRM;
        if (0 <= depth && depth <= rangeHard - 2) {                             return EnumDensity.HARD; }
        else if (depth == rangeHard - 1) {                                      return LibTools.randBoolRatio(2, 8) ? EnumDensity.HARD : EnumDensity.SOLID; }
        else if (depth == rangeHard) {                                          return LibTools.randBoolRatio(5, 5) ? EnumDensity.SOLID : EnumDensity.HARD; }
        else if (depth == rangeHard + 1) {                                      return LibTools.randBoolRatio(2, 8) ? EnumDensity.SOLID : EnumDensity.HARD; }
        else if (rangeHard + 2 <= depth && depth <= rangeSolid - 2) {           return EnumDensity.SOLID; }
        else if (depth == rangeSolid - 1) {                                     return LibTools.randBoolRatio(2, 8) ? EnumDensity.SOLID : EnumDensity.FIRM; }
        else if (depth == rangeSolid) {                                         return LibTools.randBoolRatio(5, 5) ? EnumDensity.FIRM : EnumDensity.SOLID; }
        else if (depth == rangeSolid + 1) {                                     return LibTools.randBoolRatio(2, 8) ? EnumDensity.FIRM : EnumDensity.SOLID; }
        else if (rangeSolid + 2 <= depth && depth <= rangeFirm - 2) {           return EnumDensity.FIRM; }
        else if (depth == rangeFirm - 1) {                                      return LibTools.randBoolRatio(2, 8) ? EnumDensity.FIRM : EnumDensity.SOFT; }
        else if (depth == rangeFirm) {                                          return LibTools.randBoolRatio(5, 5) ? EnumDensity.SOFT : EnumDensity.FIRM; }
        else if (depth == rangeFirm + 1) {                                      return LibTools.randBoolRatio(2, 8) ? EnumDensity.SOFT : EnumDensity.FIRM; }
        else {                                                                  return EnumDensity.SOFT; }
    }

    public static int getColor(IBlockState state) {
        if          (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.SOFT) {    return Integer.decode(Conf.base_config.TINT_COLOR_1_SOFT); }
        else if     (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.FIRM) {    return Integer.decode(Conf.base_config.TINT_COLOR_2_FIRM); }
        else  if    (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.SOLID) {   return Integer.decode(Conf.base_config.TINT_COLOR_3_SOLID); }
        else  if    (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.HARD) {    return Integer.decode(Conf.base_config.TINT_COLOR_4_HARD); }
        return 0xFFFFFF;
    }

    @Override
    public float getBlockHardness(IBlockState state, World world, BlockPos pos) {
        if          (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.SOFT) {    return this.baseHardness * Conf.base_config.HARDNESS_MULT_1_SOFT; }
        else if     (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.FIRM) {    return this.baseHardness * Conf.base_config.HARDNESS_MULT_2_FIRM; }
        else  if    (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.SOLID) {   return this.baseHardness * Conf.base_config.HARDNESS_MULT_3_SOLID; }
        else  if    (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.HARD) {   return this.baseHardness * Conf.base_config.HARDNESS_MULT_4_HARD; }
        return 1.5F;
    }

    @Override
    public String getHarvestTool(IBlockState state) { return this.harvestTool; }

    @Override
    public int getHarvestLevel(IBlockState state) {
        if          (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.SOFT) {    return 0; }
        else if     (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.FIRM) {    return 1; }
        else  if    (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.SOLID) {   return 2; }
        else  if    (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.HARD) {    return 3; }
        return 0;
    }

    public IBlockState getBlockToReplace() {
        return LibTools.getStateFromString(replacedBlock);
    }
}
