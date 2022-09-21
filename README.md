# spring-boot-docker
Dockerizing a Spring Boot Application

# create executable jar
$ mvn clean package

# start spring boot application
$ java -jar target/spring-boot-docker-1.0-SNAPSHOT.jar

# local url to hit
http://localhost:8081/sprint-boot-docker/messages

# dockerize the application, we first create a file named Dockerfile

# create an image from our Dockerfile, we have to run ‘docker build'
$ docker build --tag=message-server:latest .

# we're able to run the container from our image:
docker run -p8887:8081 message-server:latest

# This will start our application in Docker, and we can access it from the host machine at 
http://localhost:8887/messages
# Here it's important to define the port mapping, which maps a port on the host (8887) to the port inside Docker.
# (8081) This is the port we defined in the properties of the Spring Boot application.