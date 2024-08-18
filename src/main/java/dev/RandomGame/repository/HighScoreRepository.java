package dev.RandomGame.repository;

import dev.RandomGame.model.HighScore;
import org.springframework.stereotype.Repository;

import java.util.TreeMap;
@Repository
public class HighScoreRepository {

    HighScore highScore;

    TreeMap<String, Integer> highScores = new TreeMap<>();

    public HighScoreRepository() {
        highScores.put("John", 100);
        highScores.put("Jane", 200);
        highScores.put("Andreas", 300);
        highScores.put("Maria", 40);
    }

    public void add(String name, int score) {
        highScores.put(name, score);
    }
    public void remove(String name) {
        highScores.remove(name);
    }

    public void update(String name, int score) {
        highScores.put(name, score);
    }

    public void clear() {
        highScores.clear();
    }
    public int getScore(String name) {
        return highScores.get(name);
    }

    public TreeMap<String, Integer> getHighScores() {
        return highScores;
    }

    @Override
    public String toString() {
        return "HighScoreRepository{" +
                "highScore=" + highScore +
                ", highScores=" + highScores +
                '}';
    }
}
