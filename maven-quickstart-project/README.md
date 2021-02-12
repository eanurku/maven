1. create maven quickstart project:
   * mvn archetype:generate -DgroupId=com.anurag -DartifactId=maven-quickstart-project -DarchetypeartifactId=maven-archetype-quickstart -DinteractiveMode=false 

2. add compiler options:
   * <properties>
    * <maven.compiler.source>1.8</maven.compiler.source>
    * <maven.compiler.target>1.8</maven.compiler.target>
    * <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
   * </properties>
3. add runtime dependent jars in final created app jar
   * use maven-shade-plugin
4. make jar executable by adding Main class name
   * use maven-shade-plugin
5. test the app now:
   * java -cp target/maven-quickstart-project-1.0-SNAPSHOT.jar com.anurag.App 123456
   * java -jar target/maven-quickstart-project-1.0-SNAPSHOT.jar 123456