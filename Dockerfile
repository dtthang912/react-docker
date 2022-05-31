FROM openjdk:8-jdk-alpine
WORKDIR '/app'
COPY target/microservice2-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","microservice2-0.0.1-SNAPSHOT.jar"]