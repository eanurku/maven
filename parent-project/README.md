1. create parent project:
  mvn archetype:generate -DgroupId=com.anurag -DartifactId=parent-project

2.change packaging to pom in parent pom.xml
  <packaging>pom</packaging>
 
3.go to parent project folder and run below commands:
  mvn archetype:generate -DgroupId=com.anurag -DartifactId=sub-project-1
  mvn archetype:generate -DgroupId=com.anurag -DartifactId=sub-project-2
  mvn archetype:generate -DgroupId=com.anurag -DartifactId=sub-project-3
  
