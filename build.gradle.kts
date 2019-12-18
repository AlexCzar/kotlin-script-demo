plugins {
    kotlin("jvm") version "1.3.61"
    application
}

group = "io.czar"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
}

dependencies {
    api(kotlin("stdlib-jdk8"))
    api(kotlin("stdlib-jdk8"))
    api(kotlin("script-runtime"))
    runtimeOnly(kotlin("scripting-jsr223-embeddable"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }
}

application {
    mainClassName = "io.czar.kotlinscriptdemo.RunnerKt"
}
