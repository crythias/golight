plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "org.gwy.golight"
    compileSdk = 36

    defaultConfig {
        applicationId = "org.gwy.golight"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)


    // Lifecycle + ViewModel support
    implementation(libs.lifecycle.viewmodel.ktx)


    // Navigation for Compose
    // implementation("androidx.navigation:navigation-compose:2.9.3")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.7")


    // Testing
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    testImplementation("junit:junit:4.13.2")

    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}