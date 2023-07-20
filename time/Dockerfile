FROM adoptopenjdk:8-jdk-hotspot
WORKDIR /app
COPY target/time-0.0.1-SNAPSHOT.jar /app
ENTRYPOINT ["java", "-jar", "time-0.0.1-SNAPSHOT.jar"]