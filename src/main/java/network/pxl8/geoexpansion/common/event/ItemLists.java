package network.pxl8.geoexpansion.common.event;

import network.pxl8.geoexpansion.common.items.ItemCrystalCluster;
import network.pxl8.geoexpansion.common.items.ItemDustCluster;
import network.pxl8.geoexpansion.common.items.ItemOreCluster;
import network.pxl8.geoexpansion.common.items.ItemSpallingHammer;

import java.util.ArrayList;
import java.util.List;

public class ItemLists {
	private List<ItemOreCluster> oreClusterList = new ArrayList<>();
	private List<ItemCrystalCluster> crystalClusterList = new ArrayList<>();
	private List<ItemDustCluster> dustClusterList = new ArrayList<>();
	private List<ItemSpallingHammer> spallingHammerList = new ArrayList<>();

	public void addOreCluster(ItemOreCluster cluster) {
		oreClusterList.add(cluster);
	}

	public void addCrystalCluster(ItemCrystalCluster cluster) {
		crystalClusterList.add(cluster);
	}

	public void addDustCluster(ItemDustCluster cluster) {
		dustClusterList.add(cluster);
	}

	public void addHammer(ItemSpallingHammer hammer) {
		spallingHammerList.add(hammer);
	}

	public List<ItemOreCluster> getOreClusterList() {
		return oreClusterList;
	}

	public List<ItemCrystalCluster> getCrystalClusterList() {
		return crystalClusterList;
	}

	public List<ItemDustCluster> getDustClusterList() {
		return dustClusterList;
	}

	public List<ItemSpallingHammer> getSpallingHammerList() {
		return spallingHammerList;
	}
}
