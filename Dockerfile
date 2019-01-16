FROM openjdk:8-alpine

WORKDIR /app

COPY Sample.java .

RUN javac ./Sample.java

CMD java Sample
