repositories {
    jcenter()
}

plugins {
    application
    kotlin("jvm") version "1.3.0"
}

application {
    mainClassName = "main.MainKt"
}

dependencies {
    compile(kotlin("stdlib"))
}

