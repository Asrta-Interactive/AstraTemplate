group = Dependencies.group
version = Dependencies.version
plugins {
    java
    `maven-publish`
    `java-library`
    kotlin("jvm") version Dependencies.Kotlin.version apply false
    kotlin("plugin.serialization") version Dependencies.Kotlin.version apply false
    id("com.github.johnrengelman.shadow") version Dependencies.Kotlin.shadow apply false
    id("fabric-loom") version Dependencies.Fabric.fabricLoom apply false
    id("net.minecraftforge.gradle") apply false
}
