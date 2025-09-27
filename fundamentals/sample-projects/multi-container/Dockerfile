
# Build
FROM eclipse-temurin:21-jdk As build

WORKDIR /app

COPY gradlew .
COPY gradle gradle
COPY build.gradle settings.gradle ./

RUN ./gradlew dependencies --no-daemon || return 0

COPY src src

RUN ./gradlew bootJar --no-daemon


# Run
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /app/build/libs/*SNAPSHOT.jar app.jar

CMD [ "java","-jar","app.jar" ]