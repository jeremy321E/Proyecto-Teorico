plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("com.google.gms.google-services")
    //id ("dagger.hilt.android.plugin")
    id ("kotlin-kapt")
    kotlin("kapt")
    id  ("kotlin-parcelize")
    id ("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "app.kotlin.appproductos"
    compileSdk = 35

    defaultConfig {
        applicationId = "app.kotlin.appproductos"
        minSdk = 27
        targetSdk = 35
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
    viewBinding{
        enable = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    implementation(libs.firebase.database.ktx)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    // Firebase BOM (para manejar versiones automáticamente)
    implementation(platform("com.google.firebase:firebase-bom:32.7.0"))

    // Firebase Authentication
    implementation("com.google.firebase:firebase-auth-ktx")

    implementation ("com.google.android.gms:play-services-auth:20.4.0")


    implementation(libs.android.view.model)

    //implementation ("com.google.dagger:hilt-android:2.48.1")
    //kapt ("com.google.dagger:hilt-compiler:2.48.1")

    implementation(libs.fragment.navigation)
    implementation(libs.fragment.navigationui)
    implementation(libs.fragment.navigationktx)
    implementation ("com.airbnb.android:lottie:6.2.0")
}