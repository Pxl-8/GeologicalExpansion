package network.pxl8.geoexpansion.common.world;

import network.pxl8.geoexpansion.common.blocks.dynamic.IGenerationCheck;

public class CommonBlockGenerationCheck implements IGenerationCheck {
	@Override
	public boolean checkShouldGenerate(int x, int z, int chunkX, int chunkZ) {
		return x > (chunkX+6) && x < (chunkX+23)  && z > (chunkZ+6) && z < (chunkZ+23);
	}
}
