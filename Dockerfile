# --- Estágio 1: Build e Testes ---
# Usamos uma imagem que já vem com Maven e JDK 17
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copia o pom.xml e baixa as dependências (para cachear essa etapa)
COPY pom.xml .
# (Opcional: rodar 'mvn dependency:go-offline' aqui ajudaria no cache, mas vamos simplificar)

# Copia todo o código fonte
COPY src ./src

# Roda o build e os testes. Se algum teste falhar, o docker build para AQUI.
RUN mvn clean package

# --- Estágio 2: Imagem Final ---
# Usamos uma imagem JRE (apenas para rodar), mais leve
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copia o JAR gerado no estágio anterior (build)
COPY --from=build /app/target/*.jar app.jar

EXPOSE 7000

ENTRYPOINT ["java", "-jar", "app.jar"]