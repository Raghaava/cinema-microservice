FROM openjdk:8
ADD ./movies-service/target/movies-service-0.0.1-SNAPSHOT.jar movies-service.jar
ADD ./movies-service/src/main/resources/application-test.yml application.yaml
EXPOSE 8083
ENTRYPOINT ["java","-jar","movies-service.jar","--spring.config.location=application.yaml"]