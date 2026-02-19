package aircraft.client.renderer;

import aircraft.client.model.CubeModel;
import aircraft.entity.CubeEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class CubeRenderer extends GeoEntityRenderer<CubeEntity>{
    public CubeRenderer(EntityRendererProvider.Context context) {
        super(context, new CubeModel());
    }
}
