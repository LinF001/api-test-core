# api-test-core
POC of the API Automation test to build as core lib

1. To compile and build the jar file `mvn clean install`
2. To run the sample test `mvn clean verify`
3. The jar will locate in `/target/api-test-core-1.0.0.jar`
4. You can import as like
```xml
<dependency>
    <groupId>com.cvs.digital</groupId>
    <artifactId>api-test-core</artifactId>
    <version>1.0.0</version>
</dependency>
```
4. To use it in the class
```java
import com.cvs.digital.ApiAutomation;
```