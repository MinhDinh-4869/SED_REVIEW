package companyHierarchy.Tournament2;

public class Branch extends Tournament{
    private Tournament left = null;
    private Tournament right = null;

    public Branch(String p1, String p2, int po1, int po2)
    {
        super(p1, p2, po1, po2);
    }
    public Branch insert(Tournament t)
    {
        if (this.left == null)
        {
            this.left = t;
        }
        else
        {
            this.right = t;
        }
        return this;
    }

    public void Display()
    {
        this.left.Display();
        System.out.println(this.player1 + "|" + this.player2);
        System.out.println(this.point1 + "|" + this.point2);
        this.right.Display();
    }

    public boolean Check()
    {
        boolean checkLeft = this.left.Check();
        boolean checkRight = this.right.Check();

        String winner1 = this.left.getWinner();
        String winner2 = this.right.getWinner();
        if (checkLeft && checkRight)
            if (winner1.equals(this.player1) || winner1.equals(this.player2))
                return (winner2.equals(this.player2) || winner2.equals(this.player1));
        return false;
    }
}
