FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/projeto-base-javalin.jar projeto-base-javalin.jar

EXPOSE 80

ENTRYPOINT ["java", "-jar", "projeto-base-javalin.jar"]