FROM andresribera/mcr.microsoft.comopenjdkjdk17-ubuntu_base as base

EXPOSE  8080

ADD target/spring-boot-docker.jar spring-boot-docker.jar

ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]
