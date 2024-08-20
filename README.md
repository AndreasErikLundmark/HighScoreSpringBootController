[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>High Score Backend Web Service</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
        }
        h1, h2, h3 {
            color: #333;
        }
        code {
            background-color: #f4f4f4;
            padding: 2px 4px;
            border-radius: 4px;
        }
        .container {
            max-width: 800px;
            margin: auto;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>High Score Backend Web Service</h1>

        <p>This service handles HTTP requests for managing a high score list, suitable for use in applications such as games.</p>

        <h2>Overview</h2>
        <ul>
            <li><strong>Framework:</strong> Spring Boot</li>
            <li><strong>Architecture:</strong> RESTful API</li>
            <li><strong>Operations:</strong> Provides CRUD (Create, Read, Update, Delete) functionalities for high scores.</li>
        </ul>

        <h2>Endpoints</h2>

        <h3>1. Get All High Scores</h3>
        <ul>
            <li><strong>Method:</strong> <code>GET</code></li>
            <li><strong>Endpoint:</strong> <code>/highscore</code></li>
            <li><strong>Description:</strong> Retrieves the complete list of high scores.</li>
        </ul>

        <h3>2. Add a High Score</h3>
        <ul>
            <li><strong>Method:</strong> <code>POST</code></li>
            <li><strong>Endpoint:</strong> <code>/highscore/{name}/{score}</code></li>
            <li><strong>Description:</strong> Adds a new high score entry with the specified name and score.</li>
        </ul>

        <h3>3. Remove a High Score</h3>
        <ul>
            <li><strong>Method:</strong> <code>DELETE</code></li>
            <li><strong>Endpoint:</strong> <code>/highscore/{name}</code></li>
            <li><strong>Description:</strong> Removes the high score entry associated with the specified name.</li>
        </ul>

        <h3>4. Update a High Score</h3>
        <ul>
            <li><strong>Method:</strong> <code>PUT</code></li>
            <li><strong>Endpoint:</strong> <code>/highscore/{name}/{score}</code></li>
            <li><strong>Description:</strong> Updates the score for an existing entry identified by the name.</li>
        </ul>

        <h3>5. Clear All High Scores</h3>
        <ul>
            <li><strong>Method:</strong> <code>DELETE</code></li>
            <li><strong>Endpoint:</strong> <code>/highscore/clear</code></li>
            <li><strong>Description:</strong> Deletes all high score entries.</li>
        </ul>

        <h2>How to Run</h2>
        <ol>
            <li><strong>Step 1:</strong> Open the project directory.</li>
            <li><strong>Step 2:</strong> Run the <code>HighScoreApplication.java</code> file to start the application.</li>
        </ol>
        <p><strong>Data Persistence:</strong> The high score list is also stored in the <code>highscores.json</code> file, managed via the <code>FileWriter</code> class.</p>
    </div>
</body>
</html>
