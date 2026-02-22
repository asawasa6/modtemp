package aircraft.client.renderer;

import aircraft.client.model.EnemyModel;
import aircraft.entity.Enemy;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class EnemyRenderer extends GeoEntityRenderer<Enemy>{
    public EnemyRenderer(EntityRendererProvider.Context context) {
        super(context, new EnemyModel());
    }
}
