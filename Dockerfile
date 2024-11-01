ENTRYPOINT ["java", "-jar", "/app/myapp.jar"]
FROM openjdk:17-alpine-bash
COPY /target/*.jar /app/app.jar
COPY ./entrypoint.sh /entrypoint.sh
RUN ["chmod" ,"+x","/entrypoint.sh"]
ENTRYPOINT ["/entrypoint.sh"]
EXPOSE 8080
