package network.pxl8.geoexpansion.common.blocks.dynamic;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DynamicBlockFactory {
	private String name;
	private String tool;
	private float hardness;
	private Material material;
	private SoundType sound;

	private WeakBlockRef replaces;
	private WeakBlockRef drops;
	private WeakBlockRef silkDrops;

	public boolean isValid() {
		return name != null
				&& tool != null
				&& replaces != null
				&& drops != null;
	}

	public DynamicBlockData toData(IBlockLookup lookup) {
		return new DynamicBlockData(name, tool, hardness,
				material != null ? material : Material.ROCK,
				sound != null ? sound : SoundType.STONE,
				replaces.strengthen(lookup),
				drops.strengthen(lookup),
				silkDrops != null ? silkDrops.strengthen(lookup) : null
		);
	}

	public Block createBlock(IBlockLookup lookup) {
		return new DynamicTintedBlock(this.toData(lookup));
	}
}
