# 1️⃣ Imagem base com Java 21 (LTS)
FROM eclipse-temurin:21-jdk-alpine

# 2️⃣ Diretório de trabalho dentro do container
WORKDIR /app

# 3️⃣ Copia o JAR para dentro do container
COPY target/notificadorWeb-0.0.1-SNAPSHOT.jar app.jar

# 4️⃣ Porta usada pelo Spring Boot
EXPOSE 8080

# 5️⃣ Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
