# MATCH BIOMETRICO

microservicios de match biometrico

## Requirements

* Java Jdk 17
* Maven
* docker

## Install

* limpiar y empaquetar el proyecto jar

```sh
mvn clean package
```

* Construir la imagen del proyecto

```sh
docker build -t match_service
```
* Desplegar el contenedor del proyecto

```sh
docker run -d --rm -p 8080:8080 --name match_service -v /{directorio de la aplicación}/:/app match_service
```


