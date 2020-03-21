package network.pxl8.geoexpansion.common.blocks.dynamic;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DynamicBlockData {
	private String name;
	private String tool;
	private float hardness;
	private Material material = Material.ROCK;
	private SoundType sound = SoundType.STONE;
	private DynamicBlockBehaviour behaviour = DynamicBlockBehaviour.NORMAL;

	private WeakRegistryRef replaces;
	private WeakRegistryRef drops;
	private WeakRegistryRef silkDrops;

	public boolean isValid() {
		return name != null
				&& replaces != null
				&& drops != null;
	}

	public DynamicTintedBlock createBlock(IBlockLookup lookup) {
		return new DynamicTintedBlock(this);
	}

	public String getName() {
		return name;
	}

	public String getTool() {
		return tool;
	}

	public float getHardness() {
		return hardness;
	}

	public Material getMaterial() {
		return material;
	}

	public SoundType getSound() {
		return sound;
	}

	public DynamicBlockBehaviour getBehaviour() {
		return behaviour;
	}

	public WeakRegistryRef getReplaces() {
		return replaces;
	}

	public WeakRegistryRef getDrops() {
		return drops;
	}

	public WeakRegistryRef getSilkDrops() {
		return silkDrops;
	}
}
