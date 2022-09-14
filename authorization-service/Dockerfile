FROM openjdk:18
EXPOSE 8081
ADD "target/auth-service.jar" "auth-service.jar"
ENTRYPOINT [ "java", "-jar", "/auth-service.jar" ]