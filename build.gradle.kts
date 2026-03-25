import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.gradle.api.JavaVersion
import org.gradle.api.publish.maven.MavenPublication

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.binary.compatibility.validator)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.serialization)
    `maven-publish`
    signing
}

group = "com.extenre"

// Configuración de repositorios
repositories {
    google()
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.github.com/luiscupul04/jadb")
        credentials {
            username = project.findProperty("gpr.user") as? String ?: System.getenv("GITHUB_ACTOR")
            password = project.findProperty("gpr.key") as? String ?: System.getenv("GITHUB_TOKEN")
        }
    }
    maven {
        url = uri("https://maven.pkg.github.com/luiscupul04/ExtenRe-patcher")
        credentials {
            username = project.findProperty("gpr.user") as? String ?: System.getenv("GITHUB_ACTOR")
            password = project.findProperty("gpr.key") as? String ?: System.getenv("GITHUB_TOKEN")
        }
    }
    maven { url = uri("https://jitpack.io") }
}

kotlin {
    jvm {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_17
        }
    }

    androidTarget {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_17
        }
        publishLibraryVariants("release")
    }

    sourceSets {
        androidMain.dependencies {
            implementation(libs.core.ktx)
            implementation(libs.libsu.nio)
            implementation(libs.libsu.service)
        }

        commonMain.dependencies {
            implementation(libs.apksig)
            implementation(libs.apkzlib)
            implementation(libs.bcpkix.jdk18on)
            implementation(libs.guava)
            implementation(libs.jackson.module.kotlin)
            implementation(libs.jadb)
            implementation(libs.kotlin.reflect)
            implementation(libs.kotlinx.serialization.json)
            implementation(libs.extenre.patcher)
        }

        commonTest.dependencies {
            implementation(libs.kotlin.test.junit)
            implementation(libs.extenre.patcher)
        }
    }
}

configurations.all {
    resolutionStrategy.eachDependency {
        if (requested.group == "org.jetbrains.kotlin") {
            useVersion("2.3.10")
        }
    }
}

android {
    namespace = "com.extenre.library"
    compileSdk = 35
    buildToolsVersion = "35.0.0"
    defaultConfig {
        minSdk = 26
    }

    buildFeatures {
        aidl = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    // 👇 Bloque lint agregado
    lint {
        checkReleaseBuilds = false
        disable.add("KotlinMetadataVersion")
    }
}

java {
    targetCompatibility = JavaVersion.VERSION_17
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/LuisCupul04/ExtenRe-library")
            credentials {
                username = project.findProperty("gpr.user") as? String ?: System.getenv("GITHUB_ACTOR")
                password = project.findProperty("gpr.key") as? String ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }

    publications.all {
        if (this !is MavenPublication) return@all

        pom {
            name = "ExtenRe Library"
            licenses {
                license {
                    name = "GNU General Public License v3.0"
                    url = "https://www.gnu.org/licenses/gpl-3.0.en.html"
                }
            }
            scm {
                connection = "scm:git:git://github.com/LuisCupul04/ExtenRe-library.git"
                developerConnection = "scm:git:git@github.com:LuisCupul04/ExtenRe-library.git"
                url = "https://github.com/LuisCupul04/ExtenRe-library"
            }
        }
    }
}

signing {
    useGpgCmd()
    sign(publishing.publications)
}
