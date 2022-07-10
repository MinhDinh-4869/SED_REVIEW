package visitor;

public class Monitor implements ComputerPart{
    int price = 300;
    public void display()
    {
        System.out.println("This is monitor");
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
