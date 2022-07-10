package companyHierarchy.Tournament;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private String[] players;
    private int[] points;
    private String winner;

    Game nextGame = null;
    Game prevGame1 = null;
    Game prevGame2 = null;

    public Game(String[] players, int[] points) {
        this.players = players;
        this.points = points;
        this.winner = (points[0] > points[1]) ? players[0] : players[1];
    }

    public void addNextGame(Game nextGame) {
        this.nextGame = nextGame;
        if (nextGame.prevGame1 != null) {
            nextGame.prevGame1 = this;
        }
        else {
            nextGame.prevGame2 = this;
        }
    }

    public boolean checkValid()
    {
        if (prevGame1.winner.equals(this.players[0]) && prevGame2.winner.equals(this.players[1]))
            return true;
        else return prevGame1.winner.equals(this.players[1]) && prevGame2.winner.equals(this.players[0]);
    }

    public void print(Game root)
    {
        if (root == null)
        {
            ;
        }
        root.print(this.prevGame1);
        System.out.println(root.players[0] +"|"+ root.players[1]);
        System.out.println(root.points[0] + "|" + root.points[1]);
        root.print(this.prevGame2);
    }

}

