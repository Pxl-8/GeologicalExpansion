package network.pxl8.geoexpansion.common.blocks;

import net.minecraft.util.IStringSerializable;

public enum EnumDensity implements IStringSerializable {
    SOFT(0, "soft"),
    FIRM(1, "firm"),
    SOLID(2, "solid"),
    HARD(3, "hard");

    private static final EnumDensity[] META_LOOKUP = new EnumDensity[values().length];
    private final int meta;
    private final String name;

    EnumDensity(int meta, String name) {
        this.meta = meta;
        this.name = name;
    }

    public int getMetadata() {
        return this.meta;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String toString() { return getName(); }

    public static EnumDensity byMetadata(int meta) {
        if (meta < 0 || meta >= META_LOOKUP.length) { meta = 0; }
        return META_LOOKUP[meta];
    }

    static { for(EnumDensity density$enumtype : values()) { META_LOOKUP[density$enumtype.getMetadata()] = density$enumtype; } }
}
