package network.pxl8.geoexpansion.common.blocks.dynamic.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import net.minecraft.block.SoundType;

import java.lang.reflect.Type;

public class SoundTypeDeserializer implements JsonDeserializer<SoundType> {
	@Override
	public SoundType deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		String sound = json.getAsString().toLowerCase();

		switch (sound) {
			case "wood": return SoundType.WOOD;
			case "ground": return SoundType.GROUND;
			case "plant": return SoundType.PLANT;
			case "stone": return SoundType.STONE;
			case "metal": return SoundType.METAL;
			case "glass": return SoundType.GLASS;
			case "cloth": return SoundType.CLOTH;
			case "sand": return SoundType.SAND;
			case "snow": return SoundType.SNOW;
			case "ladder": return SoundType.LADDER;
			case "anvil": return SoundType.ANVIL;
			case "slime": return SoundType.SLIME;
		}

		throw new IllegalArgumentException("Invalid sound type!");
	}
}
