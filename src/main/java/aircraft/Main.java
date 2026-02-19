package aircraft;

import aircraft.registry.ModEntities;
import aircraft.client.ClientEvents;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Main.MODID)
public class Main {
    public static final String MODID = "aircraft";

    public Main(IEventBus modBus){
        ModEntities.ENTITIES.register(modBus);
        ClientEvents.register(modBus);
    }
}
