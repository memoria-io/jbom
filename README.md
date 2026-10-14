[![Release](https://github.com/ismailmarmoush/java-bom/workflows/Release/badge.svg)](https://github.com/ismailmarmoush/java-bom/actions?query=workflow%3ARelease)
[![Version](https://img.shields.io/maven-central/v/com.marmoush/java-bom?label=Version&logo=apachemaven)](https://central.sonatype.com/artifact/com.marmoush/java-bom)
[![Last Update](https://img.shields.io/maven-central/last-update/com.marmoush/java-bom?label=Updated&logo=apachemaven)](https://central.sonatype.com/artifact/com.marmoush/java-bom)
[![License](https://img.shields.io/badge/License-Apache--2.0-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![Java](https://img.shields.io/badge/Java-26-orange?logo=openjdk)](https://openjdk.org/)


# java-bom

Bill of Materials for java based projects (edge)

## Usage

The java-bom is published to Github in order to use it you need to make sure to add the following in your POM

```xml

<repositories>
        <repository>
            <id>github</id>
            <name>GitHub Packages</name>
            <url>https://maven.pkg.github.com/ismailmarmoush/*</url>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
</repositories>
```

You can then proceed to use it as a parent POM or a BOM inside

As parent POM

```xml
<parent>
    <groupId>com.marmoush</groupId>
    <artifactId>java-bom</artifactId>
    <version>26.0.0</version>
</parent>
```


A BOM inside

```xml
<dependency>
    <groupId>com.marmoush</groupId>
    <artifactId>java-bom</artifactId>
    <version>26.0.0</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```
