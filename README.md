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
    
