[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)


# High Score Backend Web Service

This service handles HTTP requests for managing a high score list, suitable for use in applications such as games.

## Overview
- **Framework:** Spring Boot
- **Architecture:** RESTful API
- **Operations:** Provides CRUD (Create, Read, Update, Delete) functionalities for high scores.

## Endpoints

### 1. Get All High Scores
- **Method:** `GET`
- **Endpoint:** `/highscore`
- **Description:** Retrieves the complete list of high scores.

### 2. Add a High Score
- **Method:** `POST`
- **Endpoint:** `/highscore/{name}/{score}`
- **Description:** Adds a new high score entry with the specified name and score.

### 3. Remove a High Score
- **Method:** `DELETE`
- **Endpoint:** `/highscore/{name}`
- **Description:** Removes the high score entry associated with the specified name.

### 4. Update a High Score
- **Method:** `PUT`
- **Endpoint:** `/highscore/{name}/{score}`
- **Description:** Updates the score for an existing entry identified by the name.

### 5. Clear All High Scores
- **Method:** `DELETE`
- **Endpoint:** `/highscore/clear`
- **Description:** Deletes all high score entries.

## How to Run
1. **Step 1:** Open the project directory.
2. **Step 2:** Run the `HighScoreApplication.java` file to start the application.

**Data Persistence:** The high score list is also stored in the `highscores.json` file, managed via the `FileWriter` class.
