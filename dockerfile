FROM openjdk

WORKDIR /app

COPY build/libs/digital_nomad_backend-1.0.0-SRPINGBOOT3_REACT5.jar /app

CMD ["java","-jar","/app/digital_nomad_backend-1.0.0-SRPINGBOOT3_REACT5.jar"]
