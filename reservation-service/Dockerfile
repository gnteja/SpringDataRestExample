FROM openjdk:8
ADD target/springdata-rest-0.0.1-SNAPSHOT.jar docker-spring-boot.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","docker-spring-boot.jar"]