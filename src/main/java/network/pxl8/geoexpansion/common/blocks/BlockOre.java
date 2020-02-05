package network.pxl8.geoexpansion.common.blocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import network.pxl8.geoexpansion.config.Conf;

import java.util.Random;

public class BlockOre extends BlockTintedBase {
    private String oreDrop;
    private Random random = new Random();

    BlockOre(String name, Float hardness, String drop) {
        super(name, hardness, "pickaxe");
        this.oreDrop = drop;
    }

    @Override
    public void getDrops(NonNullList<ItemStack> items, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        items.clear();
        Item drop = Item.getByNameOrId(oreDrop);
        float dropBase = 1.0F;
        if          (state.getValue(PROPERTY_DENSITY) == EnumDensity.SOFT) {    dropBase = Conf.ore_config.DROP_BASE_SOFT; }
        else if     (state.getValue(PROPERTY_DENSITY) == EnumDensity.HARD) {    dropBase = Conf.ore_config.DROP_BASE_HARD; }
        else  if    (state.getValue(PROPERTY_DENSITY) == EnumDensity.DENSE) {   dropBase = Conf.ore_config.DROP_BASE_DENSE; }

        float fortuneMult = 1.0F + (((1.0F/(fortune + 2.0F) + (fortune + 1.0F)/2.0F) - 1.0F) * random.nextFloat());
        int dropsMultiplied = Math.round(dropBase * fortuneMult);

        items.add(new ItemStack(drop, dropsMultiplied));
    }
}
