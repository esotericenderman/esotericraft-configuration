pluginManagement {
    repositories {
        maven {
            name = "Fabric"
            setUrl("https://maven.fabricmc.net/")
        }
        gradlePluginPortal()
    }
}

rootProject.name = "minecraft-configuration"

include("mod-menu")
