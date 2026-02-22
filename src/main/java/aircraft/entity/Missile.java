package aircraft.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;

import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

public class Missile extends Projectile implements GeoEntity {

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

    @Override
    public void onAddedToLevel() {
        super.onAddedToLevel();
        this.setDeltaMovement(0,0.1,0);
    }
    @Override
    public void tick() {
        super.tick();

        if(!this.level().isClientSide) {

            double acceleration = 0.02;
            double maxSpeed = 0.6;

            double radius = 2.5;

            Vec3 motion = this.getDeltaMovement();


            double newY = motion.y + acceleration;

            if(newY > maxSpeed) {
                newY = maxSpeed;
            }

            this.setDeltaMovement(motion.x,newY,motion.z);


            var enemies = this.level().getEntitiesOfClass(
                    aircraft.entity.Enemy.class,
                    this.getBoundingBox().inflate(radius)
            );

            if(!enemies.isEmpty()) {
                explode();
            }
        }
    }

    private void explode() {
        this.level().explode(
                this,
                this.getX(),
                this.getY(),
                this.getZ(),
                3.0f,
                Level.ExplosionInteraction.MOB
        );

        this.discard();
    }

    @Override
    public boolean isNoGravity() {
        return true;
    }
}
