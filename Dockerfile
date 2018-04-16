FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/api-0.0.1.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
EXPOSE 8080
USER 1001
