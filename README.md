[![Release](https://github.com/ismailmarmoush/java-bom/workflows/Release/badge.svg)](https://github.com/ismailmarmoush/java-bom/actions?query=workflow%3ARelease)
[![GitHub tag (latest by date)](https://img.shields.io/github/v/tag/ismailmarmoush/java-bom?label=Version&logo=github)](https://github.com/orgs/ismailmarmoush/packages?repo_name=java-bom)
[![GitHub commits since latest release (by date)](https://img.shields.io/github/commits-since/ismailmarmoush/java-bom/latest?logoColor=github)](https://github.com/ismailmarmoush/java-bom/commits/master)

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
