# FROM gradle:7.6.1-jdk17-alpine AS build
# COPY --chown=gradle:gradle . /home/gradle/src
# WORKDIR /home/gradle/src
# RUN gradle bootJar

FROM openjdk:17
EXPOSE 8080
ADD build/libs/spring-aws-plain.jar spring-aws-plain.jar
ENTRYPOINT ["java","-jar","spring-aws-plain.jar"]

# FROM eclipse-temurin:17-jdk-alpine
# VOLUME /tmp
# RUN mkdir /app
# COPY --from=build /home/gradle/src/build/libs/*.jar /app/spring-boot-application.jar
# ENTRYPOINT ["java", "-jar", "/app/spring-boot-application.jar", "-Xmx", "1024m"]