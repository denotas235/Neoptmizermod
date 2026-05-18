package com.nexus.optimizer.config;

import net.minecraft.client.option.SimpleOption;

public class NexusConfig {
    public static SimpleOption<Boolean> ENABLE_OCCLUSION_CULLING;
    public static SimpleOption<Boolean> FORCE_ASTC_TEXTURES;
    public static SimpleOption<Boolean> ENABLE_TDBR_SHADERS;
    public static SimpleOption<Integer> TILE_SIZE;

    public static void init() {
        ENABLE_OCCLUSION_CULLING = new SimpleOption<>(
            "nexus_optimizer.option.occlusion_culling",
            SimpleOption.emptyToolTip(),
            (optionText, value) -> value ? "ON" : "OFF",
            SimpleOption.ofBooleanValue(false)
        );

        FORCE_ASTC_TEXTURES = new SimpleOption<>(
            "nexus_optimizer.option.astc_textures",
            SimpleOption.emptyToolTip(),
            (optionText, value) -> value ? "ON" : "OFF",
            SimpleOption.ofBooleanValue(false)
        );

        ENABLE_TDBR_SHADERS = new SimpleOption<>(
            "nexus_optimizer.option.tdbm_shaders",
            SimpleOption.emptyToolTip(),
            (optionText, value) -> value ? "ON" : "OFF",
            SimpleOption.ofBooleanValue(false)
        );

        TILE_SIZE = new SimpleOption<>(
            "nexus_optimizer.option.tile_size",
            SimpleOption.emptyToolTip(),
            (optionText, value) -> String.valueOf(value),
            new SimpleOption.ValidatingIntValue(16, 32, 64)
        );
    }
}
