FROM debian
COPY . /kubedemo
RUN apt-get update
RUN apt-get -y install openjdk-8-jdk ssh emacs
CMD ["java","-jar","/kubedemo/target/kubedemo-0.0.1-SNAPSHOT.jar"]