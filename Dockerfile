FROM openjdk:11
COPY ./target/devops-calc-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "devops-calc-1.0-SNAPSHOT-jar-with-dependencies.jar"]