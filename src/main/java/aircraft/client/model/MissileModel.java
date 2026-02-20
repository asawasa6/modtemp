package aircraft.client.model;

import aircraft.entity.Missile;

import net.minecraft.resources.ResourceLocation;

import software.bernie.geckolib.model.GeoModel;

public class MissileModel extends GeoModel<Missile>{
    @Override
    public ResourceLocation getModelResource(Missile animatable) {
        return ResourceLocation.parse("aircraft:geo/missilemodel.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Missile animatable) {
        return ResourceLocation.parse("aircraft:textures/entity/missile.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Missile animatable) {
        return ResourceLocation.parse("aircraft:animations/missile.animation.json");
    }
}
