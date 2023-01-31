package hackerrank.sort;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {

    public static void main(String[] args) {
//        Player[] players = new Player[]{new Player("Smith", 20), new Player("Jones", 15), new Player("Jones", 20)};
        Player[] players = new Player[]{new Player("B", 20), new Player("Jones", 15), new Player("A", 20)};
        Checker checker = new Checker();
        Arrays.sort(players, checker);
        System.out.println(Arrays.toString(players));
    }

}

class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if(o2.score == o1.score) {
            return o1.name.compareTo(o2.name);  // ASC
        }
        return o2.score - o1.score; // DESC
    }
}