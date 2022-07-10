package builder;

public class Fruit implements Item{
    private final int price = 12;
    public String getName()
    {
        return "Fruit";
    }

    public int getPrice()
    {
        return this.price;
    }
}
