# MeetingSum

Meeting summarizer with a Java/Spring Boot backend and a Python AI service.
It extracts a summary, decisions and action items from meeting notes.

## Status
M0 – Skeleton. The Spring Boot app starts and responds on `/health`.
Database and AI service come in the next milestones.

## Requirements
- Java 21
- Maven is included via `mvnw`, no install needed

## Run locally
    git clone https://github.com/Hkakashi728/Summerizer-Elzbida-.git
    cd Summerizer-Elzbida-
    ./mvnw spring-boot:run

On Windows: `mvnw.cmd spring-boot:run`

Then open http://localhost:8080/health – you should see `{"status":"ok"}`