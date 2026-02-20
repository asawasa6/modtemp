package aircraft.client.renderer;

import aircraft.client.model.MissileModel;

import aircraft.entity.Missile;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class MissileRenderer extends GeoEntityRenderer<Missile>{
    public MissileRenderer(EntityRendererProvider.Context context) {
        super(context, new MissileModel());
    }
}
