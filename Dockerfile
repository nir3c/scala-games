
FROM openjdk:8-jre-alpine
ADD target/scala-**/scala-games-** app.jar
ENTRYPOINT ["java","-jar","/app.jar"]