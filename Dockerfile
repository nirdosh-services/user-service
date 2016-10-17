FROM java

COPY target/devotee-service.jar /

EXPOSE 8080

CMD ["java","-jar","devotee-service.jar"]