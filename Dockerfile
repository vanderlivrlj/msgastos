FROM openjdk:17
VOLUME /tmp
COPY target/ms-gastos.jar msgastos.jar
ENTRYPOINT ["java","-jar","/msgatos.jar"]
