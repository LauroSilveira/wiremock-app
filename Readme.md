# Wiremock-app

## About this project
* [About](#about)
* [Architecture](#Architecture)
* [Technologies](#Technologies)
* [How to run](#how-to-run)
* [Contributors](#contributors)

# About
This is a simple Wiremock server, used to mock requests.  
In my case I use to simulate another simple microservice.

# Architecture
Basically the main configuration is in the following directories:
* `src/main/resources/wiremock/__files`: contains the response of each request.
* `src/main/wirmeock/wiremock/mappings`: contains the files that do the mapping of each request and each file response. 


# Technologies
- Java 21
- Wiremock 3.6.0
- Slf4j

# How to Run
First compile and generate a jar:  
``` 
mvn package
```

After run the following command:
```
java -jar wiremock-app-1.0-SNAPSHOT.jar
```
By default, will be executed on port 8082.

## Contributors
[@LauroSilveira](https://github.com/LauroSilveira)
