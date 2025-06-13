package game;

//ScoreManager.java
import java.io.*;
import java.util.*;

public class ScoreManager {
 private static final String FILE_PATH = "top_scores.txt";
 private List<Map.Entry<String, Integer>> topScores = new ArrayList<>();

 public ScoreManager() {
     loadScores();
 }

 public void addScore(String playerName, int score) {
     topScores.add(new AbstractMap.SimpleEntry<>(playerName, score));
     topScores.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
     if (topScores.size() > 5) {
         topScores = topScores.subList(0, 5);
     }
     saveScores();
 }

 private void loadScores() {
     try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
         String line;
         while ((line = reader.readLine()) != null) {
             String[] parts = line.split(" ");
             if (parts.length == 2) {
                 String name = parts[0];
                 int score = Integer.parseInt(parts[1]);
                 topScores.add(new AbstractMap.SimpleEntry<>(name, score));
             }
         }
         topScores.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
     } catch (IOException e) {
         // Handle exception
     }
 }

 private void saveScores() {
     try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
         for (Map.Entry<String, Integer> entry : topScores) {
             writer.write(entry.getKey() + " " + entry.getValue());
             writer.newLine();
         }
     } catch (IOException e) {
         // Handle exception
     }
 }

 public void displayTopScores() {
     System.out.println("\n\nTop Scores:");
     int rank = 1;
     for (Map.Entry<String, Integer> entry : topScores) {
         System.out.println(rank + ". " + entry.getKey() + ": " + entry.getValue());
         rank++;
     }
 }
}
