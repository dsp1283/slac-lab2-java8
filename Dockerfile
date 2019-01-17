FROM openjdk:8 
WORKDIR /app
COPY HelloWorld.java .
RUN javac HelloWorld.java
CMD java HelloWorld

