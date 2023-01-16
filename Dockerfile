FROM openjdk:17-oracle
MAINTAINER MSV
EXPOSE 8080
COPY ./build/libs/operacao-servico-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","app.jar"]