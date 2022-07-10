package builder;

public class Milk implements Item{
    private final int price = 12;
    public String getName()
    {
        return "Milk";
    }

    public int getPrice()
    {
        return this.price;
    }
}
