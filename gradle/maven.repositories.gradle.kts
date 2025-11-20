dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // Tinnove Nexus repository - Releases
        maven {
            isAllowInsecureProtocol = true
            url = uri("http://10.1.120.33:8082/nexus/content/repositories/releases/")
            credentials {
                username = "wtcl_user"
                password = "WTCL@com*963."
            }
        }
        // Tinnove Nexus repository - Snapshots
        maven {
            isAllowInsecureProtocol = true
            url = uri("http://10.1.120.33:8082/nexus/content/repositories/snapshots/")
            credentials {
                username = "wtcl_user"
                password = "WTCL@com*963."
            }
        }
    }
}
