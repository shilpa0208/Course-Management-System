# Course-Management-System

Simple RESTful Web standalone application developed using Spring Boot.

## Technologies Used:
* Spring Boot
* Spring MVC
* Spring Data JPA
* RESTful Web Services
* Apache Derby
* Maven

## Description
The Course Management System consists of a set of Topics which offer specific courses. The entities are Topic and Course. Each topic can have multiple courses under it. This is realised using Spring Data JPA to map to the database. HTTP methods used to access the end points specifies what we do with the resource that is accessed. A set of URI's are mapped with the controller which expose the end points.

The API exposes the end points using the following URI's:
* Topic API
  - GET      -    /topics                     -   Gets all the topics
  - GET      -    /topics/id                  -   Gets a particular topic with the given id
  - POST     -    /topics                     -   Creates a new topic
  - PUT      -    /topics/id                  -   Updates the topic
  - DELETE   -    /topics/id                  -   Deletes a particular topic with the gven id
  
* Course API
  - GET      -    /topics/topicId/courses     -   Gets all the courses for a given topic
  - GET      -    /topics/topicId/courses/id  -   Gets a particular course with the given id
  - POST     -    /topics/topicId/courses     -   Creates a new courses under the given topic
  - PUT      -    /topics/topicId/courses/id  -   Updates the given course
  - DELETE   -    /topics/topicId/courses/id  -   Deletes a particular courses with the given id

