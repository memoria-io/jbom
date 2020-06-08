FROM memoriaio/java-docker:latest
ADD . /jbom
WORKDIR /jbom
RUN ls
RUN export JAVA_HOME=/sources/jdk14 \
    && export MAVEN_HOME=/sources/maven/bin \
    && export PATH=$PATH:$MAVEN_HOME:$JAVA_HOME/bin \
    && echo $PATH \
    && mvn --version \
    && java --version \
    && mvn install
WORKDIR /
