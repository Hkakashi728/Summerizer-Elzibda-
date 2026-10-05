# MeetingSum

Meeting summarizer with a Java/Spring Boot backend and a Python AI service.
It extracts a summary, decisions and action items from meeting notes.


## Progress
- [x] M0 – Skeleton (Spring Boot + `/health`)
- [ ] M1 – Database (in progress)
- [ ] M2 – AI service
- [ ] M3 – Login, upload, search
- [ ] M4 – Deployment

## Requirements
- Java 21
- Maven is included via `mvnw`, no install needed
- Docker Desktrop (running)

## Run locally
    git clone https://github.com/Hkakashi728/Summerizer-Elzbida-.git
    cd Summerizer-Elzbida-
    docker compose up -d
    ./mvnw spring-boot:run
    

On Windows: `.\mvnw.cmd spring-boot:run`

Then open http://localhost:8080/health – you should see `{"status":"ok"}`

## Notice
The database runs on port 5433 not default 5432, because it is occupied by a locally installed postgresSQL