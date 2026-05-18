package com.nexus.optimizer;

import net.fabricmc.api.ClientModInitializer;
import com.nexus.optimizer.config.NexusConfig;

public class NexusOptimizerMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        NexusConfig.init();
        System.out.println("[NexusOptimizer] Mod inicializado!");
    }
}
