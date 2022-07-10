package newpackage;

public class StudentArchive extends Component{
    private Component left = null;
    private Component right =null;
    public StudentArchive(String name)
    {
        super(name);
    }
    public void add(Component c)
    {
        if (this.left != null && this.right !=null)
            System.out.println("full");
        else if (this.left == null)
            this.left = c;
        else
            this.right = c;
    }
    public void printLeftToRight()
    {
        this.left.printLeftToRight();
        System.out.print(this.name);
        this.right.printLeftToRight();
    }
    public void printRightToLeft()
    {
        this.right.printRightToLeft();
        System.out.print(this.name);
        this.left.printRightToLeft();
    }
}
