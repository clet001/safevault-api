# SafeVault

SafeVault is a simple banking REST API built with Spring Boot, Spring Data JPA and PostgreSQL.

This project is being built in parts. Features are added step by step.

## Done so far

- Project setup (Maven, Spring Boot, PostgreSQL settings)
- Database tables: `User`, `Account`, `Transaction`
- Repositories to read and save them

## Coming next

- Errors and request/response classes
- Security (password hashing, JWT login)
- Banking logic (accounts, deposit, withdraw, transfer)
- API endpoints
- Tests

## How to run

1. Install Java and PostgreSQL. Create an empty database called `safevault`.
2. Copy `.env.example` to `.env` and fill in your database username and password.
3. Build the project:

```
./mvnw compile
```

(on Windows: `mvnw.cmd compile`)

Start it with `./mvnw spring-boot:run`. At this stage it only creates the tables in your database. There are no endpoints yet.
