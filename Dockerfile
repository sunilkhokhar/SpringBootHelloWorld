FROM openjdk:8-jre-alpine
COPY ./target/SpringBootHelloWorld-0.0.1-SNAPSHOT.jar /home/sunil/apps/
WORKDIR /home/saksham/apps/
CMD ["java", "-jar", "SpringBootHelloWorld-0.0.1-SNAPSHOT.jar","--server.port=8081"]
