package network.pxl8.geoexpansion.common.blocks.dynamic;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import network.pxl8.geoexpansion.common.blocks.dynamic.deserializers.BehaviourDeserializer;
import network.pxl8.geoexpansion.common.blocks.dynamic.deserializers.MaterialDeserializer;
import network.pxl8.geoexpansion.common.blocks.dynamic.deserializers.ResourceLocationDeserializer;
import network.pxl8.geoexpansion.common.blocks.dynamic.deserializers.SoundTypeDeserializer;

import java.io.InputStream;
import java.io.InputStreamReader;

public class DynamicBlockLoader {
	private Gson gson = new GsonBuilder()
			.registerTypeAdapter(Material.class, new MaterialDeserializer())
			.registerTypeAdapter(ResourceLocation.class, new ResourceLocationDeserializer())
			.registerTypeAdapter(SoundType.class, new SoundTypeDeserializer())
			.registerTypeAdapter(DynamicBlockBehaviour.class, new BehaviourDeserializer())
			.create();

	public DynamicBlockData load(String name) {
		String assetPath = String.format("/assets/geoexpansion/dynamic/%s.json", name);
		InputStream stream = getClass().getResourceAsStream(assetPath);
		InputStreamReader reader = new InputStreamReader(stream);

		DynamicBlockData factory = gson.fromJson(reader, DynamicBlockData.class);
		if (!factory.isValid()) throw new IllegalArgumentException("Invalid dynamic block entry: " + name);

		return factory;
	}
}
