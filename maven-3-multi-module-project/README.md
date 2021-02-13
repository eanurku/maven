1. create parent project:
  mvn archetype:generate -DgroupId=com.anurag -DartifactId=maven-3-multi-module-project -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

2.change packaging to pom in parent pom.xml
  <packaging>pom</packaging>
 
3.go to parent project folder and run below commands:
  mvn archetype:generate -DgroupId=com.anurag -DartifactId=sub-project-1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
  mvn archetype:generate -DgroupId=com.anurag -DartifactId=sub-project-2 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
  mvn archetype:generate -DgroupId=com.anurag -DartifactId=sub-project-3 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
  
4. adding common module as dependency in another module who are going to use it like:
  * <!--adding dependency on another module in project-->
   *  <dependency>
     * <groupId>com.anurag</groupId>
     * <artifactId>common-project</artifactId>
     * <version>1.0-SNAPSHOT</version>
     * <scope>compile</scope>
   * </dependency>