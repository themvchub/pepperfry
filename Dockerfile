FROM openjdk:8
ADD target/pepperfry.jar pepperfry.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar", "pepperfry.jar"]

