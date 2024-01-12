FROM public.ecr.aws/amazoncorretto/amazoncorretto:17 AS builder
ARG JAR_FILE=build/libs/gream-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} vt.jar
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=prod", "/vt.jar"]