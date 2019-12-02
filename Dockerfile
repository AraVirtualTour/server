# Build
FROM adoptopenjdk/openjdk11-openj9:latest
WORKDIR /app
EXPOSE 8080
ADD build/libs/virtualtour-0.1.0.jar /app/virtualtour-0.1.0.jar

# Run
ENTRYPOINT ["java", "-jar", "/app/virtualtour-0.1.0.jar"]
