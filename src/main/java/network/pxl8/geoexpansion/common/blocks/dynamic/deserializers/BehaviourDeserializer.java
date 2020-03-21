package network.pxl8.geoexpansion.common.blocks.dynamic.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import network.pxl8.geoexpansion.common.blocks.dynamic.DynamicBlockBehaviour;

import java.lang.reflect.Type;

public class BehaviourDeserializer implements JsonDeserializer<DynamicBlockBehaviour> {
	@Override
	public DynamicBlockBehaviour deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		String behaviour = json.getAsString().toLowerCase();

		switch (behaviour) {
			case "infested": return DynamicBlockBehaviour.INFESTED;
			case "ore": return DynamicBlockBehaviour.ORE;
			case "bedrock": return DynamicBlockBehaviour.BEDROCK;
			default: return DynamicBlockBehaviour.NORMAL;
		}
	}
}
