plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.orrery"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.orrery"
        minSdk = 34
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    // No code — resource-only WFF bundle
    buildFeatures {
        compose = false
        aidl = false
        buildConfig = false
        shaders = false
    }

    sourceSets {
        getByName("main") {
            java.setSrcDirs(emptyList<String>())
        }
    }
}
