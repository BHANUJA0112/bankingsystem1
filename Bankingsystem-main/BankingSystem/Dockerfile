# Use OpenJDK 17 slim as the base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built jar file from Maven target folder into the image
COPY target/BankingSystem-1.0-SNAPSHOT.jar app.jar

# Expose the port your app will run on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
