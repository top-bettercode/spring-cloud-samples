pluginManagement {
    repositories {
        mavenLocal()
        maven("https://maven.aliyun.com/repository/gradle-plugin/")
        gradlePluginPortal()
        mavenCentral()
    }
}



include(":service:integrated-gateway")
include(":service:integrated-account")
include(":service:integrated-order")
include(":service:integrated-praise-consumer")
include(":service:integrated-praise-provider")
include(":service:integrated-storage")
include(":service:seata-server")

include(":tools:integrated-frontend")
include(":tools:test")


