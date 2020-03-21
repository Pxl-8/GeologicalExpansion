package network.pxl8.geoexpansion.common.blocks.dynamic;

public interface IGenerationCheck {
	boolean checkShouldGenerate(int x, int z, int chunkX, int chunkZ);
}
