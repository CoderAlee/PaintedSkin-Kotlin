import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "org.arron.demo.skin"
    compileSdk {
        version =
            release(
                libs.versions.compileSdkVersion
                    .get()
                    .toInt(),
            )
    }

    defaultConfig {
        applicationId = "org.arron.demo.skin.launcher"
        minSdk =
            libs.versions.minSdkVersion
                .get()
                .toInt()
        targetSdk =
            libs.versions.targetSdkVersion
                .get()
                .toInt()
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlin {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.google.android.material)
    implementation(libs.google.jetpack.appcompat)
    implementation(libs.google.jetpack.activity)
    implementation(libs.google.jetpack.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
