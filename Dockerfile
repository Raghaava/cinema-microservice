FROM openjdk:8
ADD ./movies-service/target/movies-service-0.0.1-SNAPSHOT.jar movies-service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","movies-service.jar"]
