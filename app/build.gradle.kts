plugins {
    alias(libs.plugins.android.application)

    //application des plugin gradle
    alias(libs.plugins.room)

}

android {
    namespace = "com.example.petitsoin10"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.petitsoin10"
        minSdk = 24
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

    //Configuration du plugin gradle de room
    room {
        schemaDirectory("$projectDir/schemas")
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //ajout des dépendances room
    implementation(libs.room.runtime)
    annotationProcessor(libs.room.compiler)

}