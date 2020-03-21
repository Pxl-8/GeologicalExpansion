package network.pxl8.geoexpansion;

import network.pxl8.geoexpansion.common.blocks.EnumDensity;
import network.pxl8.geoexpansion.config.Conf;
import network.pxl8.geoexpansion.lib.LibTools;

public class DensityHelper {
	public static EnumDensity getDensityFromDepth(int depth) {
		int rangeHard = Conf.base_config.BLOCK_UPPER_RANGE_4_HARD;
		int rangeSolid = Conf.base_config.BLOCK_UPPER_RANGE_3_SOLID;
		int rangeFirm = Conf.base_config.BLOCK_UPPER_RANGE_2_FIRM;

		if (0 <= depth && depth <= rangeHard - 2) {
			return EnumDensity.HARD; }
		else if (depth == rangeHard - 1) {
			return LibTools.randBoolRatio(2, 8) ? EnumDensity.HARD : EnumDensity.SOLID; }
		else if (depth == rangeHard) {
			return LibTools.randBoolRatio(5, 5) ? EnumDensity.SOLID : EnumDensity.HARD; }
		else if (depth == rangeHard + 1) {
			return LibTools.randBoolRatio(2, 8) ? EnumDensity.SOLID : EnumDensity.HARD; }
		else if (rangeHard + 2 <= depth && depth <= rangeSolid - 2) {
			return EnumDensity.SOLID; }
		else if (depth == rangeSolid - 1) {
			return LibTools.randBoolRatio(2, 8) ? EnumDensity.SOLID : EnumDensity.FIRM; }
		else if (depth == rangeSolid) {
			return LibTools.randBoolRatio(5, 5) ? EnumDensity.FIRM : EnumDensity.SOLID; }
		else if (depth == rangeSolid + 1) {
			return LibTools.randBoolRatio(2, 8) ? EnumDensity.FIRM : EnumDensity.SOLID; }
		else if (rangeSolid + 2 <= depth && depth <= rangeFirm - 2) {
			return EnumDensity.FIRM; }
		else if (depth == rangeFirm - 1) {
			return LibTools.randBoolRatio(2, 8) ? EnumDensity.FIRM : EnumDensity.SOFT; }
		else if (depth == rangeFirm) {
			return LibTools.randBoolRatio(5, 5) ? EnumDensity.SOFT : EnumDensity.FIRM; }
		else if (depth == rangeFirm + 1) {
			return LibTools.randBoolRatio(2, 8) ? EnumDensity.SOFT : EnumDensity.FIRM; }
		else {
			return EnumDensity.SOFT; }
	}
}
