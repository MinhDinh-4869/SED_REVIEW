package visitor;

public class Keyboard implements ComputerPart{
    int price = 100;

    public void display()
    {
        System.out.println("This is keyboard");
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
