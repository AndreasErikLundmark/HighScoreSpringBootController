# High Score backend web service

HTTP request handling for a high score list to be used in any application, possibly a game. 

RESTful controller Spring Boot application:

CRUD operations (Create, Read, Update, Delete) 

findAll High score list..
<h4>@RestController</h4>
<h4>@RequestMapping("/highscore")</h4>

add High score
<h4> @PostMapping("/{name}/{score}")</h4>

remove High score
<h4> @DeleteMapping("/{name}")</h4>

Update High score
<h4>@PutMapping("/{name}/{score}")</h4>

clear High score list
<h4> @DeleteMapping("/clear")</h4>


Run HighScoreApplication.java to start application

High score list is also stored in "highscores.json" via filewriter class

  
