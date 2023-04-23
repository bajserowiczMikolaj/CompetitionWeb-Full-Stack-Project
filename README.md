## Competition Management System
This project is a web application built with Spring Boot, MySQL, and React.js. It allows you to create competitions and sign up players for those competitions. All competitions are displayed on the main web page, and all information is stored in a MySQL database. The frontend communicates with the backend using APIs created on the backend site.

## Getting started
Prerequisites
To run this application, you need to have:

Java 
Node.js and npm installed on your machine
MySQL database

## Installing
Clone this repository to your local machine.
Open the competition-management-backend folder in your IDE of choice.
Edit the application.properties file to include your MySQL database information.
Run the backend application.
Open the competition-management-frontend folder in your terminal or command prompt.
Install the necessary dependencies by running npm install.
Start the frontend application by running npm start.

## Configuration
To configure the backend application, you need to edit the application.properties file. Here are the properties you can configure:

spring.datasource.url: The URL for your MySQL database.
spring.datasource.username: The username for your MySQL database.
spring.datasource.password: The password for your MySQL database.

To sign up players for a competition, click on the "sign in" button on competition card you want to sign up for. Click on the "Sign Up" button and fill in the necessary information, such as the player name, age,belt, weight division. you will recive conformation email after register is complete. 

## Built with
This project was built with:

Spring Boot
MySQL
React.js
