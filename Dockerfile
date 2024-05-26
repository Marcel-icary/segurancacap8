FROM eclipse-temurin:21-alpine
VOLUME /tmp
EXPOSE 8080
# ARG JAR_FILE=target/segurancacap8-0.0.1-SNAPSHOT.jar
# ADD JAR_FILE app.jar
COPY target/segurancacap8-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]