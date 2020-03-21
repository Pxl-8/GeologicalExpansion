package network.pxl8.geoexpansion.common.blocks.dynamic;

import com.google.common.base.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntitySilverfish;
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

import java.util.Random;

public class DynamicTintedBlock extends Block implements IReplacingBlock, IHolderRefresh, IGenerationCheck {
	private DynamicBlockData data;
	private Random random = new Random();
	private IGenerationCheck customGenCheck = null;

	private BlockRef replaces;
	private ItemRef drops;
	private ItemRef silkDrops = null;

	public DynamicTintedBlock(DynamicBlockData data) {
		super(data.getMaterial());
		this.data = data;

		setRegistryName(data.getName());
		setUnlocalizedName(LibMeta.MOD_ID + "." + data.getName());
		setCreativeTab(Register.geoexpansionTabBlocks);
		setSoundType(data.getSound());

		if (data.getBehaviour() == DynamicBlockBehaviour.BEDROCK) {
			this.setResistance(6000000.0F);
			this.disableStats();
		}
	}

	@Override
	public IBlockState getTarget() {
		return replaces.getState();
	}

	@Override
	public Block getReplacement() {
		return this;
	}

	@Override
	public void provideRefs(IItemLookup items, IBlockLookup blocks) {
		replaces = data.getReplaces().toBlockRef(blocks);
		drops = data.getDrops().toItemRef(items);

		if (data.getSilkDrops() != null)
			silkDrops = data.getSilkDrops().toItemRef(items);
	}

	@Override
	public boolean checkShouldGenerate(int x, int z, int chunkX, int chunkZ) {
		if (customGenCheck != null)
			return customGenCheck.checkShouldGenerate(x, z, chunkX, chunkZ);

		return true;
	}

	public DynamicTintedBlock setCustomGenCheck(IGenerationCheck customGenCheck) {
		this.customGenCheck = customGenCheck;
		return this;
	}

	private float getDropBase(IBlockState state) {
		switch (state.getValue(LibMeta.PROPERTY_DENSITY)) {
			case SOFT: return Conf.ore_config.DROP_BASE_1_SOFT;
			case FIRM: return Conf.ore_config.DROP_BASE_2_FIRM;
			case SOLID: return Conf.ore_config.DROP_BASE_3_SOLID;
			case HARD: return Conf.ore_config.DROP_BASE_4_HARD;
		}

		return 1.0F;
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state,
	                     int fortune) {
		drops.clear();

		switch (data.getBehaviour()) {
			case NORMAL: {
				drops.add(this.drops.createStack());
				break;
			}
			case ORE: {
				float dropBase = getDropBase(state);
				float fortuneMult = 1.0F + (((1.0F / (fortune + 2.0F) + (fortune + 1.0F) / 2.0F) - 1.0F) * random.nextFloat());

				int dropCount = Math.round(dropBase * fortuneMult);

				ItemStack toDrop = this.drops.createStack();
				toDrop.setCount(dropCount);

				drops.add(toDrop);
				break;
			}
			case INFESTED:
			case BEDROCK:
				break;
		}
	}

	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state) {
		if (this.silkDrops != null) {
			return this.silkDrops.createStack();
		} else {
			return this.drops.createStack();
		}
	}

	@Override
	public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) {
		if (this.data.getBehaviour() == DynamicBlockBehaviour.INFESTED) {
			if (!worldIn.isRemote && worldIn.getGameRules().getBoolean("doTileDrops")) {
				EntitySilverfish entitysilverfish = new EntitySilverfish(worldIn);
				entitysilverfish.setLocationAndAngles((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, 0.0F, 0.0F);
				worldIn.spawnEntity(entitysilverfish);
				entitysilverfish.spawnExplosionParticle();
			}

			return;
		}

		super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
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
		if (data.getBehaviour() == DynamicBlockBehaviour.BEDROCK)
			return -1;

		switch (state.getValue(LibMeta.PROPERTY_DENSITY)) {
			case FIRM: return 1;
			case SOLID: return 2;
			case HARD: return 3;
			default: return 0;
		}
	}

	@Override
	public EnumPushReaction getMobilityFlag(IBlockState state) {
		if (data.getBehaviour() == DynamicBlockBehaviour.BEDROCK) {
			return EnumPushReaction.BLOCK;
		}

		return super.getMobilityFlag(state);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		if (data == null) return true;

		if (data.getBehaviour() == DynamicBlockBehaviour.BEDROCK) {
			return false;
		}

		return super.isOpaqueCube(state);
	}

	@Override
	public boolean isReplaceableOreGen(IBlockState state, IBlockAccess world, BlockPos pos, Predicate<IBlockState> target) {
		return data.getBehaviour() != DynamicBlockBehaviour.BEDROCK;
	}
}
