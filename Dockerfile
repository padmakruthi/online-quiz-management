# Base image with Tomcat 9 and Java 17
FROM tomcat:9.0-jdk17-corretto

# Remove default Tomcat webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy the pre-built WAR into webapps as ROOT so it opens directly at root URL or /Online_Quiz_Management
COPY Online_Quiz_Management.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
