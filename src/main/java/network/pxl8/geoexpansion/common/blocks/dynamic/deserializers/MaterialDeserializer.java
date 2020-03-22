package network.pxl8.geoexpansion.common.blocks.dynamic.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import net.minecraft.block.material.Material;

import java.lang.reflect.Type;

public class MaterialDeserializer implements JsonDeserializer<Material> {
	@Override
	public Material deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		String material = json.getAsString().toLowerCase();

		switch (material) {
			case "air": return Material.AIR;
			case "grass": return Material.GRASS;
			case "ground": return Material.GROUND;
			case "wood": return Material.WOOD;
			case "rock": return Material.ROCK;
			case "iron": return Material.IRON;
			case "anvil": return Material.ANVIL;
			case "water": return Material.WATER;
			case "lava": return Material.LAVA;
			case "leaves": return Material.LEAVES;
			case "plants": return Material.PLANTS;
			case "vine": return Material.VINE;
			case "sponge": return Material.SPONGE;
			case "cloth": return Material.CLOTH;
			case "fire": return Material.FIRE;
			case "sand": return Material.SAND;
			case "circuits": return Material.CIRCUITS;
			case "carpet": return Material.CARPET;
			case "glass": return Material.GLASS;
			case "redstone_light": return Material.REDSTONE_LIGHT;
			case "tnt": return Material.TNT;
			case "coral": return Material.CORAL;
			case "ice": return Material.ICE;
			case "packed_ice": return Material.PACKED_ICE;
			case "snow": return Material.SNOW;
			case "crafted_snow": return Material.CRAFTED_SNOW;
			case "cactus": return Material.CACTUS;
			case "clay": return Material.CLAY;
			case "gourd": return Material.GOURD;
			case "dragon_egg": return Material.DRAGON_EGG;
			case "portal": return Material.PORTAL;
			case "cake": return Material.CAKE;
			case "web": return Material.WEB;
			case "piston": return Material.PISTON;
			case "barrier": return Material.BARRIER;
			case "structure_void": return Material.STRUCTURE_VOID;
		}

		throw new IllegalArgumentException("Invalid material provided!");
	}
}
