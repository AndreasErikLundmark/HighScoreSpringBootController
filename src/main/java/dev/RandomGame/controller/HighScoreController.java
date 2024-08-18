package dev.RandomGame.controller;

import dev.RandomGame.repository.HighScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.TreeMap;

@RestController
@RequestMapping("/highscore")
@CrossOrigin(origins = "*")
public class HighScoreController {

    private final HighScoreRepository repository;
    @Autowired
    public HighScoreController(HighScoreRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public TreeMap<String, Integer> findAll() {
        return repository.getHighScores();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/{name}/{score}")
    public void add(@PathVariable String name, @PathVariable int score) {
        repository.add(name, score);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{name}")
    public void remove(@PathVariable String name) {
        repository.remove(name);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{name}/{score}")
    public void update(@PathVariable String name, @PathVariable int score) {
        repository.update(name, score);
    }



}
