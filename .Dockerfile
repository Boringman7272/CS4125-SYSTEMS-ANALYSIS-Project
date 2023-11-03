# Use the official Maven image with a specified version
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory in the Docker container
WORKDIR /app

# Copy the pom.xml file and source code
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package

# Use the official OpenJDK image to create a lightweight image
FROM openjdk:17-jre-slim

# Set the working directory in the Docker container
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]