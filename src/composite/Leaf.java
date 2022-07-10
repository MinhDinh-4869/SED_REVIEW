package composite;

public class Leaf extends Component{
    public Leaf(String p1, String p2, int po1, int po2)
    {
        super(p1, p2, po1, po2);
    }
    public void print()
    {
        System.out.println("--------------");
        System.out.println(String.format("*l* %s: %d | %s: %d *l*", this.player1, this.point1, this.player2, this.point2));
        System.out.println("--------------");
    }

    public boolean check()
    {
        return true;
    }
}
