FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY target/${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

#
# docker build -t docker.io/song1206/consumer:v1 --build-arg JAR_FILE=spring-cloud-alibaba-consumer-1.0.0-SNAPSHOT.jar .
