package network.pxl8.geoexpansion.common.blocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import network.pxl8.geoexpansion.config.Conf;
import network.pxl8.geoexpansion.lib.LibMeta;
import network.pxl8.geoexpansion.lib.LibTools;

import java.util.Random;

public class BlockOre extends BlockTintedBase {
    private ItemStack oreDrop;
    private String dropId;
    private Random random = new Random();

    BlockOre(String name, Float hardness, String replacedBlock, String drop) {
        super(name, hardness, "pickaxe", replacedBlock);

        this.dropId = drop;
    }

    public void setDrops() {
        //this.oreDrop = ForgeRegistries.ITEMS.getValue(new ResourceLocation(this.dropId));
        this.oreDrop = LibTools.getStackFromString(this.dropId);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> items, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        items.clear();
        float dropBase = 1.0F;
        Item drop = this.oreDrop.getItem();

        if (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.SOFT) {
            dropBase = Conf.ore_config.DROP_BASE_1_SOFT;
        } else if (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.FIRM) {
            dropBase = Conf.ore_config.DROP_BASE_2_FIRM;
        } else if (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.SOLID) {
            dropBase = Conf.ore_config.DROP_BASE_3_SOLID;
        } else if (state.getValue(LibMeta.PROPERTY_DENSITY) == EnumDensity.HARD) {
            dropBase = Conf.ore_config.DROP_BASE_4_HARD;
        }

        if (drop != null) {
            float fortuneMult = 1.0F + (((1.0F / (fortune + 2.0F) + (fortune + 1.0F) / 2.0F) - 1.0F) * random.nextFloat());
            int dropsMultiplied = Math.round(dropBase * fortuneMult);

            items.add(new ItemStack(drop, dropsMultiplied));
        }
    }

    @Override public boolean canSilkHarvest() { return false; }
}
