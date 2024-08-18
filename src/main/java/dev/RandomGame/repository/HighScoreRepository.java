package dev.RandomGame.repository;

import dev.RandomGame.model.HighScore;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class HighScoreRepository {

    HighScore highScore;

    List<HighScore> highScores;

    public HighScoreRepository() {

        this.highScores = new ArrayList<>();
        add("John", 100);
        add("Jane", 200);
        add("Andreas", 300);

    }

    public void add(String name, int score) {
        HighScore highScore = new HighScore(name, score);
        highScores.add(highScore);
//        System.out.println("High Score added: " + highScore.toString());
    }

    public void remove(String name) {

        Iterator<HighScore> iterator = highScores.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            HighScore highScore = iterator.next();
            if (highScore.getName().equals(name)) {
                iterator.remove();
                found = true;
                System.out.println("High score removed: " + highScore.toString());
                break;
            }
        }
        if (!found) {
            System.out.println("High score not found: " + name);
        }
    }

    public void update(String name, int score) {
        for (HighScore h : highScores) {
            if (name.equals(h.getName())) {
                h.setScore(score);
//                phoneBookFileWriter.saveToFile(friends);
                System.out.println("High Score updated: " + h.toString());
                return;
            }
        }
        System.out.println("High score not found: " + name);
    }

    public void clear() {
        highScores.clear();
    }

    public int getScore(String name) {
        for (HighScore h : highScores) {
            if (name.equals(h.getName())) {
                return h.getScore();
            }
        }
        return 0;
    }

    /**
     * Returns the high scores (sorted)
     *
     * @return
     */
    public List<HighScore> getHighScores() {
        return sortHighScores(highScores);
    }

    /**
     * Sorts the high scores in descending order
     *
     * @param highScores
     * @return sorted high scores
     */
    public List<HighScore> sortHighScores(List<HighScore> highScores) {
        Collections.sort(highScores, new Comparator<HighScore>() {
            @Override
            public int compare(HighScore h1, HighScore h2) {
                return Integer.compare(h2.getScore(), h1.getScore()); // Descending order
            }
        });
        return highScores;
    }

    @Override
    public String toString() {
        return "HighScoreRepository{" +
                "highScores=" + highScores +
                '}';
    }
}
