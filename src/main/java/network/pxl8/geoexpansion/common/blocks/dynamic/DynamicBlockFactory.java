package network.pxl8.geoexpansion.common.blocks.dynamic;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DynamicBlockFactory {
	private String name;
	private String tool;
	private float hardness;
	private Material material;
	private SoundType sound;
	private DynamicBlockBehaviour behaviour;

	private WeakRegistryRef replaces;
	private WeakRegistryRef drops;
	private WeakRegistryRef silkDrops;

	public boolean isValid() {
		return name != null
				&& replaces != null
				&& drops != null;
	}

	public DynamicBlockData toData(IBlockLookup lookup) {
		return new DynamicBlockData(name, tool, hardness,
				behaviour != null ? behaviour : DynamicBlockBehaviour.NORMAL,
				material != null ? material : Material.ROCK,
				sound != null ? sound : SoundType.STONE,
				replaces.toBlockRef(lookup),
				drops, silkDrops
		);
	}

	public DynamicTintedBlock createBlock(IBlockLookup lookup) {
		return new DynamicTintedBlock(this.toData(lookup));
	}
}
