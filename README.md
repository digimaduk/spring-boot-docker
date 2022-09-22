# spring-boot-docker
Dockerizing/Containerizing a Spring Boot Application
Docker helps you containerize your Java app — letting you bundle together your complete Spring application, runtime, configuration, and OS-level dependencies. 
This includes everything needed to ship a cross-platform, multi-architecture web application.

# create executable jar
$ mvn clean package

# start spring boot application
$ java -jar target/spring-boot-docker-1.0-SNAPSHOT.jar

# local url to hit
http://localhost:8081/sprint-boot-docker/messages

# dockerize the application, we first create a file named Dockerfile

# create an image from our Dockerfile, we have to run ‘docker build'
$ docker build --tag=message-server:latest .

# run Spring Boot Docker Container
docker run -p8887:8081 message-server:latest

# This will start our application in Docker, and we can access it from the host machine at 
http://localhost:8887/messages

# Here it's important to define the port mapping, which maps a port on the host (8887) to the port inside Docker.
# (8081) This is the port we defined in the properties of the Spring Boot application.

Docker Dashboard’s Stats tab lets you view CPU consumption, memory usage, disk read vs. write, and network use:

# Dockerize applications in a Composite
Docker provides a tool named Docker Compose to manage multiple containers
docker-compose.yml

# check our build-file for syntax-errors
$ docker-compose config

# build image, create the defined container, and start it in one command
$ docker-compose up --build

# stop the containers, remove them from Docker and remove the connected networks from it
$ docker-compose down

# scaling Services - tell Docker to run 2 containers for the message-server
$ docker-compose up -d --build --scale message-server=2

# check all container image
$ docker image list

# check running containers
$ docker ps -a

# Note: -port mapping 
- 8887:8081 container port: application port