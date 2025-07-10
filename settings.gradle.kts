pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "quest"
include(":app")
include(":time")
include(":time:api")
include(":time:impl")
include(":serialization")
include(":network")
include(":analytics")
include(":analytics:event")
include(":analytics:tracking")
include(":logging")
include(":config")
include(":config:api")
include(":config:impl")
include(":lifecycle")
include(":lifecycle:callback")
include(":lifecycle:module")
include(":share")
include(":share:impl")
include(":share:api")
include(":share:usecase")
include(":post")
include(":post:ui")
include(":post:impl")
include(":post:api")
include(":theme")
