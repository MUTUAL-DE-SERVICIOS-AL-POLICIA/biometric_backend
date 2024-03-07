FROM andresribera/mcr.microsoft.comopenjdkjdk17-ubuntu_base as base

EXPOSE  8080

ADD target/biometric-docker.jar biometric-docker.jar

ENTRYPOINT ["java","-jar","/biometric-docker.jar"]
