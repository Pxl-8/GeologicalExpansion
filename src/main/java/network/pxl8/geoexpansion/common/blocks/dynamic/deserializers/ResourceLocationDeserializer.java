package network.pxl8.geoexpansion.common.blocks.dynamic.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import net.minecraft.util.ResourceLocation;

import java.lang.reflect.Type;

public class ResourceLocationDeserializer implements JsonDeserializer<ResourceLocation> {
	@Override
	public ResourceLocation deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		String resource = json.getAsString();

		return new ResourceLocation(resource);
	}
}
