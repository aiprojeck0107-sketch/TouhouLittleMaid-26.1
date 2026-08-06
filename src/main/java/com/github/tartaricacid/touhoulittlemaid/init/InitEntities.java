package com.github.tartaricacid.touhoulittlemaid.init;

import com.github.tartaricacid.touhoulittlemaid.TouhouLittleMaid;
import com.github.tartaricacid.touhoulittlemaid.entity.chatbubble.ChatBubbleRegister;
import com.github.tartaricacid.touhoulittlemaid.entity.item.*;
import com.github.tartaricacid.touhoulittlemaid.entity.monster.EntityFairy;
import com.github.tartaricacid.touhoulittlemaid.entity.passive.EntityMaid;
import com.github.tartaricacid.touhoulittlemaid.entity.projectile.EntityDanmaku;
import com.github.tartaricacid.touhoulittlemaid.entity.projectile.EntityThrowPowerPoint;
import com.github.tartaricacid.touhoulittlemaid.entity.projectile.MaidFishingHook;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;

public final class InitEntities {
    public static EntityType<EntityMaid> MAID;
    public static EntityType<EntityFairy> FAIRY;
    public static EntityType<EntityChair> CHAIR;
    public static EntityType<EntityBroom> BROOM;
    public static EntityType<EntityBox> BOX;
    public static EntityType<EntitySit> SIT;
    public static EntityType<EntityTombstone> TOMBSTONE;
    public static EntityType<MaidFishingHook> FISHING_HOOK;
    public static EntityType<EntityDanmaku> DANMAKU;
    public static EntityType<EntityExtinguishingAgent> EXTINGUISHING_AGENT;
    public static EntityType<EntityPowerPoint> POWER_POINT;
    public static EntityType<EntityThrowPowerPoint> THROW_POWER_POINT;

    public static EntityDataSerializer<?> MAID_CHAT_BUBBLE_DATA_SERIALIZERS;

    public static void registerAll() {
        MAID = register("maid", EntityMaid.TYPE);
        FAIRY = register("fairy", EntityFairy.TYPE);
        CHAIR = register("chair", EntityChair.TYPE);
        BROOM = register("broom", EntityBroom.TYPE);
        BOX = register("box", EntityBox.TYPE);
        SIT = register("sit", EntitySit.TYPE);
        TOMBSTONE = register("tombstone", EntityTombstone.TYPE);
        FISHING_HOOK = register("fishing_hook", MaidFishingHook.TYPE);
        DANMAKU = register("danmaku", EntityDanmaku.TYPE);
        EXTINGUISHING_AGENT = register("extinguishing_agent", EntityExtinguishingAgent.TYPE);
        POWER_POINT = register("power_point", EntityPowerPoint.TYPE);
        THROW_POWER_POINT = register("throw_power_point", EntityThrowPowerPoint.TYPE);

        MAID_CHAT_BUBBLE_DATA_SERIALIZERS = Registry.register(Registries.ENTITY_DATA_SERIALIZERS, new ResourceLocation(TouhouLittleMaid.MOD_ID, "maid_chat_bubble"), ChatBubbleRegister.INSTANCE);

        // Register spawn placements
        try {
            SpawnPlacements.register(FAIRY, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityFairy::checkFairySpawnRules);
        } catch (Throwable ignored) {
            // Some environments may require different spawn registration timing; keep safe.
        }
    }

    private static <T extends Entity> EntityType<T> register(String id, EntityType<T> type) {
        return Registry.register(Registries.ENTITY_TYPE, new ResourceLocation(TouhouLittleMaid.MOD_ID, id), type);
    }
}
