package network.pxl8.geoexpansion.common.blocks.dynamic;

import net.minecraft.block.Block;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import network.pxl8.geoexpansion.DensityHelper;
import network.pxl8.geoexpansion.common.blocks.EnumDensity;
import network.pxl8.geoexpansion.common.event.Register;
import network.pxl8.geoexpansion.config.Conf;
import network.pxl8.geoexpansion.lib.LibMeta;

public class DynamicTintedBlock extends Block implements IReplacingBlock {
	private DynamicBlockData data;

	public DynamicTintedBlock(DynamicBlockData data) {
		super(data.getMaterial());

		setRegistryName(data.getName());
		setUnlocalizedName(LibMeta.MOD_ID + "." + data.getName());
		setCreativeTab(Register.geoexpansionTabBlocks);

		this.data = data;
	}

	@Override
	public IBlockState getTarget() {
		return data.getReplaces().getState();
	}

	@Override
	public Block getReplacement() {
		return this;
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state,
	                     int fortune) {
		drops.clear();
		drops.add(data.getDrops().createStack());
	}

	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state) {
		if (data.getSilkDrops() != null) {
			return data.getSilkDrops().createStack();
		} else {
			return data.getDrops().createStack();
		}
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, LibMeta.PROPERTY_DENSITY);
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(LibMeta.PROPERTY_DENSITY, EnumDensity.byMetadata(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(LibMeta.PROPERTY_DENSITY).getMetadata();
	}

	@Override
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float x, float y, float z,
	                                        int meta, EntityLivingBase placer) {
		return this.getDefaultState().withProperty(LibMeta.PROPERTY_DENSITY,
				DensityHelper.getDensityFromDepth(pos.getY()));
	}

	public int getColor(IBlockState state) {
		return Integer.decode(getStringColor(state));
	}

	String getStringColor(IBlockState state) {
		switch (state.getValue(LibMeta.PROPERTY_DENSITY)) {
			case SOFT: return Conf.base_config.TINT_COLOR_1_SOFT;
			case FIRM: return Conf.base_config.TINT_COLOR_2_FIRM;
			case SOLID: return Conf.base_config.TINT_COLOR_3_SOLID;
			case HARD: return Conf.base_config.TINT_COLOR_4_HARD;
			default: return "0xFFFFFF";
		}
	}

	@Override
	public float getBlockHardness(IBlockState state, World world, BlockPos pos) {
		float hardness = data.getHardness();

		switch (state.getValue(LibMeta.PROPERTY_DENSITY)) {
			case SOFT: return hardness * Conf.base_config.HARDNESS_MULT_1_SOFT;
			case FIRM: return hardness * Conf.base_config.HARDNESS_MULT_2_FIRM;
			case SOLID: return hardness * Conf.base_config.HARDNESS_MULT_3_SOLID;
			case HARD: return hardness * Conf.base_config.HARDNESS_MULT_4_HARD;
			default: return 1.5F;
		}
	}

	@Override
	public String getHarvestTool(IBlockState state) {
		return data.getTool();
	}

	@Override
	public int getHarvestLevel(IBlockState state) {
		switch (state.getValue(LibMeta.PROPERTY_DENSITY)) {
			case FIRM: return 1;
			case SOLID: return 2;
			case HARD: return 3;
			default: return 0;
		}
	}
}
