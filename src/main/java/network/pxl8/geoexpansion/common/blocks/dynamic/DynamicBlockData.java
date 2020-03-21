package network.pxl8.geoexpansion.common.blocks.dynamic;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class DynamicBlockData {
	private String name;
	private String tool;
	private float hardness;
	private Material material;
	private SoundType soundType;
	private DynamicBlockBehaviour behaviour;

	private BlockRef replaces;
	private WeakRegistryRef drops;
	private WeakRegistryRef silkDrops;

	public DynamicBlockData(String name, String tool, float hardness,
	                        DynamicBlockBehaviour behaviour, Material material, SoundType sound,
	                        BlockRef replaces, WeakRegistryRef drops, WeakRegistryRef silkDrops) {
		this.name = name;
		this.tool = tool;
		this.hardness = hardness;
		this.behaviour = behaviour;
		this.material = material;
		this.soundType = sound;
		this.replaces = replaces;
		this.drops = drops;
		this.silkDrops = silkDrops;
	}

	@Nonnull
	public String getName() {
		return name;
	}

	@Nonnull
	public String getTool() {
		return tool;
	}

	public float getHardness() {
		return hardness;
	}

	@Nonnull
	public Material getMaterial() {
		return material;
	}

	@Nonnull
	public SoundType getSoundType() {
		return soundType;
	}

	public DynamicBlockBehaviour getBehaviour() {
		return behaviour;
	}

	@Nonnull
	public BlockRef getReplaces() {
		return replaces;
	}

	@Nonnull
	public WeakRegistryRef getDrops() {
		return drops;
	}

	@Nullable
	public WeakRegistryRef getSilkDrops() {
		return silkDrops;
	}
}
