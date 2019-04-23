### BUILDER IMAGE ###
FROM maven:3-jdk-8-slim as builder

COPY solarvillage-model/pom.xml /build/solarvillage-model/
RUN mvn --file build/solarvillage-model/pom.xml --batch-mode dependency:go-offline
RUN mvn --file build/solarvillage-model/pom.xml --batch-mode install -DskipTests

COPY solarvillage-listener/pom.xml /build/solarvillage-listener/
RUN mvn --file build/solarvillage-listener/pom.xml --batch-mode dependency:go-offline
RUN mvn --file build/solarvillage-listener/pom.xml --batch-mode install -DskipTests

COPY solarvillage-kie/pom.xml /build/solarvillage-kie/
RUN mvn --file build/solarvillage-kie/pom.xml --batch-mode dependency:go-offline
RUN mvn --file build/solarvillage-kie/pom.xml --batch-mode install -DskipTests

COPY solarvillage-model/src /build/solarvillage-model/src/
RUN mvn --file build/solarvillage-model/pom.xml --batch-mode --offline install -DskipTests

COPY solarvillage-listener/src /build/solarvillage-listener/src/
RUN mvn --file build/solarvillage-listener/pom.xml --batch-mode --offline install -DskipTests

COPY solarvillage-kie/src /build/solarvillage-kie/src/
RUN mvn --file build/solarvillage-kie/pom.xml --batch-mode --offline install -DskipTests


### EXECUTABLE IMAGE ###
FROM registry.redhat.io/rhpam-7/rhpam73-kieserver-openshift

COPY --from=builder /root/.m2/repository /home/jboss/.m2/repository/

USER root
RUN chown jboss -R /home/jboss/.m2/repository
USER jboss

#RUN echo "batman=caaba233e7778bc95d0ad7e5c02640d0" >> /opt/eap/standalone/configuration/application-users.properties \
# && echo "batman=kie-server" >> /opt/eap/standalone/configuration/application-roles.properties

ENV KIE_SERVER_BYPASS_AUTH_USER=true
ENV KIE_ADMIN_USER=user KIE_ADMIN_PWD=password
ENV KIE_SERVER_CONTAINER_DEPLOYMENT=solarvillage=com.juliaaano:solarvillage-kie:1.1.0-SNAPSHOT
