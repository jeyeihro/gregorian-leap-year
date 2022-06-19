plugins {
    id("application")
    id("jacoco")
}

group = "com.github.jeyeihro.gregorian"
version = "1.0"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = org.gradle.api.JavaVersion.VERSION_17;
    targetCompatibility = org.gradle.api.JavaVersion.VERSION_17;
}

application {
    mainClass.set("com.github.jeyeihro.gregorian.Main")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testImplementation("org.mockito:mockito-core:4.6.1")
    testImplementation("org.mockito:mockito-junit-jupiter:4.6.1")
    testImplementation("org.mockito:mockito-inline:4.6.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

jacoco{
    toolVersion = "0.8.+"
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.test{
    finalizedBy(tasks.jacocoTestReport)
}

tasks.jacocoTestReport{
    dependsOn(tasks.test)
    reports {
        xml.required.set(false)
        csv.required.set(false)
        html.outputLocation.set(layout.buildDirectory.dir("jacocoHtml"))
    }
}