package aircraft.client.model;

import aircraft.entity.Enemy;

import net.minecraft.resources.ResourceLocation;

import software.bernie.geckolib.model.GeoModel;

public class EnemyModel extends GeoModel<Enemy>{
    @Override
    public ResourceLocation getModelResource(Enemy animatable) {
        return ResourceLocation.parse("aircraft:geo/enemy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Enemy animatable) {
        return ResourceLocation.parse("aircraft:textures/entity/enemy.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Enemy animatable) {
        return ResourceLocation.parse("aircraft:animations/cube.animation.json");
    }
}
