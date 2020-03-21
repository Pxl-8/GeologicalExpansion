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

	private BlockRef replaces;
	private BlockRef drops;
	private BlockRef silkDrops;

	public DynamicBlockData(String name, String tool, float hardness, Material material, SoundType sound, BlockRef replaces, BlockRef drops, BlockRef silkDrops) {
		this.name = name;
		this.tool = tool;
		this.hardness = hardness;
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

	@Nonnull
	public BlockRef getReplaces() {
		return replaces;
	}

	@Nonnull
	public BlockRef getDrops() {
		return drops;
	}

	@Nullable
	public BlockRef getSilkDrops() {
		return silkDrops;
	}
}
