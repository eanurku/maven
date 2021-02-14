1. Run Unit Tests:
# Run all the unit test classes.
* mvn test

# Run a single test class.
* mvn -Dtest=TestApp1 test

# Run multiple test classes.
* mvn -Dtest=TestApp1,TestApp2 test

# Run a single test method from a test class.
* mvn -Dtest=TestApp1#methodname test

# Run all test methods that match pattern 'testHello*' from a test class.
* mvn -Dtest=TestApp1#testHello* test

# Run all test methods match pattern 'testHello*' and 'testMagic*' from a test class.
* mvn -Dtest=TestApp1#testHello*+testMagic* test

2. maven-surefire-plugin 

3.skip tests

* mvn package -Dmaven.test.skip=true

* or add below property to exclude tests during running " mvn package "

    * <properties>
      * <maven.test.skip>true</maven.test.skip>
    * </properties>

* use this -DskipTests in surefire plugin.
  * mvn package -DskipTests 
  
* or update below config properties of surefire plugin:

 * <plugin>
 * <groupId>org.apache.maven.plugins</groupId>
 * <artifactId>maven-surefire-plugin</artifactId>
 * <version>3.0.0-M1</version>
 * <configuration>
 * <skipTests>true</skipTests>
 * </configuration>
 * </plugin>
 
*Create a custom profile to skip the unit test:

    * <profiles>
    *  <profile>
    *   <id>xtest</id>
    *   <properties>
    *      <maven.test.skip>true</maven.test.skip>
    *   </properties>
    *  </profile>
    * </profiles>
    
    * now run below command woith profile:
    *  mvn package -Pxtest
 