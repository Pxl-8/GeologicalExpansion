package network.pxl8.geoexpansion.lib;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

public class LibStone {
    public static IBlockState ANDESITE = Blocks.STONE.getDefaultState().withProperty(net.minecraft.block.BlockStone.VARIANT, net.minecraft.block.BlockStone.EnumType.ANDESITE);
    public static IBlockState DIORITE = Blocks.STONE.getDefaultState().withProperty(net.minecraft.block.BlockStone.VARIANT, net.minecraft.block.BlockStone.EnumType.DIORITE);
    public static IBlockState GRANITE = Blocks.STONE.getDefaultState().withProperty(net.minecraft.block.BlockStone.VARIANT, net.minecraft.block.BlockStone.EnumType.GRANITE);
    public static IBlockState STONE = Blocks.STONE.getDefaultState().withProperty(net.minecraft.block.BlockStone.VARIANT, net.minecraft.block.BlockStone.EnumType.STONE);
}
