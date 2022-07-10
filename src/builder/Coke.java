package builder;

public class Coke implements Item{
    private final int price = 15;
    public String getName()
    {
        return "Coke";
    }

    public int getPrice()
    {
        return this.price;
    }
}
