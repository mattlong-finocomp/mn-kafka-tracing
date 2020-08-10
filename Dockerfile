FROM openjdk:14-alpine
COPY build/libs/mn-kafka-tracing-*-all.jar mn-kafka-tracing.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "mn-kafka-tracing.jar"]