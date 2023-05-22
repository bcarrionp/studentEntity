FROM openjdk:8-jre-slim
WORKDIR /studentEntity
COPY target/*.war /studentEntity/studentEntity-0.0.1-SNAPSHOT.war
EXPOSE 9090
CMD java -XX:+UseContainerSupport -Xmx512m -Dserver.port=9090 -jar studentEntity-0.0.1-SNAPSHOT.war 
