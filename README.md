1. install maven
2. sudo apt policy maven
3. sudo apt install maven
4. mvn -version
5. maven installed location
    * ls -lsa /usr/share/maven
    * ls -lsa /etc/maven

6. maven commands:
    * Display the project dependencies:
        * mvn dependency:tree
    * run jetty server:
        * mvn jetty:run

7. -pl,-am
    * -pl ,--projects
    * -am,--also-make
        * ex:
            * mvn -pl <module> dependency:tree
            * mvn -pl -am <module> compile
            * mvn -pl <module> jetty:run

8. create maven quickstart project:
    * mvn archetype:generate -DgroupId=com.anurag -DartifactId=maven-quickstart-project -DarchetypeartifactId=maven-archetype-quickstart -DinteractiveMode=false

9. add compiler options:
    * <properties>
    * <maven.compiler.source>1.8</maven.compiler.source>
    * <maven.compiler.target>1.8</maven.compiler.target>
    * <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    * </properties>
10. add runtime dependent jars in final created app jar
     * use maven-shade-plugin
11. make jar executable by adding Main class name
     * use maven-shade-plugin
12. test the app now:
     * java -cp target/maven-quickstart-project-1.0-SNAPSHOT.jar com.anurag.App 123456
     * java -jar target/maven-quickstart-project-1.0-SNAPSHOT.jar 123456