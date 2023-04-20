FROM openjdk:20-slim
ARG JAR_NAME
ARG JAR_VERSION
COPY target/$JAR_NAME-$JAR_VERSION.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
