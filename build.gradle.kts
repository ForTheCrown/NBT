plugins {
  id("java")
}

group = "net.forthecrown"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  compileOnly("org.jetbrains:annotations:20.1.0")
  testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

  implementation("it.unimi.dsi:fastutil:8.5.11")
}

tasks {
  test {
    useJUnitPlatform()
  }

  java {
    withSourcesJar()
  }
}