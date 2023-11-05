# CS4125-SYSTEMS-ANALYSIS-Project
Overview This repository hosts the collaborative work for the CS4125 Systems Analysis &amp; Design course project. The project involves applying Object-Oriented Analysis and Design (OOAD) principles using the Unified Modelling Language (UML) to model a software system.  

This is a simple guide on how to use Docker to set up and run this project.

## Prerequisites

Before proceeding, make sure you have Docker installed on your machine. If you do not have Docker installed, please follow the instructions on the [official Docker website](https://docs.docker.com/get-docker/) to get Docker running on your system.

## Starting the Application

To start the application, you need to use Docker Compose, which simplifies the process of running multi-container Docker applications.

1. Open a terminal or command prompt.
2. Navigate to the root directory of this project where the `docker-compose.yml` file is located.
3. Run the following command:

        docker compose up

run the following command to stop the application and remove the containters:
        docker-compose down

use the following to stop the application but not remove the containers:
        docker-compose stop

please note the first time you docker compose up it may take a while.

There shoulder be an ignored file called .env
the contents should look something similar to the following:
MY_CUSTOM_PATH=/home/crz/Projects/CS4125/Rental-system/CS4125-SYSTEMS-ANALYSIS-Project

please swap the path to the path to the root directory of your project and save.


