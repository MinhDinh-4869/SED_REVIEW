package companyHierarchy.Tournament2;

public abstract class Tournament {
    int point1;
    int point2;
    String player1;
    String player2;
    public Tournament(String p1, String p2, int po1, int po2)
    {
        this.player1 = p1;
        this.player2 = p2;
        this.point1 = po1;
        this.point2 = po2;
    }
    public String getWinner()
    {
        return (point1 > point2) ? player1 : player2;
    }
    public abstract void Display();
    public abstract boolean Check();
}
