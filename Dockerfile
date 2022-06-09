 FROM openjdk:11
 EXPOSE 8088
 ADD target/docker-spring-boot docker-spring-boot
 ENTRYPOINT ["java","-jar","docker-spring-boot"]