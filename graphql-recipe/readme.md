# graphql-recipe

## Description

This project is a Spring Boot application that uses GraphQL to manage and retrieve recipe data. It includes functionalities for handling Garmin and Strava run data, as well as runner information.

## Technologies Used

*   Java
*   Maven
*   Spring Boot
*   GraphQL
*   SQL

## Project Structure

The project is structured as follows:

*   `src/main/java/me/sathish/graphqlrecipe`: Contains the main application code.
    *   `common`: Contains common classes and interfaces.
    *   `garminruns`: Contains classes related to Garmin run data.
    *   `stravaruns`: Contains classes related to Strava run data.
    *   `runner`: Contains classes related to runner data.
    *   `web`: Contains controllers for REST and GraphQL endpoints.
    *   `runner`: Contains the `Runner` entity.
*   `src/main/resources`: Contains configuration files and GraphQL schema.
    *   `graphql`: Contains the GraphQL schema definition (`schema.graphqls`).
    *   `application.properties`: Contains the application properties.

## Setup Instructions

1.  **Prerequisites:**
    *   Java Development Kit (JDK) 17 or higher
    *   Maven
    *   A SQL database (e.g., MySQL, PostgreSQL)

2.  **Clone the repository:**

    ```bash
    git clone https://github.com/sathishjayapal/tech-recipes-boot3.git
    ```

3.  **Configure the database:**
    *   Pass these following values ${garmindb}, ${darmindb_user}, ${darmindb_password} as environment variables.

4.  **Build the project:**

    ```bash
    mvn clean install
    ```

5.  **Run the application:**

    ```bash
    mvn spring-boot:run
    ```

## Endpoints

*   **GraphQL Endpoint:** `/graphql`
*   **REST Endpoints:**
    *   `/garmin/runs`: Retrieves all Garmin runs.

## GraphQL Queries

Here are some example GraphQL queries:

*   **Get all runs:**

    ```graphql
    query {
      getAllRuns {
        id
        name
        distance
        runnerName
      }
    }
    ```

*   **Get Garmin runs:**

    ```graphql
    query {
      getGarminRuns {
        id
        name
        distance
        runnerUser {
          name
        }
      }
    }
    ```

## Contributing

Contributions are welcome! Please follow these steps:

1.  Fork the repository.
2.  Create a new branch for your feature or bug fix.
3.  Commit your changes.
4.  Push to the branch.
5.  Submit a pull request.

## License

MIT License