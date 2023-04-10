[![Release](https://github.com/memoria-io/jbom/workflows/Release/badge.svg)](https://github.com/memoria-io/jbom/actions?query=workflow%3ARelease)
[![GitHub tag (latest by date)](https://img.shields.io/github/v/tag/memoria-io/jbom?label=Version&logo=github)](https://github.com/orgs/memoria-io/packages?repo_name=jbom)
[![GitHub commits since latest release (by date)](https://img.shields.io/github/commits-since/memoria-io/jbom/latest?logoColor=github)](https://github.com/memoria-io/jbom/commits/master)

# jbom

Bill of Materials for opensource projects (edge)

## Usage

The jbom is published to Github in order to use it you need to make sure to add the following in your POM

```xml

<repositories>
        <repository>
            <id>github</id>
            <name>GitHub Packages</name>
            <url>https://maven.pkg.github.com/memoria-io/*</url>
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
    <groupId>io.memoria</groupId>
    <artifactId>jbom</artifactId>
    <version>20.1.0</version>
</parent>
```


A BOM inside

```xml
<dependency>
    <groupId>io.memoria</groupId>
    <artifactId>jbom</artifactId>
    <version>20.1.0</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```
