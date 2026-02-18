package aircraft.client.model;

import aircraft.entity.CubeEntity;

import net.minecraft.resources.ResourceLocation;

import software.bernie.geckolib.model.GeoModel;

public class CubeModel extends GeoModel<CubeEntity>{
    @Override
    public ResourceLocation getModelResource(CubeEntity animatable) {
        return ResourceLocation.parse("airmod:geo/cube.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CubeEntity animatable) {
        return ResourceLocation.parse("airmod:textures/entity/cubetex.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CubeEntity animatable) {
        return ResourceLocation.parse("airmod:animations/cube.animation.json");
    }
}
