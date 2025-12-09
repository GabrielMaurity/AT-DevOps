# --- Estágio 1: Build e Testes ---
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
# Compila o projeto
RUN mvn clean package

# --- Estágio 2: Imagem Final ---
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# CORREÇÃO AQUI: Pegamos o arquivo pelo nome exato, evitando pegar o "original-..." sem querer
COPY --from=build /app/target/devcalc-api-1.0-SNAPSHOT.jar app.jar

EXPOSE 7000
ENTRYPOINT ["java", "-jar", "app.jar"]