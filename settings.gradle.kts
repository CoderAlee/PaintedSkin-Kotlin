// Gradle Plugin repository configuration
apply(from = "gradle/plugin.repositories.gradle.kts")

// Gradle Maven repository configuration
apply(from = "gradle/maven.repositories.gradle.kts")
// Project name
rootProject.name = "PaintedSkin"
include(":Launcher")
project(":Launcher").projectDir = File("app")
include(":Library:PaintedSkin")
