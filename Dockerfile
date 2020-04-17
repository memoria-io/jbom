FROM ismailmarmoush/java-docker:latest
COPY . /app
WORKDIR /app
CMD ["mvn", "install"]
