package visitor;

public class Mouse implements ComputerPart{
    int price = 50;
    public void display()
    {
        System.out.println("This is Mouse");
    }
    public int count()
    {
        return 1;
    }
    public int calculatePrice()
    {
        return this.price;
    }
}
