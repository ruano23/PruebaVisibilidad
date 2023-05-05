FROM adoptopenjdk/openjdk11
EXPOSE 8080
ARG JAR_FILE=target/Prueba-1.jar
WORKDIR /opt/app
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]