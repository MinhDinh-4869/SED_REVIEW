package companyHierarchy.Tournament2;

public class Leave extends Tournament{
    public Leave(String p1, String p2, int po1, int po2)
    {
        super(p1, p2, po1, po2);
    }
    public void Display()
    {
        System.out.println(this.player1 + "|" + this.player2);
        System.out.println(this.point1 + "|" + this.point2);
    }
    public boolean Check()
    {
        return true;
    }
}
