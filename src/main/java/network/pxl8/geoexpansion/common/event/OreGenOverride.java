package network.pxl8.geoexpansion.common.event;

import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static net.minecraftforge.fml.common.eventhandler.Event.Result.DENY;

public class OreGenOverride {
    @SubscribeEvent
    public void oreGen(OreGenEvent.GenerateMinable event) {
        switch (event.getType()) {
            case COAL: case IRON: case GOLD: case DIAMOND: case EMERALD: case REDSTONE: case LAPIS: case DIORITE: case GRANITE: case ANDESITE:
                event.setResult(DENY);
                break;
            default: break;
        }
    }
}