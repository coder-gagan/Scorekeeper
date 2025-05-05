**scorekeeper**
Based on Spring boot and built using Gradle, this app is a microservice belonging to this CQRS-based system for managing League tables.
Within the overall system, this service is responsible for accepting score events (i.e. accepting COMMANDS). 
Based on configuration, it can either be a producer (publishing score events) to a kafka topic OR can directly process the latest state and persist it in MongoDB. 


**Endpoints**
POST /score
This endpoint accepts score events and processes them (either as a kafka producer or by processing it to directly persist the latest state).

GET /ping
Healthcheck endpoint.


**Application Context Diagram**


**Integrations**
This app integrates with the following services:
- Kafka (eventstore): as a producer for producing table update events
- MongoDB: for persisting league tables


**Setup**
Build the project using Gradle:
> gradle build

Start Docker locally before proceeding to next step.

Start up all integrations by running the script file:
> ./start_services.sh

Run the Spring boot application!