dependencies {
    implementation("mysql:mysql-connector-java")
    implementation("com.alibaba:druid-spring-boot-starter")

    implementation("top.bettercode.summer:data-jpa")

    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-seata")
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-discovery")
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign")
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-config")
    implementation("org.springframework.cloud:spring-cloud-starter-loadbalancer")
}
