# Build
FROM adoptopenjdk/openjdk11-openj9:latest
WORKDIR /app
EXPOSE 80
EXPOSE 8080
ADD build/libs/virtualtour-0.0.1-SNAPSHOT.jar /app/virtualtour.jar

# Run
ENTRYPOINT ["java", "-jar", "/app/virtualtour.jar"]
