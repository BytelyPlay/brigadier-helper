plugins {
    id("java-library")
}

group = "org.bytelyplay.brigadierHelpers"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(uri("https://libraries.minecraft.net"))
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    compileOnly("org.jetbrains:annotations:26.0.2")
    api("com.mojang:brigadier:1.0.18")
}

tasks.test {
    useJUnitPlatform()
}