dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-jdbc")
    implementation("mysql:mysql-connector-java")
    implementation("com.alibaba:druid-spring-boot-starter")
    implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter")
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-seata")
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-discovery")
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-config")
    implementation(project(":tools:integrated-common"))
}
