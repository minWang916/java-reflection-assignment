# Stage 1: Build the JAR file using Maven
FROM maven:amazoncorretto AS build
WORKDIR /app
COPY pom.xml ./
COPY src ./src
RUN mvn clean package

# Stage 2: Run the JAR file
FROM openjdk:24-slim-bullseye
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]