package org.example.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DynamicArraysWithComparator {
    public static void main(String[] args) {

        // *** Code Snippet 1: Sorting Cricketers by Name in Ascending Order ***
        System.out.println("**** Sorting Cricketers by Name in Ascending Order ****");
        List<String> cricketers = new ArrayList<>(Arrays.asList("Virat Kohli", "Sachin Tendulkar", "MS Dhoni", "Ricky Ponting"));

        // Sorting using Comparator to sort names in ascending order
        Collections.sort(cricketers, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);  // Ascending order
            }
        });

        System.out.println("Cricketers Sorted in Ascending Order: " + cricketers);

        // *** Code Snippet 2: Sorting Cricketers by Name in Descending Order ***
        System.out.println("\n**** Sorting Cricketers by Name in Descending Order ****");
        Collections.sort(cricketers, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);  // Descending order
            }
        });

        System.out.println("Cricketers Sorted in Descending Order: " + cricketers);

        // *** Code Snippet 3: Sorting Cricket Scores (Integers) in Ascending Order ***
        System.out.println("\n**** Sorting Cricket Scores (Integers) in Ascending Order ****");
        List<Integer> scores = new ArrayList<>(Arrays.asList(45, 100, 20, 90, 30));

        // Sorting integers using Comparator to sort in ascending order
        Collections.sort(scores, new Comparator<Integer>() {
            @Override
            public int compare(Integer score1, Integer score2) {
                return score1.compareTo(score2);  // Ascending order
            }
        });

        System.out.println("Scores Sorted in Ascending Order: " + scores);

        // *** Code Snippet 4: Sorting Cricket Scores (Integers) in Descending Order ***
        System.out.println("\n**** Sorting Cricket Scores (Integers) in Descending Order ****");
        Collections.sort(scores, new Comparator<Integer>() {
            @Override
            public int compare(Integer score1, Integer score2) {
                return score2.compareTo(score1);  // Descending order
            }
        });

        System.out.println("Scores Sorted in Descending Order: " + scores);

        // *** Code Snippet 5: Sorting Cricketers by Score (Assume Score List) ***
        System.out.println("\n**** Sorting Cricketers by Score (Assumed Scores) ****");

        // Creating a list of players with their corresponding scores
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("Virat Kohli", 75));
        playerList.add(new Player("MS Dhoni", 50));
        playerList.add(new Player("Sachin Tendulkar", 100));
        playerList.add(new Player("Ricky Ponting", 80));

        // Sorting by score using a custom Comparator
        Collections.sort(playerList, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return p1.getScore().compareTo(p2.getScore());  // Ascending order by score
            }
        });

        System.out.println("Cricketers Sorted by Score: " + playerList);
    }

    // Player class with name and score for custom sorting
    static class Player {
        private String name;
        private Integer score;

        public Player(String name, Integer score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public Integer getScore() {
            return score;
        }

        @Override
        public String toString() {
            return name + " - " + score + " runs";
        }
    }
}
