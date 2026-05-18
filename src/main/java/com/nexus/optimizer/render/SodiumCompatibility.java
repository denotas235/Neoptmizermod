package com.nexus.optimizer.render;

import me.jellysquid.mods.sodium.client.render.SodiumWorldRenderer;
import net.minecraft.client.MinecraftClient;

public class SodiumCompatibility {
    public static void hookIntoSodium() {
        try {
            SodiumWorldRenderer renderer = (SodiumWorldRenderer) MinecraftClient.getInstance().worldRenderer;
            System.out.println("[NexusOptimizer] Sodium detectado! Integração ativa.");
        } catch (ClassCastException e) {
            System.err.println("[NexusOptimizer] Sodium não encontrado. Usando renderização padrão.");
        }
    }
}
