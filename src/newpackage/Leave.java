package newpackage;

public class Leave extends Component{
    public Leave(String name)
    {
        super(name);
    }
    public void printLeftToRight()
    {
        System.out.print(" | " +this.name + " | ");
    }
    public void printRightToLeft()
    {
        System.out.print(" | " +this.name + " | ");
    }
}
