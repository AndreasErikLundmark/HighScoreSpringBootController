# High Score backend web service

HTTP request handling for a high score list to be used in any application, possibly a game. 

RESTful controller Spring Boot application:
CRUD operations (Create, Read, Update, Delete) 
<br>
findAll High score list..
<h4>@RestController</h4>
<h4>@RequestMapping("/highscore")</h4>
<br>
add High score
<h4> @PostMapping("/{name}/{score}")</h4>
<br>
remove High score
<h4> @DeleteMapping("/{name}")</h4>
<br>
Update High score
<h4>@PutMapping("/{name}/{score}")</h4>
<br>
clear High score list
<h4> @DeleteMapping("/clear")</h4>

<br>
Run HighScoreApplication.java to start application

High score list is also stored in "highscores.json" via filewriter class

  
