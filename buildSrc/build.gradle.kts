configurations {
    all {
        resolutionStrategy.cacheChangingModulesFor(1, TimeUnit.SECONDS)
    }
}

repositories {
    mavenLocal()
    maven("http://maven.wintruelife.com/nexus/content/repositories/public/") {
        isAllowInsecureProtocol = true
    }
    maven("https://maven.aliyun.com/repository/gradle-plugin/")
    maven("https://maven.aliyun.com/repository/public/")
    maven("https://s01.oss.sonatype.org/content/groups/public/")
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation("top.bettercode.summer:summer-plugin:0.0.19-SNAPSHOT")
}
