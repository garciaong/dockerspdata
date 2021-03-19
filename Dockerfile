FROM openjdk:8-jdk-alpine
##ENV CONTAINER_DIR=/
##WORKDIR ${CONTAINER_DIR}
ARG JAR_FILE=target/*SNAPSHOT.jar
COPY ${JAR_FILE} data.jar
#ADD ${JAR_FILE} data.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/data.jar"]