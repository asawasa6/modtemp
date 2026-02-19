package aircraft.registry;

import aircraft.entity.CubeEntity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(Registries.ENTITY_TYPE, "aircraft");

    public static final DeferredHolder<EntityType<?>, EntityType<CubeEntity>> CUBE =
            ENTITIES.register("cube", () ->
                    EntityType.Builder
                            .of(CubeEntity::new, MobCategory.MISC)
                            .sized(1.0f, 1.0f)
                            .build("aircraft:cube")
            );
}
