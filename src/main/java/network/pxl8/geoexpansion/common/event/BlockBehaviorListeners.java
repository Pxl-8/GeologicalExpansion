package network.pxl8.geoexpansion.common.event;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import network.pxl8.geoexpansion.common.blocks.dynamic.BehaviorMixin;
import network.pxl8.geoexpansion.common.blocks.dynamic.DynamicTintedBlock;

public class BlockBehaviorListeners {
	@SubscribeEvent
	public void onTillSoil(UseHoeEvent event) {
		if (event.isCanceled()) return;

		IBlockState state = event.getWorld().getBlockState(event.getPos());
		Block block = state.getBlock();

		if (block instanceof DynamicTintedBlock) {
			BehaviorMixin mixin = ((DynamicTintedBlock) block).getBehavior();

			if (mixin != null) {
				boolean success = mixin.onTillBlock(event.getWorld(), event.getPos(), state, event.getCurrent());

				if (success) event.setResult(Event.Result.ALLOW);
			}
		}
	}
}
