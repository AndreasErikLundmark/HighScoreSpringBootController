# High Score backend web service

HTTP request handling for a high score list to be used in any application, possibly a game. 

RESTful controller Spring Boot application:

CRUD operations (Create, Read, Update, Delete) 

findAll High score list..
@RestController
@RequestMapping("/highscore")

add High score
 @PostMapping("/{name}/{score}")

remove High score
 @DeleteMapping("/{name}")

Update High score
@PutMapping("/{name}/{score}")

clear High score list
 @DeleteMapping("/clear")


Run HighScoreApplication.java to start application

High score list is also stored in "highscores.json" via filewriter class

  
