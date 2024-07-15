FROM amazoncorretto:17
COPY build/libs/cronjob-0.0.1-SNAPSHOT.jar app.jar
RUN yum install shadow-utils.x86_64 -y
RUN groupadd -g 61000 javauser
RUN useradd -g 61000 -l -m -s /bin/false -u 61000 javauser
USER javauser
ENTRYPOINT ["java", "-jar", "/app.jar"]