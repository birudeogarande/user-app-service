FROM openjdk:21

WORKDIR /app

COPY /target/user-app-service.jar /app/

EXPOSE 9191

CMD [ "java", "-jar", "user-app-service.jar" ]