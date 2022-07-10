package composite;

public class Composite extends Component{
    private Component left = null;
    private Component right = null;
    public Composite(String player1, String player2, int point1, int point2)
    {
        super(player1, player2, point1, point2);
    }

    public void add(Component c)
    {
        if (this.left == null)
        {
            this.left = c;
        }
        else
        {
            this.right = c;
        }
    }

    public void print()
    {
        this.left.print();
        System.out.println("--------------");
        System.out.println(String.format("*b* %s: %d | %s: %d *b*", this.player1, this.point1, this.player2, this.point2));
        System.out.println("--------------");
        this.right.print();
    }

    public boolean check()
    {
        boolean checkLeft = this.left.check();
        boolean checkRight = this.right.check();

        if (checkLeft && checkRight)
            if(this.left.getWinner().equals(this.player1) || this.left.getWinner().equals(this.player2))
                return (this.right.getWinner().equals(this.player2) || this.right.getWinner().equals(this.player1));
        return false;
    }
}
