tasks.register("buildModMenuAndMoveJar") {
    dependsOn(":mod-menu:build")

    doLast {
        val jarFile = file("mod-menu/build/libs/modmenu-main.jar")
        val modsDir = file("mods")

        if (jarFile.exists()) {
            modsDir.mkdirs()
            jarFile.copyTo(modsDir.resolve(jarFile.name), overwrite = true)
            println("Moved modmenu-main.jar to mods/ directory")
        } else {
            println("modmenu-main.jar not found, ensure the build completed successfully")
        }
    }
}
