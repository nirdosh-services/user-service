FROM java

COPY target/user-service.jar /

EXPOSE 8080

CMD ["java","-jar","user-service.jar"]