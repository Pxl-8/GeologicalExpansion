package network.pxl8.geoexpansion.lib;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;
import network.pxl8.geoexpansion.common.world.StoneWorldGen;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class ReflectionUtil {
	public static Map<IWorldGenerator, Integer> fetchWorldGeneratorIndex() {
		try {
			Field f = GameRegistry.class.getDeclaredField("worldGeneratorIndex");

			f.setAccessible(true);
			return (Map<IWorldGenerator, Integer>) f.get(GameRegistry.class);
		} catch (NoSuchFieldException | IllegalAccessException e) {
			LibMeta.LOG.warn("Could not access the world generator index field; " +
					"world generation may not run late enough!", e);
			return null;
		}
	}

	public static void forceRefreshGeneratorIndex() {
		try {
			Method m = GameRegistry.class.getDeclaredMethod("computeSortedGeneratorList");
			m.setAccessible(true);
			m.invoke(GameRegistry.class);
		} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
			LibMeta.LOG.warn("Could not refresh the sorted world generator list; " +
					"world generation may not run late enough!", e);
		}
	}

	public static void modifyWorldGenerators() {
		Map<IWorldGenerator, Integer> worldGeneratorIndex = fetchWorldGeneratorIndex();

		if (worldGeneratorIndex == null) return;

		worldGeneratorIndex.replaceAll((gen, weight) -> {
			if (weight == Integer.MAX_VALUE && !(gen instanceof StoneWorldGen)) {
				return Integer.MAX_VALUE - 1;
			} else {
				return weight;
			}
		});

		forceRefreshGeneratorIndex();
	}
}
