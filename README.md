# Java Test
## Summary

Your task is to create a RESTful API for a simple E-Wallet application

This repository contains starter applications ready for you to work on. Feel free to add any additional libraries you need.

## Project Starter

* Java version: 8 
* Spring version: 2.5.5
* Database: PostgreSQL (Any Version)
* Dependency List:
1. Spring Data JPA
	* Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
2. PostgreSQL Driver 
	* A JDBC and R2DBC driver that allows Java programs to connect to a PostgreSQL database using standard, database independent Java code.
3. Spring Web
	* Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
4. Lombok
	* Java annotation library which helps to reduce boilerplate code.

## Instructions

### Objective

Designing and implementing a simple E-Wallet.
Please use the following requirement and rule when working on the assessment.
Your assessment will be scored based on the key indicators stated in Assessment Aspects section.

The service will work as a backend API for the client application in a RESTful manner with JSON as the data format.

Develop the task with the mindset that it must be ready for production. 

### Requirements


1. Create User Registration Endpoint
	- register using data: no identity, name, date birth, username, password, phone number, balance and  Feel free to add any field you need.
	- when register done, set balance to 0
2. Create login endpoint
	- Login using username and password
	- response data: access_token (JWT token), refresh_token (JWT Token), expired in, and type token
	  Example:
	  ```
	  {
		  "access_token": "eyJjdHkiOiJBY2Nlc3NUb2tlbiIsImFsZyI6IkhTMjU2In0.eyJqdGkiOiJVRVZTVkVGTlNVNUJMVEV5Tnk0d0xqQXVNUT09IiwiZXhwIjoxNjMzMDc5NTY3LCJpYXQiOjE2MzMwNzU5Njd9.yqBRylsSm09CTm0NRRnbkYPu1wfxWDZHiOLlS7QtJEw",
		  "refresh_token": "eyJjdHkiOiJSZWZyZXNoVG9rZW4iLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJVRVZTVkVGTlNVNUJMVEV5Tnk0d0xqQXVNUT09IiwiZXhwIjoxNjMzMTYyMzY3LCJpYXQiOjE2MzMwNzU5Njd9.jwFu2BCWkWGcTR9XCyQL2ufVf9gnR0Nv1e_lSc118yE",
		  "token_type": "Bearer",
		  "expired_in": 3600000
	  }
   	  ```
3. Create refresh token endpoint
	- endpoint for Get new access_token using refresh_token in body request
	
4. Create get Balance user
   - endpoint for get Balance user
	
5. Create an endpoint to increase the deposit balance
	- endpoint for increase deposit balance
	- user detail get from Authentication
	- example body request
	```
	  {
	  		"amount":25000
	  }
   ```
6. Create payment endpoint to decrease the deposit balance
	- endpoint for decrease deposit balance for payment
	- user detail get from Authentication
	- example body request
   ```
	  {
	  		"amount":25000
	  }
     ```
additional value if implementing ACID in the payment process
https://en.wikipedia.org/wiki/ACID

## Submission

1. Fork this repository
2. Make some changes with proper commit logs
3. Make a Pull Request 

## Assessment Aspects

* Using the features of java programming (Optional, Lambda and Generic)
* Feature completeness
* Code cleanliness
* Quality assessment with unit test and or functional API test

Good luck.