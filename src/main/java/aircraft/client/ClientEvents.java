package aircraft.client;

import aircraft.client.renderer.CubeRenderer;
import aircraft.registry.ModEntities;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

public class ClientEvents {
    public static void register(IEventBus modBus) {
        modBus.addListener((EntityRenderersEvent.RegisterRenderers event) -> event.registerEntityRenderer(
                ModEntities.CUBE.get(),
                CubeRenderer::new
        ));
    }
}
