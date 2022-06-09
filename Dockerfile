 FROM openjdk:11
 EXPOSE 8088
 ADD target/docker-spring-boot.jar docker-spring-boot.jar
 ENTRYPOINT ["java","-jar","docker-spring-boot.jar"]