package aircraft.client;

import aircraft.client.renderer.CubeRenderer;
import aircraft.client.renderer.MissileRenderer;
import aircraft.client.renderer.EnemyRenderer;
import aircraft.registry.ModEntities;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

public class ClientEvents {
    public static void register(IEventBus modBus) {
        modBus.addListener((EntityRenderersEvent.RegisterRenderers event) -> {
            event.registerEntityRenderer(
                    ModEntities.CUBE.get(),
                    CubeRenderer::new
            );
            event.registerEntityRenderer(
                    ModEntities.MISSILE.get(),
                    MissileRenderer::new
            );
            event.registerEntityRenderer(
                    ModEntities.ENEMY.get(),
                    EnemyRenderer::new
            );
        });
    }
}
