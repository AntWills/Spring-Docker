FROM eclipse-temurin:25.0.2_10-jre-noble

COPY target/docker-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java",  "-jar", "app.jar"]