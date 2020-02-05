package network.pxl8.geoexpansion.common.blocks;

import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import network.pxl8.geoexpansion.config.Conf;
import network.pxl8.geoexpansion.common.event.Register;
import network.pxl8.geoexpansion.compat.top.ITOPInfoProvider;
import network.pxl8.geoexpansion.lib.LibMeta;
import network.pxl8.geoexpansion.lib.LibTools;

public class BlockTintedBase extends Block implements ITOPInfoProvider {
    public static final PropertyEnum PROPERTY_DENSITY = PropertyEnum.create("density", EnumDensity.class);

    private Float baseHardness;
    private String harvestTool;

    BlockTintedBase(String registryName, Float hardness, String harvestTool) {
        super(Material.ROCK);
        this.setCreativeTab(Register.geoexpansionTab);

        this.setRegistryName(registryName);
        this.setUnlocalizedName(LibMeta.MOD_ID + "." + registryName);

        this.baseHardness = hardness;
        this.harvestTool = harvestTool;
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
        int rangeDense = Conf.base_config.BLOCK_UPPER_RANGE_DENSE;
        int rangeHard = Conf.base_config.BLOCK_UPPER_RANGE_HARD;
        if (0 <= depth && depth <= rangeDense - 2) {                            return EnumDensity.DENSE; }
        else if (depth == rangeDense - 1) {                                     return LibTools.randBoolRatio(2, 8) ? EnumDensity.DENSE : EnumDensity.HARD; }
        else if (depth == rangeDense) {                                         return LibTools.randBoolRatio(5, 5) ? EnumDensity.HARD : EnumDensity.DENSE; }
        else if (depth == rangeDense + 1) {                                     return LibTools.randBoolRatio(2, 8) ? EnumDensity.HARD : EnumDensity.DENSE; }
        else if (rangeDense + 2 <= depth && depth <= rangeHard - 2) {           return EnumDensity.HARD; }
        else if (depth == rangeHard - 1) {                                      return LibTools.randBoolRatio(2, 8) ? EnumDensity.HARD : EnumDensity.SOFT; }
        else if (depth == rangeHard) {                                          return LibTools.randBoolRatio(5, 5) ? EnumDensity.SOFT : EnumDensity.HARD; }
        else if (depth == rangeHard + 1) {                                      return LibTools.randBoolRatio(2, 8) ? EnumDensity.SOFT : EnumDensity.HARD; }
        else {                                                                  return EnumDensity.SOFT; }
    }

    public static int getColor(IBlockState state) {
        if          (state.getValue(PROPERTY_DENSITY) == EnumDensity.SOFT) {    return Integer.decode(Conf.base_config.TINT_COLOR_SOFT); }
        else if     (state.getValue(PROPERTY_DENSITY) == EnumDensity.HARD) {    return Integer.decode(Conf.base_config.TINT_COLOR_HARD); }
        else  if    (state.getValue(PROPERTY_DENSITY) == EnumDensity.DENSE) {   return  Integer.decode(Conf.base_config.TINT_COLOR_DENSE); }
        return 0xFFFFFF;
    }

    @Override
    public float getBlockHardness(IBlockState state, World world, BlockPos pos) {
        if          (state.getValue(PROPERTY_DENSITY) == EnumDensity.SOFT) {    return this.baseHardness * Conf.base_config.HARDNESS_MULT_SOFT; }
        else if     (state.getValue(PROPERTY_DENSITY) == EnumDensity.HARD) {    return this.baseHardness * Conf.base_config.HARDNESS_MULT_HARD; }
        else  if    (state.getValue(PROPERTY_DENSITY) == EnumDensity.DENSE) {   return this.baseHardness * Conf.base_config.HARDNESS_MULT_DENSE; }
        return 1.5F;
    }

    @Override
    public String getHarvestTool(IBlockState state) { return this.harvestTool; }

    @Override
    public int getHarvestLevel(IBlockState state) {
        if          (state.getValue(PROPERTY_DENSITY) == EnumDensity.SOFT) {    return 0; }
        else if     (state.getValue(PROPERTY_DENSITY) == EnumDensity.HARD) {    return 1; }
        else  if    (state.getValue(PROPERTY_DENSITY) == EnumDensity.DENSE) {   return 2; }
        return 0;
    }

    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo info, EntityPlayer player, World world, IBlockState state, IProbeHitData data) {
        IBlockState blockstate = world.getBlockState(data.getPos());
        LibMeta.LOG.info(blockstate);
        LibMeta.LOG.info(blockstate.getBlock());
        LibMeta.LOG.info(state);
        LibMeta.LOG.info(state.getBlock());

        /*if (blockstate.getBlock() instanceof  BlockTintedBase) {
            String density_level = "";
            if          (blockstate.getValue(PROPERTY_DENSITY) == EnumDensity.SOFT) {    density_level = "Soft"; }
            else if     (blockstate.getValue(PROPERTY_DENSITY) == EnumDensity.HARD) {    density_level = "Hard"; }
            else  if    (blockstate.getValue(PROPERTY_DENSITY) == EnumDensity.DENSE) {   density_level = "Dense"; }
            info.horizontal()
                    .text(TextFormatting.AQUA + "Density: " + density_level);
        }*/
    }
}
