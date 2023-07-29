FROM openjdk:20
ARG JAR_FILE
ARG TEMPLATE
WORKDIR /work
RUN mkdir -p /work/template
COPY ${JAR_FILE} app.jar
COPY ${TEMPLATE} /work/template/template.txt
ENTRYPOINT [ "java","-jar","/app.jar" ]