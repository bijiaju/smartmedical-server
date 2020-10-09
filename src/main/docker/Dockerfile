FROM hub.c.163.com/r00txx/java8
MAINTAINER bee byq_work@163.com
VOLUME /home/bee
ADD docker_base-0.0.1-SNAPSHOT.jar app.jar
RUN touch /app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
