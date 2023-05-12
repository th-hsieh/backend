FROM openjdk

WORKDIR /app

COPY build/libs/digital_nomad_backend-0.0.1-SNAPSHOT.jar /app

CMD ["java","-jar","/app/digital_nomad_backend-0.0.1-SNAPSHOT.jar"]
