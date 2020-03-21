package network.pxl8.geoexpansion.common.recipe;

import com.google.gson.JsonObject;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IIngredientFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.oredict.OreIngredient;

import javax.annotation.Nonnull;

public class WildcardOreDictFactory implements IIngredientFactory {
	@Nonnull
	@Override
	public Ingredient parse(JsonContext context, JsonObject json) {
		return new FixedOreIngredient(JsonUtils.getString(json, "ore"));
	}

	static class FixedOreIngredient extends OreIngredient {
		public FixedOreIngredient(String ore) {
			super(ore);
		}

		@Override
		public boolean isSimple() {
			return false;
		}
	}
}
