# gauge-mvn-archetype

One can initialize Gauge projects using several templates as described [here](http://getgauge.io/documentation/user/current/getting_started/creating_a_gauge_project.html). This repo contains the Maven archetypes for Gauge.

##Maven archetypes for Gauge
* gauge-archetype-java
* gauge-archetype-selenium

##To add a Maven Archetype for Gauge-Java

Step 1: Generate a maven archetype template with command
```
mvn archetype:generate -B -DarchetypeArtifactId=maven-archetype-archetype -DgroupId=com.thoughtworks.gauge.maven -DartifactId=[Your archetype artifact ID] -Dversion=[Your archetype version]
```
Naming convention for Gauge-Maven archetypes: 
```
Artifact ID: `gauge-archetype-[Name of archetype]`
Group ID: `com.thoughtworks.gauge.maven`
```

Step 2: Add the template files and metadata to archetype.

Step 3: Manually generate Maven Project with command
```
mvn archetype:generate -DarchetypeArtifactId=[Your archetype artifact ID] -DarchetypeGroupId=com.thoughtworks.gauge.maven -DarchetypeVersion=[Your archetype version]
```

Step 4: Add Integration tests using Maven Archetype plugin.
To run integration tests:
```
mvn clean install archetype:integration-test
```

Check this tutorial for detail on [how to create a Maven archetype](http://marosmars.weebly.com/blog/maven-archetype-tutorial).
