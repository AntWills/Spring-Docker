FROM maven:4.0.0-rc-5-eclipse-temurin-25-noble AS build

WORKDIR /app
COPY . .
RUN ls -la
RUN mvn clean package -DskipTests

FROM eclipse-temurin:25.0.2_10-jre-noble

WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

ENTRYPOINT ["java",  "-jar", "app.jar"]