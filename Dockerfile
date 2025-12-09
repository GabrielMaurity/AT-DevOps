# Usa a imagem do Eclipse Temurin (substituto oficial e leve do OpenJDK)
FROM eclipse-temurin:17-jdk-alpine

# Define o diretório de trabalho
WORKDIR /app

# Copia o JAR. Certifique-se que o nome do arquivo aqui é igual ao da pasta target
COPY target/devcalc-api-1.0-SNAPSHOT.jar app.jar

# Expõe a porta
EXPOSE 7000

# Comando para rodar
ENTRYPOINT ["java", "-jar", "app.jar"]