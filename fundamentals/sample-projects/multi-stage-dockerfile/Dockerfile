
# ========================
# 1) Build Stage
# ========================

FROM eclipse-temurin:21-jdk AS build

WORKDIR /usr/app

# Copy Gradle wrapper & build files first (for caching)
COPY gradlew .
COPY gradle gradle
COPY build.gradle settings.gradle ./

# Download dependencies (cached in Docker layer)
RUN ./gradlew dependencies --no-daemon || return 0

COPY src src

# Build the Spring Boot fat JAR
RUN ./gradlew bootJar --no-daemon



# ========================
# 2) Runtime Stage
# ========================

FROM eclipse-temurin:21-jre

WORKDIR /usr/app

# Copy the built jar from the build stage
COPY --from=build /usr/app/build/libs/*SNAPSHOT.jar app.jar

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]