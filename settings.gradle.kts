// TODO: Figure out why this causes problems.
rootProject.name = "extenre-library"

buildCache {
    local {
        isEnabled = "CI" !in System.getenv()
    }
}

pluginManagement {
    repositories {
        google()
        mavenCentral()
    }
}
