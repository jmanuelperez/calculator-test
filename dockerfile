# we are extending everything from tomcat:8.0 image ...
FROM tomcat:8.5
MAINTAINER Manuuuu
# COPY path-to-your-application-war path-to-webapps-in-docker-tomcat
COPY target/DockerTest.war /usr/local/tomcat/webapps/