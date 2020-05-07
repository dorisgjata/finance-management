# Finance Management App

### About
This is a personal finance management / buget app. The scope of this project is to learn docker, containers and all that fun stuff.

### Run the project
**Gradle** 
If you don't have docker, you can run the project using gradle ```./gradlew bootRun```. Check out the running app: ```localhost:8080/v1/expenses``` 

**Docker**
If you don't have docker, follow their installation [docs](https://docs.docker.com/engine/install/) and sign up for [dockerhub](https://hub.docker.com/). 
Build the image ```docker build -t username/finance-management . ```
Run the image ```docker run -p 8080:8080 username/finance-management``` and check out ```localhost:8080/v1/expenses``` 
