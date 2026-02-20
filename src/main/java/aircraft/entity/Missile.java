package aircraft.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

public class Missile extends Entity implements GeoEntity {

    private final AnimatableInstanceCache cache =
            GeckoLibUtil.createInstanceCache(this);

    public Missile(EntityType<? extends Missile> type, Level level) {
        super(type, level);
    }

    // 1.21ではこれが必要
    @Override
    protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData.Builder builder) {
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}
