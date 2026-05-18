package com.nexus.optimizer.render;

import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;

import java.io.IOException;

public class TDBRShader {
    private static ShaderProgram shader;

    public static void loadShader() {
        try {
            Resource vertexResource = MinecraftClient.getInstance().getResourceManager()
                .getResource(new Identifier("nexus_optimizer:shaders/tile_based.vsh"));
            Resource fragmentResource = MinecraftClient.getInstance().getResourceManager()
                .getResource(new Identifier("nexus_optimizer:shaders/tile_based.fsh"));

            shader = new ShaderProgram(
                vertexResource.getInputStream(),
                fragmentResource.getInputStream()
            );
            shader.compile();
        } catch (IOException | NullPointerException e) {
            System.err.println("[NexusOptimizer] Falha ao carregar shader: " + e.getMessage());
        }
    }

    public static void bindShader() {
        if (shader != null) {
            shader.bind();
        }
    }
}
