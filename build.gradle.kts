group = "ru.otus"
version = "1.0.0"

plugins {
    kotlin("jvm") version "2.0.10"
    id("java-library")
    id("maven-publish")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["kotlin"])
            groupId = "ru.otus"
            artifactId = "redirect-core"
            version = "1.0.0"
        }
    }
}

kotlin {
    jvmToolchain(17)
}
