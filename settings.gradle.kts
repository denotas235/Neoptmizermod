pluginManagement {
    repositories {
        maven {
            name = "Fabric"
            url = uri("https://maven.fabricmc.net/")
        }
        maven {
            name = "SpongePowered"
            url = uri("https://repo.spongepowered.org/repository/maven-public/")
        }
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("net.fabricmc.fabric-loom-remap") version "1.3.2"
    }
}
rootProject.name = "NexusOptimizer"