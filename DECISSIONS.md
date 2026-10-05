# Decisions

## 1. Build tool
**Date:** 2026-09-29
**Chose:** Maven
**Alternative:** Gradle
**Why:** Maven is the most common choice in Swedish Java jobs, and most Spring guides use it. pom.xml is also easy to read for beginners.

## 2. Database
**Date:** 2026-10-05
**Chose:** PostgreSQL
**Alternative:** MariaDB
**Why:** M3 and M5 require searching the database. PostgreSQL has built-in full-text search, and the pgvector extension supports semantic search with embeddings.

## 3. Database port
**Date:** 2026-10-05
**Chose:** 5433
**Alternative:** Stop the local PostgreSQL and use the default port 5432
**Why:** Port 5432 is already used by my local PostgreSQL 18, which I use for courses. Using 5433 lets both run at the same time.

## 4. Tables created automatically
**Date:** 2026-10-05
**Chose:** Let Spring create tables via `ddl-auto=update`
**Alternative:** Create tables manually with SQL
**Why:** Simpler and faster during development, since tables follow the Java classes. Can be replaced with migrations (Flyway) later.

## 5. Store data in a volume
**Date:** 2026-10-05
**Chose:** A named Docker volume (`db-data`)
**Alternative:** Store data directly in the container
**Why:** Data becomes independent of the container. If the container is removed, a new one can attach to the same volume and continue with the same data. Note: the volume is not a backup – `docker compose down -v` deletes it.