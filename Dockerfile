FROM openjdk:openjdk-jre-11-alpine-3.11
ARG target/cityjokes.war
COPY ${JAR_FILE} app.war

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-war","/app.war"]