# Solar Village

Homework assignment lab on Red Hat Process Automation - RHPAM.

## Quick Start

```
docker-compose up --detach --force-recreate solarvillage
docker-compose logs -f solarvillage
```

Check the following:
* http://localhost:18080/docs/
* http://localhost:18080/services/rest/server

### End to end tests

With the system up and running:

```
docker-compose run --rm postman
```
