pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Flights"
include(":app")
include(":network")
include(":common")
include(":domain")
include(":entities")
include(":features")
include(":data")
include(":features:account")
include(":features:flights")
