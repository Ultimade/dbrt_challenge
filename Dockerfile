FROM openjdk:21-jdk-slim-bullseye
LABEL org.opencontainers.image.authors="Ultimade"
COPY target/dbrt_challenge-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8081