FROM amazoncorretto:17

ENV ACTIVE_PROFILE=dev

WORKDIR /app/
COPY target/*.jar /app/

EXPOSE 8080
CMD ["bash", "-c", "java -jar -Dspring.profiles.active=$ACTIVE_PROFILE app.jar"]
