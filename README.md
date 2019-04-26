# Solar Village

Homework assignment lab on Red Hat Process Automation - RHPAM.

## Quick Start

```
docker-compose up --detach --force-recreate solarvillage
docker-compose run --rm mock
docker-compose logs --follow solarvillage
```

Check the following:
* http://localhost:18080/docs/
* http://localhost:18080/services/rest/server
* User: **user** | Password: **password**

#### End to end tests

Once the system is up and running (previous steps):

```
docker-compose run --rm postman
```

## Postman

It is possible to import the http requests into [Postman](https://www.getpostman.com/).

This way, you can manually run each of the HTTP requests.

Import the files from ./postman folder. Verify the collection(s) and select the "localhost" environment.

## Docker

Build the docker container from sources locally:

```
docker build --tag juliaaano/solarvillage:local .
```

Run the container:

```
docker run --rm --name solarvillage --detach --publish 18080:8080 juliaaano/solarvillage:local
docker logs --follow solarvillage
```

## Business Central

This is the 'manual' way to play with this project. Use Business Central interact with the business process.

> Tested with BC/KIE Server 7.3.0.GA, OpenJDK version 1.8.0_202 and Apache Maven 3.6.1.

#### Import project

Import the solarvillage-kie project from https://github.com/juliaaano/solarvillage.git

#### Install the dependencies

```
git clone https://github.com/juliaaano/solarvillage.git
mvn --file solarvillage-model/pom.xml clean install
mvn --file solarvillage-listener/pom.xml clean install
```

#### Run/setup mocks

Run the mockserver and setup the expectations for the electrical and structural government services.

```
docker-compose up --detach --force-recreate mockserver
docker-compose run --rm mock
```
