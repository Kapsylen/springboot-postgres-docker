pringBoot-Postgresql-With-Docker-Compose
The Way of Dockerize a Spring Boot app with Postgresql db with Docker Compose.
You can find more informations by : https://medium.com/thefreshwrites/the-way-of-dockerize-a-spring-boot-and-mysql-application-with-docker-compose-de2fc03c6a42

To be able to start this app, first run docker-compose.yml. It will spin up a postgresql db in a docker container.
OR
docker run --name my-postgres -e POSTGRES_DB=my-postgres -e POSTGRES_USER=sa -e POSTGRES_PASSWORD=password -p 5432:5432 -d postgres