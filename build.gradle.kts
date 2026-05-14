plugins {
    id("java-library")
    id("maven-publish")
}

group = "org.bytelyplay.brigadierHelpers"
version = "1.0.0-BETA"

repositories {
    mavenCentral()
    maven(uri("https://libraries.minecraft.net"))
}

dependencies {
    compileOnly("org.jetbrains:annotations:26.1.0")
    api("com.mojang:brigadier:1.0.18")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])

            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()
        }
    }
    repositories {
        mavenLocal()
    }
}
java {
    withSourcesJar()
    sourceCompatibility = JavaVersion.VERSION_25
}