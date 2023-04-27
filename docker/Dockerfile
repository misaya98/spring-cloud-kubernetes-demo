FROM openjdk:17
RUN mkdir /app
COPY spring-cloud-kubernetes-demo-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["/bin/sh", "-c","java -jar /app/app.jar"]
