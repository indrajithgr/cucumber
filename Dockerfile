FROM amazoncorretto:17-alpine3.17-jdk
VOLUME /tmp
ARG JAR_FILE
COPY build/libs/cucumber-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080