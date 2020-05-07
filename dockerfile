FROM gradle:6.3.0-jdk8

RUN gradle build

FROM openjdk:8-jre-slim

ARG WAR_FILE=build/libs/*.war

COPY ${WAR_FILE} app.war

ENTRYPOINT ["java", "-jar", "/app.war"]