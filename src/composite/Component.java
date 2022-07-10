package composite;

public abstract class Component {
    protected String player1;
    protected String player2;
    protected int point1;
    protected int point2;
    public Component(String player1, String player2, int point1, int point2)
    {
        this.player1 = player1;
        this.player2 = player2;
        this.point1 = point1;
        this.point2 = point2;
    }
    //public abstract void add(Component c);
    public abstract boolean check();
    public abstract void print();
    public String getWinner()
    {
        return (point1 > point2) ? player1 : player2;
    }
}
