package network.pxl8.geoexpansion.compat.top;

import mcjty.theoneprobe.api.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import network.pxl8.geoexpansion.lib.LibMeta;

import javax.annotation.Nullable;
import java.util.function.Function;

public class TOPCompat {
    private static boolean registered;

    public static void register() {
        if (registered) return;
        registered = true;
        FMLInterModComms.sendFunctionMessage("theoneprobe", "getTOP", "network.pxl8.geoexpansion.compat.top.TOPCompat$getTOP");
    }

    public static class getTOP implements Function<ITheOneProbe, Void> {
        public static ITheOneProbe probe;

        @Nullable
        @Override
        public Void apply(ITheOneProbe theOneProbe) {
            probe = theOneProbe;
            probe.registerProvider(new IProbeInfoProvider() {
                @Override
                public String getID() {
                    return LibMeta.MOD_ID + ":default";
                }

                @Override
                public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
                    if (blockState.getBlock() instanceof ITOPInfoProvider) {
                        ITOPInfoProvider provider = (ITOPInfoProvider) blockState.getBlock();
                        provider.addProbeInfo(mode, probeInfo, player, world, blockState, data);
                    }
                }
            });
            return null;
        }
    }
}
