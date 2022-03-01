FROM openjdk:11.0.12-jre-slim-buster
RUN mkdir /app
COPY /build/libs/*standalone.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]