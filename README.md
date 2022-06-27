# Spreddit

A reddit clone with features to create a user account, create a subreddit, make a post, upvote a post, downvote a post and write comments on post. 

**Technologies**: Angular, Spring Boot, MySQL

## Sample screenshots of Project

#### Home page
![home](https://github.com/Dev-Daljeet/Screenshots/blob/master/spreddit/home.PNG?raw=true)

#### Create a subreddit
![Create a subreddit](https://github.com/Dev-Daljeet/Screenshots/blob/master/spreddit/create-subreddit.PNG?raw=true)

#### Create a post
![Create a post](https://github.com/Dev-Daljeet/Screenshots/blob/master/spreddit/create-post.PNG?raw=true)

#### View post
![View post](https://github.com/Dev-Daljeet/Screenshots/blob/master/spreddit/view-post.PNG?raw=true)

#### User profile
![User profile](https://github.com/Dev-Daljeet/Screenshots/blob/master/spreddit/user-profile.PNG?raw=true)

## Installation and Setup Instructions 

**You need to run frontend (Angular) on port 4200 and Backend (Spring Boot) on port 8080. Moreover, you will need to configure mysql in application.properties and run MySQL instance on your machine.**

### Prerequisites (Requirements):

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)
- [npm](https://nodejs.org/en/)
- [Angular CLI](https://angular.io/cli)
- [MySQL](https://www.mysql.com/downloads/)

### Running the MySQL instance with MySQL workbench

1. Open MySQL workbench
2. Create a local instance with username and password
3. Set up the following fields with credentials in the application.properties file under src/main/resources:
```
spring.datasource.url=jdbc:mysql://localhost:{port}/spreddit?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
spring.datasource.username={your user name}
spring.datasource.password={your password}
```

### Running the backend of the application with IDE

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.devdaljeet.spreddit.SpredditApplication` class from your IDE (example - Eclipse).

* 	Clone the Git repository
```shell
$ git clone https://github.com/Dev-Daljeet/spreddit.git
```
* 	Open Eclipse
	* File -> Import -> Existing Maven Project -> Navigate to the folder where you have the project
	* Select the project
* 	Choose the Spring Boot Application file (search for @SpringBootApplication)
* 	Right Click on the file and Run as Sprint Boot Application

### Running the backend of the application with Maven

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
$ git clone https://github.com/Dev-Daljeet/spreddit.git
$ cd spreddit
$ mvn spring-boot:run
```

### Running the frontend of the application with IDE

Firstly, clone down this repository.  

```shell
$ git clone https://github.com/Dev-Daljeet/spreddit.git
$ cd spreddit
```

Then, execute the below commands.

##### Installation:

`npm install`   

##### To start a server:

`ng serve` or  `npm start` 

##### To visit the app:

Open `http://localhost:4200/` to view it in the browser  

# License
MIT License
Copyright (c) 2022 Daljeet Singh

Refer to **LICENSE** file for full information.