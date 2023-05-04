FROM openjdk:8-jdk-alpine
COPY "./target/Prueba-0.0.0-SNAPCHOT.jar"
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]