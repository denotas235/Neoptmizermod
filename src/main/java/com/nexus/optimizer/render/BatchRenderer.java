package com.nexus.optimizer.render;

import net.minecraft.block.Block;
import net.minecraft.client.render.VertexConsumer;

import java.util.HashMap;
import java.util.Map;

public class BatchRenderer {
    private static final Map<Block, VertexConsumer> batchMap = new HashMap<>();

    public static void startBatch() {
        batchMap.clear();
    }

    public static void addToBatch(Block block, VertexConsumer consumer) {
        batchMap.computeIfAbsent(block, k -> {
            return new BatchVertexConsumer();
        });
    }

    public static void renderBatches() {
        batchMap.forEach((block, consumer) -> {
            // Renderizar todos os vertices agrupados
        });
    }
}
