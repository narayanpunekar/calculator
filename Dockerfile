FROM frolvlad/alpine-java 
LABEL maintainer="Narayan Punekar"
LABEL description="This Dockerfile installs calculator Spring Boot"
COPY ./target/calculator-0.0.1-SNAPSHOT.jar calculatorone-app.jar  
ENTRYPOINT ["java", "-jar", "calculatorone-app.jar"] 
