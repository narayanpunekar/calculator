FROM frolvlad/alpine-java 
LABEL maintainer="Narayan Punekar"
LABEL description="This Dockerfile installs calculator Spring Boot"
COPY ./target/calculator-0.0.1-SNAPSHOT.jar calculator-app.jar  
ENTRYPOINT ["java", "-jar", "calculator-app.jar"] 
